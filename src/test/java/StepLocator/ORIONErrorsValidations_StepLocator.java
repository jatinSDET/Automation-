package StepLocator;

import java.awt.AWTException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.UserBase;

public class ORIONErrorsValidations_StepLocator extends UserBase{


	@FindBy(xpath="//*[@id=\"root\"]/div/div[3]/div/div/div/button[3]/div/span")
	WebElement cpeMissing;

	@FindBy(xpath="(//button[@data-testid='validation-row'])[1]")
	WebElement selectError;

//	@FindBy(xpath="(//div[@class='sc-pZOBi bNnzrs'])[1]")
//	WebElement premiseTypeSDU;

	@FindBy(xpath="(//div[@class='sc-pJUVA kxyWmW'])[2]")
	WebElement premiseFedViaNOTSET ;

	@FindBy(xpath="(//div[@class='sc-pJUVA kxyWmW'])[3]")
	WebElement sSNOHnotSET;
	
//	@FindBy(xpath="(//div[@class='sc-pJUVA kxyWmW'])[2]")
//	WebElement dropdown;


	//2
	//	@FindBy(xpath="//div[@class='sc-ptEpz CXDTT']")
	//	WebElement clickErrorBtn;

	@FindBy(xpath="//button[@data-testid='validation-row-EquipmentsWithInvalidAddresses']")
	WebElement validationRowError1;

	@FindBy(xpath="(//button[@data-testid='validation-row'])[1]")
	WebElement validationRowError2;

	@FindBy(xpath="//textarea[@name='friendlyAddress']")
	WebElement friendlyAddress;

	//3
	@FindBy(xpath="//button[@data-testid='validation-row-NoDuctWithCable']")
	WebElement noDucthaveAssociateCable;

	@FindBy(xpath="(//button[@data-testid='validation-row'])[1]")
	WebElement clickNameandError;

	@FindBy(xpath="//div[contains(text(),'TRENCH')]")
	WebElement clickNameandError2 ;

	@FindBy(xpath="//span[normalize-space()='CONDUIT']")
	WebElement selectASConduit ;

	//4
	@FindBy(xpath="//input[@data-testid='attachment-file-choose']")
	WebElement attachment ;

	@FindBy(xpath="//textarea[@data-testid='attachment-description']")
	WebElement description;

	@FindBy(xpath="//div[@class='sc-fznzqM kcMtBa']")
	WebElement dropDown1 ;

	@FindBy(xpath="//span[normalize-space()='DRSS']")
	WebElement dropDown2 ;


	//5

	@	FindBy(xpath="//button[@data-testid='validation-row-MDUCPEsNeedEquipmentValidation']")
	WebElement errorBasementBudi;

	@	FindBy(xpath="//button[normalize-space()='UPRN:100062349215']")
	WebElement errorFirstRow ;

	@	FindBy(xpath="(//*[name()='text'][normalize-space()='MDU 100062349215'])[1]")
	WebElement x965;

	@	FindBy(xpath="//button[@data-testid='bulk-reparent']")
	WebElement bulkReparent;

	@	FindBy(xpath="//div[@class='sc-oTmZL kfNTWi']//*[name()='svg']//*[name()='g' and @id='pointerGroup']//*[name()='g' and @id='mainGroup']//*[name()='g' and contains(@class,'nodes')]//*[name()='g'][28]/*[name()='g'][1]")
	WebElement cpe1;

	//6
	@FindBy(xpath="(//div[@class='sc-AxhUy dRAsXB'])[8]")
	WebElement errorRouteThrough;

	@FindBy(xpath="//span[normalize-space()='14 cables are routed through ND and Aerial spans']")
	WebElement routeErrorFirstRow;

	@FindBy(xpath="//button[@class='sc-AxiKw biCAiB']")
	WebElement submit;

	//7
	@FindBy(xpath="//button[@data-testid='reparent-equipment']")
	WebElement reparent;

	@FindBy(xpath="(//div[@class='sc-AxhUy kPYByP'])[1]")
	WebElement spilitterScale;

	@FindBy(xpath="//span[normalize-space()='Add Children']")
	WebElement addChildren;

	@FindBy(xpath="//div[@class='sc-oTmZL kfNTWi']//*[name()='svg']//*[name()='g' and @id='pointerGroup']//*[name()='g' and @id='mainGroup']//*[name()='g' and contains(@class,'nodes')]//*[name()='g'][3]/*[name()='g'][1]")
	WebElement CBT1;

	@FindBy(xpath="//div[@class='sc-oTmZL kfNTWi']//*[name()='svg']//*[name()='g' and @id='pointerGroup']//*[name()='g' and @id='mainGroup']//*[name()='g' and contains(@class,'nodes')]//*[name()='g'][4]/*[name()='g'][1]")
	WebElement CBT2;

	@FindBy(xpath="//div[@class='sc-oTmZL kfNTWi']//*[name()='svg']//*[name()='g' and @id='pointerGroup']//*[name()='g' and @id='mainGroup']//*[name()='g' and contains(@class,'nodes')]//*[name()='g'][5]/*[name()='g'][1]")
	WebElement CBT3;

	@FindBy(xpath="//div[@class='sc-oTmZL kfNTWi']//*[name()='svg']//*[name()='g' and @id='pointerGroup']//*[name()='g' and @id='mainGroup']//*[name()='g' and contains(@class,'nodes')]//*[name()='g'][6]/*[name()='g'][1]")
	WebElement CBT4;

	//8
	@FindBy(xpath="(//div[@class='sc-AxhUy kPYByP'])[1]")
	WebElement intermediateJoint;

	@FindBy(xpath="//button[@data-testid='reparent-equipment']")
	WebElement reparentEqp;

	@FindBy(xpath="//span[normalize-space()='Some nodes serve too many directly connected CBTs']")
	WebElement directlyConnectedCBTs;

	//9
	@FindBy(xpath="//span[normalize-space()='1 ND span has no depth of cover defined']")
	WebElement depthOfCoverDefined;

	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[4]/div[2]/div[1]/form[1]/div[1]/div[6]/div[1]/div[1]")
	WebElement depthCover;

	@FindBy(xpath="//span[normalize-space()='600']")
	WebElement selectAs600 ;

	//10

	@FindBy(xpath="//button[@data-testid='validation-row-EmptySurfaceTypes']")
	WebElement surfaceTypeDefine;

	@FindBy(xpath="//input[@id='surfaceRough']")
	WebElement enterRoughUnsurfaced;

	@FindBy(xpath="//input[@id='surfaceFootway']")
	WebElement enterFootway;

	@FindBy(xpath="//input[@id='surfaceCarriageway']")
	WebElement enterCarriageway;

	//11
	@FindBy(xpath="//button[@data-testid='validation-row-OrphanedEquipment']")
	WebElement noParent;

	@FindBy(xpath="//button[@data-testid='reparent-equipment']")
	WebElement reparentCPE;

	@FindBy(xpath = "(//div[@class='sc-fznBtT ccaska'])[1]") 
	WebElement selectCPE;

	@FindBy(xpath ="//input[@data-testid='SearchBar']")
	WebElement searchBar;

	@FindBy(xpath="(//div[@class='sc-oTaid fpeoAN'])[2]")
	WebElement selectCPEOption;


	//12

	@FindBy(xpath="//div[@class='sc-pZOBi bNnzrs']")
	WebElement Status;

	@	FindBy(xpath="//span[normalize-space()='PDR']")
	WebElement PDR;

	@FindBy(xpath="//span[normalize-space()='1 structures or spans have a status of PDR']")
	WebElement errorName;

	@FindBy(xpath="//span[normalize-space()='PDA']")
	WebElement PDA;

	@FindBy(xpath="//div[@class='sc-pZOBi bNnzrs']")
	WebElement dropDown;

	//13

	@FindBy(xpath="//span[normalize-space()='1 external span is connected to an SDU']")
	WebElement errorSDU;

	//14
	@FindBy(xpath="//span[contains(text(),'Some civils are not serving any equipment or cable')]")
	WebElement errorName14;

	@FindBy(xpath="//div[@class='sc-pZOBi bNnzrs']")
	WebElement statusDropDown;;

	@FindBy(xpath="//span[normalize-space()='IPL']")
	WebElement StatusIPL;

	//15

	@	FindBy(xpath ="//input[@id='subPremise']")
	WebElement subPremise;

	@	FindBy(xpath ="//input[@id='premiseName']")
	WebElement premiseName;

	@	FindBy(xpath ="//input[@id='postTown']")
	WebElement postTown;

	@	FindBy(xpath ="//input[@id='postcode']")
	WebElement postcode;

	@	FindBy(xpath ="//button[@data-testid='validation-row-IncompleteAddress']")
	WebElement IncompleteAddress;

	@FindBy(xpath="(//div[@class='sc-fznBtT ccaska'])[1]")
	WebElement ClickCPE;

	//16
	@FindBy(xpath="//button[normalize-space()='JC:JRF:W1682231']")
	WebElement enclosingStructures;

	@FindBy(xpath="(//div[@class='sc-fznzqM kcMtBa'])[2]")
	WebElement selectDropDown;

	@FindBy(xpath="//span[normalize-space()='INFERRED_STRUCTURE']")
	WebElement selectedInferredStructure;

	@FindBy(xpath="//span[normalize-space()='GENERIC']")
	WebElement selectedGeneric;

	@FindBy(xpath="//span[contains(text(),'1 Equipment or cable segment are inside an inferre')]")
	WebElement selectedError;

	@FindBy(xpath="//span[normalize-space()='1_32_CONN_SPLITTER']")
	WebElement selectConnSplitter;

	//17
	@FindBy(xpath="//label[normalize-space()='Add Multiple']")
	WebElement addMultiple;

	@FindBy(xpath="//button[@data-testid='validation-row-ReducersWithTooManySpans']")
	WebElement moreThan2;

	@FindBy(xpath="//div[@data-testid='class-dropdown']//div[@class='sc-fznzqM kcMtBa'][normalize-space()='REDUCER']")
	WebElement classReducer;

	@FindBy(xpath="//button[@class='sc-AxiKw biCAiB']")
	WebElement submitBtn;

	//18
	@FindBy(xpath="//span[normalize-space()='1 Duct Tee has more than 3 connected spans']")
	WebElement clickToError;

	@FindBy(xpath="//div[@data-testid='class-dropdown']//div[@class='sc-fznzqM kcMtBa'][normalize-space()='DUCT TEE']")
	WebElement ductTee;

	@FindBy(xpath="//label[normalize-space()='Add Multiple']")
	WebElement addMultiple1;

	//19
	@FindBy(xpath="//span[normalize-space()='Add Children']")
	WebElement addChildrenNode;

	@FindBy(xpath="//button[normalize-space()='No']")
	WebElement ReparentEquipmentAsNo;

	@FindBy(xpath="//span[normalize-space()='Some nodes serve too many CBTs']")
	WebElement clickToErrorNode;

	@FindBy(xpath = "//div[normalize-space()='SPLITTER_SCALE THY_21B_SN_56']")
	WebElement SPLITTER_SCALE;

	@FindBy(xpath="//div[contains(text(),'SMALL_NODE_AS_IJ')]")
	WebElement selectDropDownNode;

	@FindBy(xpath="//span[normalize-space()='MEDIUM_NODE_AS_IJ']")
	WebElement MEDIUM_NODE;

	@FindBy(xpath="(//div[@class='sc-fznBtT ccaska'])[2]")
	WebElement IJ ;

	@FindBy(xpath="//button[@data-testid='SubmitButton']")
	WebElement submitBtnNodes;

	//20

	@	FindBy(xpath="//span[normalize-space()='1 COF600 is routed internally for more than 2m']")
	WebElement clickToErrorCOF600;

	@FindBy(xpath="(//div[@class='sc-fznBtT ccaska'])[4]")
	WebElement conduitCable;

	@FindBy(xpath="(//div[@class='sc-fznzqM kcMtBa'])[2]")
	WebElement itemType;

	@FindBy(xpath="(//div[@class='sc-fznBtT ccaska'])[1]")
	WebElement intermittentJ;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/form[1]/div[1]/div[1]/div[7]/div[2]/div[67]/span[1]")
	WebElement ItemType2;

	public ORIONErrorsValidations_StepLocator() {
		PageFactory.initElements(driver, this);
	}

	public void missingCpe() throws InterruptedException, AWTException
	{
		clickErrorBtn();
		Thread.sleep(2000);
		cpeMissing.click();
		Thread.sleep(2000);
		selectError.click();
	}
	public void selectAsPremiseTypeSDU() throws InterruptedException
	{
//		premiseTypeSDU.click();
//		Thread.sleep(2000);
//		selectDropdown("Single Dwelling Unit Business");
//		Thread.sleep(2000);	
	}

	public void premiseFedViaNotSet() throws InterruptedException
	{
		premiseFedViaNOTSET.click();
		Thread.sleep(2000);
		selectDropdown("O");
		Thread.sleep(2000);
	}

	public void sSNNotSET() throws InterruptedException
	{
		sSNOHnotSET.click();
		selectDropdown("OH Feed hoist required");
		saveBtn();
		Thread.sleep(4000);
	}
	public void validRow1() throws InterruptedException
	{
		Thread.sleep(2000);
		clickErrorBtn();
		validationRowError1.click();
		validationRow();

	}
	public void friendlyAddress(String fAddress) throws InterruptedException
	{
		friendlyAddress.sendKeys(fAddress);
		saveBtn();
		Thread.sleep(5000);
	}

	public void noDuctError() throws InterruptedException
	{
		//		clickErrorBtn();
		Thread.sleep(2000);
		noDucthaveAssociateCable.click();
	}
	public void clickNameandError()
	{
		clickNameandError.click();
		clickNameandError2.click();
	}
	public void clickToConduit() throws InterruptedException
	{
		selectASConduit.click();
		saveBtn();
		Thread.sleep(5000);
	}
	public void chooseFile() throws InterruptedException
	{
		chooseFile(attachment, "papaya.png",dropDown1 ,"DRSS", "at least one attachment");
		//		Thread.sleep(3000);
		//		chooseFile(attachment, "Panda.jpg",dropDown1 ,"Spine/Agg");

	}
	public void fillDescription()
	{
		description.sendKeys();
	}
	public void dropDownData()
	{
		dropDown1.click();
		dropDown2.click();
	}
	public void clickedErrorBasementBudi() throws InterruptedException
	{
		Thread.sleep(2000);
		errorBasementBudi.click();
		Thread.sleep(2000);
		errorFirstRow.click();
		Thread.sleep(2000);
		cutWindow();
		Thread.sleep(2000);
		zoomOutSchematic();
	}
	public void addBtnAddEquipmentAddIJ () throws InterruptedException
	{
		addBasement();
		Thread.sleep(2000);
		x965.click();	
		Thread.sleep(3000);
	}
	public void basementAddChildren() throws InterruptedException
	{
		Thread.sleep(2000);
		bulkReparent.click();
		Thread.sleep(2000);
	}
	public void cpeAndSubmit() throws InterruptedException
	{
		cpe1.click();
		Thread.sleep(2000);
		submitBtn();
		Thread.sleep(5000);
	}
	public void drawSpans() throws InterruptedException
	{
		Thread.sleep(2000);
		addsSpans();
		Thread.sleep(2000);
		searchBox("THY_21B_SN_56");
		clickToCordinates();
		searchBox("THY_21B_CBT_1034_1");
		clickToCordinates();	
	}

	public void errorsAndReroute() throws InterruptedException
	{
		Thread.sleep(2000);
		clickErrorBtn();
		Thread.sleep(2000);
		routeErrorFirstRow.click();
		Thread.sleep(2000);
		validationRow();
		Reroute();
		Thread.sleep(2000);
		searchBox("THY_21B_SN_56");
		clickToCordinates();
		searchBox("THY_21B_CBT_1034_1");
		clickToCordinates();
		submit.click();
		Thread.sleep(5000);
	}
	public void addingSplitter() throws InterruptedException
	{
		addSpilitter();
		searchBox("JC:JRC:W1681133");
		clickToCordinates();

		reparent.click();
		searchBox("THY_21B_SN_56");
		clickToCordinates();
		Thread.sleep(3000);

	}
	public void selectSpilitter() throws InterruptedException
	{
		searchBox("JC:JRC:W1681133");
		clickToCordinates();
		Thread.sleep(4000);
		spilitterScale.click();
		Thread.sleep(2000);
		addChildren.click();
		Thread.sleep(2000);
		btnSchematic();
		Thread.sleep(4000);
	}
	public void addCBT() throws InterruptedException
	{
		//		CBT1.click();
		//		CBT2.click();
		//		CBT3.click();
		//		CBT4.click();
		addCBTOutGoingCables();
		submitBtn();
		Thread.sleep(5000);
	}
	public void addMDUandIJ() throws InterruptedException
	{

		addMDU();
		searchBox("JC:JRC:W1681133");
		clickToCordinates();
		Thread.sleep(5000);
		addBasement();
		Thread.sleep(2000);
		clickToCordinates();
		addsSpans();
		searchBox("JC:JRC:W1681133");
		clickToCordinates();
		Thread.sleep(4000);
		searchBox("THY_21B_SN_56");
		clickToCordinates();
		Thread.sleep(5000);

	}
	public void reparentIJToMainSplitter() throws InterruptedException
	{
		searchBox("JC:JRC:W1681133");
		Thread.sleep(2000);
		clickToCordinates();
		intermediateJoint.click();
		reparentEqp.click();
		searchBox("THY_21B_SN_56");
		clickToCordinates();
		clickErrorBtn(); 
		directlyConnectedCBTs.click();
		//		waitForClick(directlyConnectedCBTs);
		btnSchematic();
		validationRow();
		addChildren();
		addCBTOutGoingCables();
		submitBtn();
		Thread.sleep(5000);
	}
	public void addSpansAtStructure() throws InterruptedException, AWTException
	{
		addTrenchSpan();
		searchBox("JC:GEN:W1697327");
		clickToCordinates();
		searchBox("THY_21B_SN_56");
		clickToCordinates();
		clickErrorBtn();
		depthOfCoverDefined.click();
		validationRow();
		zoomOut();	
	}
	public void CoverDefine()
	{
		depthCover.click();
	}
	public void As600() throws InterruptedException
	{
		selectAs600.click();
		saveBtn();
		Thread.sleep(10000);
	}
	public void addSmallIJatStructure() throws InterruptedException
	{
		Thread.sleep(2000);
		addsSpans();
		searchBox("JC:JUF:W1731644");
		clickToCordinates();
		searchBox("THY_21B_SN_56");
		clickToCordinates();
		clickErrorBtn();
		Thread.sleep(2000);
		surfaceTypeDefine.click();
		validationRow();
	}

	public void roughUnsurfaced(String rUnsurfaced)
	{
		enterRoughUnsurfaced.sendKeys(rUnsurfaced);
	}

	public void enterFootway(String footway)
	{
		enterFootway.sendKeys(footway);
	}
	public void enterCarriageway(String carriageway) throws InterruptedException
	{
		enterCarriageway.sendKeys(carriageway);
		saveBtn();
		Thread.sleep(10000);

	}
	public void reparentCPEandCBT(String UPRN) throws InterruptedException
	{
		clickErrorBtn();
		noParent.click();
		validationRow();
		searchBar.sendKeys(Keys.CONTROL + "a");
		searchBar.sendKeys(Keys.DELETE);
		Thread.sleep(1000);
		searchBar.sendKeys(UPRN);
		selectCPEOption.click();
		Thread.sleep(1000);
		reparentCPE.click();
		searchBox("THY_21B_CBT_928_1");
		clickToCordinates();

	}
	public void cbtStatus() throws InterruptedException
	{
		searchBox("BUR:STATE:W1640310']");
		Status.click();
		PDR.click();
		saveBtn();
		Thread.sleep(10000);
	}
	public void errorName() throws InterruptedException
	{
		clickErrorBtn();
		Thread.sleep(1000);
		errorName.click();
		validationRow();
	}
	public void dropDownPDA() throws InterruptedException
	{
		Status.click();
		dropDown.click();
		selectDropdown("PDA");
		saveBtn();	
		Thread.sleep(5000);
	}
	public void addCPEatStructure() throws InterruptedException
	{
		addSDU();
		searchBox("482475,160519");
		clickToCordinates();
		Thread.sleep(5000);
		addCPEEcTest();
		searchBox("482475,160519");
		clickToCordinates();
		Thread.sleep(5000);
	}
	public void drawSpnToCBT() throws InterruptedException
	{
		addsSpans();
		searchBox("482475,160519");
		clickToCordinates();
		searchBox("THY_21B_CBT_925_1");
		clickToCordinates();
		clickErrorBtn();
		errorSDU.click();
		validationRow();
		deleteBtn();
		Thread.sleep(5000);
	}
	public void drawSpans14() throws InterruptedException, AWTException
	{
		addsSpans();
		searchBox("THY_21B_SN_56");
		clickToCordinates();
		searchBox("JC:GEN:W1697327");
		clickToCordinates();
		Thread.sleep(3000);
		clickErrorBtn();
		Thread.sleep(2000);
		errorName14.click();
		Thread.sleep(1000);
		validationRow();
		zoomOut();
		Thread.sleep(1000);
	}
	public void statusIPL() throws InterruptedException, AWTException
	{
		statusDropDown.click();
		Thread.sleep(2000);
		Thread.sleep(2000);
		StatusIPL.click();
		saveBtn();
		Thread.sleep(5000);
	}
	public void incompleteCPEData() throws InterruptedException
	{
		addSDU();
		searchBox("UPRN:100060411078");
		clickToCordinates();
		Thread.sleep(5000);
		addCPEEcTest();
		searchBox("UPRN:100060411078");
		clickToCordinates();
		Thread.sleep(3000);
		searchBox("UPRN:100060411078");
		clickToCordinates();
		ClickCPE.click();
		Thread.sleep(2000);

	}
	public void removeAddressData() throws InterruptedException
	{
		subPremise.clear();;
		Thread.sleep(1000);
		premiseName.clear();
		Thread.sleep(1000);
		postTown.clear();
		Thread.sleep(1000);
		postcode.clear();
		Thread.sleep(1000);
		saveBtn();
		Thread.sleep(5000);
		clickErrorBtn();
		IncompleteAddress.click();
		validationRow();
	}
	public void fillAddressData(String dataCPE) throws InterruptedException
	{
		subPremise.sendKeys(dataCPE);
		Thread.sleep(1000);
		premiseName.sendKeys(dataCPE);
		Thread.sleep(1000);
		postTown.sendKeys(dataCPE);
		Thread.sleep(1000);
		postcode.sendKeys(dataCPE);
		Thread.sleep(1000);
		saveBtn();
		Thread.sleep(5000);
	}
	public void enclosingStructure() throws InterruptedException
	{
		searchBox("THY_21B_SN_56");
		enclosingStructures.click();
		selectDropDown.click();
	}

	public void selectInfered() throws InterruptedException
	{
		selectDropdown("INFERRED_STRUCTURE");
		saveBtn();
		Thread.sleep(3000);
		clickErrorBtn();
		selectedError.click();
		validationRow();
	}
	public void againEnclosingStructure()
	{
		enclosingStructures.click();
		selectDropDown.click();
	}
	public void selectGeneric() throws InterruptedException
	{
		selectDropdown("GENERIC");
		saveBtn();
		Thread.sleep(5000);
	}
	public void addReducerAndAddSpanToStructure() throws InterruptedException, AWTException
	{
		addReducer();
		searchBox("JC:JRC:W1681133");
		clickToCordinates();
		Thread.sleep(5000);
		addsSpans();
		addMultiple.click();
		searchBox("JC:JRC:W1681133");
		clickToCordinates();
		searchBox("THY_21B_CBT_1038_1");
		clickToCordinates();
		searchBox("JC:JRC:W1681133");
		clickToCordinates();
		searchBox("THY_21B_CBT_1042_1");
		clickToCordinates();
		searchBox("JC:JRC:W1681133");
		clickToCordinates();
		searchBox("THY_21B_CBT_1043_1");
		clickToCordinates();
		submitBtn.click();
		clickErrorBtn();
		zoomOut();
		Thread.sleep(3000);
		moreThan2.click();
		validationRow();
	}
	public void selectChangeOfState() throws InterruptedException 
	{
		classReducer.click();
		selectDropdown("CHANGE OF STATE");
		saveBtn();
		Thread.sleep(5000);
	}
	public void addDuctAndAddToCBTs() throws InterruptedException
	{
		addDuctTee();
		Thread.sleep(2000);
		searchBox("JC:JRC:W1681133");
		clickToCordinates();
		Thread.sleep(2000);
		addsSpans();
		addMultiple1.click();
	}
	public void ductToCBT() throws InterruptedException
	{
		searchBox("JC:JRC:W1681133");
		clickToCordinates();
		searchBox("THY_21B_CBT_1038_1");
		clickToCordinates();
		searchBox("JC:JRC:W1681133");
		clickToCordinates();
		searchBox("THY_21B_CBT_1042_1");
		clickToCordinates();
		searchBox("JC:JRC:W1681133");
		clickToCordinates();
		searchBox("THY_21B_CBT_1043_1");
		clickToCordinates();
		searchBox("JC:JRC:W1681133");
		clickToCordinates();
		searchBox("THY_21B_CBT_1044_1");
		clickToCordinates();
		searchBox("JC:JRC:W1681133");
		clickToCordinates();
		searchBox("THY_21B_CBT_925_1");
		clickToCordinates();
		submitBtn.click();
	}
	public void dropDown() throws InterruptedException
	{
		clickErrorBtn();
		clickToError.click();
		validationRow();
		Thread.sleep(2000);
		ductTee.click();
		selectDropdown("CHANGE OF STATE");
		saveBtn();	
		Thread.sleep(5000);
	}
	public void addSmallIJandReparent() throws InterruptedException
	{
		addIJ();
		searchBox("THY_21B_SN_56");
		clickToCordinates();
		//		searchBox("THY_21B_SN_56");
		//		clickToCordinates();
	}

	public void reparentIJToMain() throws InterruptedException
	{
		reparent();
		Thread.sleep(2000);
		searchBox("THY_21B_SN_56");
		clickToCordinates();
		SPLITTER_SCALE.click();
		Thread.sleep(10000);
		searchBox("THY_21B_SN_56");
		clickToCordinates();
	}

	public void IJAndCBT() throws InterruptedException, AWTException
	{
		Thread.sleep(3000);
		IJ.click();
		Thread.sleep(3000);
		addChildrenNode.click();
		btnSchematic();
		zoomOutSchematic();
		addCBTs();
		Thread.sleep(2000);
		zoomOut();
		//		Thread.sleep(2000);
		//		submitBtn();
		submitBtnNodes.click();

	}
	public void reparentEquipment() throws InterruptedException
	{
		ReparentEquipmentAsNo.click();
		clickErrorBtn();
		clickToErrorNode.click();
		validationRow();
	}
	public void dropDownNode() throws InterruptedException
	{
		selectDropDownNode.click();
		MEDIUM_NODE.click();
		saveBtn();
	}
	public void  oneSpliitterToAnother() throws InterruptedException, AWTException
	{
		addMDU();
		searchBox("482456,160547");
		clickToCordinates();
		addBasement();
		searchBox("482456,160547");
		clickToCordinates();
		Thread.sleep(3000);
		addsSpans();
		searchBox("482456,160547");
		clickToCordinates();
		searchBox("THY_21B_SN_56");
		clickToCordinates();
		searchBox("482456,160547");
		clickToCordinates();
		intermittentJ.click();
		reparent();
		searchBox("THY_21B_SN_56");
		clickToCordinates();
		searchBox("482456,160547");
		clickToCordinates();
		zoomOut();
		Thread.sleep(2000);
		conduitCable.click();
		Thread.sleep(2000);
		itemType.click();
		selectDropdown("INT");
		saveBtn();	
		Thread.sleep(5000);	
	}
	public void resolveCofError() throws InterruptedException
	{
		clickErrorBtn();
		clickToErrorCOF600.click();
		validationRow();
		searchBox("482456,160547");
		clickToCordinates();
		conduitCable.click();
		itemType.click();
		Thread.sleep(3000);
		selectDropdown("D56");
//		ItemType2.click();
		saveBtn();	
		Thread.sleep(5000);	
		

	}
}










