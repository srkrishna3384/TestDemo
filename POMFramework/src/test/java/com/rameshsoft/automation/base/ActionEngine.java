package com.rameshsoft.automation.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

abstract public class ActionEngine extends BaseEngine {

	private static WebElement webElement;
	private static List<WebElement> webElements;
	
	public static void enterURL(String url,String how) {
		if (how.equalsIgnoreCase("driver")) {
			getDriver().get(url);
		}
		else if (how.equalsIgnoreCase("navigation")) {
			getDriver().navigate().to(url);
		}
	}
	
	public static void enterURL(String url) {
			getDriver().get(url);
	}
	public static void closeCurrentBrowser() {
		getDriver().close();
	}
	
    public static void closeAllBrowser() {
		getDriver().quit();
	}
	static public WebElement identifyElement(String locMech,String locValue) {
		
		switch(locMech){
		case "id": webElement = getDriver().findElement(By.id(locValue));
		checkElementisVisible(webElement);
		           break;
		case "name":webElement = getDriver().findElement(By.name(locValue));
		checkElementisVisible(webElement);
		break;
		case "className":webElement = getDriver().findElement(By.className(locValue));
		checkElementisVisible(webElement);
		break;
		case "css":webElement = getDriver().findElement(By.cssSelector(locValue));
		checkElementisVisible(webElement);
		break;
		case "xpath":webElement = getDriver().findElement(By.xpath(locValue));
		checkElementisVisible(webElement);
		break;
		case "tagName":webElement = getDriver().findElement(By.tagName(locValue));
		checkElementisVisible(webElement);
		break;
		case "linkTxt":webElement = getDriver().findElement(By.linkText(locValue));
		checkElementisVisible(webElement);
		break;
		case "partialLinkTxt":webElement = getDriver().findElement(By.partialLinkText(locValue));
		checkElementisVisible(webElement);
		break;
		}
		return webElement;
	}
	
static public List<WebElement> identifyElements(String locMech,String locValue) {
		
		switch(locMech){
		case "id": 
			try{
			webElements = getDriver().findElements(By.id(locValue));
			}
			catch(Exception e){
				
			}
		checkElementisVisible(webElements);
		           break;
		case "name":webElements = getDriver().findElements(By.name(locValue));
		checkElementisVisible(webElements);
		break;
		case "className":webElements = getDriver().findElements(By.className(locValue));
		checkElementisVisible(webElements);
		break;
		case "css":webElements = getDriver().findElements(By.cssSelector(locValue));
		checkElementisVisible(webElements);
		break;
		case "xpath":webElements = getDriver().findElements(By.xpath(locValue));
		checkElementisVisible(webElements);
		break;
		case "tagName":webElements = getDriver().findElements(By.tagName(locValue));
		checkElementisVisible(webElements);
		break;
		case "linkTxt":webElements = getDriver().findElements(By.linkText(locValue));
		checkElementisVisible(webElements);
		break;
		case "partialLinkTxt":webElements = getDriver().findElements(By.partialLinkText(locValue));
		checkElementisVisible(webElements);
		break;
		}
		return webElements;
	}
	
	private static boolean checkElementisVisible(WebElement webElement){
     boolean status = (webElement.isDisplayed()&&webElement.isEnabled())?true:false;
     return status;
	}
	
	private static boolean checkElementisVisible(List<WebElement> webElement){
		boolean status = true;
		for(WebElement element: webElement){
	     status = (element.isDisplayed()&&element.isEnabled())?true:false;
		}
	     return status;
		}
	
	public static void DTA(String locMech,String locValue,String testData) {
		webElement = identifyElement(locMech, locValue);
		webElement.sendKeys(testData);
	}
	
	public static void click(String locMech,String locValue) {
		webElement = identifyElement(locMech, locValue);
		webElement.click();
	}
	
	public static void click(String locMech,String locValue,String clickType) {
		Actions actions = new Actions(getDriver());
		webElement = identifyElement(locMech, locValue);
		if (clickType.equalsIgnoreCase("webelement")) {
			webElement.click();
		}
		else if (clickType.equalsIgnoreCase("single")) {
			actions.click(webElement).build().perform();
		}
		else if (clickType.equalsIgnoreCase("double")) {
			actions.doubleClick(webElement).build().perform();
		}
		else if (clickType.equalsIgnoreCase("keyboard")) {
			actions.sendKeys(webElement, Keys.ENTER).build().perform();
		}
		webElement.click();
	}
	
	public static void mouseHoverAction(String locMech,String locValue) {
		Actions actions = new Actions(getDriver());
		webElement = identifyElement(locMech, locValue);
		actions.moveToElement(webElement).build().perform();;
	}	
}
