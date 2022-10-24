package coms;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationpractice.TextPages.CreateAccountDetails;
import com.automationpractice.TextPages.CreateAccountDetails_1;
import com.automationpractice.TextPages.SignIn;

public class VerifySignIn extends Base{
	@Test
	public void DoSignIn() throws IOException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		SignIn sn = new SignIn(driver);
		sn.clickSigIn();
		sn.login("shameemshaik82@gmail.com", "Sultana82#");
		sn.signout();
		
		
		

}
}
