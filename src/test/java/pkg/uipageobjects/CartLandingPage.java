package pkg.uipageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pkg.uiautomation.BaseTest;

public class CartLandingPage {
	//BaseTest
	//new BaseTest();
	WebDriver driver;
	public CartLandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		
	}
	
	By placeorder = By.xpath("//button[text()='Place Order']");
	
	public void clickPlaceOrder() throws InterruptedException{
		
		driver.findElement(placeorder).click();
		Thread.sleep(10000);
	}
}
