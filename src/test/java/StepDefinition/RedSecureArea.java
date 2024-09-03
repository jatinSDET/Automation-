package StepDefinition;

import java.awt.AWTException;

import StepLocator.RedSecureArea_Step;
import Utility.UserBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RedSecureArea extends UserBase{
	
	public RedSecureArea_Step redSecure = new RedSecureArea_Step();
	
	@Given("Click to Manually Draw button")
	public void click_to_manually_draw_button() throws InterruptedException {
		redSecure.cantCreateWO();
		
	}

	@And("Five Times Click to Map")
	public void five_times_click_to_map() {
	   
		
	}

	@Given("Click to Map for Creating Polygon Partially")
	public void click_to_map_for_creating_polygon_partially() throws InterruptedException {
	  
		redSecure.canCreateYellowAndRedSecureArea();
	}

	@Then("Click to Submit button and Click to Yes as Well")
	public void click_to_submit_button_and_click_to_yes_as_well() {
	   
		
	}

	@Given("Click to Splitter ID and create WO")
	public void click_to_splitter_id_and_create_wo() throws InterruptedException, AWTException {
	  
		redSecure.canSeeSDUorCPE();
		
	}

	@When("Add the SDU and CPE at Red Site Area")
	public void add_the_sdu_and_cpe_at_red_site_area() {
	 
	}

	@Given("Add the Splitter at Red Site Areaa")
	public void add_the_splitter_at_red_site_areaa() throws InterruptedException, AWTException {
	   redSecure.cantSeeCivilsandGhostplan();
		
	}

}
