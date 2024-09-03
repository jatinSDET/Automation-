package StepLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.UserBase;

public class Spans_Step extends UserBase{
	
	@FindBy(xpath="//label[normalize-space()='Data Improvement']")
	WebElement DI;
	
	@FindBy(xpath="(//div[@class='sc-pZOBi bNnzrs'])[2]")
	WebElement dropdown;
	
	@FindBy(xpath="//textarea[@id='notes']")
	WebElement remarks;
	
	@FindBy(xpath="//div[@class='sc-pZOBi bNnzrs']")
	WebElement statusDropDown;
	
	@FindBy(xpath="//button[@class='sc-pdMpF oEwjr']")
	WebElement deleteS;
	
	@FindBy(xpath="//button[normalize-space()='Delete']")
	WebElement delete;
	
	@FindBy(xpath="//button[@data-testid='edit-link']")
	WebElement editLink;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[3]/textarea[1]")
	WebElement comments;
	
	@FindBy(xpath="//button[@class='sc-AxiKw biCAiB']")
	WebElement submit;
	
	public Spans_Step()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void addingExistingSpan(String name) throws InterruptedException
	{
		searchBox("OSP:TRNCH:W3873284");
		DI.click();
		dropdown.click();
		Thread.sleep(1000);
		selectDropdown("Span exists update attributes");
		remarks.sendKeys(name);
		Thread.sleep(1000);
		saveBtn();
		Thread.sleep(5000);
		
	}
	
	public void updatingSpan(String name) throws InterruptedException
	{
		searchBox("OSP:TRNCH:W4110644");
		DI.click();
		dropdown.click();
		Thread.sleep(1000);
		selectDropdown("Span route modified");
		remarks.sendKeys(name);
		saveBtn();
		Thread.sleep(5000);
	}
	public void deletingSpan(String name) throws InterruptedException
	{
		addsSpans();
		searchBox("JC:JBF:W3873352");
		clickToCordinates();
		Thread.sleep(1000);
		statusDropDown.click();
		selectDropdown("IPL");
		verifyMessage("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[9]/div[1]/div[1]", "Span exists but not recorded");
		remarks.sendKeys(name);
		Thread.sleep(1000);
		searchBox("JC:JMF::36296241");
		clickToCordinates();
		submit.click();
		Thread.sleep(5000);
		deleteS.click();
		Thread.sleep(1000);
		delete.click();
		Thread.sleep(1000);
		
	}
	
	public void movingExistingSpan(String name) throws InterruptedException
	{
		searchBox("OSP:CND::AA207316030");
		editLink.click();
		Thread.sleep(1000);
		moveSpan();
		comments.sendKeys(name);
		submit.click();
		Thread.sleep(5000);
		
	}
	

}
