package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class RegistrationSteps {

	@Given("user is on registartion page")
	public void user_is_on_registartion_page() {
		System.out.println("****user_is_on_registartion_page***");
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}
	@When("user clicks on register")
	public void user_clicks_on_register() {
		System.out.println("****user_clicks_on_register*****");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	
	@Given("user is on registartion page2")
	public void user_is_on_registartion_page2() {
		System.out.println("****user_is_on_registartion_page2***");
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}
	@When("user clicks on register2")
	public void user_clicks_on_register2() {
		System.out.println("****user_clicks_on_register2*****");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
}
