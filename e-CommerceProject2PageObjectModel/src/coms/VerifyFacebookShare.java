package coms;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationpractice.TextPages.CreateAccountDetails;
import com.automationpractice.TextPages.CreateAccountDetails_1;
import com.automationpractice.TextPages.ShareOnFaceBook;
import com.automationpractice.TextPages.SignIn;


public class VerifyFacebookShare extends Base {
	@Test
	public void shareFaceBook() throws IOException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		SignIn sn = new SignIn(driver);
		sn.clickSigIn();
		sn.login("shameemshaik82@gmail.com", "Sultana82#");
		
		ShareOnFaceBook fb = new ShareOnFaceBook(driver);
		fb.clickWomen();
		fb.clickOnProduct();
		fb.clickOnFacebook();
		String actualText=fb.getTitle(driver);
		String expectedText="Facebook";
		Assert.assertEquals(actualText, expectedText);
		
		

}
}
