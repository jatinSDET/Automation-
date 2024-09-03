package StepLocator;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Utility.UserBase;

public class RedSecureArea_Step extends UserBase{
	
	
	
	@FindBy(xpath="//button[@data-testid='createWOButton']")
	WebElement createWOBtn;
	
	@FindBy(xpath="(//div[@class='sc-fznBtT ccaska'])[1]")
	WebElement manuallyDraw;
	
	@FindBy(xpath="//input[@class='sc-fzpkqZ kmZxWx']")
	WebElement nameWO;
	
	@FindBy(xpath="//button[@class='sc-AxiKw biCAiB']")
	WebElement submitBtn;
	
	
	public RedSecureArea_Step()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void cantCreateWO() throws InterruptedException
	{
		searchBox("484830,153853");
		createWOBtn.click();
		Thread.sleep(2000);
		manuallyDraw.click();
		clickToMap();
		verifyMessage("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/span[1]", "Cannot create workorder completely within a protected secure area");
	}
	
	public void canCreateYellowAndRedSecureArea() throws InterruptedException
	{
		searchBox("484830,153853");
		createWOBtn.click();
		Thread.sleep(2000);
		manuallyDraw.click();
//		searchBox("484830,153853");
//		clickToCordinates();
//		searchBox("484408,154241");
//		clickToCordinates2(303,176, -303,-176);
//		Thread.sleep(1000);
//		searchBox("484416,154142");
//		clickToCordinates2(174,287, -174,-287);
//		Thread.sleep(1000);
//		searchBox("484416,154142");
//		clickToCordinates2(324,343, -324,-343);
//		searchBox("484830,153853");
//		clickToCordinates();
		clickToMapTC44();
		nameWO.sendKeys(AutoENameGeneratorSRedAndYellow());
		
		submitBtn.click();
		Thread.sleep(3000);
		submitBtn.click();
		verifyMessage("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/span[1]","SURVEY - CREATED");
		
	}
	
	public void canSeeSDUorCPE() throws InterruptedException, AWTException
	{
		newWorkOrder("THFB_21C_SN_70");
		addSDU();
		searchBox("484212,153586");
		clickToCordinates();
		Thread.sleep(2000);
//		verifyMessage("//span[@class='sc-fzoYkl iOBPaV']", "Cannot add a structure outside the workorder polygon");
		
		
	}
	
	public void cantSeeCivilsandGhostplan() throws InterruptedException, AWTException
	{
		newWorkOrder("THFB_21C_SN_70");
		addsSpans();
		searchBox("486284,153550");
		clickToCordinates();
		searchBox("486270,153579");
		clickToCordinates();
		Thread.sleep(1000);
		searchBox("486314,153571");
		clickToCordinates();
		Thread.sleep(1000);
//		verifyMessage("//*[@id=\"root\"]/div/div[3]/div/div/div/div[2]/span[2]", "Cannot add a span inside or across a protected secure area");
//		WebElement verifyPOP = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div/div[2]/span[2]"));
//		String ExpectedText = "Cannot add a span inside or across a protected secure area";
//		Assert.assertEquals(ExpectedText, verifyPOP.getText());
//		System.out.println("It is not added in Red Site Area – Assert passed");
	}

}
