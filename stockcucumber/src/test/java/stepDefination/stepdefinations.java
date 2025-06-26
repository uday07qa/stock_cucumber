package stepDefination;

import commonFunctions.FunctionLibrary;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class stepdefinations {

	@Given("lanch browser")
	public void lanch_browser() throws Throwable {
	    FunctionLibrary.lanchBrowser();
	}

	@When("lanchURL")
	public void lanchurl() {
	   FunctionLibrary.openURL();
	}

	@When("wait for username with {string} and {string} and {string}")
	public void wait_for_username_with_and_and(String locatertype,String locatervalue,String Testdata) {
	    
		FunctionLibrary.waitforelement(locatertype, locatervalue, Testdata);
	}

	@When("Enter the username with {string} and {string} and {string}")
	public void enter_the_username_with_and_and(String locatertype,String locatervalue,String Testdata) {
	    
		FunctionLibrary.TypeActions(locatertype, locatervalue, Testdata);
	}

	@When("wait for password  with {string} and {string} and {string}")
	public void wait_for_password_with_and_and(String locatertype,String locatervalue,String Testdata) {
		FunctionLibrary.waitforelement(locatertype, locatervalue, Testdata);
	}

	@When("Enter the password with {string} and {string} and {string}")
	public void enter_the_password_with_and_and(String locatertype,String locatervalue,String Testdata) {
	FunctionLibrary.TypeActions(locatertype, locatervalue, Testdata);
	}

	@When("click on the login button with {string} and {string}")
	public void click_on_the_login_button_with_and(String locatertype,String locatervalue) throws Throwable {
		FunctionLibrary.clickaction(locatertype, locatervalue);
	    
	}

	@When("wait for logout link with {string} and {string} and {string}")
	public void wait_for_logout_link_with_and_and(String locatertype,String locatervalue,String Testdata) {
		FunctionLibrary.waitforelement(locatertype, locatervalue, Testdata);
	}

	@When("verify page title with {string}")
	public void verify_page_title_with(String Testdata) {
	   FunctionLibrary.validatetitle(Testdata);
	}

	@When("wait for logout button with {string} and {string} amd {string}")
	public void wait_for_logout_button_with_and_amd(String locatertype,String locatervalue,String Testdata) {
		FunctionLibrary.waitforelement(locatertype, locatervalue, Testdata);
	}

	@When("click on the logout button with {string} and {string}")
	public void click_on_the_logout_button_with_and(String locatertype,String locatervalue) throws Throwable {
	   FunctionLibrary.clickaction(locatertype, locatervalue);
	}

	@When("close the browser")
	public void close_the_browser() {
	    FunctionLibrary.closebrowser();
	}


}
