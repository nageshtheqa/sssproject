package pkg.uipageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pkg.uiautomation.BaseTest;

public class LandingPage {
	//BaseTest
	//new BaseTest();
	WebDriver driver;
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		
	}
	By search=By.xpath("//input[@type='search']");
	By addtocard=By.xpath("//button[text()='ADD TO CART']");
	By carticon = By.xpath("//img[@alt='Cart']");
	By proceedtocheckout = By.xpath("//button[text()='PROCEED TO CHECKOUT']");
	
	public void searchItem(String strArg1) throws InterruptedException {
		driver.findElement(search).sendKeys(strArg1);
		Thread.sleep(10000);
		
	}
	
	public void addItemToCart() {
		driver.findElement(addtocard).click();			
	}
	
	public void clickCartIcon() {
		driver.findElement(carticon).click();			
	}
	public void proceedToCheckout() throws InterruptedException {
		driver.findElement(proceedtocheckout).click();		
		Thread.sleep(10000);
	}
}
