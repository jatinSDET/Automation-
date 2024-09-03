package StepDefinition;

import java.awt.AWTException;

import StepLocator.PON_Attachment_Step;
import Utility.UserBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PON_Attachment extends UserBase{
	
	
	public PON_Attachment_Step attachment = new PON_Attachment_Step();
	

	@Given("Open the WorkOrder for Attachments Type")
	public void open_the_work_order_for_attachments_type() throws InterruptedException, AWTException {
		Thread.sleep(2000);
//		openWO("YLY_V9056 (39)");
		newWorkOrder("THY_21B_SN_56");
	}

	@When("Click to WorkOrder Name")
	public void click_to_work_order_name() throws InterruptedException, AWTException {
	
//		zoomOut();
	 
		
	}

	@And("Click to Upload button")
	public void click_to_upload_button() throws InterruptedException {
	
		
	}

	
//	upload
	@Given("Chosen file and given the Description1")
	public void chosen_file_and_given_the_description1() throws InterruptedException, AWTException {
		attachment.upload("Uploaded Attachment for Other !!");
	 
		
	}

	@When("Select and check DRSS the Attachment types")
	public void select_and_check_drss_the_attachment_types() {
	 
		
	}

	@And("Chosen file and given the Description2")
	public void chosen_file_and_given_the_description2() {
	   
		
		
	}

	@Then("Select and check Schamatics the Attachment types")
	public void select_and_check_schamatics_the_attachment_types() {
	
		
	}

	@And("Chosen file and given the Description3")
	public void chosen_file_and_given_the_description3() {
	 
		
	}

	@Then("Select and check Spine or Agg the Attachment types")
	public void select_and_check_spine_or_agg_the_attachment_types() {
	  
		
	}

	@And("Chosen file and given the Description4")
	public void chosen_file_and_given_the_description4() {
	   
		
	}

	@Then("Select and check Other the Attachment types")
	public void select_and_check_other_the_attachment_types() {
	 
		
		
	}
	
	
	//edit
	@Given("Click the Edit or Pencil option1")
	public void click_the_edit_or_pencil_option1() throws InterruptedException, AWTException {
	
		attachment.edit("Replaced File 3");
		
	}

	@When("Click Replacement option and click to choose file1")
	public void click_replacement_option_and_click_to_choose_file1() {
	
		
	}

	@And("Description as1 {string}")
	public void description_as1(String string) {
	 
		
	}

	@Then("Select the Dropdown as DRSS only")
	public void select_the_dropdown_as_drss_only() {
	 
		
	}

	@When("Click the Edit or Pencil option2")
	public void click_the_edit_or_pencil_option2() {
	   
		
	}

	@And("Click Replacement option and click to choose file2")
	public void click_replacement_option_and_click_to_choose_file2() {
	 
		
	}

	@Then("Description as2 {string}")
	public void description_as2(String string) {
	  
		
	}

	@And("Select the Dropdown as Schamatics only")
	public void select_the_dropdown_as_schamatics_only() {
	 
		
	}

	@When("Click the Edit or Pencil option3")
	public void click_the_edit_or_pencil_option3() {
	
		
	}

	@And("Click Replacement option and click to choose file3")
	public void click_replacement_option_and_click_to_choose_file3() {
	  
		
	}
	
	
	@Then("Description as3 {string}")
	public void description_as3(String string) {
	
		
	}

	@And("Select the Dropdown as Spine or Agg only")
	public void select_the_dropdown_as_spine_or_agg_only() {
	 
		
	}

	@When("Click the Edit or Pencil option4")
	public void click_the_edit_or_pencil_option4() {
	   
		
	}

	@And("Click Replacement option and click to choose file4")
	public void click_replacement_option_and_click_to_choose_file4() {
	  
		
	}
	
	@Then("Description as4 {string}")
	public void description_as4(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("Select the Dropdown as Other only")
	public void select_the_dropdown_as_other_only() {
	   
		
	}

	//Delete

	@When("Click the delete icon1")
	public void click_the_delete_icon1() throws InterruptedException, AWTException {
		attachment.delete("Deleted");


	}

	@When("Click Delete button as confirmation1")
	public void click_delete_button_as_confirmation1() {


	}

	@When("Click the delete icon2")
	public void click_the_delete_icon2() {


	}

	@When("Click Delete button as confirmation2")
	public void click_delete_button_as_confirmation2() {


	}

	@When("Click the delete icon3")
	public void click_the_delete_icon3() {


	}

	@When("Click Delete button as confirmation3")
	public void click_delete_button_as_confirmation3() {


	}

	@When("Click the delete icon4")
	public void click_the_delete_icon4() {


	}

	@When("Click Delete button as confirmation4")
	public void click_delete_button_as_confirmation4() {


	}
	
	@Given("Click to Upload the chosen file with more than10MB and given the Description")
	public void click_to_upload_the_chosen_file_with_more_than10mb_and_given_the_description() throws InterruptedException {
	 
		attachment.moreThan10MB();
		
	}


	@Given("Click to Upload the chosen file with unsupported file and given the Description")
	public void click_to_upload_the_chosen_file_with_unsupported_file_and_given_the_description() throws InterruptedException {
	  
		attachment.unsupportedFile(System.getProperty("user.dir") + "\\testdata\\"+"\\Attachment-Types\\" + "country.csv");
		
	}
	    
		
		





}
