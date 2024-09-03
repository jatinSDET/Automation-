package StepLocator;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.UserBase;

public class YellowSecureArea_Step extends UserBase{
	
	
	
	@FindBy(xpath="//button[@data-testid='createWOButton']")
	WebElement CWB;
	
	@FindBy(xpath="(//div[@class='sc-fznBtT ccaska'])[1]")
	WebElement manuallyDraw;
	
	@FindBy(xpath="//input[@class='sc-fzpkqZ kmZxWx']")
	WebElement nameWO;
	
	@FindBy(xpath="//button[@class='sc-AxiKw biCAiB']")
	WebElement submitBtn;
	
	
	
	
	public YellowSecureArea_Step()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void cannotCreateWorkorderCompletelyWithinProtected() throws InterruptedException
	{
		searchBox("487650,152619");
		CWB.click();
		Thread.sleep(2000);
		manuallyDraw.click();
		clickToCordinates();
		Thread.sleep(1000);
		clickToCordinates2(216, 396, -216,-396);
		Thread.sleep(1000);
		clickToCordinates2(175, 173, -175,-173);
		Thread.sleep(1000);
		clickToCordinates2(460,164, -460,-164);
		Thread.sleep(1000);
		clickToCordinates();
		verifyMessage("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/span[1]", "Cannot create workorder completely within a protected secure area");
	
	}
	
	public void canSeeCivilsandGhostplan() throws InterruptedException
	{
		searchBox("487650,152619");
		CWB.click();
		Thread.sleep(2000);
		manuallyDraw.click();
		searchBox("487650,152619");
		Thread.sleep(1000);
		clickToCordinates();
		searchBox("487618,152738");
		clickToCordinates2(230, 421, -230,-421);
		Thread.sleep(1000);
		clickToCordinates2(809,289, -809,-289);
		Thread.sleep(1000);
		clickToCordinates2(847,363, -847,-363);
		Thread.sleep(1000);
		searchBox("487650,152619");
		clickToCordinates();
		nameWO.sendKeys(AutoENameGeneratorSRedAndYellow());
		submitBtn.click();
		submitBtn.click();
		verifyMessage("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/span[1]", "SURVEY - CREATED");
		
	}
	
	public void canSeeSDU() throws InterruptedException, AWTException
	{
		newWorkOrder("THFB_21C_SN_70");
		addSDU();
		searchBox("487650,152619");
		clickToCordinates();
		Thread.sleep(1000);
//		verifyMessage("/html/body/div[1]/div/div[3]/div/div/div/div[2]/span[2]","Cannot add a structure outside the workorder polygon");
		
	}
	
	public void cantSeeCivilsandGhostplan() throws InterruptedException, AWTException
	{
		newWorkOrder("THFB_21C_SN_70");
		addsSpans();
		searchBox("486854,153118");
		clickToCordinates();
		searchBox("486886,153116");
		clickToCordinates();
		searchBox("486919,153222");
		clickToCordinates();
		Thread.sleep(1000);
//		verifyMessage("//*[@id=\"root\"]/div/div[3]/div/div/div/div[2]/span[2]", "Cannot add a span inside or across a protected secure area");
	}
}
