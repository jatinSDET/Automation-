package StepDefinition;

import java.awt.AWTException;

import StepLocator.YellowSecureArea_Step;
import Utility.UserBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class YellowSecureArea extends UserBase{

public YellowSecureArea_Step yellowArea = new YellowSecureArea_Step();

	@Given("Click to Manually Draw buttonn")
	public void click_to_manually_draw_buttonn() throws InterruptedException {
		
		yellowArea.cannotCreateWorkorderCompletelyWithinProtected();
		


	}

	@And("Five Times Click to Mapp")
	public void five_times_click_to_mapp() {


	}

	@Then("Verify Error Messagee\"Cannot create workorder completely within a protected secure area\"")
	public void verify_error_messagee_cannot_create_workorder_completely_within_a_protected_secure_area() {


	}

	@Given("Click to Yellow Side Manually Draww")
	public void click_to_yellow_side_manually_draww() throws InterruptedException {

		yellowArea.canSeeCivilsandGhostplan();

	}

	@And("Click to Yellow Side at Map for Creating Polygon Partially")
	public void click_to_yellow_side_at_map_for_creating_polygon_partially() {


	}

	@Then("Verify Yellow side Work Order Name ass {string}")
	public void verify_yellow_side_work_order_name_ass(String string) {


	}

	@Given("Add the SDU and CPE at Yellow Side Areaa")
	public void add_the_sdu_and_cpe_at_yellow_side_areaa() throws InterruptedException, AWTException {
		
		yellowArea.canSeeSDU();


	}

	@And("Verify the Pop Up Messagee at Yellow Side")
	public void verify_the_pop_up_messagee_at_yellow_side() {


	}

	@Given("Add to the Splitter at Yellow Side Areaa")
	public void add_to_the_splitter_at_yellow_side_areaa() throws InterruptedException, AWTException {

		yellowArea.cantSeeCivilsandGhostplan();

	}

	@And("Verify the Pop Upp Message at Yellow Side")
	public void verify_the_pop_upp_message_at_yellow_side() {


	}

}
