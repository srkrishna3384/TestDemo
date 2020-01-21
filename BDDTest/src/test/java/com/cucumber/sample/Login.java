package com.cucumber.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	WebDriver driver;
	@Given("^User navigate to moneycontrol application$")
	public void navigate() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\main\\resources\\Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.moneycontrol.com");
	}
	@When("^Verify the user navigate to Moneycontrol application$")
	public void verifyNavigation() {
	
		
	}
	@And("^User click on Login button$")
	public void loginClick() {
		driver.findElement(By.xpath("//strong[text()='Log In']")).click();
	}
	@And("^User enters \"(.*)\" and \"(.*)\"$")
	public void enterLoginCredentials(String arg1, String arg2) {
		driver.findElement(By.xpath("//form[@id='login_form']//input[@id='email']")).sendKeys(arg1);
		driver.findElement(By.xpath("//form[@id='login_form']//input[@id='pwd']")).sendKeys(arg2);
		
	}
	@Then("^Verify the user login successfully or not$")
	public void loginSuccess() {
		driver.findElement(By.xpath("//button[@id='ACCT_LOGIN_SUBMIT']")).click();
		String expt = driver.findElement(By.xpath("//strong[contains(text(),'Hi')]")).getText();
		Assert.assertEquals("Hi", expt);
	}

}
