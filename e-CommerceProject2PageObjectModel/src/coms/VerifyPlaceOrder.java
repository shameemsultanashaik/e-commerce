package coms;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationpractice.TextPages.CreateAccountDetails;
import com.automationpractice.TextPages.CreateAccountDetails_1;
import com.automationpractice.TextPages.PlaceOrder;
import com.automationpractice.TextPages.Review;
import com.automationpractice.TextPages.SignIn;



public class VerifyPlaceOrder extends Base {
	@Test
	public void testReview() throws IOException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		SignIn sn = new SignIn(driver);
		sn.clickSigIn();
		sn.login("shameemshaik82@gmail.com", "Sultana82#");
		
		PlaceOrder po = new PlaceOrder(driver);
		po.clickWomen();
		po.clickOnProduct1();
		po.addToCart();
		
//		String actualText=po.getTextMessage1();
//		String expectedText="Product successfully added to your shopping cart";
//		Assert.assertEquals(actualText, expectedText);
//		
		po.continueShopping();
		
		po.clickDresses();
		po.clickProduct();
		po.addToCartDress();
		
//		String actualText1=po.getTextMessage2();
//		String expectedText1="Product successfully added to your shopping cart";
//		Assert.assertEquals(actualText1, expectedText1);
//		
		po.clickcontinueShoppingdress();
		po.clicktShirt();
		po.clickproducttShirt();
		po.addToCarttShirt();
		
//		String actualText2=po.gettextMessagetShirt();
//		String expectedText2="Product successfully added to your shopping cart";
//		Assert.assertEquals(actualText2, expectedText2);
//		
		po.clickproceedToCheckout1();
		po.clickproceedToCheckout2();
		po.clickproceedToCheckout3();
		po.clickCheckout();
		po.clickproceedCheckout4();
		po.clickbankWire();
		po.clickmyOrder();
		
		String actualText3=po.getverifyTextMessage();
		String expectedText3="Your order on My Store is complete.";
		Assert.assertEquals(actualText3, expectedText3);
				
		
		
		
		
		

}
}
