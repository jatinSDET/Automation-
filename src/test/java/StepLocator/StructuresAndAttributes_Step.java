package StepLocator;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.UserBase;

public class StructuresAndAttributes_Step extends UserBase{
	
	
	
	@FindBy(xpath="//div[@class='sc-pZOBi bNnzrs']")
	WebElement dropDown;
	
	@FindBy(xpath="//div[contains(text(),'(not set)')]")
	WebElement dropDown2;
	
	@FindBy(xpath="//textarea[@name='notes']")
	WebElement remarks;
	
	@FindBy(xpath="//button[@class='sc-AxiKw biCAiB']")
	WebElement submit;
	
	@FindBy(xpath="//button[@class='sc-pdMpF oEwjr']")
	WebElement deletePole;
	
	@FindBy(xpath="//button[normalize-space()='Delete']")
	WebElement deleteConfirmation;
	
	@FindBy(xpath="//label[normalize-space()='Data Improvement']")
	WebElement dataImprovement;
	
	@	FindBy(xpath="//button[@data-testid='move-structure']")
	WebElement moveStructure;
	
	@FindBy(xpath="//textarea[@class='sc-fzomuh haPQRt']")
	WebElement comments;
	
	@FindBy(xpath="//button[normalize-space()='Confirm']")
	WebElement Confirm;
	
	@FindBy(xpath="//button[@data-testid='layersButton']")
	WebElement layerBtn;
	
	@FindBy(xpath="//span[normalize-space()='Deleted']")
	WebElement deletedBtn;
	
	@FindBy(xpath="(//div[@class='sc-fznzqM kcMtBa'])[1]")
	WebElement dropDown1;
	
	@FindBy(xpath="//div[contains(text(),'CHANGE OF STATE')]")
	WebElement ChangeOfState;
	
	
	@FindBy(xpath="//span[normalize-space()='POLE']")
	WebElement POLE;
	
	@FindBy(xpath="//div[contains(text(),'DATA')]")
	WebElement Data;
	
	@FindBy(xpath="//span[normalize-space()='HOLLOW LIGHT']")
	WebElement HollowLight;
	
	public StructuresAndAttributes_Step()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void AddingExistingStructure(String name) throws InterruptedException
	{
		
		addStructure();
		searchBox("JC:JMF::36296241");
		dropDown.click();
		selectDropdown("IPL");
		remarks.sendKeys(name);
		searchBox("JC:JBF:W4109107");
		Thread.sleep(1000);
		clickToCordinates();
		submit.click();	
	}
	
	public void deletingStructures(String name) throws InterruptedException
	{
		
		searchBox("JC:JBF:W3873330");
		addStructure();
		searchBox("JC:JBF:W3873330");
		Thread.sleep(1000);
		dropDown.click();
		selectDropdown("IPL");
		remarks.sendKeys(name);
		searchBox("JC:JBF:W3873330");
		Thread.sleep(1000);
		clickToCordinates();
		submit.click();	
		Thread.sleep(2000);
		deletePole.click();
		deleteConfirmation.click();
	}
	
	public void updatingStructures(String name) throws InterruptedException, AWTException
	{
		searchBox("JC:JBF:W3863012");
		Thread.sleep(1000);
//		zoomOut();
		dataImprovement.click();
		Thread.sleep(1000);
		dropDown2.click();
		Thread.sleep(1000);
		selectDropdown("Span exists but not recorded");
		remarks.sendKeys(name);
		saveBtn();
		Thread.sleep(5000);
	}
	
	public void movingStructure(String name) throws InterruptedException
	{
		searchBox("JC:JUF:W3874792");
		Thread.sleep(1000);
		moveStructure.click();
		Thread.sleep(1000);
		moveStructure();
		Thread.sleep(1000);
		comments.sendKeys(name);
		Thread.sleep(1000);
		Confirm.click();
	}
	
	public void deletingPlantCauses() throws InterruptedException
	{
		layerBtn.click();
		Thread.sleep(1000);
		deletedBtn.click();
	}

	public void changeFamilyofStructure() throws InterruptedException
	{
		searchBox("JC:JBF:W4109107");
		Thread.sleep(1000);
		dropDown1.click();
		Thread.sleep(1000);
//		BT.click();
		selectDropdown("BLOCK TERMINAL");
		saveBtn();
		Thread.sleep(5000);
	}
	
	public void changeClassofStructure() throws InterruptedException
	{
		searchBox("JC:JBF:W4109107");
		Thread.sleep(1000);
		dropDown1.click();
		Thread.sleep(1000);
//		buried.click();
		selectDropdown("BURIED");
		Thread.sleep(1000);
		ChangeOfState.click();
		Thread.sleep(1000);
//		DuctTee.click();
		selectDropdown("DUCT TEE");
		saveBtn();
		Thread.sleep(5000);
	}
	public void changeItemOfStructure() throws InterruptedException
	{
		searchBox("JC:JBF:W4109107");
		Thread.sleep(1000);
		dropDown1.click();
		Thread.sleep(1000);
		POLE.click();
		Thread.sleep(1000);
		Data.click();
		Thread.sleep(1000);
		HollowLight.click();
		saveBtn();
		Thread.sleep(5000);
	}
	

}
