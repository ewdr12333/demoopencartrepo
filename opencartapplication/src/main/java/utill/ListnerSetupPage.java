package utill;


import org.testng.ITestListener;
import org.testng.ITestResult;

import testBase.TestBaseClasses;

public class ListnerSetupPage extends TestBaseClasses implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("Testcase startes " +result);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Testcase passed " +result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		UtillClassPage.getScreenshot(result.getName());
		System.out.println("Testcase Failed " +result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("Testcase Skipped " +result.getName());
	}

	

}
