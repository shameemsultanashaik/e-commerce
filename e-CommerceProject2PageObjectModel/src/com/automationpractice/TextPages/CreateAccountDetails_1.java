package com.automationpractice.TextPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountDetails_1 {
	@FindBy(css = "#id_gender2")
	private WebElement titleElement;

	@FindBy(id = "customer_firstname")
	private WebElement firstnameElement;

	@FindBy(id = "customer_lastname")
	private WebElement lastnameElement;

	@FindBy(css = "#email")
	private WebElement emailElement;

	@FindBy(id = "passwd")
	private WebElement passwordElement;

	@FindBy(id = "days")
	private WebElement dateDaysElement;
	@FindBy(id = "months")
	private WebElement dateMonthsElement;
	@FindBy(id = "years")
	private WebElement dateYearsElement;
	@FindBy(id = "firstname")
	private WebElement fNameElement;
	@FindBy(id = "lastname")
	private WebElement lNameElement;
	@FindBy(id = "company")
	private WebElement companyElement;
	@FindBy(id = "address1")
	private WebElement AddressElement;
	@FindBy(id = "city")
	private WebElement CityElement;
	@FindBy(id = "id_state")
	private WebElement StateElement;
	@FindBy(id = "postcode")
	private WebElement PostalcodeElement;
	@FindBy(id = "id_country")
	private WebElement CountryElement;
	@FindBy(id = "phone_mobile")
	private WebElement MobilePhoneElement;
	@FindBy(css = "#submitAccount > span")
	private WebElement RegisterElement;
	
	@FindBy(css="#center_column > div")
	private WebElement countryNullAthenticationElement;
	
	@FindBy(css="#center_column > div")
	private WebElement postalNullAthenticationElement;
	

	public CreateAccountDetails_1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickTitleElement() {
		titleElement.click();

	}

	public void addFields(String firstname, String lastname, String password, int dindex, int mindex, int yindex,
			String companyName, String address, String city, int Sindex, String postalcode, int Cindex,
			String mobilephone) {
		firstnameElement.sendKeys(firstname);
		lastnameElement.sendKeys(lastname);
		passwordElement.sendKeys(password);
		Select ddd = new Select(dateDaysElement);
		ddd.selectByIndex(dindex);
		Select mdd = new Select(dateMonthsElement);
		mdd.selectByIndex(mindex);
		Select ydd = new Select(dateYearsElement);
		ydd.selectByIndex(yindex);
		companyElement.sendKeys(companyName);
		AddressElement.sendKeys(address);
		CityElement.sendKeys(city);
		Select sdd = new Select(StateElement);
		sdd.selectByIndex(Sindex);
		PostalcodeElement.sendKeys(postalcode);
		Select cdd = new Select(CountryElement);
		cdd.selectByIndex(Cindex);
		MobilePhoneElement.sendKeys(mobilephone);

	}
	
	
	public String getEmailText() {
		String actualText = emailElement.getText();
		return actualText;

	}

	public String getfNameText() {
		String actualText = fNameElement.getText();
		return actualText;

	}

	public String getlNameText() {
		String actualText = lNameElement.getText();
		return actualText;
	}
	
	public String getcountryNullAthentication() {
		String actualText=countryNullAthenticationElement.getText();
		return actualText;
	}
	
	public String getpostalNullAthentication() {
		String actualText=postalNullAthenticationElement.getText();
		return actualText;
	}


	public void clickRegisterButton() {
		RegisterElement.click();

	}

}
