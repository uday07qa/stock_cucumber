package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import commonFunctions.FunctionLibrary;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import gherkin.Func;

public class stockitem_steps {



	@When("wait for the stockitem with {string} and {string} and {string}")
	public void wait_for_the_stockitem_with_and_and(String locatertype,String locatervalue,String Testdata) {
	   FunctionLibrary.waitforelement(locatertype, locatervalue, Testdata);
	}

	@When("click onthestockitem with {string} and {string}")
	public void click_onthestockitem_with_and(String locatertype,String locatervalue) throws Throwable {
	   FunctionLibrary.clickaction(locatertype, locatervalue);
	}

	@When("click on addbutton with {string} and {string}")
	public void click_on_addbutton_with_and(String locatertype,String locatervalue) throws Throwable {
	   FunctionLibrary.clickaction(locatertype, locatervalue);
	   
	}

	@When("wait for category with {string} and {string} and {string}")
	public void wait_for_category_with_and_and(String locatertype,String locatervalue,String Testdata) {
	   FunctionLibrary.waitforelement(locatertype, locatervalue, Testdata);
	   
	}

	@When("select the category with {string} and {string} and {string}")
	public void select_the_category_with_and_and(String locatertype,String locatervalue,String Testdata) {
	    FunctionLibrary.dropdow_Actions_index(locatertype, locatervalue, Testdata);
	}

	@When("wait for suppliernumber with {string} and {string} and {string}")
	public void wait_for_suppliernumber_with_and_and(String locatertype,String locatervalue,String Testdata) {
	   FunctionLibrary.waitforelement(locatertype, locatervalue, Testdata);
	   
	}

	@When("select suppliernumber with {string} and {string} and {string}")
	public void select_suppliernumber_with_and_and(String locatertype,String locatervalue,String Testdata) {
	  FunctionLibrary.dropdow_Actions_index(locatertype, locatervalue, Testdata);
	}

	@When("wait forstocknumber with {string} and {string} and {string}")
	public void wait_forstocknumber_with_and_and(String locatertype,String locatervalue,String Testdata) {
		  FunctionLibrary.waitforelement(locatertype, locatervalue, Testdata);
	}

	@When("capture stocknumber with {string} and {string}")
	public void capture_stocknumber_with_and(String locatertype,String locatervalue) throws Throwable {
	    FunctionLibrary.capture_stocknumber(locatertype, locatervalue, locatervalue);
	}

	@When("select theUnit Of Measurement with {string} and {string} and {string}")
	public void select_theUnit_Of_Measurement_with_and_and(String locatertype,String locatervalue,String Testdata) {
	   FunctionLibrary.dropdow_Actions_index(locatertype, locatervalue, Testdata);
	}

	@When("enter the Purchasing Price with {string} and {string} and {string}")
	public void enter_the_Purchasing_Price_with_and_and(String locatertype,String locatervalue,String Testdata) {
	    FunctionLibrary.TypeActions(locatertype, locatervalue, Testdata);
	}

	@When("enter the sellerprice with {string} and {string} and {string}")
	public void enter_the_sellerprice_with_and_and(String locatertype,String locatervalue,String Testdata) {
		FunctionLibrary.TypeActions(locatertype, locatervalue, Testdata);
	}

	@When("enter the note with {string} and {string} and {string}")
	public void enter_the_note_with_and_and(String locatertype,String locatervalue,String Testdata) {
		FunctionLibrary.TypeActions(locatertype, locatervalue, Testdata);
	}

	@When("click on the addbutton with  {string} and {string}")
	public void click_on_the_addbutton_with_and(String locatertype,String locatervalue) throws Throwable {
	   FunctionLibrary.clickaction(locatertype, locatervalue);
	}

	@When("click on confirm ok button with {string} and {string}")
	public void click_on_confirm_ok_button_with_and(String locatertype,String locatervalue) throws Throwable {
		FunctionLibrary.clickaction(locatertype, locatervalue);
	}

	

	@When("click on Alertok button with {string} and {string}")
	public void click_on_Alertok_button_with_and(String locatertype,String locatervalue) {
		FunctionLibrary.clickaction(locatertype, locatervalue);
	}

	@When("verify stocktable")
	public void verify_stocktable() throws Throwable {
	   FunctionLibrary.verify_stocknumber();
	}
	@When("enter the stock name with {string} and {string} and {string}")
	public void enter_the_stock_name_with_and_and(String locatertype,String locatervalue,String Testdata) {
	   FunctionLibrary.TypeActions(locatertype, locatervalue, Testdata);
	}

	@When("waitforconfirm ok button with {string}")
	public void waitforconfirm_ok_button_with(String Testdata) throws Throwable {
	   FunctionLibrary.threadsleep(Testdata);
	}

	@When("waitforconfirm Alertok button with {string}")
	public void waitforconfirm_Alertok_button_with(String Testdata)throws Throwable  {
		 FunctionLibrary.threadsleep(Testdata);
	}


}
