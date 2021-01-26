package stepdefinations;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefination {

	
	
	@Given("^User is on login page$")
	public void user_is_on_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User navigated to login page");
	}

	@When("^User enter valid username and password$")
	public void user_enter_valid_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User entered valid username and password");
	}

	@When("^User click on login button$")
	public void user_click_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User click on login button");
	}

	@Then("^Home page is displayed$")
	public void home_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Home page is displayed");
	}
	
	@When("^User enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_valid_and(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("username: "+arg1);
	    System.out.println("paswword: "+arg2);
	}
	@Given("^User is on Netbanking login page$")
	public void user_is_on_Netbanking_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^User sign with following details$")
	public void user_sign_with_following_details(DataTable data) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		
		List<List<String>> dataToEnter=data.raw();
    	System.out.println(dataToEnter.get(0).get(0));	
    	System.out.println(dataToEnter.get(0).get(1));
    	System.out.println(dataToEnter.get(0).get(2));
    	System.out.println(dataToEnter.get(0).get(3));
    	System.out.println(dataToEnter.get(0).get(4));
	    
	}

	@Then("^User home page is displayed$")
	public void user_home_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^User can see card details$")
	public void user_can_see_card_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

}
