package StepDefination;

import commonfunctions.functionalLibrary;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class makepaymentflow_steps {
	@When("wait for mens with {string}")
	public void wait_for_mens_with(String testdata) throws Throwable {
	   functionalLibrary.threedsleeo(testdata);
	}

	@When("wait for the add with {string} and {string} and {string}")
	public void wait_for_the_add_with_and_and(String locatertype,String locatervalue,String testdata) {
		   functionalLibrary.waitforelement(locatertype, locatervalue, testdata);
	}

@When("close the adds with {string} and {string}")
public void close_the_adds_with_and(String locatertype,String locatervalue) {
	functionalLibrary.clickAction(locatertype, locatervalue);
}

	
	@When("click on the mens with {string} and {string}")
	public void click_on_the_mens_with_and_span_normalize_space(String locatertype,String locatervalue) {
		   functionalLibrary.clickAction(locatertype, locatervalue);
		}
	@When("wait for bottoms with {string}")
	public void wait_for_bottoms_with(String testdata) throws Throwable {
	   functionalLibrary.threedsleeo(testdata);
	}

	@When("move mouse to bottoms with {string} and {string}")
	public void move_mouse_to_bottoms_with_and(String locatertype,String locatervalue) {
	   functionalLibrary.actions_click(locatertype, locatervalue);
	}

	@When("wait for short with {string}")
	public void wait_for_short_with(String testdata) throws Throwable {
	   functionalLibrary.threedsleeo(testdata);
	}

	@When("move to shorts and click on it with {string} and {string}")
	public void move_to_shorts_and_click_on_it_with_and(String locatertype,String locatervalue) {
	   functionalLibrary.actions_click(locatertype, locatervalue);
	}

	@When("scroll the the first product with {string}")
	public void scroll_the_the_first_product_with(String testdata) {
	    functionalLibrary.scrolling(testdata);
	}

	@When("click on the wishlist   with {string} and {string}")
	public void click_on_the_wishlist_with_and(String locatertype,String locatervalue) {
		   functionalLibrary.clickAction(locatertype, locatervalue);
	}

	@When("scroll to add to card with {string}")
	public void scroll_to_add_to_card_with(String testdata) {
	    functionalLibrary.scrolling(testdata);
	}

	@When("click on add to card button  with {string} and {string}")
	public void click_on_add_to_card_button_with_and(String locatertype,String locatervalue) {
		   functionalLibrary.clickAction(locatertype, locatervalue);
	}

	@When("wait for size with {string}")
	public void wait_for_size_with(String testdata) throws Throwable {
		   functionalLibrary.threedsleeo(testdata);
	}

	@When("click the size with {string} and {string}")
	public void click_the_size_with_and(String locatertype,String locatervalue) {
		   functionalLibrary.clickAction(locatertype, locatervalue);
	}

	@When("click the colour with {string} and {string}")
	public void click_the_colour_with_and(String locatertype,String locatervalue) {
		   functionalLibrary.clickAction(locatertype, locatervalue);
	}

	@When("enter the quantity with {string} and {string} and {string}")
	public void enter_the_quantity_with_and_and(String locatertype,String locatervalue,String testdata) {
	   functionalLibrary.TypeActions(locatertype, locatervalue, testdata);
	}

	@When("click on add_to_cart with {string} and {string}")
	public void click_on_add_to_cart_with_and(String locatertype,String locatervalue) {
		   functionalLibrary.clickAction(locatertype, locatervalue);
	}

	@When("wait for cartbutton with {string}")
	public void wait_for_cartbutton_with(String testdata) throws Throwable {
		   functionalLibrary.threedsleeo(testdata);
	}

	@When("click on cart button on right_corner with {string} and {string}")
	public void click_on_cart_button_on_right_corner_with_and(String locatertype,String locatervalue) {
		   functionalLibrary.clickAction(locatertype, locatervalue);
	}

	@When("click on procide to checkout with {string} and {string}")
	public void click_on_procide_to_checkout_with_and(String locatertype,String locatervalue) {
		   functionalLibrary.clickAction(locatertype, locatervalue);
	}

	@When("wait for new address with {string} and {string}")
	public void wait_for_new_address_with_and(String locatertype,String locatervalue,String testdata) {
	   functionalLibrary.waitforelement(locatertype, locatervalue, testdata);
	}

	@When("click on  new address with {string} and {string}")
	public void click_on_new_address_with_and(String locatertype,String locatervalue) {
		   functionalLibrary.clickAction(locatertype, locatervalue);
	}

	@When("enter the street address with {string} and {string} and {string}")
	public void enter_the_street_address_with_and_and(String locatertype,String locatervalue,String testdata) {
		   functionalLibrary.TypeActions(locatertype, locatervalue, testdata);
	}

	@When("enter the city name with {string} and {string}")
	public void enter_the_city_name_with_and(String locatertype,String locatervalue,String testdata) {
		   functionalLibrary.TypeActions(locatertype, locatervalue, testdata);
	}

	@When("scroll down for country with {string}")
	public void scroll_down_for_country_with(String testdata) {
	    functionalLibrary.scrolling(testdata);
	}

	@When("select  country with {string} and {string} and {string}")
	public void select_country_with_and_and(String locatertype,String locatervalue,String testdata) {
	    functionalLibrary.select_dropdown(locatertype, locatervalue, testdata);
	}

	@When("select the state with {string} and {string} and {string}")
	public void select_the_state_with_and_and(String locatertype,String locatervalue,String testdata) {
	    functionalLibrary.select_dropdown(locatertype, locatervalue, testdata);
	}

	@When("enter the zip coide with {string} and {string} and {string}")
	public void enter_the_zip_coide_with_and_and(String locatertype,String locatervalue,String testdata) {
		   functionalLibrary.TypeActions(locatertype, locatervalue, testdata);
	}

	@When("enter the mobilenumber with {string} and {string} and {string}")
	public void enter_the_mobilenumber_with_and_and(String locatertype,String locatervalue,String testdata) {
		   functionalLibrary.TypeActions(locatertype, locatervalue, testdata);
	}

	@When("click on ship here {string} and {string}")
	public void click_on_ship_here_and(String locatertype,String locatervalue) {
		   functionalLibrary.clickAction(locatertype, locatervalue);
	}

	@When("click on next with {string} and {string}")
	public void click_on_next_with_and(String locatertype,String locatervalue) {
		   functionalLibrary.clickAction(locatertype, locatervalue);
	}

	@When("click on placeorder with {string} and {string}")
	public void click_on_placeorder_with_and(String locatertype,String locatervalue) {
		   functionalLibrary.clickAction(locatertype, locatervalue);
	}

	@Then("verify the order id is generated and thaksyou msg with {string} and {string}")
	public void verify_the_order_id_is_generated_and_thaksyou_msg_with_and(String locatertype,String locatervalue,String testdata) {
	    functionalLibrary.verifyorderid(locatertype, locatervalue, testdata);
	}
}