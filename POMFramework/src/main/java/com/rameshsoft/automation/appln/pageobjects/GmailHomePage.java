package com.rameshsoft.automation.appln.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rameshsoft.automation.base.BaseEngine;

public class GmailHomePage extends BaseEngine {

	@FindBy(id="identifierId")
	private static WebElement userName;
	
	@FindBy(id="identifierNext")
	private static WebElement next;
	
	@FindBy(xpath="//button[contains(text(),'Forgot email?')]")
	private static WebElement frgtEmail;
	
	@FindBy(xpath="//span[contains(text(),'Create account')]")
	private static WebElement createAcc;
	
	@FindBy(xpath="//a[contains(text(),'Learn more')]")
	private static WebElement learnMore;
	
	
	public static void enterUserName(String un) {
		userName.clear();
		userName.sendKeys(un);
	}
	
	public static void clickNextBtn() {
		next.click();
	}
	
	public static void clickOnFrgtEmail() {
		frgtEmail.click();
	}
	
	public static void clickOnCreateAcc() {
		createAcc.click();
	}
	static
	{
	   PageFactory.initElements(getDriver(), GmailHomePage.class);	
	}
}
