package StepDefinition;

import java.awt.AWTException;

import StepLocator.StructuresAndAttributes_Step;
import Utility.UserBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StructuresAndAttributes extends UserBase{


	public StructuresAndAttributes_Step structures= new StructuresAndAttributes_Step();


	@Given("Open Work Order for Structures")
	public void open_work_order_for_structures() throws InterruptedException, AWTException {

//		openWO("YLY_V90561207244451");
		newWorkOrder("THFB_21C_SN_70");
	}



	@Given("Add Structure and place it")
	public void add_structure_and_place_it() throws InterruptedException {
		structures.AddingExistingStructure("Two wheels, endless adventures");


	}

	@Then("Change to Status1 as {string}")
	public void change_to_status1_as(String string) {


	}

	@Then("Provide Remarks and Click to Map")
	public void provide_remarks_and_click_to_map() {


	}


	@Given("Enter the Structure ID and add structure It")
	public void enter_the_structure_id_and_add_structure_it() throws InterruptedException {

		structures.deletingStructures("For Deleting Structures");
	}

	@Then("Click to Structure and select {string}")
	public void click_to_structure_and_select(String string) {


	}

	@Then("Click to delete that Pole")
	public void click_to_delete_that_pole() {


	}

	@Given("Adding the Structure here")
	public void adding_the_structure_here() throws InterruptedException, AWTException {

		structures.updatingStructures("Take every chance, drop every fear.");
	}

	@Then("Click to Status2 as {string}")
	public void click_to_status2_as(String string) {


	}

	@Then("Select the suggestion as {string}")
	public void select_the_suggestion_as(String string) {


	}

	@Then("Fill the Remarks1")
	public void fill_the_remarks1() {


	}

	@Given("Search the Structure here")
	public void search_the_structure_here() throws InterruptedException {
		structures.movingStructure("Moving Existing Structure...");


	}

	@And("Select to move structure'")
	public void select_to_move_structure() {



	}

	@Then("Fill the comments")
	public void fill_the_comments() {


	}

	@Given("Add Pole Structure")
	public void add_pole_structure() throws InterruptedException {
		structures.deletingPlantCauses();

	}

	@Given("Search the Structure here and placed it")
	public void search_the_structure_here_and_placed_it() {


	}

	@Then("Click to delete that Pole Structure")
	public void click_to_delete_that_pole_structure() {


	}

	@Then("Click to checked in Layer Deleted Option")
	public void click_to_checked_in_layer_deleted_option() {


	}


	@Given("Select the Family as BLOCK TERMINAL")
	public void select_the_family_as_block_terminal() throws InterruptedException {
		structures.changeFamilyofStructure();


	}

	@Given("Select the Family as BURIED here")
	public void select_the_family_as_buried_here() throws InterruptedException {
		structures.changeClassofStructure();



	}

	@When("Select the Class as DUCT TEE")
	public void select_the_class_as_duct_tee() {


	}

	@Given("Select the Family as POLE here")
	public void select_the_family_as_pole_here() throws InterruptedException {
		structures.changeItemOfStructure();


	}

	@When("Select the Class as HOLLOW LIGHT")
	public void select_the_class_as_hollow_light() {



	}

}
