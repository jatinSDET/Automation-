package StepLocator;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.UserBase;

public class Add_Conduit_spans_Step extends UserBase{
	
	
	
	@FindBy(xpath="//input[@id='ductDistanceInMM']")
	WebElement ductDistance;
	
	@FindBy(xpath="//button[@class='sc-AxiKw biCAiB']")
	WebElement submitButton;
	
	
	public Add_Conduit_spans_Step()
	{
		PageFactory.initElements(driver, this);
	}

	public void addConduitSpan(String num) throws InterruptedException, AWTException
	{
		addsSpans();
		searchBox("JC:JBF::24061965");
		clickToCordinates();
		zoomIn8();
		searchBox("485900,153380");
		clickToCordinates();
		verifyMessage("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[7]/span[1]", "Duct is less than 1 meter and running between jointbox to Pole/Wall. Can you please provide the actual distance in millimeters please");
		ductDistance.sendKeys(num);
		submitButton.click();
		Thread.sleep(10000);
		
	
	}
	
	public void addConduitSpan2(String num) throws InterruptedException, AWTException
	{
		addStructure();
		searchBox("JC:JBF::24061965");
		Thread.sleep(1000);
		zoomIn8();
		zoomIn4();
		clickToCordinates2(678, 339, -678, -339);
		Thread.sleep(10000);
		addsSpans();
		searchBox("JC:JBF::24061965");
		zoomIn8();
		zoomIn4();
		clickToCordinates();
		Thread.sleep(1000);
		zoomIn8();
		Thread.sleep(1000);
		zoomIn4();
		Thread.sleep(1000);
		clickToCordinates2(660, 316, -660, -316);
		Thread.sleep(1000);
		searchBox("485900,153381");
		zoomIn8();
		zoomIn4();
		Thread.sleep(1000);
		zoomIn8();
		Thread.sleep(1000);
		zoomIn4();
		Thread.sleep(1000);
		clickToCordinates2(660, 316, -660, -316);
		Thread.sleep(10000);
		verifyMessage("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[7]/span[1]", "Duct is less than 1 meter and running between jointbox to Pole/Wall. Can you please provide the actual distance in millimeters please");
		ductDistance.sendKeys(num);
		submitButton.click();
		Thread.sleep(10000);
		
		
	}
	public void addDuctDistance() throws InterruptedException, AWTException
	{
		addStructure();
		searchBox("JC:JBF::24061965");
		zoomIn8();
		zoomIn4();
		clickToCordinates2(678, 339, -678, -339);
		Thread.sleep(10000);
		addsSpans();
		searchBox("JC:JBF::24061965");
		zoomIn8();
		zoomIn4();
		clickToCordinates();
		Thread.sleep(1000);
		zoomIn8();
		zoomIn4();
		clickToCordinates2(660, 316, -660, -316);
		Thread.sleep(10000);
		verifyMessage("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[9]/label[1]", "Duct Distance in millimetres (1-999)");
		
	}
	
	
	
}
