package com.rameshsoft.automation.reports;

import com.rameshsoft.automation.base.BaseEngine;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ReportsUtility extends BaseEngine{

	/*private String reportsPath;
	private ExtentReports extentReports;
	private ExtentTest extentTest;
	
	
	public ReportsUtility(String reportsPath)
	{
		this.reportsPath = reportsPath;
		extentReports = new ExtentReports(reportsPath);
		
	}*/
	
	public void logInfo(String info) {
		getExtentTest().log(LogStatus.INFO, info);
	}
	
	
	
}
