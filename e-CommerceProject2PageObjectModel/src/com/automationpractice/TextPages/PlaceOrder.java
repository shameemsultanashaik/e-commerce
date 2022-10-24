package com.automationpractice.TextPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PlaceOrder {
	@FindBy(css="#block_top_menu > ul > li:nth-child(1) > a")
	private WebElement womenElement;
	
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[2]/h5/a")
	private WebElement Onproduct1Element;
	
	@FindBy(css="#add_to_cart > button > span")
	private WebElement addCartWomenElement;
	
	@FindBy(xpath="/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[1]/h2")
	private WebElement textMessageWomenElement;
	
	@FindBy(css="#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > span > span")
	private WebElement continueShoppingWomenElement;
	
	@FindBy(xpath="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/a")
	private WebElement onDressesElement;
	
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div[2]/ul/li[4]/div/div[2]/h5/a")
	private WebElement productdressElement;
	
	@FindBy(id="add_to_cart")
	private WebElement addToCartdressElement;
	
	
	@FindBy(css="#layer_cart > div.clearfix > div.layer_cart_product.col-xs-12.col-md-6 > h2")
	private WebElement textMessagedressElement;
	
	@FindBy(css="#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > span > span")
	private WebElement continueShoppingdressElement;
	
	@FindBy(css="#block_top_menu > ul > li:nth-child(3) > a")
	private WebElement tShirtElement;
	
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[2]/h5/a")
	private WebElement producttShirtElement;
	
	
	@FindBy(css="#add_to_cart > button > span")
	private WebElement addToCarttShirtElement;
	
	@FindBy(css="#layer_cart > div.clearfix > div.layer_cart_product.col-xs-12.col-md-6 > h2")
	private WebElement textMessagetShirtElement;
	
	@FindBy(css="#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a > span")
	private WebElement proceedToCheckout1Element;
	
	@FindBy(css="#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium > span")
	private WebElement proceedToCheckout2Element;
	
	@FindBy(css="#center_column > form > p > button > span")
	private WebElement proceedToCheckout3Element;
	
	@FindBy(name="cgv")
	private WebElement CheckoutElement;
	
	@FindBy(css="#form > p > button > span")
	private WebElement proceedCheckout4Element;
	
	@FindBy(css="#HOOK_PAYMENT > div:nth-child(1) > div > p > a")
	private WebElement bankWireElement;
	
	@FindBy(css="#cart_navigation > button > span")
	private WebElement myOrderElement;
	
	@FindBy(css="#center_column > div > p > strong")
	private WebElement verifyTextMessageElement;
	
	
	public PlaceOrder(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}public void clickWomen() {
		womenElement.click();
		
	}
	
	public void clickOnProduct1() {
		Onproduct1Element.click();
	
		
	}
	public void addToCart() {
		addCartWomenElement.click();
		
	}
	
	public String getTextMessage1() {
		String actualText=textMessageWomenElement.getText();
		return actualText;
		
				
	}
	public void continueShopping() {
		continueShoppingWomenElement.click();
		
	}
	
		
	
	public void clickDresses() {
		onDressesElement.click();
		
	}
	public void clickProduct() {
		productdressElement.click();
		
	}
	public void addToCartDress() {
		addToCartdressElement.click();
		
	}
	public String getTextMessage2() {
		String actualText=textMessagedressElement.getText();
		return actualText;
	}
	
	public void clickcontinueShoppingdress() {
		continueShoppingdressElement.click();
	}
	public void clicktShirt() {
		tShirtElement.click();
	}
	public void clickproducttShirt() {
		producttShirtElement.click();
	}
	public void addToCarttShirt() {
		addToCarttShirtElement.click();
	}
	public String gettextMessagetShirt() {
		String actualText=textMessagetShirtElement.getText();
		return actualText;
	}
	public void clickproceedToCheckout1() {
		proceedToCheckout1Element.click();
	}
	public void clickproceedToCheckout2() {
		proceedToCheckout2Element.click();
	}
	public void clickproceedToCheckout3() {
		proceedToCheckout3Element.click();
		
	}
	public void clickCheckout() {
		CheckoutElement.click();
	}
	public void clickproceedCheckout4() {
		proceedCheckout4Element.click();
	}
	public void clickbankWire() {
		bankWireElement.click();
	}
	public void clickmyOrder() {
		myOrderElement.click();
	}
	public String getverifyTextMessage() {
		String actualText=verifyTextMessageElement.getText();
		return actualText;
	}
			
	
	

}
