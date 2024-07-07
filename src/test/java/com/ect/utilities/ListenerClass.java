package com.ect.utilities;

import java.io.File;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenerClass implements ITestListener{

	ExtentSparkReporter htmlReporter;
	ExtentReports reports;
	ExtentTest test;
	
	public void configureReport() {
		
		htmlReporter = new ExtentSparkReporter("ExtentListenerReportDemo.html");
		reports = new ExtentReports();
		reports.attachReporter(htmlReporter);
		
		//add system info/environment info on reports
		reports.setSystemInfo("Machine", "PriyamPC");
		reports.setSystemInfo("os", "windows11");
		
		htmlReporter.config().setDocumentTitle("Extent Listener Report Demo");
		htmlReporter.config().setReportName("This is my first report");
		htmlReporter.config().setTheme(Theme.DARK);
	}
	
	public void onTestStart(ITestResult result)
	{
		System.out.println("The Test Started");
	}
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Name of the Test Method which successfully executed: " + result.getName());
		test=reports.createTest(result.getName());
		test.log(Status.PASS, MarkupHelper.createLabel("Name of the pass test case is: " + result.getName(), ExtentColor.GREEN));
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Name of the Test Method which is failed to execute: " + result.getName());
		
		String failedTest=result.getName();
		String screenshot="./ScreenShots/";
		test=reports.createTest(result.getName());
		test.log(Status.FAIL, MarkupHelper.createLabel("Name of the failed test case is: " + result.getName(), ExtentColor.RED))
		.addScreenCaptureFromPath(screenshot +failedTest + ".png");
		
		String screenShotPath = System.getProperty("user.dir") +"\\ScreenShots\\" + result.getName() + ".png";
		
		File screenShotFile = new File(screenShotPath);
		
		if(screenShotFile.exists())
		{
			test.fail("Captured Screenshot is below:" + test.addScreenCaptureFromPath(screenShotPath));
		}
	}
	
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Name of the Test Method which skipped: " + result.getName());
		test=reports.createTest(result.getName());
		test.log(Status.SKIP, MarkupHelper.createLabel("Name of the skipped test case is: " + result.getName(), ExtentColor.YELLOW));
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestListener result) {
		
	}
	
	public void onTestFailedWithTimeout(ITestResult result)
	{
		onTestFailure(result);
	}
	
	public void onStart(ITestContext context) {
		configureReport();
		System.out.println("On Start Method Invoked...");
	}
	
	public void onFinish(ITestContext context) {
		System.out.println("On Finish Method Invoked...");
		reports.flush(); //It is mandatory to call flush method to ensure information is written till the started reporter.
	}

}
