package com.rameshsoft.automation.appln.scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.rameshsoft.automation.base.BaseEngine;
import com.relevantcodes.extentreports.LogStatus;

public class FBTest extends BaseEngine {

	@Test
	public void fbTest() {
		String url = "https://www.facebook.com";
		//BaseEngine.getDriver().get("https://www.facebook.com");
		getDriver().get(url);
		getExtentTest().log(LogStatus.INFO, "URL IS entered as : " +url);
		
		getDriver().findElement(By.id("email")).sendKeys("hello");
		getExtentTest().log(LogStatus.INFO, "DTA is done un: as hello");
		
	}
	
}
