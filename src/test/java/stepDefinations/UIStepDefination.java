package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class UIStepDefination {

	   @Given("^user is on registartion page ui$")
	    public void user_is_on_registartion_page_ui() throws Throwable {
		   System.out.println("////////user_is_on_registartion_page_ui////////1");
	        //throw new PendingException();
	    }

	    @When("^user clicks on register ui$")
	    public void user_clicks_on_register_ui() throws Throwable {
	        //throw new PendingException();
	    	System.out.println("////////user_clicks_on_register_ui/////////1");
	    }
	    
	    @Given("^user is on registartion page ui 2$")
	    public void user_is_on_registartion_page_ui_2() throws Throwable {
	    	System.out.println("////////user_is_on_registartion_page_ui_2/////");
	        //throw new PendingException();
	    }

	    @When("^user clicks on register ui 2$")
	    public void user_clicks_on_register_ui_2() throws Throwable {
		     System.out.println("////////user_clicks_on_register_ui_2////");
	    	//throw new PendingException();
	    }
}
