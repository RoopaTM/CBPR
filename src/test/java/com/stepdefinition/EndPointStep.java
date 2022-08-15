package com.stepdefinition;



import com.pageobjectmodel.EndPointPojo;
import com.pageobjectmodel.RoutingRulePojo;
import com.utility.BaseProperty;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EndPointStep extends BaseProperty {
	
	
	EndPointPojo EndPointPojo;
	@Given("cilck on onboarding datab")
	public void cilck_on_onboarding_datab() {
	    
	     
	}

	@When("click the EndPoint and click add new end pointb")
	public void click_the_EndPoint_and_click_add_new_end_pointb() {
	    btnClick(EndPointPojo.getEndpointNameOn());
	    btnClick(EndPointPojo.getCreateButtonOn());
	     
	}

	@When("Enter the data in  mandatory fieldsb")
	public void enter_the_data_in_mandatory_fieldsb() {
	fill(EndPointPojo.getEndPointCode(), "CUSTOMER");
	fill(EndPointPojo.getEndpointNameOn(), "Customer Endpoint");
	btnClick(EndPointPojo.getEndPointGroupCode());
	btnClick(EndPointPojo.getEndPointGroupCodeValue());
	btnClick(EndPointPojo.getEndPointCategory());
	btnClick(EndPointPojo.getEndPointCategoryvalue());
	btnClick(EndPointPojo.getEntityMessageFuncionCode());
	btnClick(EndPointPojo.getEntityMessageFuncionCodeValue());
	btnClick(EndPointPojo.getEntityStatusCode());
dropDown(EndPointPojo.getEntityStatusCode(), "ACTIVE");
btnClick(EndPointPojo.getEffectiveDate());
btnClick(EndPointPojo.getEffectiveDateValueas1());
btnClick(EndPointPojo.getSubmitbutton());
	}

	@When("click the submitb")
	public void click_the_submitb() {
	    // Write code here that turns the phrase above into concrete actions
	     
	}

	@When("switch tab and login into refdataapprover userb")
	public void switch_tab_and_login_into_refdataapprover_userb() {
	    // Write code here that turns the phrase above into concrete actions
	     
	}

	@When("click approval menu and and approval details tabb")
	public void click_approval_menu_and_and_approval_details_tabb() {
	    // Write code here that turns the phrase above into concrete actions
	     
	}

	@When("Click  created routing ruleb")
	public void click_created_routing_ruleb() {
	    // Write code here that turns the phrase above into concrete actions
	     
	}

	@When("Approve the new routing ruleb")
	public void approve_the_new_routing_ruleb() {
	    // Write code here that turns the phrase above into concrete actions
	     
	}

	@Then("logout of the refdataapprover userb")
	public void logout_of_the_refdataapprover_userb() {
	    // Write code here that turns the phrase above into concrete actions
	     
	}

}
