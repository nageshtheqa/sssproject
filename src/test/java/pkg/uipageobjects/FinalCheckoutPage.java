package pkg.uipageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pkg.uiautomation.BaseTest;

public class FinalCheckoutPage extends BaseTest {

	//WebDriver driver;
	/*
	 * public FinalCheckoutPage(WebDriver driver) { // TODO Auto-generated
	 * constructor stub this.driver=driver;
	 * 
	 * }
	 */
	
	By agree = By.xpath("//input[@class='chkAgree']");
	By proceed = By.xpath("//button[text()='Proceed']");
	
	public void selectAgreeTandC() {
		driver.findElement(agree).click();
	}
	
	public void clickProceed() throws InterruptedException {
		driver.findElement(proceed).click();
		Thread.sleep(10000);
	}
}
