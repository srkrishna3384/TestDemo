package com.rameshsoft.automation.appln.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.rameshsoft.automation.appln.pageobjects.GmailHomePage;
import com.rameshsoft.automation.appln.pageobjects.GmailPwdPage;
import com.rameshsoft.automation.base.ActionEngine;
import com.rameshsoft.automation.base.BaseEngine;
import com.relevantcodes.extentreports.LogStatus;

public class GmailPOMTest extends BaseEngine {
	@Test
	public void gmailPOMTest() throws InterruptedException {
     String URL = getPrConf().getPropertyValue("dev_url");
		ActionEngine.enterURL(URL);
		getExtentTest().log(LogStatus.INFO, "Entered URL as: " +URL);
		Assert.assertEquals("Gmail", getDriver().getTitle());
		String un = getExcelReader().getSingleCellData("hello", 0, 0);
		GmailHomePage.enterUserName(un);
		getExtentTest().log(LogStatus.INFO, "DTA is done on UN with test data: " +un);
		GmailHomePage.clickNextBtn();
		getExtentTest().log(LogStatus.INFO, "Clicked on next button");
		Thread.sleep(4000);
		String pwd = getExcelReader().getSingleCellData("hello", 0, 1);
		GmailPwdPage.enterPwd(pwd);
		getExtentTest().log(LogStatus.INFO, "DTA is done on PWS with test data: " +pwd);
		GmailPwdPage.clickNextBtn();
		getExtentTest().log(LogStatus.INFO, "Clicked on sigin button");
		String errorMsg = "Wrong password. Try again or click Forgot password to reset it.";
		Assert.assertEquals(errorMsg, GmailPwdPage.getErrorMsg());
	}
}
