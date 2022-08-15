package com.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.BaseProperty;

public class EndPointPojo extends BaseProperty {
	
	public EndPointPojo() {
	
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//span[contains(text(),'OnBoarding Data')]")
	WebElement onBoardingDataTabOn;



	@FindBy(xpath=" //a[@title='Endpoint']")
	private WebElement endPointTabOn;

	@FindBy(xpath=" //i[@title='Add Endpoint']")
	private WebElement createButtonOn;

	@FindBy(id="NdPtCd")
	private WebElement endPointCode;

	@FindBy(xpath=" //input[@id='NdPtNm']")
	private WebElement endpointNameOn;


	@FindBy(id="select2-NdPtGrpCd_custom7045-container")
	private WebElement endPointGroupCode;

	@FindBy(xpath=" //li[text()='CLEARING-Clearing Endpointgroup']")
	private WebElement endPointGroupCodeValue;

	@FindBy(xpath=" //select[@title='NdPtCtgy'] //select[@title='NdPtCtgy']")
	private WebElement endPointCategory;
	

	@FindBy(xpath=" //option[text()=' CLEARING ']")
	private WebElement endPointCategoryvalue;

	

	@FindBy(xpath=" //span[@id='select2-SpprtdMsgFctns0NttyMsgFctnCd_custom1565-container']")
	private WebElement entityMessageFuncionCode;
	
	
	@FindBy(xpath=" //li[text()='CustomerCreditTransfer']")
	private WebElement entityMessageFuncionCodeValue;
	
	
	@FindBy(id="NttyStsCd")
	private WebElement entityStatusCode;
	
	
	@FindBy(xpath=" //input[@id='FctvFr_custom']")
	private WebElement effectiveDate;
	
	
	@FindBy(xpath=" //a[text()='1']")
	private WebElement effectiveDateValueas1;
	
	


	@FindBy(xpath=" //button[text()=' Submit ']")
	private WebElement submitbutton;


	@FindBy(xpath="//span[text()=' Approval Menu']")
	private WebElement approvalMenu;


	@FindBy(xpath="//span[text()='Approval Details']")
	private WebElement approvalDetails;


	public WebElement getOnBoardingDataTabOn() {
		return onBoardingDataTabOn;
	}


	public WebElement getEndPointTabOn() {
		return endPointTabOn;
	}


	public WebElement getCreateButtonOn() {
		return createButtonOn;
	}


	public WebElement getEndPointCode() {
		return endPointCode;
	}


	public WebElement getEndpointNameOn() {
		return endpointNameOn;
	}


	public WebElement getEndPointGroupCode() {
		return endPointGroupCode;
	}


	public WebElement getEndPointGroupCodeValue() {
		return endPointGroupCodeValue;
	}


	public WebElement getEndPointCategory() {
		return endPointCategory;
	}


	public WebElement getEndPointCategoryvalue() {
		return endPointCategoryvalue;
	}


	public WebElement getEntityMessageFuncionCode() {
		return entityMessageFuncionCode;
	}


	public WebElement getEntityMessageFuncionCodeValue() {
		return entityMessageFuncionCodeValue;
	}


	public WebElement getEntityStatusCode() {
		return entityStatusCode;
	}


	public WebElement getEffectiveDate() {
		return effectiveDate;
	}


	public WebElement getEffectiveDateValueas1() {
		return effectiveDateValueas1;
	}


	public WebElement getSubmitbutton() {
		return submitbutton;
	}


	public WebElement getApprovalMenu() {
		return approvalMenu;
	}


	public WebElement getApprovalDetails() {
		return approvalDetails;
	}


	

}
