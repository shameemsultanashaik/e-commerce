package com.automationpractice.TextPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ShareOnFaceBook {

	@FindBy(css="#block_top_menu > ul > li:nth-child(1) > a")
	private WebElement womenElement;
	
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[2]/h5/a")
	private WebElement OnproductElement;
	
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div/div/div/div[3]/p[7]/button[2]")
	private WebElement OnfacebookElement;
	
	
	public ShareOnFaceBook(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickWomen() {
		womenElement.click();
		
	}
	
	public void clickOnProduct() {
		OnproductElement.click();
		
	}
	public void clickOnFacebook() {
		OnfacebookElement.click();
		
	}
	public String getTitle(WebDriver driver) {
		String winHandleBefore = driver.getWindowHandle();


		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		String title = driver.getTitle();
		driver.close();
		driver.switchTo().window(winHandleBefore);

		return title;
	}

}
