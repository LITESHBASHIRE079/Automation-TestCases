package Listners_TestNg_Example;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNgListners implements ITestListener {
	
	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test cases started");
	}
	
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test cases finished");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test cases failed...");
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test cases Passed...");
	}
	
	
	

}
