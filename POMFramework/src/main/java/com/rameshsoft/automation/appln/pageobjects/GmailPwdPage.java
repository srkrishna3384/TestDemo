package com.rameshsoft.automation.appln.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rameshsoft.automation.base.BaseEngine;

public class GmailPwdPage extends BaseEngine{

	@FindBy(name="password")
	private static WebElement password;
	
	@FindBy(id="passwordNext")
	private static WebElement pwdNext;
	
	@FindBy(xpath="//button[contains(text(),'Forgot password?')]")
	private static WebElement frgtPwd;

	@FindBy(xpath="//*[contains(text(),'Wrong password. Try again or click Forgot password to reset it.')]")
	private static WebElement errorMsg;
	
	public static void enterPwd(String pwd) {
		password.clear();
		password.sendKeys(pwd);
	}
	
	public static void clickNextBtn() {
		pwdNext.click();
	}
	
	public static void clickOnFrgtEmail() {
		frgtPwd.click();
	}
	static
	{
	   PageFactory.initElements(getDriver(), GmailPwdPage.class);	
	}
	
	public static String getErrorMsg(){
		return errorMsg.getText();
	}	
}
