package com.rk.sample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowHandles {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Moneycontrol_Web2\\Sample\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.moneycontrol.com");
		for(int i=0;i<=8;i++) {
			String window = "";
			Set<String> handles = driver.getWindowHandles();
			Iterator<String> ite = handles.iterator();
			while (ite.hasNext()) {
				window = (String) ite.next();
				System.out.println(window);
			}
			driver.switchTo().window(window);

		driver.findElement(By.xpath("//div[@class='header-main-wrapper']//a[@title='Forum']")).click();
		}
		ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles()); //get all the windows
		driver.switchTo().window(windows.get(3)); //switch to 4th window by using index position
		Thread.sleep(5000);
		driver.switchTo().window(windows.get(6)); //switch to 7th window by using index position
		
	}

}
