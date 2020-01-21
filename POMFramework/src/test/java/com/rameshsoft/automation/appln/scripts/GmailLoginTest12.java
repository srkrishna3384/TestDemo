package com.rameshsoft.automation.appln.scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.rameshsoft.automation.base.ActionEngine;
import com.rameshsoft.automation.base.BaseEngine;
import com.rameshsoft.automation.supporters.ExcelReader;
import com.rameshsoft.automation.supporters.PropertiesUtilities;
import com.rameshsoft.automation.utilities.FilePaths;
import com.rameshsoft.automation.utilities.POJOSupporters;
import com.rameshsoft.automation.utilities.RegExPhNumUtility;
import com.relevantcodes.extentreports.LogStatus;

public class GmailLoginTest12 extends ActionEngine {

	@Test
	public void gmailLoginTest() throws IOException, EncryptedDocumentException, InvalidFormatException {
		String URL = getPrConf().getPropertyValue("dev_url");
		
		String ev = "Gmail1";
		enterURL(URL);
		SoftAssert softAssert = new SoftAssert();
		
		String av = getDriver().getTitle();
		softAssert.assertEquals(av, ev);
		//Assert.assertEquals(av, ev);
		getExtentTest().log(LogStatus.INFO, "Entered URL as: " +URL);
		String un = getPrOr().getPropertyValue("homepage_un_id");
		String nxt = getPrOr().getPropertyValue("homepage_next_id");
		
		String unData = getExcelReader().getSingleCellData("java", 1, 1);
		
		/*if(RegExPhNumUtility.isValidPhNum(unData))
		{
			DTA("id", un, unData);
		}*/
		
		getDriver().findElement(By.id(un)).sendKeys(unData);
		getExtentTest().log(LogStatus.INFO, "Data Typing Action is done on UN with test data: " +unData);
		WebElement ele = getDriver().findElement(By.id(nxt));
		
		Assert.assertTrue(ele.isDisplayed()&&ele.isEnabled());
		
		getExtentTest().log(LogStatus.INFO, "Clicked on next button");
		getDriver().findElement(By.name(getPrOr().getPropertyValue("homepage_pwd_name"))).sendKeys(getExcelReader().getSingleCellData("java", 1, 2));
		getExtentTest().log(LogStatus.INFO, "Data Typing Action is done on PWD with test data: " +unData);
		getDriver().findElement(By.xpath(getPrOr().getPropertyValue("homepage_signin_xpath"))).click();
		getExtentTest().log(LogStatus.INFO, "Clicked on SIGNIN button");
		
		
	}
}









