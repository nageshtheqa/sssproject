package stepDefinations;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pkg.uiautomation.*;

public class SeleniumStepDefinations extends BaseTest {
	public WebDriver driver;

	@Given("webdriver is at placed in desired location")
	public void webdriver_is_at_placed_in_desired_location() {
	    // Write code here that turns the phrase above into concrete actions
		 //throw new io.cucumber.java.PendingException();
		
		System.out.println("webdriver_is_at_placed_in_desired_location");
	}
	@When("webdriver should be intiated and started")
	public void webdriver_should_be_intiated_and_started() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		 //throw new io.cucumber.java.PendingException();
		System.out.println("webdriver_should_be_intiated_and_started");
		driver=BaseTest.getDriver();
		
		
	}
	@Then("chromebrowser is started with desired url")
	public void chromebrowser_is_started_with_desired_url() {
	    // Write code here that turns the phrase above into concrete actions
		 //throw new io.cucumber.java.PendingException();
		System.out.println("chromebrowser_is_started_with_desired_url");
		//driver.get("");
	}

	

	@Then("chromebrowser is closed")
	public void chromebrowser_is_closed() {
	    // Write code here that turns the phrase above into concrete actions
		 //throw new io.cucumber.java.PendingException();
		System.out.println("chromebrowser_is_closed");
		BaseTest.closeBrowser();
		//driver.get("");
	}

}
