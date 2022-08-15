//package com.pageobjectmodel;
//
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//import com.utility.BaseProperty;
//
//public class MessageTranslationPojo extends BaseProperty {
//	
//	   public MessageTranslationPojo() {
//	        PageFactory.initElements(driver, this);
//
//	    }
//	   
//	   
//	      
//	    @FindBy(xpath = "//span[text()='Received Instructions']")
//	    WebElement receivedInstructionsTabOn;
//
//
//
//	    @FindBy(xpath = "//div[@class='input-group general-search']")
//	    private WebElement searchvalueenter;
//	    
//	    @FindBy(xpath = " //button[@title='Search']")
//	    private WebElement clicksearch;
//	   
//
//	    @FindBy(xpath = " //span[text()=' INSTRUCTION ']")
//	    private WebElement clickvolabasemessage;
//	    
//	    public WebElement getClickvolabasemessage() {
//			return clickvolabasemessage;
//		}
//
//
//
//		@FindBy(xpath = " //span[text()=' COMPLETED']")
//	    private WebElement statusCompleted;
//
//	    @FindBy(xpath = " //a[text()=' Instruction Incidence']")
//	    private WebElement instructionIncidence;
//	    
//	    public WebElement getParseRejectionStatus() {
//			return parseRejectionStatus;
//		}
//
//
//
//		@FindBy(xpath = " //span[text()=' PARSEREJECTION']")
//	    private WebElement parseRejectionStatus;
//
//		public WebElement getReceivedInstructionsTabOn() {
//			return receivedInstructionsTabOn;
//		}
//
//	
//
//		public WebElement getSearchvalueenter() {
//			return searchvalueenter;
//		}
//
//
//
//		public WebElement getClicksearch() {
//			return clicksearch;
//		}
//
//
//
//	
//
//		public WebElement getStatusCompleted() {
//			return statusCompleted;
//		}
//
//		
//
//		public WebElement getInstructionIncidence() {
//			return instructionIncidence;
//		}
//	    
//	  //span[text()=' PARSEREJECTION']
//	    
//	    
//
//
//}
