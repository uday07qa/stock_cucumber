package StepDefination;



import commonfunctions.functionalLibrary;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class exestinguser_login extends functionalLibrary {
 


	
	
	@When("click on the signup with {string} and {string}")
	public void click_on_the_signup_with_and(String locatertype,String locatervalue) {
	   functionalLibrary.clickAction(locatertype, locatervalue);
	}

	@When("scroll down for username field with {string}")
	public void scroll_down_for_username_field_with(String testdata) {
	   functionalLibrary.scrolling(testdata);
	}

	@When("enter the username with {string} and {string}")
	public void enter_the_username_with_and(String locatertype,String locatervalue) {
	   functionalLibrary.TypeActions(locatertype, locatervalue, compro.getProperty("username"));
	}

	
	@When("enter the password with {string} and {string}")
	public void enter_the_password_with_and(String locatertype,String locatervalue) {
		functionalLibrary.TypeActions(locatertype, locatervalue, compro.getProperty("password"));
	}
	
	@When("click on signup button with {string} and {string}")
	public void click_on_signup_button_with_and(String locatertype,String locatervalue) {
	    functionalLibrary.clickAction(locatertype, locatervalue);
	}

	

	@Then("verify the user name  need to display the user menu  with {string} and {string} and {string}")
	public void verify_the_user_name_need_to_display_the_user_menu_with_and_and(String locatertype,String locatervalue, String testdata) {
	   functionalLibrary.verifytheuser(locatertype, locatervalue, testdata);
	}
	@Then("close the browser")
	public void close_the_browser() {
	   functionalLibrary.closebrowser();
	}
	@Then("wait for some seconds with {string}")
	public void wait_for_some_seconds_with(String testdata) throws Throwable {
		functionalLibrary.threedsleeo(testdata);
	}

	
}
