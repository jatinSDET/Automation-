package StepLocator;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import Utility.UserBase;



public class EthernetJourney_Step extends UserBase{


	@FindBy(xpath="//button[@data-testid='createWOButton']")
	WebElement createWOButton;

	@FindBy(xpath="//div[contains(div/following-sibling::text(),'Create Ethernet Workorder')]")
	WebElement CreateEthernetWorkorder;

	@FindBy(xpath="//input[@data-testid='circuitNumber']")
	WebElement circuitNumber;

	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[4]/input[1]")
	WebElement Suffix;

	@FindBy(xpath="//button[normalize-space()='SET']")
	WebElement SET;

	@FindBy(xpath="//h3[normalize-space()='End User Site Details']")
	WebElement endUser;

	@FindBy(xpath="//input[@id='endUser']")
	WebElement endUserDetails;

	@FindBy(id="endUserAddress")
	WebElement endUserAddressDetils;

	@FindBy(id="customer")
	WebElement customer;

	@FindBy(id="floor")
	WebElement floor;

	@FindBy(id="room")
	WebElement room;

	@FindBy(xpath="//button[@data-testid='cancelWorkorder']")
	WebElement cancelWorkorder;

	@FindBy(xpath="//button[normalize-space()='Yes']")
	WebElement Yes;

	@FindBy(xpath="//button[@data-testid='completeEthernetPhase']")
	WebElement completeEthernetPhase;

	@FindBy(xpath="//button[normalize-space()='Confirm']")
	WebElement Confirm;

	@FindBy(xpath="//button[@data-testid='rollbackEthernetPhase']")
	WebElement rollBackPhase;

	@FindBy(xpath="//h3[normalize-space()='Plant Positioning']")
	WebElement PlantPositioning;

	@FindBy(xpath="//h3[normalize-space()='Safety']")
	WebElement Safety;

	@FindBy(xpath="//span[normalize-space()='1 dummy cable requires an updated type']")
	WebElement errorDummy;

	@FindBy(xpath="//div[contains(text(),'DUMMY CABLE')]")
	WebElement dUMMYCABLE;

	@FindBy(xpath="//div[@class='sc-fznzqM kcMtBa']")
	WebElement dropDownAsNode;

	@FindBy(xpath="//span[normalize-space()='1 YCode equipment requires an updated item type']")
	WebElement errorname;

	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[4]/div[2]/div[1]/form[1]/div[1]/div[1]/div[7]/div[1]")
	WebElement selectItem;

	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/form[1]/div[1]/div[10]/div[3]/button[1]")
	WebElement startPoint;

	@FindBy(xpath="(//button[@class='sc-AxhCb eSwYtm'])[3]")
	WebElement endPointAndEnclosing1;

	@FindBy(xpath="//button[normalize-space()='DL:CCEA:X1691378']")
	WebElement endPointAndEnclosing2;

	@FindBy(xpath="//span[normalize-space()='2 civils does not have USRN number']")
	WebElement errorUSRN;

	@FindBy(xpath="//input[@id='usrn']")
	WebElement selectFilledUSRN1;

	@FindBy(xpath="//button[@data-testid='validation-row-missingBTPlant1141Code']")
	WebElement BTPlantErrors;

	@FindBy(xpath="//input[@id='btPlant1141Code']")
	WebElement BTPlantErrorsValidations;

	@FindBy(xpath="(//div[@class='sc-pZOBi bNnzrs'])[1]")
	WebElement plantPositioning1;

	@FindBy(xpath="(//div[@class='sc-pZOBi bNnzrs'])[2]")
	WebElement plantPositioning2;

	@FindBy(xpath="(//div[@class='sc-pZOBi bNnzrs'])[3]")
	WebElement plantPositioning3;

	@FindBy(css="div[data-testid='rams'] div[class='sc-pZOBi bNnzrs']")
	WebElement Rams;

	@FindBy(css="div[data-testid='siteInduction'] div[class='sc-pZOBi bNnzrs']")
	WebElement siteInductionRequired;

	@FindBy(css="div[data-testid='workingHeights'] div[class='sc-pZOBi bNnzrs']")
	WebElement workingHeights;

	@FindBy(css="div[data-testid='confinedSpaces'] div[class='sc-pZOBi bNnzrs']")
	WebElement confinedSpaces;

	@FindBy(css="div[data-testid='buildingBuiltBeforeYearTwoThousand'] div[class='sc-pZOBi bNnzrs']")
	WebElement buildingBuiltBeforeYearTwoThousand;

	@FindBy(css="div[data-testid='asbestosPresent'] div[class='sc-pZOBi bNnzrs']")
	WebElement asbestosPresent;

	@FindBy(css="div[data-testid='asbestosRegisterAvailable'] div[class='sc-pZOBi bNnzrs']")
	WebElement asbestosRegisterAvailable;

	@FindBy(xpath="//button[@data-testid='beginEthernetPhase']")
	WebElement beginSurveyBtn;

	@FindBy(xpath="//span[normalize-space()='1 YCode equipment requires an updated item type']")
	WebElement YCodeEquipmentError;

	@FindBy(xpath="//button[@data-testid='validation-row-tCodesWithDummyType']")
	WebElement TCodeEquipmentError;

	public EthernetJourney_Step()
	{
		PageFactory.initElements(driver, this);
	}

//	@BeforeMethod
//	public void accesssOn() throws InterruptedException
//	{
//		ethernetAccessOn();
//		Thread.sleep(4000);
//	}
	public void createWO() throws InterruptedException
	{
	
		EthernetWO();

	}
	public void endUserDetails(String Name, String Name2, String Name3, String Number1, String Number2) throws InterruptedException
	{
		EthernetWO();
		clickToWoName();
		

		endUser.click();
		endUserDetails.sendKeys(Name);
		endUserAddressDetils.sendKeys(Name2);
		customer.sendKeys(Name3);
		floor.sendKeys(Number1);
		room.sendKeys(Number2);
		saveBtn();
		Thread.sleep(10000);
	}

	public void cancelWorkorder() throws InterruptedException
	{

		EthernetWO();
		clickToWoName();
		
		
		cancelWorkorder.click();
		Yes.click();
		Thread.sleep(5000);
		verifyMessage("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/span[1]", "PRE_PLANNING - CANCELLED");
		Thread.sleep(2000);
	}
	public void RollbacktoPreplanningPhase(String Name, String Name2, String Name3, String Number1, String Number2) throws InterruptedException
	{
		
		EthernetWO();
		clickToWoName();
		
		

		endUser.click();
		endUserDetails.sendKeys(Name);
		endUserAddressDetils.sendKeys(Name2);
		customer.sendKeys(Name3);
		floor.sendKeys(Number1);
		room.sendKeys(Number2);
		saveBtn();
		Thread.sleep(3000);
		clickErrorBtn();
		BTPlantErrors.click();
		validationRow();
		BTPlantErrorsValidations.sendKeys(Number1);
		saveBtn();
		Thread.sleep(3000);
		validationRow();
		BTPlantErrorsValidations.sendKeys(Number2);
		saveBtn();
		Thread.sleep(3000);
		clickToWoName();
		completeEthernetPhase.click();
		Confirm.click();
		rollBackPhase.click();
		Confirm.click();
		Thread.sleep(10000);
	}

	public void Plant_Position_details() throws InterruptedException
	{
		EthernetWO();
		clickToWoName();
		
		

		PlantPositioning.click();
		plantPositioning1.click();
		selectDropdown("Yes");
		plantPositioning2.click();
		selectDropdown("Yes");
		plantPositioning3.click();
		selectDropdown("Yes");
		saveBtn();
		Thread.sleep(5000);
	}

	public void Safety_details(String Name, String Name2, String Name3, String Number1, String Number2) throws InterruptedException
	{
		
		EthernetWO();
		clickToWoName();
		
		

		endUser.click();
		endUserDetails.sendKeys(Name);
		endUserAddressDetils.sendKeys(Name2);
		customer.sendKeys(Name3);
		floor.sendKeys(Number1);
		room.sendKeys(Number2);
		saveBtn();
		Thread.sleep(5000);
		clickErrorBtn();
		BTPlantErrors.click();
		validationRow();
		BTPlantErrorsValidations.sendKeys(Number1);
		saveBtn();
		Thread.sleep(3000);
		validationRow();
		BTPlantErrorsValidations.sendKeys(Number2);
		saveBtn();
		Thread.sleep(3000);
		clickToWoName();
		completeEthernetPhase.click();
		Confirm.click();
		beginSurveyBtn.click();
		Confirm.click();
		Thread.sleep(3000);		
		Safety.click();
		Rams.click();
		selectDropdown("Generic");
		siteInductionRequired.click();
		selectDropdown("Yes");
		workingHeights.click();
		selectDropdown("Yes");
		confinedSpaces.click();
		selectDropdown("Yes");
		buildingBuiltBeforeYearTwoThousand.click();
		selectDropdown("Yes");
		asbestosPresent.click();
		selectDropdown("Yes");	
		asbestosRegisterAvailable.click();
		selectDropdown("Yes");
		Thread.sleep(2000);
		saveBtn();
		Thread.sleep(5000);
	}

	public void changeDummyCabletoEthernetCable(String Name, String Name2, String Name3, String Number1, String Number2) throws InterruptedException
	{
		
		EthernetWO();
		clickToWoName();
		
		
		
		

		//		endUserDetails(Name);
		endUser.click();
		endUserDetails.sendKeys(Name);
		endUserAddressDetils.sendKeys(Name2);
		customer.sendKeys(Name3);
		floor.sendKeys(Number1);
		room.sendKeys(Number2);
		saveBtn();
		Thread.sleep(2000);
		clickErrorBtn();
		BTPlantErrors.click();
		validationRow();
		BTPlantErrorsValidations.sendKeys(Number1);
		saveBtn();
		validationRow();
		BTPlantErrorsValidations.sendKeys(Number2);
		saveBtn();
		Thread.sleep(1000);
		clickToWoName();
		completeEthernetPhase.click();
		Confirm.click();
		beginSurveyBtn.click();
		Confirm.click();
		Thread.sleep(1000);
		errorDummy.click();
		validationRow();
		dUMMYCABLE.click();
		selectDropdown("COF 950/144");
		saveBtn();
		Thread.sleep(5000);

	}

	public void changeTheTCodeItemtoSmallMediumLargeNode(String Name, String Name2, String Name3, String Number1, String Number2) throws InterruptedException, AWTException
	{
		EthernetWO();
		clickToWoName();
		
		
		
		

		//		endUserDetails(Name);
		endUser.click();
		endUserDetails.sendKeys(Name);
		endUserAddressDetils.sendKeys(Name2);
		customer.sendKeys(Name3);
		floor.sendKeys(Number1);
		room.sendKeys(Number2);
		saveBtn();
		Thread.sleep(2000);
		clickErrorBtn();
		BTPlantErrors.click();
		validationRow();
		BTPlantErrorsValidations.sendKeys(Number1);
		saveBtn();
		validationRow();
		BTPlantErrorsValidations.sendKeys(Number2);
		saveBtn();
		Thread.sleep(1000);
		clickToWoName();
		completeEthernetPhase.click();
		Confirm.click();
		beginSurveyBtn.click();
		Confirm.click();
		Thread.sleep(2000);
		zoomOut();
		TCodeEquipmentError.click();
		validationRow();
		dropDownAsNode.click();
		selectDropdown("SMALL_NODE_AS_IJ");
		saveBtn();
		Thread.sleep(2000);

	}

	public void YCodetoDcborMcb(String Name, String Name2, String Name3, String Number1, String Number2) throws InterruptedException, AWTException
	{
		
		EthernetWO();
		clickToWoName();
		
		
		
		

		//		endUserDetails(Name);
		endUser.click();
		endUserDetails.sendKeys(Name);
		endUserAddressDetils.sendKeys(Name2);
		customer.sendKeys(Name3);
		floor.sendKeys(Number1);
		room.sendKeys(Number2);
		saveBtn();
		Thread.sleep(2000);
		clickErrorBtn();
		BTPlantErrors.click();
		validationRow();
		BTPlantErrorsValidations.sendKeys(Number1);
		saveBtn();
		validationRow();
		BTPlantErrorsValidations.sendKeys(Number2);
		saveBtn();
		Thread.sleep(1000);
		clickToWoName();
		completeEthernetPhase.click();
		Confirm.click();
		beginSurveyBtn.click();
		Confirm.click();
		Thread.sleep(2000);
		errorname.click();
		validationRow();
		zoomOut();
		selectItem.click();
		selectDropdown("MULTICCT_SP_BOX_12TR");
		saveBtn();
		Thread.sleep(3000);
	}

	public void searchByTCode() throws InterruptedException
	{
		
		EthernetWO();
		clickToWoName();
		
		

		startPoint.click();
		verifyMessage("/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/form[1]/div[1]/div[8]/span[1]", "T CODE");

	}
	public void searchByYCode() throws InterruptedException, AWTException
	{
		EthernetWO();
		clickToWoName();
		
		
		
		

		zoomOut();
		endPointAndEnclosing1.click();
		endPointAndEnclosing1.click();
		Thread.sleep(5000);
		//		verifyMessage("/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/form[1]/div[1]/div[10]/span[1]", "YCODE");

	}

	public void USRNDetailforTCodeandYCode(String Number, String Number2) throws InterruptedException
	{

		EthernetWO();
		clickToWoName();
		
		
		
		errorUSRN.click();
		validationRow();
		selectFilledUSRN1.sendKeys(Number);
		saveBtn();
		validationRow();
		selectFilledUSRN1.sendKeys(Number2);
		saveBtn();
		Thread.sleep(5000);
		

	}
	
//	@After
//	public void accessOff() throws InterruptedException
//	{
//		ethernetAccessOff();
//		Thread.sleep(5000);
//	}
}
