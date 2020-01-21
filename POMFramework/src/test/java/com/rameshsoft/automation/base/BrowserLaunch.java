package com.rameshsoft.automation.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserLaunch {
	
	public static RemoteWebDriver openBrowser(String browserName) {
		RemoteWebDriver driver = null;
		try
		{
		if(browserName.equalsIgnoreCase("chrome")){
		 driver = new ChromeDriver();
		 driver.manage().deleteAllCookies();
		}
		else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new ChromeDriver();
			 driver.manage().deleteAllCookies();
		}
	}
		catch(Exception e){
			System.out.println("");
		}
		return driver;
	}
	
}
