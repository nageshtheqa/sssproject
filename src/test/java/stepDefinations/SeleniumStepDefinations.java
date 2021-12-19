package stepDefinations;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pkg.uiautomation.*;
import pkg.uipageobjects.CartLandingPage;
import pkg.uipageobjects.LandingPage;

public class SeleniumStepDefinations extends BaseTest {
	public WebDriver driver;
	LandingPage landingpage ; 
	CartLandingPage cart;
	
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
		landingpage = new LandingPage(driver);
		
	}
	@Then("chromebrowser is started with desired url")
	public void chromebrowser_is_started_with_desired_url() {
	    // Write code here that turns the phrase above into concrete actions
		 //throw new io.cucumber.java.PendingException();
		System.out.println("chromebrowser_is_started_with_desired_url");
		//driver.get("");
	}

	@And("^user searches item \"([^\"]*)\"$")
    public void user_searches_item_something(String strArg1) throws Throwable {
		landingpage.searchItem(strArg1); 
        //Thread.sleep(10000);
    }
	

    @And("^user adds the item to cart$")
    public void user_adds_the_item_to_cart() throws Throwable {
    	landingpage.addItemToCart();
        //throw new PendingException();
    }

    @And("^user clicks cart icon$")
    public void user_clicks_cart_icon() throws Throwable {
    	landingpage.clickCartIcon();
        //throw new PendingException();
    }

    @And("^user clicks on proceed to checkout$")
    public void user_clicks_on_proceed_to_checkout() throws Throwable {
    	landingpage.proceedToCheckout();
        //throw new PendingException();
    	
    }
    

    @And("^user clicks on place order$")
    public void user_clicks_on_place_order() throws Throwable {
    	//landingpage.proceedToCheckout();
    	
        //throw new PendingException();
    	cart = new CartLandingPage(driver);
    	cart.clickPlaceOrder();
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
