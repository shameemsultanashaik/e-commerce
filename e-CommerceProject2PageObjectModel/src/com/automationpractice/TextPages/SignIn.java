package com.automationpractice.TextPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn {
	@FindBy(css="#header > div.nav > div > div > nav > div.header_user_info > a")
	private WebElement signIn;
	
	@FindBy(id="email_create")
	private WebElement emailElement;
	
	@FindBy(css="#SubmitCreate > span")
	private WebElement submitElement; 
	
	@FindBy(id="email")
	private WebElement emailAddressElement; 
	@FindBy(id="passwd")
	private WebElement passwordElement;
	
	@FindBy(css="#SubmitLogin > span")
	private WebElement signInElement;
	
	@FindBy(css="#header > div.nav > div > div > nav > div:nth-child(2) > a")
	private WebElement signoutElement;
	
	@FindBy(css="#center_column > div.alert.alert-danger")
	private WebElement getAuthenticationMessageElement;
	
	
	
	
	

	
	public SignIn(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickSigIn() {
		signIn.click();
	}
	
	 public void clickCreateAccount(String emailId) {
		 emailElement.sendKeys(emailId);
		 submitElement.click();
		 
	 }
	 
	 public void login(String email, String pass) {
		 emailAddressElement.sendKeys(email);
		 passwordElement.sendKeys(pass);
		 signInElement.click();
	 }
	 
	 public void signout() {
		 signoutElement.click();
		 
	 }
	 
	 public String getAuthenticationMessage() {
		 String actualText=getAuthenticationMessageElement.getText();
		 return actualText;
	 }
		
	
	

}
