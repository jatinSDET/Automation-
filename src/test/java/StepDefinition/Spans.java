package StepDefinition;

import java.awt.AWTException;

import StepLocator.Spans_Step;
import Utility.UserBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Spans extends UserBase{
	
	
	public Spans_Step spans = new Spans_Step();
	
	@Given("Open Work Order for Spans")
	public void open_work_order_for_spans() throws InterruptedException, AWTException {
//	   openWO("FB_V9070 (20)");
	   newWorkOrder("THFB_21C_SN_70");
		
	}

	@Given("Check the Data Improvement")
	public void check_the_data_improvement() throws InterruptedException {
		spans.addingExistingSpan("Watching the world go by");
	  
		
	}

	@When("Select the drop down for Spans as {string}")
	public void select_the_drop_down_for_spans_as(String string) {
	   
		
	}
	@And("Fill the Remarksss1")
	public void fill_the_remarksss1() {
	   
		
	}
	

	@Given("Search to open Span")
	public void search_to_open_span() throws InterruptedException {
	
		spans.updatingSpan("One Life. One World. Explore it!");
		
	}

	@And("Select the status as {string}")
	public void select_the_status_as(String string) {
	  
		
	}

	@Then("Select drop down for Spans2 as {string}")
	public void select_drop_down_for_spans2_as(String string) {
	   
		
	}

	@And("Fill the Remarks2")
	public void fill_the_remarks2() {
	   
		
	}

	@Given("Add New Spans")
	public void add_new_spans() throws InterruptedException {
		spans.deletingSpan("Escape the ordinary");
	   
		
	}

	@And("Select the Structure")
	public void select_the_structure() {
	 
		
	}

	@Then("Click to delete the structure")
	public void click_to_delete_the_structure() {
	 
		
	}

	@Given("Select Move and Drag It")
	public void select_move_and_drag_it() throws InterruptedException {
	   
		spans.movingExistingSpan("As this is a data improvement operation on an in-place span please leave a comment about your change");
	}

	@When("Leave a comment about our change")
	public void leave_a_comment_about_our_change() {
	    
		
	}

	@And("Click to Confirm")
	public void click_to_confirm() {
	 
		
	}

}
