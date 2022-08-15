package com.pageobjectmodel;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.utility.BaseProperty;

public class TransactionPojo extends BaseProperty {
	
	
	 public TransactionPojo() {
	        PageFactory.initElements(driver, this);

	    }
	 //CustomerCreditTransfer 
	 
	    @FindBy(xpath = "//span[text()=' RULE_FAILURE']")
	    WebElement transactionStatusRuleFailure;
	    
	    
	  //  @FindBy(xpath = "//a[text()=' Customer Credit Transfer Incidence']")
	    @FindBy(xpath = "//*[@id=\"dynamicTabs\"]/li[4]/a")
	    WebElement cctTransactioncctIncidence;
	    
	    @FindBy(xpath = "//span[text()=' REPLAY01MSG ']")
	    WebElement replayIncidence;
	    
	    @FindAll({@FindBy(xpath = "//span[text()=' COMPLETED']"),
	   
	    @FindBy(xpath = "//span[text()=' PROCESSED']")
	    
	    })
	   WebElement  transactionStatusCompleted;
	    
	    
		public WebElement getTransactionStatusRuleFailure() {
			return transactionStatusRuleFailure;
		}

		public WebElement getTransactioncctIncidence() {
			return cctTransactioncctIncidence;
		}

		public WebElement getReplayIncidence() {
			return replayIncidence;
		}

		public WebElement getCctTransactioncctIncidence() {
			return cctTransactioncctIncidence;
		}

//		public List<WebElement> getTransactionStatusCompleted() {
//			return transactionStatusCompleted;
//		}

		public WebElement getTransactionStatusCompleted() {
			return transactionStatusCompleted;
		}
	    
	   
	    
	    
	    
	    
	    
}
