package StepDefinition;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import StepLocator.ORIONErrorsValidations_StepLocator;
import Utility.UserBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ORIONErrorsValidations extends UserBase{

	public ORIONErrorsValidations_StepLocator errosOrion =  new ORIONErrorsValidations_StepLocator();

	
	
	@Given("Create new Work Order")
	public void create_new_work_order() throws InterruptedException, AWTException {
		newWorkOrder("THY_21B_SN_56");
	}
	@Given("click to {string}")
	public void click_to(String string) throws InterruptedException, AWTException, FileNotFoundException {
		errosOrion.missingCpe();
	}

	@When("click to the {string} drop down and  select as SDU")
	public void click_to_the_drop_down_and_select_as_sdu(String string) throws InterruptedException {
		errosOrion.selectAsPremiseTypeSDU();

	}

	@And("click to the {string} drop down and select as O")
	public void click_to_the_drop_down_and_select_as_o(String string) throws InterruptedException {
		errosOrion.premiseFedViaNotSet();

	}

	@Then("click to the {string} drop down and select as OH Feed hoist required")
	public void click_to_the_drop_down_and_select_as_oh_feed_hoist_required(String string) throws InterruptedException {
		errosOrion.sSNNotSET();
	}


	//2

	@Given("Click to the {string}")
	public void click_to_the(String string) throws InterruptedException, AWTException, FileNotFoundException {

		//		newWorkOrder("482469,160535");
		errosOrion.validRow1();

	}

	@And("Click to the missing address error")
	public void click_to_the_missing_address_error() {
		//		address.validRow2();

	}

	@Then("Click to the {string} and type as {string}")
	public void click_to_the_and_type_as(String string, String string2) throws InterruptedException {
		errosOrion.friendlyAddress("COLERIDGE AVENUE");

	}

	//3

	@Given("Click to No Duct have associate cable")
	public void click_to_no_duct_have_associate_cable() throws InterruptedException, AWTException, FileNotFoundException {


		clickErrorBtn();
		errosOrion.noDuctError();		
	}


	@And("Click to the error name")
	public void click_to_the_error_name() {
		errosOrion.clickNameandError();

	}
	@Then("Select as\"CONDUIT\"")
	public void select_as_conduit() throws InterruptedException {
		errosOrion.clickToConduit();	

	}

	//4
	@Given("Click to the Choose File")
	public void click_to_the_choose_file() throws FileNotFoundException, AWTException, InterruptedException {
		

		clickToWoName();
		//		essentials.zoomOut();
		Thread.sleep(2000);
		ClickToUploadBtn();
		Thread.sleep(10000);
		errosOrion.chooseFile();

	}

	@And("the Description")
	public void the_description() {
		//		attachment.fillDescription();

	}

	@Then("Click to drop down and select to the {string}")
	public void click_to_drop_down_and_select_to_the(String string) {
		//		attachment.dropDownData();

	}
	//	5

	@Given("Click to the error CPE need a basement\\/budi box parent in same MDU")
	public void click_to_the_error_cpe_need_a_basement_budi_box_parent_in_same_mdu() throws InterruptedException, AWTException, FileNotFoundException 
	{

		btnSchematic();
		clickErrorBtn();
		errosOrion.clickedErrorBasementBudi();
	}
	@Then("Click add button and add equipment and IJ and click to  Basement Box")
	public void click_add_button_and_add_equipment_and_ij_and_click_to_basement_box() throws InterruptedException
	{
		errosOrion.addBtnAddEquipmentAddIJ();	
	}
	@Then("Click to Basement box and add children")
	public void click_to_basement_box_and_add_children() throws InterruptedException 
	{
		errosOrion.basementAddChildren();
	}
	@And("Click to CPE and Submit")
	public void click_to_cpe_and_submit() throws InterruptedException {
		errosOrion.cpeAndSubmit();


	}	

	//6
	@Given("Click to error as Route through ND and aerial spans")
	public void click_to_error_as_route_through_nd_and_aerial_spans() throws InterruptedException, AWTException {

		//		newWorkOrder("482469,160535");
		errosOrion.drawSpans();
		errosOrion.errorsAndReroute();	
	}

	@When("Add the cable from one end to another")
	public void add_the_cable_from_one_end_to_another() throws InterruptedException {
		System.out.println("Add the cable from one end to another");
	}

	@And("Select the error Route through ND and aerial spans")
	public void select_the_error_route_through_nd_and_aerial_spans() {
		System.out.println("Select the error Route through ND and aerial spans");
	}

	@Then("Click to REROUTE button")
	public void click_to_reroute_button() {
		System.out.println("Click to REROUTE button");
	}
	@And("Click spilitter and other spilitter Sequnecelly and click submit button")
	public void click_spilitter_and_other_spilitter_sequnecelly_and_click_submit_button() {
		System.out.println("Click spilitter and other spilitter Sequnecelly and click submit button");	
	}

	//7
	@Given("Click to add and add Splitter")
	public void click_to_add_and_add_splitter() throws InterruptedException, AWTException {
		//		essentials.newWorkOrder("482469,160535");
		errosOrion.addingSplitter();

	}

	@And("Search Splitter and select Spilitter")
	public void search_splitter_and_select_spilitter() throws InterruptedException {
		errosOrion.selectSpilitter();
	}

	@Then("Add CBT with Splitter")
	public void add_cbt_with_splitter() throws InterruptedException {
		errosOrion.addCBT();


	}
	
	//8
	@Given("Click to add MDU and add IJ")
	public void click_to_add_mdu_and_add_ij() throws InterruptedException, AWTException {
//		essentials.newWorkOrder("THY_21B_SN_56");

//		openWO("YLY_V9056 (448)");
		errosOrion.addMDUandIJ();

	}
	@And("Reparent IJ to main spilitter")
	public void reparent_ij_to_main_spilitter() throws InterruptedException {

		errosOrion.reparentIJToMainSplitter();
	}
	@Then("Add CBT with IJ")
	public void add_cbt_with_ij() {
	}


	//9
	@Given("Click to add Spans to Structure and main Splitter")
	public void click_to_add_spans_to_structure_and_main_splitter() throws InterruptedException, AWTException {

//		newWorkOrder("482469,160535");
		errosOrion.addSpansAtStructure();	
	}

	@When("Click to the Depth of Cover \\(mm)")
	public void click_to_the_depth_of_cover_mm() {
		errosOrion.CoverDefine();
	}

	@Then("Click to dropdown to select as {int}")
	public void click_to_dropdown_to_select_as(Integer int1) throws InterruptedException {
		errosOrion.As600();
	}


	//10
	@Given("Click to Add Small IJ at  Structure to Main Splitter")
	public void click_to_add_small_ij_at_structure_to_main_splitter() throws InterruptedException, AWTException {

		//	essentials.newWorkOrder("482469,160535");
//		openWO("YLY_V90560706243706");
		errosOrion.addSmallIJatStructure();

	}

	@When("Enter the value as rough\"Surface Type - Rough Unsurfaced\"")
	public void enter_the_value_as_rough_surface_type_rough_unsurfaced() {
		errosOrion.roughUnsurfaced("5687578786868");

	}

	@And("Enter the value {string}")
	public void enter_the_value(String string) {
		//	noSurfaceDefine.enterFootway(TenDigitNumberGenerator());
		errosOrion.enterFootway("84367853253895379");

	}

	@Then("Enter the value as {string}")
	public void enter_the_value_as(String string) throws InterruptedException {
		errosOrion.enterCarriageway("874368365832634");



	}
	
	//11
	
	@Given("Reparent CPE and CBT")
	public void reparent_cpe_and_cbt() throws InterruptedException, AWTException {
		
//		essentials.newWorkOrder("482469,160535");
//		openWO("YLY_V90562706244602");
		errosOrion.reparentCPEandCBT("UPRN:200001016151");
	
		
	}
	
	//12
	
	@Given("Search CBT and Set Status PDR")
	public void search_cbt_and_set_status_pdr() throws InterruptedException, AWTException {
//		openWO("YLY_V90562606241630");
		errosOrion.cbtStatus();
	}
	@And("Click to error by name as status PDR")
	public void click_to_error_by_name_as_status_pdr() throws InterruptedException {
		errosOrion.errorName();
	}
	@Then("Click status drop down as PDA")
	public void click_status_drop_down_as_pda() throws InterruptedException {
	}
	
	
	//13
	
	@Given("Add SDU and CPE at Cordinate")
	public void add_sdu_and_cpe_at_cordinate() throws InterruptedException {
	  
//		openWO("YLY_V90560307244509");
		errosOrion.addCPEatStructure();	
	}

	@When("DrawSpan between CPE and CBT")
	public void draw_span_between_cpe_and_cbt() throws InterruptedException {
		errosOrion.drawSpnToCBT();	
	}

	@Then("Resolve the error")
	public void resolve_the_error() {	
	}

	
	
	//14
	
	@Given("Search the Structure and Add the Spans")
	public void search_the_structure_and_add_the_spans() throws InterruptedException, AWTException {
//		openWO("YLY_V90562606241331");
		errosOrion.drawSpans14();
	}

	@When("select the status as IPL")
	public void select_the_status_as_ipl() throws InterruptedException, AWTException 
	{
		errosOrion.statusIPL();
		
	}
	
	
	//15
	
//	@Given("Add SDU and CPE")
//	public void add_sdu_and_cpe() throws InterruptedException {
//	
//		errosOrion.incompleteCPEData();
//		
//	}
//
//	@When("Remove the Addreses data and Save")
//	public void remove_the_addreses_data_and_save() throws InterruptedException {
//		errosOrion.removeAddressData();
//
//
//	}
//
//	@Then("Fill the Addresses data and Save")
//	public void fill_the_addresses_data_and_save() throws InterruptedException {
//		errosOrion.fillAddressData("uytefewewtuiwt");
//		errosOrion.fillAddressData("uytefe45wtuiwt");
//		errosOrion.fillAddressData("uytefewe33wtuiwt");
//		errosOrion.fillAddressData("uytefe22wewtuiwt");
//
//
//
//	}
	
	
	//16
	@Given("Click to this Enclosing Structure")
	public void click_to_this_enclosing_structure() throws InterruptedException, AWTException {
	 
//		openWO("YLY_V90562006244141");
		errosOrion.enclosingStructure();
		
	}

	@And("Select the drop down and select as {string}")
	public void select_the_drop_down_and_select_as(String string) throws InterruptedException {
		errosOrion.selectInfered();
		
	}

	@Then("Again click to this Enclosing Structure")
	public void again_click_to_this_enclosing_structure() {
		errosOrion.againEnclosingStructure();
	 
	}

	@And("Click to class as {string}")
	public void click_to_class_as(String string) throws InterruptedException {
	
		errosOrion.selectGeneric();
	}
	
	//17
	
	@Given("Add Reducer at the Structure")
	public void add_reducer_at_the_structure() throws InterruptedException, AWTException {
		
//		openWO("YLY_V90561006242257");
//		Thread.sleep(2000);
		errosOrion.addReducerAndAddSpanToStructure();
	}

	@When("Select class as {string}")
	public void select_class_as(String string) throws InterruptedException {
		errosOrion.selectChangeOfState();
	   
		
	}
	
	//18
	@Given("Add Duct equipment at the Structure")
	public void add_duct_equipment_at_the_structure() throws InterruptedException, AWTException {
//		newWorkOrder("482469,160535");
//		openWO("");
		errosOrion.addDuctAndAddToCBTs();	
	}
	@When("Add Spans from Duct to {int} CBT's")
	public void add_spans_from_duct_to_cbt_s(Integer int1) throws InterruptedException {
		errosOrion.ductToCBT();	
	}

	@Then("Select the dropdown class as {string}")
	public void select_the_dropdown_class_as(String string) throws InterruptedException {
		errosOrion.dropDown();
	}
	
	//19
	
	@Given("Click to Add the Small IJ")
	public void click_to_add_the_small_ij() throws InterruptedException, AWTException {
		
//		openWO("YLY_V9056 (495)");
//		newWorkOrder("THY_21B_SN_56");
		errosOrion.addSmallIJandReparent();
		

	}

	@When("Reparent IJ to Main Splitter")
	public void reparent_ij_to_main_splitter() throws InterruptedException {
		errosOrion.reparentIJToMain();
	  
		
	}

	@And("Click to IJ and add CBT with IJ")
	public void click_to_ij_and_add_cbt_with_ij() throws InterruptedException, AWTException {
//		tooMany.reparentIJToMain();
		errosOrion.IJAndCBT();
	    
		
	}

	@Then("Last Click {string} as No")
	public void last_click_as_no(String string) throws InterruptedException {
		errosOrion.reparentEquipment();
	    
		
	}

	@And("Select Item Drop Down as {string}")
	public void select_item_drop_down_as(String string) throws InterruptedException {
		errosOrion.dropDown();
	   
	}

	//20
	@Given("Click to Add Spans to One Spliitter to another spilitter")
	public void click_to_add_spans_to_one_spliitter_to_another_spilitter() throws InterruptedException, AWTException {

		errosOrion.oneSpliitterToAnother();	
	}
	@When("Click to Reroute")
	public void click_to_reroute() throws InterruptedException {
		errosOrion.resolveCofError();
	}
	@When("Click one Splitter to Another Spilitter")
	public void click_one_splitter_to_another_spilitter() throws InterruptedException {
		
	}



}





