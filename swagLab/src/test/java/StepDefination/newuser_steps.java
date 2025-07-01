package StepDefination;

import commonfunctions.functionalLibrary;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class newuser_steps  {
	
	@Given("open the lanchbrowser")
	public void open_the_lanchbrowser() throws Throwable {
	   functionalLibrary.lanchbrowser();
	}

	@When("open the projectwebsite")
	public void open_the_projectwebsite() {
	   functionalLibrary.url();
	}
	
	@When("Wait for create account {string} and {string} and {string}")
	public void wait_for_create_account_and_and(String locatertype,String locatervalue,String testdata) {
		 functionalLibrary.waitforelement(locatertype, locatervalue, testdata);
			}
	
	

	@When("Click on create account with {string} and {string}")
	public void click_on_create_account_with_and(String locatertype,String locatervalue) {
	    functionalLibrary.clickAction(locatertype, locatervalue);
		
	}

	
	@When("Wait for create form {string} and {string} and {string}")
	public void wait_for_create_form_and_and(String locatertype,String locatervalue,String testdata) {
		functionalLibrary.waitforelement(locatertype, locatervalue, testdata);
	}

	@When("Enter the firestname with {string} and {string} and {string}")
	public void enter_the_firestname_with_and_and(String locatertype,String locatervalue,String testdata) {
	    functionalLibrary.TypeActions(locatertype, locatervalue, testdata);
	}

	@When("Enter the lastname with {string} and {string} and {string}")
	public void enter_the_lastname_with_and_and(String locatertype,String locatervalue,String testdata) {
		functionalLibrary.TypeActions(locatertype, locatervalue, testdata);
	}

	@When("Enter the Email with {string} and {string} and {string}")
	public void enter_the_Email_with_and_and(String locatertype,String locatervalue,String testdata) {
		functionalLibrary.TypeActions(locatertype, locatervalue, testdata);
	}

	@When("Enter the password with {string} and {string} and {string}")
	public void enter_the_password_with_and_and(String locatertype,String locatervalue,String testdata) {
		functionalLibrary.TypeActions(locatertype, locatervalue, testdata);
	}

	@When("Enter the re-enterpassword with {string} and {string} and {string}")
	public void enter_the_re_enterpassword_with_and_and(String locatertype,String locatervalue,String testdata) {
		functionalLibrary.TypeActions(locatertype, locatervalue, testdata);
	}

	@When("click on the createaccount button with {string} and {string}")
	public void click_on_the_createaccount_button_with_and(String locatertype,String locatervalue) {
	    functionalLibrary.clickAction(locatertype, locatervalue);
	}
	@Then("verify the username is  valid  {string} and {string} and {string}")
	public void verify_the_username_is_valid_and_and(String locatertype,String locatervalue,String testdata) {
		 functionalLibrary.verifytheuser(locatertype, locatervalue, testdata);
	}
	




}