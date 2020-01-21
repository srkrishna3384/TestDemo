package com.rameshsoft.automation.appln.scripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ScreenshotTest {
public static void main(String[] args) throws IOException {
	
	System.setProperty("webdriver.chrome.driver", "E:\\MyWorkspace\\Frameworks7AM\\Drivers\\chromedriver.exe");
	RemoteWebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();	
	driver.get("https://www.gmail.com");
	
	File imaFile = driver.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(imaFile, new File("E:\\MyWorkspace\\Frameworks7AM\\Screenshots\\GmailHomePage.jpeg"));
	driver.findElement(By.id("identifierId"));
	
	
}
}
