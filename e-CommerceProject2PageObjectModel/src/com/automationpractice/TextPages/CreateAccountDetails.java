package com.automationpractice.TextPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountDetails {
	@FindBy(css="#id_gender2")
	private WebElement titleElement;
	
	@FindBy(id="customer_firstname")
	private WebElement firstnameElement;
	
	@FindBy(id="customer_lastname")
	private WebElement lastnameElement;
	
	@FindBy(css="#email")
	private WebElement emailElement;
	
	@FindBy(id="passwd")
	private WebElement passwordElement;
	
	@FindBy(id="days")
	private WebElement dateDaysElement;
	@FindBy(id="months")
	private WebElement dateMonthsElement;
	@FindBy(id="years")
	private WebElement dateYearsElement;
	@FindBy(id="firstname")
	private WebElement fNameElement;
	@FindBy(id="lastname")
	private WebElement lNameElement;
	@FindBy(id="company")
	private WebElement companyElement;
	@FindBy(id="address1")
	private WebElement AddressElement;
	@FindBy(id="city")
	private WebElement CityElement;
	@FindBy(id="id_state")
	private WebElement StateElement;
	@FindBy(id="postcode")
	private WebElement PostalcodeElement;
	@FindBy(id="id_country")
	private WebElement CountryElement;
	@FindBy(id="phone_mobile")
	private WebElement MobilePhoneElement;
	@FindBy(css="#submitAccount > span")
	private WebElement RegisterElement;
	
	@FindBy(css="#center_column > div")
	private WebElement countryNullAthenticationElement;
	
	
	

	
	
	
	public CreateAccountDetails(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickTitleElement() {
		titleElement.click();
		
	}
	public void addFirstName(String firstname) {
		firstnameElement.sendKeys(firstname);
		
	}
	public void addLastName(String lastname) {
		lastnameElement.sendKeys(lastname);
		
	}
	public String getEmailText() {
		String actualText = emailElement.getText();
		return actualText;
		
	}
	public void addPassword(String password) {
		passwordElement.sendKeys(password);
		
	}
	public void addDateDays(int dindex) {
		Select dd= new Select(dateDaysElement);
		dd.selectByIndex(dindex);
		
	}
	public void addDateMonths(int mindex) {
		Select dd= new Select(dateMonthsElement);
		dd.selectByIndex(mindex);
		
	}
	public void addDateYear(int yindex) {
		Select dd= new Select(dateYearsElement);
		dd.selectByIndex(yindex);
		
	}
	public String getfNameText() {
		String actualText=fNameElement.getText();
				return actualText;
		
	}
	
	public String getlNameText() {
		String actualText=lNameElement.getText();
		return actualText;
	}
	public void addCompanyName(String Name) {
		companyElement.sendKeys(Name);
		
	}
	public void addAddressText(String address) {
		AddressElement.sendKeys(address);
	}
	public void addCityText(String city) {
		CityElement.sendKeys(city);
		
	}
	public void addState(int Sindex) {
		Select dd= new Select (StateElement);
		dd.selectByIndex(Sindex);
	}
	
	public void addPostalCode(String postalcode) {
		PostalcodeElement.sendKeys(postalcode);
		
	}
	public void addCountryText(int Cindex) {
		Select dd=new Select(CountryElement);
		dd.selectByIndex(Cindex);
	}
	public void addMobilePhone(String mobilephone) {
		MobilePhoneElement.sendKeys(mobilephone);
		
	}
	public void clickRegisterButton() {
		RegisterElement.click();
		
	}
	
	public String getcountryNullAthentication() {
		String actualText=countryNullAthenticationElement.getText();
		return actualText;
	}

}
