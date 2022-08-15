package com.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.BaseProperty;

public class LoginPojo extends BaseProperty {

	
		
	 public LoginPojo() {
			PageFactory.initElements(driver, this);
				}
		@FindBy(id="UsrId")
		private WebElement usernNameLogin;
		
		@FindBy(id="Pswd")
		private WebElement passwordLogin;
		
		@FindBy(xpath="//button[@type='submit']")
		private WebElement submitLogin;

		public WebElement getUsernNameLogin() {
			return usernNameLogin;
		}

		public WebElement getPasswordLogin() {
			return passwordLogin;
		}

		public WebElement getSubmitLogin() {
			return submitLogin;
		}

		public void setSubmitLogin(WebElement submitLogin) {
			this.submitLogin = submitLogin;
		}
		 
		
		
		
	
}
