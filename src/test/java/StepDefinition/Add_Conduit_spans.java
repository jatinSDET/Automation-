package StepDefinition;

import java.awt.AWTException;

import StepLocator.Add_Conduit_spans_Step;
import Utility.UserBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Add_Conduit_spans extends UserBase{
	
	public Add_Conduit_spans_Step conduit = new Add_Conduit_spans_Step();
	
	@Given("Open Work Order for Conduit span")
	public void open_work_order_for_conduit_span() throws InterruptedException, AWTException {

	  newWorkOrder("THFB_21C_SN_70");
		
	}

	@Given("Add Spans1")
	public void add_spans1() throws InterruptedException, AWTException {
		conduit.addConduitSpan("50");
	
		
	}

	@When("Enter to search Structure ID")
	public void enter_to_search_structure_id() {
	  
		
	}

	@And("Enter to search the pole path1")
	public void enter_to_search_the_pole_path1() {
	    
		
	}

	@Then("Enter the Duct Distance in millimetres1")
	public void enter_the_duct_distance_in_millimetres1() {
	 
		
	}

	@Given("Add Pole2")
	public void add_pole() throws InterruptedException, AWTException {
	 
		conduit.addConduitSpan2("50");
	}

	@Then("Add Span2")
	public void add_span2() {
	 
	}

	@When("Enter to search Structure ID and span place")
	public void enter_to_search_structure_id_and_span_place() {
	 
		
	}

	@Then("Enter the Duct Distance in millimetres2")
	public void enter_the_duct_distance_in_millimetres2() {
	    
		
	}

	@Then("Add Spans3")
	public void add_spans3() throws InterruptedException, AWTException {
	   
		conduit.addDuctDistance();
	}

	@When("Enter to search Structure ID3")
	public void enter_to_search_structure_id3() {
	  
	}

	@And("Verify the Duct Distance in millimetres3")
	public void verify_the_duct_distance_in_millimetres3() {
	   
		
	}

}
