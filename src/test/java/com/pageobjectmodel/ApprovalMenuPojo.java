package com.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.BaseProperty;

public class ApprovalMenuPojo extends BaseProperty {




    public ApprovalMenuPojo() {
        PageFactory.initElements(driver, this);

    }


@FindBy(xpath = "//span[text()='Approved sucessfully..All Level of approval are done']")
WebElement appprovedSuccessfully;

@FindBy(xpath = "//span[text()=' Approval Menu']")
private WebElement approvalMenu;

public WebElement getAppprovedSuccessfully() {
	return appprovedSuccessfully;
}


public WebElement getApprovalMenu() {
	return approvalMenu;
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


public WebElement getSubmitCreatedRoutingRule() {
	return submitCreatedRoutingRule;
}


public WebElement getLogoutRefDataApprover() {
	return logoutRefDataApprover;
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





}