package com.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.BaseProperty;

public class PartyPojo extends BaseProperty {

	
	public  PartyPojo() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//span[contains(text(),'OnBoarding Data')]")
	WebElement onBoardingDataTabOn;



	@FindBy(xpath="//span[contains(text(),'Routing Rules')]")
	private WebElement routingRulesTabOn;

	@FindBy(xpath="//i[@title='Add Routing Rules']")
	private WebElement createButtonOn;

	@FindBy(id="RuleCd")
	private WebElement ruleCodeOn;

	@FindBy(id="RuleNm")
	private WebElement ruleNameOn;


	@FindBy(id="NttyStsCd")
	private WebElement entityStatusCode;

	@FindBy(id="FctvFr")
	private WebElement effectiveFrom;

	@FindBy(linkText="1")
	private WebElement date;

	
	
	
}
