package coms;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationpractice.TextPages.CreateAccountDetails;
import com.automationpractice.TextPages.CreateAccountDetails_1;
import com.automationpractice.TextPages.SignIn;

public class VerifyPostalCodeNull extends Base {
	@Test
	public void accountCreation() throws IOException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		
		SignIn sn = new SignIn(driver);
		sn.clickSigIn();
		sn.clickCreateAccount("shaik123780@gmail.com");
		
//		CreateAccountDetails cad=new CreateAccountDetails(driver);
//		cad.clickTitleElement();
//		
//		cad.addFirstName("Haroon");
//		
//		cad.addLastName("Rasheed");
//		
//		String actualText=cad.getEmailText();
//		String expectedText="shameem123789@gmail.com";
//		Assert.assertEquals(actualText, expectedText);
		
//		cad.addPassword("Syed1976#");
//		cad.addDateDays(25);
//		cad.addDateMonths(5);
//		cad.addDateYear(46);
//		
////		String actualText=cad.getfNameText();
////		String expectedText="Heron";
////		Assert.assertEquals(actualText, expectedText);
////		
////		String actualText1=cad.getlNameText();
////		String expectedText1="Rushed";
////		Assert.assertEquals(actualText1, expectedText1);
//		
//		cad.addCompanyName("Aigebra");
//		
//		cad.addAddressText("3323 151st ");
//		
//		cad.addCityText("surrey");
//		
//		cad.addState(10);
//		
//		cad.addPostalCode("90210");
//		
//		cad.addCountryText(1);
//		
//		cad.addMobilePhone("510-366-6536");
//		
//		cad.clickRegisterButton();
		
		CreateAccountDetails_1 cad1 =new CreateAccountDetails_1(driver);
		cad1.clickTitleElement();

		cad1.addFields("Haroon", "Rasheed", "Syed1976#", 25, 5, 46, "Aigebra", "3323 151st", "surrey", 10, "0", 1, "510-366-6536");
		cad1.clickRegisterButton();
		
		String actualText=cad1.getpostalNullAthentication();
		String expectedText="There is 1 error\nThe Zip/Postal code you've entered is invalid. It must follow this format: 00000";
				
		Assert.assertEquals(actualText, expectedText);
				
	
	}
}

