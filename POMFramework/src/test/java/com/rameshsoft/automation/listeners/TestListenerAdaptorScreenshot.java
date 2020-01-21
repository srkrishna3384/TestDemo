ackage com.rameshsoft.automation.listeners;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.rameshsoft.automation.utilities.ScreenShotUtility;

public class TestListenerAdaptorScreenshot extends TestListenerAdapter {

	@Override
	public void onTestFailure(ITestResult arg0) {
		System.out.println("TC IS FAILURE : " +arg0.getName());
		try {
			ScreenShotUtility.screenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void onTestSkipped(ITestResult arg0) {
		System.out.println("TC IS SKIPPED : " +arg0.getName());
	}
	@Override
	public void onTestStart(ITestResult arg0) {
		System.out.println("TC STARTED : " +arg0.getName());
	}
	
	
}
