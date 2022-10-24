package com.automationpractice.TextPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Review {
	@FindBy(css="#block_top_menu > ul > li:nth-child(1) > a")
	private WebElement womenElement;
	
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[2]/h5/a")
	private WebElement ProductElement;
	
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div/div/div/div[3]/div[3]/ul/li/a")
	private WebElement writeAReviewElement;
	
	@FindBy(css="#comment_title")
	private WebElement titleBoxElement;
	
	@FindBy(css="#content")
	private WebElement commentBoxElement;
	
	@FindBy(css="#submitNewMessage > span")
	private WebElement sendElement;
	
	@FindBy(css="#product > div.fancybox-wrap.fancybox-desktop.fancybox-type-html.fancybox-opened > div > div > div > p:nth-child(2)")
	private WebElement textMessageElement;
	
	@FindBy(css="#product > div.fancybox-wrap.fancybox-desktop.fancybox-type-html.fancybox-opened > div > div > div > p.submit > button > span")
	private WebElement clickOkElement;
	
	
	
	
	public Review(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickWomen() {
		womenElement.click();
		
	}
	public void clickProduct() {
		ProductElement.click();
		
	}
	public void clickOnWriteReview() {
		writeAReviewElement.click();
		
	}
	public void addTitleBox(String titlebox,String commentbox) {
		titleBoxElement.sendKeys(titlebox);
		commentBoxElement.sendKeys(commentbox);
		
	}
	public void clickOnSend() {
		sendElement.click();
		
	}
	public String getTextMessage() {
		String actualText = textMessageElement.getText();
		return actualText;
		
	}
	public void clickOk() {
		clickOkElement.click();
		
	}

}
