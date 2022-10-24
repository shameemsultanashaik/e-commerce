
package coms;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationpractice.TextPages.CreateAccountDetails;
import com.automationpractice.TextPages.CreateAccountDetails_1;
import com.automationpractice.TextPages.SignIn;

public class VerifyDataDrivenAccountCreation extends Base {
	@Test
	public void accountCreation() throws IOException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		
		SignIn sn = new SignIn(driver);
		CreateAccountDetails_1 cad1 =new CreateAccountDetails_1(driver);
		
		String[][] data = GenericMethods.getData("C:\\Users\\shame\\Downloads\\AccountCreationTestData.xlsx","Sheet1");
		for(int i= 1;i<data.length;i++) {
			sn.clickSigIn();
			sn.clickCreateAccount(data[i][0]);
			
			
			cad1.clickTitleElement();

			cad1.addFields(data[i][1], data[i][2], data[i][3], Integer.valueOf(data[i][4]), Integer.valueOf(data[i][5]), Integer.valueOf(data[i][6]), data[i][7], data[i][8], data[i][9], Integer.valueOf(data[i][10]),data[i][11], Integer.valueOf(data[i][12]),data[i][13]);
			cad1.clickRegisterButton();
			sn.signout();
			
		}
		

		
	

	}
}
