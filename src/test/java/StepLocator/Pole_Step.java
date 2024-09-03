package StepLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.UserBase;

public class Pole_Step extends UserBase{


	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/form[1]/div[1]/div[12]/label[1]")
	WebElement poleReset;

	@FindBy(xpath="//input[@id='poling.dpNumber']")
	WebElement DpNumber;

	@FindBy(xpath="//div[@data-testid='poling.manualWorkOnly']")
	WebElement manualWork;

	@FindBy(xpath="//div[@data-testid='poleSurfaceType']")
	WebElement surfaceType;

	@FindBy(xpath="//input[@id='poleNumber']")
	WebElement poleNumber;

	@FindBy(xpath="//input[@name='poling.additionalStaysRequired']")
	WebElement additionalStaysRequired;

	@FindBy(xpath="//div[@data-testid='poling.fibreOnlyPole']")
	WebElement FibreOnly;

	@FindBy(xpath="//input[@id='poling.existingAerialCables']")
	WebElement existingAerialCables;

	@FindBy(xpath="//input[@id='poling.existingDropWires']")
	WebElement existingDropWires;

	@FindBy(xpath="//input[@id='poling.existingStays']")
	WebElement existingStays;

	@FindBy(xpath="//input[@id='poling.existingBlockTerminals']")
	WebElement existingBlockTerminals;

	@FindBy(xpath="//input[@id='poling.existingJoints']")
	WebElement existingJoints;

	@FindBy(xpath="//input[@id='poling.existingOtherFittings']")
	WebElement existingOtherFittings;


	public Pole_Step()
	{
		PageFactory.initElements(driver, this);
	}

	public void bckgroundSteps(String DPNumber) throws InterruptedException
	{
//		searchBar("POL:DATA:W1642149");
		checkOthersFieldsIsEnable();
		poleReset.click();
		Thread.sleep(2000);
		DpNumber.sendKeys(DPNumber);
		
		saveBtn();
		Thread.sleep(10000);
	}

	public void manualWorkOnly() throws InterruptedException
	{
		manualWork.click();
		selectDropdown("Yes");
		Thread.sleep(2000);
		saveBtn();
		Thread.sleep(10000);
		
	}
	public void surfaceType() throws InterruptedException
	{
//		Thread.sleep(2000);
		surfaceType.click();
		selectDropdown("Tarmac");
		Thread.sleep(1000);
		saveBtn();
		Thread.sleep(10000);
	}
	public void DPNumber(String number) throws InterruptedException
	{
		
		DpNumber.sendKeys(number);
		saveBtn();
		Thread.sleep(10000);
	}
	
	public void poleNumber(String number) throws InterruptedException
	{
		
		poleNumber.sendKeys(number);
		saveBtn();
		Thread.sleep(10000);
		
	}	
	public void additionalStaysRequired(String Number) throws InterruptedException
	{
		additionalStaysRequired.sendKeys(Number);
		saveBtn();
		Thread.sleep(10000);
	}
	public void polereSet() throws InterruptedException
	{
		verifyCheckedPoleReset();
		saveBtn();
		Thread.sleep(10000);
	}
	public void fibreOnly() throws InterruptedException
	{
		FibreOnly.click();
		selectDropdown("Yes");
		saveBtn();
		Thread.sleep(10000);
	}
	public void existingAerialCables(String number) throws InterruptedException
	{
		
		existingAerialCables.sendKeys(number);
		saveBtn();
		Thread.sleep(10000);
	}
	public void existingDropWires(String number) throws InterruptedException
	{
		
		existingDropWires.sendKeys(number);
		saveBtn();
		Thread.sleep(10000);
	}
	
	public void existingStays(String number) throws InterruptedException
	{
		existingStays.sendKeys(number);
		saveBtn();
		Thread.sleep(10000);
	}
	public void existingBlockTerminals(String number) throws InterruptedException
	{
		existingBlockTerminals.sendKeys(number);
		saveBtn();
		Thread.sleep(10000);
	}
	public void existingJoints(String number) throws InterruptedException
	{
		existingJoints.sendKeys(number);
		saveBtn();
		Thread.sleep(10000);
	}
	public void existingOtherFittings(String number) throws InterruptedException
	{
		existingOtherFittings.sendKeys(number);	
		saveBtn();
		Thread.sleep(10000);
	}

}
