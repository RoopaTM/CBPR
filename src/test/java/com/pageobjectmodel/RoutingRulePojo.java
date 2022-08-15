package com.pageobjectmodel;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.BaseProperty;

public class RoutingRulePojo extends BaseProperty {


    public RoutingRulePojo() {
        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath = "//span[contains(text(),'OnBoarding Data')]")
    WebElement onBoardingDataTabOn;



    @FindBy(xpath = "//span[contains(text(),'Routing Rules')]")
    private WebElement routingRulesTabOn;

    @FindBy(xpath = "//i[@title='Add Routing Rules']")
    private WebElement createButtonOn;
    
    @FindBy(xpath = "//button[@title='Update']")
    private WebElement updateButtonOn;
    
    @FindBy(xpath = "//button[@title='Update']")
    private WebElement deleteButtonOn;
    

    
    
  

    public WebElement getDeleteButtonOn() {
		return deleteButtonOn;
	}



	public WebElement getUpdateButtonOn() {
		return updateButtonOn;
	}
	@FindBy(id = "RuleCd")
    private WebElement ruleCodeOn;

    @FindBy(id = "RuleNm")
    private WebElement ruleNameOn;


    @FindBy(id = "NttyStsCd")
    private WebElement entityStatusCode;

    @FindBy(id = "FctvFr")
    private WebElement effectiveFrom;

    @FindBy(linkText = "1")
    private WebElement date;



    @FindBy(xpath = "//span[text()='Please Enter Entity Message Function Code']")
    private WebElement entityMessageFunctionCode;


    @FindBy(xpath = "//li[contains(text(),'CustomerCreditTransfer')]")
    private WebElement emfcCustomerCreditTransfer;


    public WebElement getEmfcCustomerCreditTransfer() {
        return emfcCustomerCreditTransfer;
    }
    @FindBy(id = "SkipRule")
    private WebElement skipRule;


    @FindBy(xpath = "//i[contains(text(),'CREATE RULE')]")
    private WebElement createRule;


    @FindBy(xpath = "//div[@class='col-md-3 mt-1']//select")
    private WebElement createRuleBuilderTag;

    @FindBy(xpath = "(//select[contains(@class,'form-control ng-untouched')])[2]")
    private WebElement createRuleBuildercondition;

    @FindBy(xpath = "//span[@title='dropdown']//span")
    private WebElement createRuleBuilderValue;


    @FindBy(xpath = "//li[contains(text(),'USD')]")
    private WebElement crbvUsd;

    //span[@title='USD']


    public WebElement getCrbvUsd() {
        return crbvUsd;
    }
    @FindBy(xpath = "//button[@type='submit ']")
    private WebElement createRuleBuilderSubmit;



    @FindBy(xpath = "//span[@class='select2-selection__placeholder']")
    private WebElement entityMessageTypeCode;

    @FindBy(xpath = "//li[text()='MT103']")
    private WebElement emtcCustomerCreditTransfer;

    @FindBy(id = "NttyPrcCd")
    private WebElement entityProcessCode;


    @FindBy(xpath = "//span[text()='Please Enter Distributed Endpoint']")
    private WebElement distributedEndpoint;

    @FindBy(xpath = "//li[text()='AUS_NonISO']")
    private WebElement deSWIFTCLEARING;


    @FindBy(xpath = "//button[text()=' Submit ']")
    private WebElement rrSubmit;

    //validation

    @FindBy(xpath = "//span[text()='Success']")
    private WebElement routingrulecreatedsuccess;
    
    
    
    @FindBy(xpath = "//td[@data-label='ID']//child::span[@tabindex='0']")
    private WebElement newEntityId; 
    
  
    
    

    //refdataapprover


    public WebElement getNewEntityId() {
		return newEntityId;
	}



	public WebElement getRoutingrulecreatedsuccess() {
        return routingrulecreatedsuccess;
    }
    @FindBy(xpath = "//span[text()=' Approval Menu']")
    private WebElement approvalMenu;








    public WebElement getApprovalMenu() {
        return approvalMenu;
    }
    @FindBy(xpath = "//span[text()='Approval Details']")
    private WebElement approvalDetails;

    @FindBy(xpath = "//div[@class='col-auto mr-auto w-75 float-left pr-0']")
    private WebElement toClickCreatedApproveRoutingRule;

    @FindBy(xpath = "//button[text()=' Approve ']")
    private WebElement toApproveCreatedRoutingRule;


    @FindBy(xpath = "//button[text()=' Submit ']")
    private WebElement submitCreatedRoutingRule;


    @FindBy(xpath = "//button[@title='Logout']")
    private WebElement logoutRefDataApprover;









    public WebElement getSubmitCreatedRoutingRule() {
        return submitCreatedRoutingRule;
    }



    public WebElement getLogoutRefDataApprover() {
        return logoutRefDataApprover;
    }



    public WebElement getApprovalDetails() {
        return approvalDetails;
    }

    public WebElement getToClickCreatedApproveRoutingRule() {
        return toClickCreatedApproveRoutingRule;
    }

    public WebElement getToApproveCreatedRoutingRule() {
        return toApproveCreatedRoutingRule;
    }

    public WebElement getDistributedEndpoint() {
        return distributedEndpoint;
    }

    public WebElement getDeSWIFTCLEARING() {
        return deSWIFTCLEARING;
    }

    public WebElement getRrSubmit() {
        return rrSubmit;
    }

    public WebElement getEntityProcessCode() {
        return entityProcessCode;
    }

    public WebElement getEmtcCustomerCreditTransfer() {
        return emtcCustomerCreditTransfer;
    }

    public WebElement getEntityMessageTypeCode() {
        return entityMessageTypeCode;
    }



    public WebElement getCreateRuleBuilderTag() {
        return createRuleBuilderTag;
    }

    public WebElement getCreateRuleBuildercondition() {
        return createRuleBuildercondition;
    }

    public WebElement getCreateRuleBuilderValue() {
        return createRuleBuilderValue;
    }



    public WebElement getCreateRuleBuilderSubmit() {
        return createRuleBuilderSubmit;
    }

    public WebElement getDate() {
        return date;
    }



    public WebElement getSkipRule() {
        return skipRule;
    }

    public WebElement getCreateRule() {
        return createRule;
    }

    public WebElement getOnBoardingDataTabOn() {
        return onBoardingDataTabOn;
    }

    public WebElement getEntityMessageFunctionCode() {
        return entityMessageFunctionCode;
    }

    public WebElement getRoutingRulesTabOn() {
        return routingRulesTabOn;
    }

    public WebElement getCreateButtonOn() {
        return createButtonOn;
    }

    public WebElement getRuleCodeOn() {
        return ruleCodeOn;
    }

    public WebElement getRuleNameOn() {
        return ruleNameOn;
    }

    public WebElement getEntityStatusCode() {
        return entityStatusCode;
    }

    public WebElement getEffectiveFrom() {
        return effectiveFrom;
    }






}