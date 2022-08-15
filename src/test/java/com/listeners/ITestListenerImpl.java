package com.listeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.pageobjectmodel.AutoReplaypojo;
import com.stepdefinition.Hook;
import com.utility.BaseProperty;

public class ITestListenerImpl extends BaseProperty implements ITestListener{
	
	
	ExtentTest logger;
	ExtentReports extent = ExtentReportNG.getReportObject();
	AutoReplaypojo AutoReplaypojo;
	
	@Override
	public void onTestStart(ITestResult result) {
		

	}
	@Override
	public void onTestSuccess(ITestResult result) {
		
			logger = extent.createTest(Hook.scenarioname);
		
			logger.log(Status.PASS,"");
		}
	@Override
	public void onTestFailure(ITestResult result) {
		
		//System.out.println("ABC"+Hook.scenarioname);
		//logger = extent.createTest(Hook.scenarioname);
		//logger = extent.createTest("first scenario");
//	    try {
//	    	System.out.println("berfore screensot done for failed sceanrio");
//			logger.fail("Test case Failed", MediaEntityBuilder.createScreenCaptureFromBase64String(getscreenshotasbase64()).build());
//			System.out.println("after screensot done for failed sceanrio");
//		} catch (IOException e) {
//		}
	    //reportStatus.add("FAIL");
		//logger.log(Status.FAIL, "");
		
		
		//////////////////////////////////////////
//		logger = extent.createTest(Hook.scenarioname);
//		try {
//			logger.log(Status.FAIL, "Test case Failed", MediaEntityBuilder.createScreenCaptureFromBase64String(getscreenshotasbase64()).build());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		 
	}
	@Override
	public void onFinish(ITestContext context) {
		
		System.out.println("Execution completed for Volpay UI...");
			System.out.println("Generated Report. . .");	
			extent.flush();
			
			//driver.close();
		//	driver.quit();
	}
	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	
	}
