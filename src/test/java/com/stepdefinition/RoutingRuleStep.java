package com.stepdefinition;


import static org.testng.Assert.assertEquals;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.SessionId;
import org.testng.Assert;
import com.pageobjectmodel.RoutingRulePojo;
import com.utility.BaseProperty;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RoutingRuleStep extends BaseProperty {

    RoutingRulePojo RoutingRulePojo;



    @Given("cilck on onboarding data")
    public void cilck_on_onboarding_data() throws InterruptedException, AWTException {

        launchChromebrowser();
        loadUrl(baseUrl+"volpayui/#/");

        // need to reconfigure	
        WebElement username = driver.findElement(By.id("UsrId"));
        username.sendKeys("adminuserauto");

        WebElement password = driver.findElement(By.id("Pswd"));
        password.sendKeys("Volpay@300");

        WebElement login = driver.findElement((By.xpath("//button[@type='submit']")));
        login.click();
        Thread.sleep(400);
//        SessionId s = ((ChromeDriver) driver).getSessionId();
//System.out.println(s);
        
        
        

        
        
        
        
        
        
        
        
        
        
        
        // need to reconfigure
        RoutingRulePojo = new RoutingRulePojo();
       btnClick(RoutingRulePojo.getOnBoardingDataTabOn());

        
     //   Assert.assertTrue(true);



    }

    @When("click the routing rule and click add routing rule")
    public void click_the_routing_rule_and_click_add_routing_rule() throws InterruptedException {
        //Thread.sleep(3000);
        btnClick(RoutingRulePojo.getRoutingRulesTabOn());
        //Thread.sleep(5000);
        btnClick(RoutingRulePojo.getCreateButtonOn());
        //Thread.sleep(2000);


        //throw new cucumber.api.PendingException();
    }

    @When("Enter the data in the mandatory fields")
    public void enter_the_data_in_the_mandatory_fields() throws AWTException, InterruptedException {
        fill(RoutingRulePojo.getRuleCodeOn(), "CCT_103_OUT_Automation7");
        fill(RoutingRulePojo.getRuleNameOn(), "CCT_103_OUT_Automation7");
        btnClick(RoutingRulePojo.getEntityStatusCode());
        Robot rob = new Robot();
        rob.keyPress(KeyEvent.VK_DOWN);
        rob.keyPress(KeyEvent.VK_DOWN);
        rob.keyPress(KeyEvent.VK_ENTER);
        btnClick(RoutingRulePojo.getEffectiveFrom());

        btnClick(RoutingRulePojo.getDate());

        btnClick(RoutingRulePojo.getEntityMessageFunctionCode());

        btnClick(RoutingRulePojo.getEmfcCustomerCreditTransfer());

        btnClick(RoutingRulePojo.getSkipRule());

        rob.keyPress(KeyEvent.VK_DOWN);
        rob.keyPress(KeyEvent.VK_DOWN);
        rob.keyPress(KeyEvent.VK_ENTER);

        btnClick(RoutingRulePojo.getCreateRule());

        btnClick(RoutingRulePojo.getCreateRuleBuilderTag());

        dropDown(RoutingRulePojo.getCreateRuleBuilderTag(), "CCY");

        dropDown(RoutingRulePojo.getCreateRuleBuildercondition(), "CONTAINS");

        btnClick(RoutingRulePojo.getCreateRuleBuilderValue());

        btnClick(RoutingRulePojo.getCrbvUsd());

        btnClick(RoutingRulePojo.getCreateRuleBuilderSubmit());

        btnClick(RoutingRulePojo.getEntityMessageTypeCode());

        btnClick(RoutingRulePojo.getEmtcCustomerCreditTransfer());
        fill(RoutingRulePojo.getEntityProcessCode(), "OUTGOING");

        btnClick(RoutingRulePojo.getDistributedEndpoint());

        btnClick(RoutingRulePojo.getDeSWIFTCLEARING());





    }

    @When("click submit")
    public void click_submit() throws InterruptedException {

        btnClick(RoutingRulePojo.getRrSubmit());

        System.out.println("Assertion test begins");


        assertEquals(getTxtValue1(RoutingRulePojo.getRoutingrulecreatedsuccess()), "Success");



    }

    @When("switch tab and login into refdataapprover user")
    public void switch_tab_and_login_into_refdataapprover_user() throws InterruptedException, AWTException {




        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_T);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_T);


        switchwindow(1);

        loadUrl(baseUrl+"volpayui/#/");


        // need to reconfigure	
        WebElement username = driver.findElement(By.id("UsrId"));
        username.sendKeys("refdataapproverauto");

        WebElement password = driver.findElement(By.id("Pswd"));
        password.sendKeys("Volpay@300");

        WebElement login = driver.findElement((By.xpath("//button[@type='submit']")));
        login.click();

        printTitle();

    }

    @When("click approval menu and and approval details tab")
    public void click_approval_menu_and_and_approval_details_tab() throws InterruptedException {

        btnClick(RoutingRulePojo.getApprovalMenu());

        btnClick(RoutingRulePojo.getApprovalDetails());



    }

    @When("Click  created routing rule")
    public void click_created_routing_rule() throws InterruptedException {

        btnClick(RoutingRulePojo.getToClickCreatedApproveRoutingRule());

    }

    @When("Approve the new routing rule")
    public void approve_the_new_routing_rule() throws InterruptedException {

        btnClick(RoutingRulePojo.getToApproveCreatedRoutingRule());


        btnClick(RoutingRulePojo.getSubmitCreatedRoutingRule());


        System.out.println("Routing rule approved successfully");

    }

    @Then("logout of the refdataapprover user")
    public void logout_of_the_refdataapprover_user() throws InterruptedException {

        btnClick(RoutingRulePojo.getLogoutRefDataApprover());
        quitChrome();
    }

}