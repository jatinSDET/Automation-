package StepLocator;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.UserBase;

public class NAD_StepLoactor extends UserBase{
	
	
	@FindBy(xpath="//span[normalize-space()='Refresh address']")
	WebElement refreshBtn;
	
	@FindBy(xpath="//input[@data-testid='SearchBar']")
	WebElement searchBar3;
	
	@FindBy(xpath="(//div[@class='sc-oTaid fpeoAN'])[3]")
	WebElement dropDown3;
	
	

	public NAD_StepLoactor()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void WO() throws InterruptedException, AWTException
	{
		newWorkOrder("SSTHO_21C_SN_30");
//		openWO("YLY_V90560407245758");
	}

	public void verifyMsg() throws InterruptedException, AWTException
	{
		newWorkOrder("THY_21B_SN_56");
		Thread.sleep(3000);
		WorkOrderName();
		refreshBtn.click();
		Thread.sleep(5000);
		verifyRefreshSuccessMsg();

	}
	
	//2
	
	@FindBy(xpath="(//div[@class='sc-fznzqM kcMtBa'])[1]")
	WebElement selectAddressType;
	
	@FindBy(xpath="(//div[@class='sc-fznBtT ccaska'])[1]")
	WebElement selectCPE2;
	
	
	public void UPRNAndVerify(String num1) throws InterruptedException, AWTException
	{
		newWorkOrder("THY_21B_SN_56");
		Thread.sleep(3000);
//		searchBox("UPRN:100060411078");
		searchBar3.sendKeys(num1);
		searchBar3.click();
		Thread.sleep(1000);
		dropDown3.click();
		Thread.sleep(1000);
		zoomOut();
		selectAddressType.click();
		Thread.sleep(1000);
		selectDropdown("NGD Address");
		Thread.sleep(1000);
//		verifySuccessfulNGDAddress();	
		verifyMessage("//*[@id=\"root\"]/div/div[3]/div[2]/div[1]/form/div/div[11]/span", "NGD Address fetched successfully.");
	}
	
	//3
	@FindBy(xpath="//input[@data-testid='SearchBar']")
	WebElement searchBar;
	

	public void ORFrindlyAddress(String num3) throws InterruptedException, AWTException
	{
		newWorkOrder("THY_21B_SN_56");
//		searchBox("UPRN:100060411078");
//		clickToCordinates();
		searchBar3.sendKeys(num3);
		searchBar3.click();
		Thread.sleep(1000);
		dropDown3.click();
		Thread.sleep(1000);
//		getText("//div[@class='sc-fznzqM kcMtBa']");
		byDefaultORFriendly();


	}
	//4
	public void addressDisabled(String num4) throws InterruptedException, AWTException
	{
		newWorkOrder("THY_21B_SN_56");
		Thread.sleep(3000);
		searchBar3.sendKeys(num4);
		searchBar3.click();
		Thread.sleep(1000);
		dropDown3.click();
		Thread.sleep(1000);
		addressFieldsDisabled();
	}

	//5
	
	public void Low_address_accuracy_in_properties(String num5) throws InterruptedException, AWTException
	{
		newWorkOrder("SSTHO_21C_SN_30");
		Thread.sleep(3000);
		addsSpans();
	
//		searchBox("UPRN:655649");
		searchBar3.sendKeys(num5);
		searchBar3.click();
		Thread.sleep(1000);
		dropDown3.click();
		Thread.sleep(1000);
		clickToCordinates();
		searchBox("SSTHO_21C_CBT_1173_1");
		Thread.sleep(2000);
		clickToCordinates();
		Thread.sleep(2000);
//		searchBox("UPRN:655649");
		driver.findElement(By.xpath("//input[@data-testid=\"SearchBar\"]")).sendKeys(Keys.CONTROL + "a");
		driver.findElement(By.xpath("//input[@data-testid=\"SearchBar\"]")).sendKeys(Keys.DELETE);

		searchBar3.sendKeys(num5);
		searchBar3.click();
		Thread.sleep(1000);
		dropDown3.click();
		
		Thread.sleep(1000);
		reparent();
		searchBox("SSTHO_21C_CBT_1173_1");
		clickToCordinates();
		btnSchematic();
		expandCBTandCPE();
		verifyLowAddress();
	}
	
	//6
	@FindBy(xpath="(//div[@class='sc-fznBtT ccaska'])[1]")
	WebElement  blueCPE;
	
	@FindBy(xpath="//div[@class='sc-oTmZL kfNTWi']//*[name()='svg']//*[name()='g' and @id='pointerGroup']//*[name()='g' and @id='mainGroup']//*[name()='g' and contains(@class,'nodes')]//*[name()='g'][3]/*[name()='g'][1]")
	WebElement addCBT;
	
	@FindBy(xpath="//div[@class='sc-oTmZL kfNTWi']//*[name()='svg']//*[name()='g' and @id='pointerGroup']//*[name()='g' and @id='mainGroup']//*[name()='g' and contains(@class,'nodes')]//*[name()='g'][3]/*[name()='g'][2]")
	WebElement expandCBT;
	
	@FindBy(xpath="//div[@class='sc-oTmZL kfNTWi']//*[name()='svg']//*[name()='g' and @id='pointerGroup']//*[name()='g' and @id='mainGroup']//*[name()='g' and contains(@class,'nodes')]//*[name()='g'][26]/*[name()='g'][1]")
	WebElement clickBlueCPE;
	
	
	
	
	public void addCpeandSDU() throws InterruptedException, AWTException
	{
		newWorkOrder("THY_21B_SN_56");
		Thread.sleep(3000);
		addSDU();
		searchBox("JC:GEN:W1697327");
		clickToCordinates();
		Thread.sleep(3000);
		addCPEEcTest();
		searchBox("JC:GEN:W1697327");
		clickToCordinates();
		Thread.sleep(3000);
		searchBox("JC:GEN:W1697327");
		clickToCordinates();
		blueCPE.click();
		reparent();
		btnSchematic();
		Thread.sleep(2000);
		addCBT.click();
		Thread.sleep(5000);
		expandCBT.click();
//		blueColormissingUPRNProperties();	
		clickBlueCPE.click();
		Thread.sleep(2000);
		verifyMessage("//span[contains(text(),'Missing UPRN')]", "Missing UPRN");
	}

	//7
	@FindBy(xpath="//div[@class='sc-oTmZL kfNTWi']//*[name()='svg']//*[name()='g' and @id='pointerGroup']//*[name()='g' and @id='mainGroup']//*[name()='g' and contains(@class,'nodes')]//*[name()='g'][3]/*[name()='g'][1]")
	WebElement addCBTError;
	
	@FindBy(xpath="//div[@class='sc-oTmZL kfNTWi']//*[name()='svg']//*[name()='g' and @id='pointerGroup']//*[name()='g' and @id='mainGroup']//*[name()='g' and contains(@class,'nodes')]//*[name()='g'][3]/*[name()='g'][2]")
	WebElement clickCPE;
	
	@FindBy(xpath="//div[@class='sc-oTmZL kfNTWi']//*[name()='svg']//*[name()='g' and @id='pointerGroup']//*[name()='g' and @id='mainGroup']//*[name()='g' and contains(@class,'nodes')]//*[name()='g'][26]/*[name()='g'][1]")
	WebElement clickCPE2;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/form[1]/div[1]/div[10]/div[1]")
	WebElement switchedNGD;
	
	@FindBy(css ="div[class='sc-fznOgF glfmCu'] div:nth-child(3) span:nth-child(1)")
	WebElement switchedNGD2;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[3]/div/div/div[4]/div")
	WebElement selectCPE;
	
	
	public void addSDUandCpeAtStructure() throws InterruptedException, AWTException
	{
		newWorkOrder("THY_21B_SN_56");
		Thread.sleep(3000);
		addSDU();
		searchBox("JC:JB:W1641368");
		clickToCordinates();
		addCPEEcTest();
		Thread.sleep(2000);
		searchBox("JC:JB:W1641368");
		clickToCordinates();
		Thread.sleep(2000);
		searchBox("JC:JB:W1641368");
		clickToCordinates();
		Thread.sleep(2000);
		selectCPE.click();
		reparent();
		btnSchematic();
		addCBTError.click();
		Thread.sleep(10000);
		clickCPE.click();
		Thread.sleep(2000);
		clickCPE2.click();
		zoomOut();
		switchedNGD.click();
		Thread.sleep(2000);
		switchedNGD2.click();
		verifyTheErrorMsgNGD();	
	}

}
