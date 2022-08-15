package com.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.BaseProperty;

public class AutoReplaypojo extends BaseProperty {



	public AutoReplaypojo() {
		PageFactory.initElements(driver, this);

	}



	@FindBy(xpath = "//span[text()=' Instructions']")
	WebElement instructionsTabOn;


	public WebElement getInstructionsTabOn() {
		return instructionsTabOn;
	}



	@FindBy(xpath = "//span[text()='Received Instructions']")
	WebElement receivedInstructionsTabOn;



	@FindBy(xpath = "//input[@placeholder='Search']")
	private WebElement searchvalueenter;

	@FindBy(xpath = " //button[@title='Search']")
	private WebElement clicksearch;


	@FindBy(xpath = " //span[text()=' INSTRUCTION ']")
	private WebElement clickvolabasemessage;

	@FindBy(xpath = " //span[text()=' COMPLETED']")
	private WebElement statusCompleted;

	@FindBy(xpath = "//a[text()=' Credit Transfer']")
	private WebElement creditTransferTab;
	
	
	public WebElement getCreditTransferTab() {
		return creditTransferTab;
	}



	public WebElement getTransactionLink() {
		return transactionLink;
	}



	@FindBy(xpath = "//*[@id=\"DYNAMIC_TAB\"]/v6-grid/div[1]/table/tbody/tr/td[1]/span/v6-link-popup/a")
	private WebElement transactionLink;
	
	
	
	
	@FindBy(xpath = " //a[text()=' Instruction Incidence']")
	private WebElement instructionIncidence;







	public WebElement getLogoutUser() {
		return logoutUser;
	}



	@FindBy(xpath = " //span[text()=' PARSEREJECTION']")
	private WebElement parseRejectionStatus;


	@FindBy(xpath = " //span[text()=' REPLAY01MSG ']")
	private WebElement replayincidence;

	@FindBy(xpath = " //td[@data-label='PRCSTS']//child::span[@class='badge badge-pill badge-primary']//child::span[text()=' PARSEREJECTION '][1]")
	private WebElement parseRejectionafterReplayIncidence;

	@FindBy(xpath = "//button[@title='Logout']")
	private WebElement logoutUser;




	public WebElement getReplayincidence() {
		return replayincidence;
	}



	public WebElement getParseRejectionafterReplayIncidence() {
		return parseRejectionafterReplayIncidence;
	}



	public WebElement getReceivedInstructionsTabOn() {
		return receivedInstructionsTabOn;
	}



	public WebElement getSearchvalueenter() {
		return searchvalueenter;
	}



	public WebElement getClicksearch() {
		return clicksearch;
	}



	public WebElement getClickvolabasemessage() {
		return clickvolabasemessage;
	}



	public WebElement getStatusCompleted() {
		return statusCompleted;
	}



	public WebElement getInstructionIncidence() {
		return instructionIncidence;
	}



	public WebElement getParseRejectionStatus() {
		return parseRejectionStatus;
	}



	










}



