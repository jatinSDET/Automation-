package StepDefinition;

import java.awt.AWTException;
import java.io.FileNotFoundException;

import StepLocator.Pole_Step;
import Utility.UserBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Pole extends UserBase{
	
	public Pole_Step pole = new Pole_Step();

	
	@Given("Enter the Pole ID and Search it")
	public void enter_the_pole_id_and_search_it() throws FileNotFoundException, AWTException, InterruptedException {
		
		newWorkOrder("THY_21B_SN_56");
//		openWO("YLY_V9056 (442)");
		searchBox("POL:DATA:W1642149");
	}

	@Given("Check All Others Fields should not be enable")
	public void check_all_others_fields_should_not_be_enable() {
		
	}

	@When("Click to check Pole Reset Required")
	public void click_to_check_pole_reset_required() throws InterruptedException {
		
		
	}
	@When("Check All Others Fields should not be disable")
	public void check_all_others_fields_should_not_be_disable() {
		
		
	}

	  
	@And("Enter the DP Number")
	public void enter_the_dp_number() throws InterruptedException {
	
		
	}


	@And("Click to press the save button")
	public void click_to_press_the_save_button() throws InterruptedException {
		
		
	}

	@When("Click to Manual work only")
	public void click_to_manual_work_only() throws InterruptedException {
		
		pole.bckgroundSteps("7655878787");
		pole.manualWorkOnly();
		
		
	}

	@And("Select as Yes")
	public void select_as_yes() throws InterruptedException {
		
		
	}

	@When("Click to drop down")
	public void click_to_drop_down() throws InterruptedException {
	
		pole.bckgroundSteps("7655878787");
		pole.surfaceType();
		
	}

	@And("Select the drop down as Tarmac")
	public void select_the_drop_down_as_tarmac() throws InterruptedException {
		
		
		
	}

	@When("Verify after enter the DP Number all fields should not be enable")
	public void verify_after_enter_the_dp_number_all_fields_should_not_be_enable() throws InterruptedException {
		pole.bckgroundSteps("7655878787");
		pole.DPNumber("93265598269563");
	
		
		
	}

	@When("Enter the Pole Number")
	public void enter_the_pole_number() throws InterruptedException {
//		pole.bckgroundSteps("7655878787");
		pole.poleNumber("43632262626");
		
	}

	@When("Enter the value for Additional Stays Required")
	public void enter_the_value_for_additional_stays_required() throws InterruptedException {
		
		pole.bckgroundSteps("7655878787");
		pole.additionalStaysRequired("5");
		
		
	}

	@When("Verify here Pole Reset is checked or not")
	public void verify_here_pole_reset_is_checked_or_not() throws InterruptedException {
		pole.bckgroundSteps("7655878787");
		pole.polereSet();
	
	}

	@When("Click to Fibre Only Pole")
	public void click_to_fibre_only_pole() throws InterruptedException {
		pole.bckgroundSteps("7655878787");
		pole.fibreOnly();	
	}

	@When("Select as Yes in drop down")
	public void select_as_yes_in_drop_down() throws InterruptedException {
	
		
	}
	@When("Click to Enter the values")
	public void click_to_enter_the_values() throws InterruptedException {
		pole.bckgroundSteps("7655878787");
	
		pole.existingAerialCables("3");
		
	}

	@When("Click to provide the value of Existing Drop Wires")
	public void click_to_provide_the_value_of_existing_drop_wires() throws InterruptedException {
		pole.bckgroundSteps("7655878787");
		pole.existingDropWires("9");
	
		
	}

	@When("Provide existing stays value")
	public void provide_existing_stays_value() throws InterruptedException {
		
		pole.bckgroundSteps("7655878787");
		pole.existingStays("8");
		
	}

	@When("Enter the values for Existing Terminal Blocks")
	public void enter_the_values_for_existing_terminal_blocks() throws InterruptedException {
		
		pole.bckgroundSteps("7655878787");
		pole.existingBlockTerminals("3");
		
	}

	@When("Enter the value for Existing Joints")
	public void enter_the_value_for_existing_joints() throws InterruptedException {
		
		pole.bckgroundSteps("7655878787");
		pole.existingJoints("7");
		
	}

	@When("Enter the value for Existing Other Fittings")
	public void enter_the_value_for_existing_other_fittings() throws InterruptedException {
		
		pole.bckgroundSteps("7655878787");
		pole.existingOtherFittings("2");
		
	}

}
