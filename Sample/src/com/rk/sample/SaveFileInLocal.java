package com.rk.sample;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SaveFileInLocal {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Moneycontrol_Web2\\Sample\\Driver\\chromedriver.exe");
		String downloadFilepath = "D:\\";
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadFilepath);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumhq.org");
		driver.findElement(By.xpath("//div[@class='download-button webdriver']")).click();
		driver.findElement(By.xpath("//a[text()='3.141.59']")).click();
	}

}
