package com.utility;




import java.awt.AWTException;
import java.awt.List;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.stepdefinition.Hook;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import junit.framework.Assert;

public class BaseProperty {

	public static WebDriver driver;
	public static ExtentReports extent;
	
	public static String autoReplayResponse="";
	public static String volbaseIdResponse="";
	public static String baseUrl="http://localhost:8443/";
	public static String basepostmanmsgUrl="http://localhost:8443/";  
	public static String urlMtMx= "translator/transport/lynxnonisoapps";
	public static String urlMxMt= "translator/transport/lynxclearings";
	public static String getTxtValue1 ="";
//	public static String urlMtMx= "translator/transport/ausoutgoingmt";
	//public static String urlMxMt= "translator/transport/ausincoming";
//	public static String mt103Rule="CCT_103_OUT"; // BCT_202_OUT    CCT_103_OUT
//	public static String mt202Rule="BCT_202_OUT";
//	public static String pacs008RoutingRule1="";
//	public static String pacs008RoutingRule2="";
//	public static String mt202RoutingRule="";
	
	
	
	public static void launchChromebrowser() {
		
		ChromeOptions options = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		
		options.addArguments("start-maximized"); // open Browser in maximized mode
	
		options.setExperimentalOption("excludeSwitches",Arrays.asList("enable-automation"));//To disable infobar
		//To disable popup of chrome to save password
		Map<String, Object> prefs = new HashMap<String, Object>();
	    prefs.put("credentials_enable_service", false);
	    prefs.put("profile.password_manager_enabled", false);
	    options.setExperimentalOption("prefs", prefs);
	    
		
	//	driver = new ChromeDriver();
		driver = new ChromeDriver(options);
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //executes in program wherever a driver reference is used and if availble tries to executes if not will wait for max of 5 sec
	}
	
	public static void loadUrl(String url) {
		
		driver.get(url);
	}

	public static void winMax() {

		driver.manage().window().maximize();
	}

	public static void printTitle() {

		System.out.println(driver.getTitle());
	}

	public static void printCurrentUrl() {

		System.out.println(driver.getCurrentUrl());
	}

	public static void fill(WebElement ele, String value) {

		ele.sendKeys(value);
	}

	public static void btnClick(WebElement ele) {

		ele.click();
	}
	public static void btnClickList(WebElement ele) {

		ele.click();
	}

	public static void closeChrome() {

		driver.close();
	}

	public static void quitChrome() {

		driver.quit();
	}

	public static void printText(WebElement ele) {

		System.out.println(ele.getText());
	}

	public static String printAttribute(WebElement ele) {

		String str = ele.getAttribute("value");
		return str;
	}
	
	public static void dropDown(WebElement element,String data) {
		Select s = new Select(element);
        s.selectByVisibleText(data);	
	}
public static  void newwindow(String newurl) {
	driver.switchTo().window(newurl);	
}


public static void  switchwindow(int indexoftab) {
	Set <String> all =driver.getWindowHandles();
	java.util.List<String> li=new ArrayList<String>();
	li.addAll(all);
	String x=li.get(indexoftab);
	driver.switchTo().window(x);
}


//public static void robot() throws AWTException {
//
//	Robot rob = new Robot();
//	rob.keyPress(arg0);
//}





public static   String getTxtValue1(WebElement b) {
	//String getTxtValue=b.getText();
	getTxtValue1 = b.getText();
	System.out.println(getTxtValue1);
	return getTxtValue1;
}








public static String Screenshots() throws IOException {
	  
	  String directory =
	  System.getProperty("user.dir")+"\\Screenshots\\"+Hook.scenarioname+".png";
	  File sourcefile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(sourcefile, new File(directory)); String
	  destination=directory; return destination; 
	  }
	  //to encode to project
	  public String getscreenshotasbase64() throws IOException {
		System.out.println("getscreenshotasbase64 print");
		System.out.println("scnerio to screenshot"+Hook.scenarioname);
		  String directory = System.getProperty("user.dir")+"\\Screenshots\\\\"+Hook.scenarioname+".png";
		
		  File sourcefile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(sourcefile, new File(directory));
		  byte[] imagebyte= IOUtils.toByteArray(new FileInputStream(directory));
		  return Base64.getEncoder().encodeToString(imagebyte);


	  }
	  
	
	  public static void inputMessage(String samplePath,String mxMtOrMtMxUrl ) throws IOException {	  
		  
		  
		File path = new File(samplePath);

		String content = FileUtils.readFileToString(path, "UTF-8");
		//System.out.println(content);
		Response response = RestAssured.given().body(content).post(mxMtOrMtMxUrl);
		volbaseIdResponse = response.getBody().asString();
		int statusCode = response.getStatusCode();
		System.out.println("status code  = "+statusCode);
		Assert.assertEquals("Could not process payment via postman", 200, statusCode);
		System.out.println("volabase id "+volbaseIdResponse);
	  
	  
}
	  
	  
	
	
	@SuppressWarnings("unchecked")
	public static void autoReplay(String status,String msgFctnCd,String prcCd ) {

//			F	//ParseRejection
	RestAssured.baseURI=baseUrl;          //"http://10.50.76.234:8080/";//parametrize in feature file
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("StsCd", status);   //jsonObject.put("StsCd", "PARSEREJECTION");
		jsonObject.put("MsgFctnCd", msgFctnCd);
		jsonObject.put("PrcCd", prcCd);
		System.out.println(jsonObject);
		Response response = RestAssured.given().header("tenantid","DEMOTENANT")
				.contentType(ContentType.JSON)
				.body(jsonObject).post("rest/rest/replay/message");	
		int replayStatusCode = response.getStatusCode();
		System.out.println(replayStatusCode);
		Assert.assertEquals("Could not repaly the payment", 201, replayStatusCode);
		 autoReplayResponse = response.getBody().asString();
		//System.out.println(autoReplayResponse);
	}
  

		
}
