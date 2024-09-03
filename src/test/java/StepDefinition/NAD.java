package StepDefinition;

import java.awt.AWTException;
import java.io.FileNotFoundException;

import StepLocator.NAD_StepLoactor;
import Utility.UserBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NAD extends UserBase{


	public NAD_StepLoactor nad = new NAD_StepLoactor();



//	@Given("Open Work Order for NAD")
//	public void open_work_order_for_nad() throws InterruptedException, AWTException {
//		nad.WO();
//
//
//	}

	//1
	@Given("Click to work order name1")
	public void click_to_work_order_name1() throws InterruptedException, AWTException {

		
		//		openWO("YLY_V9056 (490)");
		nad.verifyMsg();

	}

	@When("Click to Refresh Address button")
	public void click_to_refresh_address_button() {




	}

	@And("I will verify that {string} as Successfull meassge")
	public void i_will_verify_that_as_successfull_meassge(String string) {



	}

	//2


	@Given("Enter UPRN number and Search1")
	public void enter_uprn_number_and_search() throws InterruptedException, AWTException{

		
		nad.UPRNAndVerify("UPRN:100060411078");

	}

	@When("Select NAD Address in drop down1")
	public void select_nad_address_in_drop_down() {


	}

	@When("Verify the success message as1 {string}")
	public void verify_the_success_message_as1(String string) {


	}


	//3
	@Given("Enter UPRN number and Click to Search")
	public void enter_uprn_number_and_click_to_search() throws InterruptedException, AWTException {

	
		nad.ORFrindlyAddress("UPRN:100060411078");


	}

	@When("Verify by default it should ORFriendly only")
	public void verify_by_default_it_should_or_friendly_only() {


	}

	//4
	@Given("Enter UPRN number and Search UPRN")
	public void enter_uprn_number_and_search_uprn() throws InterruptedException, AWTException, FileNotFoundException {
		
		nad.addressDisabled("UPRN:100060411078");

	}

	@When("Address fields should be disabled")
	public void address_fields_should_be_disabled() {


	}

	//5
	@Given("Add Spans between CPE to CBT")
	public void add_spans_between_cpe_to_cbt() throws InterruptedException, AWTException {
		
		nad.Low_address_accuracy_in_properties("UPRN:655649");

	}

	@When("Click to reparent CPE to CBT")
	public void click_to_reparent_cpe_to_cbt() {


	}

	@And("Verify the CPE Properties as {string}")
	public void verify_the_cpe_properties_as(String string) {


	}

	//6
	@Given("Click to Add SDU and CPE place it")
	public void click_to_add_sdu_and_cpe_place_it() throws InterruptedException, AWTException {

		
		nad.addCpeandSDU();

	}

	@When("Click to CPE and Reparent to CBTs")
	public void click_to_cpe_and_reparent_to_cb_ts() {

	}

	@Then("Also Verify the Missing UPRN in Proprtiess")
	public void also_verify_the_missing_uprn_in_proprtiess() {


	}

	//7
	@Given("Add SDU and add CPE placed it in Structure")
	public void add_sdu_and_add_cpe_placed_it_in_structure() throws InterruptedException, AWTException {

	
		nad.addSDUandCpeAtStructure();


	}

	@When("Switched to OR Frindly to NGD address")
	public void switched_to_or_frindly_to_ngd_address() {

	}

	@Then("Verify the Error message {string}")
	public void verify_the_error_message(String string) {


	}
}
