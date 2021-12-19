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
import pkg.uipageobjects.FinalCheckoutPage;

public class CheckoutStepDefs extends BaseTest {
	FinalCheckoutPage finalpage=new FinalCheckoutPage();
	
	  @And("^user agrees terms and conditions$")
	    public void user_agrees_terms_and_conditions() throws Throwable {
		  finalpage.selectAgreeTandC();
	       // throw new PendingException();
	    }

	    @And("^user clicks proceed$")
	    public void user_clicks_proceed() throws Throwable {
	    	finalpage.clickProceed();
	        //throw new PendingException();
	    }

	
}
