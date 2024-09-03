package StepDefinition;

import java.awt.AWTException;

import StepLocator.EthernetJourney_Step;
import Utility.UserBase;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EthernetJourney extends UserBase{
	
	public  EthernetJourney_Step eNet = new EthernetJourney_Step();
	
//	
//	@BeforeAll
	@Given("Proving Access ON")
	public void proving_access_on() throws InterruptedException {
	  
		eNet.ethernetAccessOn();
		Thread.sleep(5000);
		
	}
	
	
	@Given("Create Ethernet WO")
	public void create_ethernet_wo() throws InterruptedException {
	
	
		EthernetWO();
	}
	@And("Click to WO Name")
	public void click_to_wo_name() throws InterruptedException {
		clickToWoName();


	}
	
	
	@Given("Click to create work order button and click to {string}")
	public void click_to_create_work_order_button_and_click_to(String string) throws InterruptedException {
	  
//		eNet.createWO();
	}

	

	@Given("Click to this {string}")
	public void click_to_this(String string) throws InterruptedException {
//		eNet.accesssOn();
	
		eNet.endUserDetails("BT Engineer","Brandon Street","Peter Vylish", "3","10");
	
		
		
	}

	@Then("Filled all the required details")
	public void filled_all_the_required_details() {
	    
		
	}

	@Given("Click to this Cancel Work Order")
	public void click_to_this_cancel_work_order() throws InterruptedException {
		
		eNet.cancelWorkorder();
		
	}

	@Then("Click to Yes")
	public void click_to_yes() {
	   
		
	}

	@Given("Click to this first {string} button")
	public void click_to_this_first_button(String string) throws InterruptedException {
		eNet.RollbacktoPreplanningPhase("BT Engineer","Brandon Street","Peter Vylish", "3","10");
	  
		
	}

	@Then("Click to {string} button")
	public void click_to_button(String string) {
	
	}

	@Given("Click to this {string} error")
	public void click_to_this_error(String string) throws InterruptedException {
	  
		eNet.Plant_Position_details();
		
	}

	@When("Filled all the required details here")
	public void filled_all_the_required_details_here() {
	  
		
	}

	@Given("Click to {string} Option")
	public void click_to_option(String string) throws InterruptedException {
		eNet.Safety_details("BT Engineer","Brandon Stark","Peter Vylishh", "5","12");
	
		
	}

	@When("Again Filled the required details")
	public void again_filled_the_required_details() {
	  
		
	}

	@Given("Select the drop down as {string}")
	public void select_the_drop_down_as(String string) throws InterruptedException {
	   
		eNet.changeDummyCabletoEthernetCable("BT Engineer","Brandon Street","Peter Vylish", "3","10");
	}

	@Given("Filled required heree")
	public void filled_required_heree() throws InterruptedException, AWTException {
	 
		eNet.changeTheTCodeItemtoSmallMediumLargeNode("BT Engineer","Brandon Street","Peter Vylish", "3","10");
	}

	@And("Click to Completed survey buttonn")
	public void click_to_completed_survey_buttonn() {
	  
	}

	@Then("Select the drop down as Small Nod'")
	public void select_the_drop_down_as_small_nod() {
	
		
	}

	@Then("Select the drop down as Medium Node")
	public void select_the_drop_down_as_medium_node() {
	 
		
	}

	@And("Select the drop down as Large Node")
	public void select_the_drop_down_as_large_node() {
	
		
	}

	@Given("Filled required hereee")
	public void filled_required_hereee() throws InterruptedException, AWTException {
	 
		eNet.YCodetoDcborMcb("BT Engineer","Brandon Street","Peter Vylish", "3","10");
	}

	@And("Click to Completed survey buttonnn")
	public void click_to_completed_survey_buttonnn() {
	   
		
	}

	@Then("Click to YCode equipment requires an updated item type error")
	public void click_to_y_code_equipment_requires_an_updated_item_type_error() {
	
		
	}

	@And("Select the Iteam Type as {string}")
	public void select_the_iteam_type_as(String string) {
	   
		
	}

	@Given("Click to Work Order Name here")
	public void click_to_work_order_name_here() throws InterruptedException {
	
		eNet.searchByTCode();
		
	}

	@When("Clicked to Start Point")
	public void clicked_to_start_point() {
	  
		
	}

	@Then("Verify Equipment {string} Should be as {string}")
	public void verify_equipment_should_be_as(String string, String string2) {
	 
		
	}

	@Given("Click to End Point and Enclosing Structure as well")
	public void click_to_end_point_and_enclosing_structure_as_well() throws InterruptedException, AWTException {
	  
		eNet.searchByYCode();
	}

	@And("Verify the Y Code in Plant Type")
	public void verify_the_y_code_in_plant_type() {
	    
		
	}

	@Given("Click to error {int} civils does not have USRN number")
	public void click_to_error_civils_does_not_have_usrn_number(Integer int1) throws InterruptedException {
	 
		eNet.USRNDetailforTCodeandYCode("20", "30");
//		eNet.accessOff();
		
	}

	@And("Filled the USRN Number one")
	public void filled_the_usrn_number_one() {
	   
		
	}

	@Then("Filled the USRN Number two")
	public void filled_the_usrn_number_two() {
	  
		
	}
	

	@Given("Proving Access Off")
	public void proving_access_off() throws InterruptedException {
	    
	eNet.ethernetAccessOff();
	Thread.sleep(5000);
	
	
	}

}
	
