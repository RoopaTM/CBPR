package com.stepdefinition;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.pageobjectmodel.AutoReplaypojo;
import com.utility.BaseProperty;

//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends BaseProperty {
	
	public BaseProperty base;
	public static String scenarioname;
	public Hook(BaseProperty base) {
		
		this.base = base;
	}
	
	ExtentTest logger;
	AutoReplaypojo AutoReplaypojo;
	

	
	@Before
	public void initializetest() throws InterruptedException {
		launchChromebrowser();
		loadUrl(baseUrl+"volpayui/#/");

		Thread.sleep(4000);

		// need to reconfigure	
		WebElement username = driver.findElement(By.id("UsrId"));
		username.sendKeys("adminuserauto");

		WebElement password = driver.findElement(By.id("Pswd"));
		password.sendKeys("Volpay@300");

		WebElement login = driver.findElement((By.xpath("//button[@type='submit']")));
		login.click();
		Thread.sleep(2000);
	AutoReplaypojo = new AutoReplaypojo();


		
	}
	
	@After
	public void TearDownTest(cucumber.api.Scenario scenario) throws InterruptedException {
		
		if(scenario.isFailed()) {

			//System.out.println("scenario.isFailed() true or false =  "+scenario.isFailed());
			scenarioname  =	scenario.getName();	
			logger = extent.createTest(Hook.scenarioname);
			try {
				logger.log(Status.FAIL, "Test case Failed", MediaEntityBuilder.createScreenCaptureFromBase64String(getscreenshotasbase64()).build());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Hook Scenario fail : "+scenarioname);
			
		}
		else{
			
			scenarioname  =	scenario.getName();	
			//System.out.println("Hook Scenario name pass: "+scenario.getName());
			
			System.out.println("Hook Scenario pass: "+scenarioname);
			
		}
		//Thread.sleep(5000);
		driver.navigate().refresh();
		// btnClick(AutoReplaypojo.getLogoutUser());
		 //driver.close();
		 // driver.quit();	
		
	}

}
