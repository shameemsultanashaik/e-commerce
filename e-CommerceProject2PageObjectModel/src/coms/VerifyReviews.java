package coms;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationpractice.TextPages.CreateAccountDetails;
import com.automationpractice.TextPages.CreateAccountDetails_1;
import com.automationpractice.TextPages.Review;
import com.automationpractice.TextPages.SignIn;


public class VerifyReviews extends Base {
	@Test
	public void testReview() throws IOException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		SignIn sn = new SignIn(driver);
		sn.clickSigIn();
		sn.login("shameemshaik82@gmail.com", "Sultana82#");
		
		Review r=new Review(driver);
		r.clickWomen();
		r.clickProduct();
		r.clickOnWriteReview();
		r.addTitleBox("Good", "Product is very Nice");
		r.clickOnSend();
		String actualText=r.getTextMessage();
		String expectedText="Your comment has been added and will be available once approved by a moderator";
		Assert.assertEquals(actualText, expectedText);
		
		r.clickOk();


}
}