package StepLocator;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Utility.UserBase;

public class PON_Attachment_Step extends UserBase{


	@FindBy(xpath="//input[@data-testid='attachment-file-choose']")
	WebElement attachment ;
	
	@	FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]")
	WebElement editAttachment;

	@FindBy(xpath="//div[@class='sc-fznzqM kcMtBa']")
	WebElement DropDown;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/div[15]/div[3]/div")
	WebElement DropDownEdit;

	@FindBy(xpath="//span[normalize-space()='DRSS']")
	WebElement dropDown1 ;

	@FindBy(xpath="//span[normalize-space()='Schematics']")
	WebElement dropDown2 ;

	@FindBy(xpath="//span[normalize-space()='Spine/Agg']")
	WebElement dropDown3 ;

	@FindBy(xpath="//span[normalize-space()='Other']")
	WebElement dropDown4;

	@FindBy(xpath="(//button[@data-testid='editAttachment'])[1]")
	WebElement editPencilBtn1;
	
	@FindBy(xpath="(//button[@data-testid='editAttachment'])[2]")
	WebElement editPencilBtn2;
	
	@FindBy(xpath="(//button[@data-testid='editAttachment'])[3]")
	WebElement editPencilBtn3;
	
	@FindBy(xpath="(//button[@data-testid='editAttachment'])[4]")
	WebElement editPencilBtn4;
	
	

	@FindBy(xpath="//button[@data-testid='replaceAttachment']")
	WebElement replaceAttachmentBtn;

	@FindBy(xpath="(//span[text()='Other'])[2]")
	WebElement dropDownOther;

	@FindBy(xpath="//textarea[@data-testid='attachment-description']")
	WebElement descriptionforOther;

	@FindBy(xpath="//div[@class='sc-fznzqM kcMtBa']")
	WebElement selectDropDownforOther;

	@FindBy(xpath="//button[@data-testid='file-upload']")
	WebElement fileUpload;

	@	FindBy(xpath="(//button[@data-testid='confirm-delete-attachment-button'])[1]")
	WebElement deleteBtn;
	
	@	FindBy(xpath="//button[@data-testid='confirm-delete-button']")
	WebElement confirmDeleteBtn;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[13]/textarea[1]")
	WebElement descriptionForEdit;

	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/div[15]/div[3]/div[2]/div[5]")
	WebElement Other;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/div[15]/div[3]/div[2]/div[4]")
	WebElement spineoragg;

	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/div[15]/div[3]/div[2]/div[3]")
	WebElement schematics;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/div[15]/div[3]/div[2]/div[2]")
	WebElement DRSS;
	
	@FindBy(xpath="//button[@data-testid='file-upload']")
	WebElement clickFileUpload;
	
	@FindBy(xpath="//button[@data-testid='save-photo']")
	WebElement savePhoto;


	
	public PON_Attachment_Step()
	{
		PageFactory.initElements(driver, this);
	}
	

//	@BeforeClass
	public void upload(String description) throws InterruptedException, AWTException
	{
		zoomOut();
		Thread.sleep(2000);
		clickToWoName();
		ClickToUploadBtn();
		
		chooseFile(attachment, "Delta Env.docx", DropDown, "DRSS", "Uploaded Attachment for DRSS !!");
		Thread.sleep(1000);
		
		chooseFile(attachment, "RAPDF.pdf", DropDown, "Schematics", "Uploaded Attachment for Schematics !!");
		Thread.sleep(1000);
		
		chooseFile(attachment, "Panda.jpg", DropDown, "Spine/Agg", "Uploaded Attachment for Spine/Agg !!");
		Thread.sleep(1000);
		
		attachmentForOther();
		Thread.sleep(1000);
		descriptionforOther.sendKeys(description);
		Thread.sleep(1000);
		selectDropDownforOther.click();
		Thread.sleep(1000);
		dropDownOther.click();
		Thread.sleep(1000);
		fileUpload.click();	
	}
	
	public void edit(String description) throws InterruptedException, AWTException
	{
		zoomOut();
		Thread.sleep(2000);
		clickToWoName();
		ClickToUploadBtn();
		
		chooseFile(attachment, "Delta Env.docx", DropDown, "DRSS", "Uploaded Attachment for DRSS !!");
		Thread.sleep(1000);
		
		chooseFile(attachment, "RAPDF.pdf", DropDown, "Schematics", "Uploaded Attachment for Schematics !!");
		Thread.sleep(1000);
		
		chooseFile(attachment, "Panda.jpg", DropDown, "Spine/Agg", "Uploaded Attachment for Spine/Agg !!");
		Thread.sleep(1000);
		
		attachmentForOther();
		Thread.sleep(1000);
		descriptionforOther.sendKeys(description);
		Thread.sleep(1000);
		selectDropDownforOther.click();
		Thread.sleep(1000);
		dropDownOther.click();
		Thread.sleep(1000);
		fileUpload.click();	
		
		////////////////////////////////////////////////
//		zoomOut();
//		Thread.sleep(2000);
//		clickToWoName();
//		ClickToUploadBtn();
		Thread.sleep(2000);
		editPencilBtn1.click();
		Thread.sleep(10000);
		replaceAttachmentBtn.click();
		Thread.sleep(4000);
		zoomOut();
		Thread.sleep(2000);
		chooseFileEdit(editAttachment, "papaya.png", DropDownEdit, "Replaced File1");
		Thread.sleep(2000);
		Other.click();
		savePhoto.click();
		Thread.sleep(5000);
		
		editPencilBtn2.click();
		Thread.sleep(10000);
		replaceAttachmentBtn.click();
		Thread.sleep(4000);
		
		chooseFileEdit(editAttachment, "OS MAP.jpg", DropDownEdit, "Replaced File 2");
		Thread.sleep(1000);
		spineoragg.click();
		savePhoto.click();
		Thread.sleep(4000);
		
		editPencilBtn3.click();
		Thread.sleep(10000);
		replaceAttachmentBtn.click();
		Thread.sleep(4000);
		
		chooseFileEdit(editAttachment, "FAQAllocation.pdf", DropDownEdit, "Replaced File 3");
		Thread.sleep(1000);
		schematics.click();
		savePhoto.click();
		Thread.sleep(4000);
		
		editPencilBtn4.click();
		Thread.sleep(10000);
		replaceAttachmentBtn.click();
		Thread.sleep(4000);
		
		chooseFileEdit(editAttachment, "demo.xml", DropDownEdit, "Replaced File 4");
		Thread.sleep(1000);
		DRSS.click();
		savePhoto.click();
		Thread.sleep(4000);
		
		
	}
	
	public void delete(String description) throws InterruptedException, AWTException
	{
		zoomOut();
		Thread.sleep(2000);
		clickToWoName();
		ClickToUploadBtn();
		
		chooseFile(attachment, "Delta Env.docx", DropDown, "DRSS", "Uploaded Attachment for DRSS !!");
		Thread.sleep(1000);
		
		chooseFile(attachment, "RAPDF.pdf", DropDown, "Schematics", "Uploaded Attachment for Schematics !!");
		Thread.sleep(1000);
		
		chooseFile(attachment, "Panda.jpg", DropDown, "Spine/Agg", "Uploaded Attachment for Spine/Agg !!");
		Thread.sleep(1000);
		
		attachmentForOther();
		Thread.sleep(1000);
		descriptionforOther.sendKeys(description);
		Thread.sleep(1000);
		selectDropDownforOther.click();
		Thread.sleep(1000);
		dropDownOther.click();
		Thread.sleep(1000);
		fileUpload.click();	
		//////////////////////////////////////////////////////
//		zoomOut();
//		Thread.sleep(2000);
//		clickToWoName();
//		ClickToUploadBtn();
		
		Thread.sleep(2000);
		deleteBtn.click();
		confirmDeleteBtn.click();
		Thread.sleep(4000);
		deleteBtn.click();
		confirmDeleteBtn.click();
		Thread.sleep(4000);
		deleteBtn.click();
		confirmDeleteBtn.click();
		Thread.sleep(4000);
		deleteBtn.click();
		confirmDeleteBtn.click();
		Thread.sleep(4000);	
	}
	public void moreThan10MB() throws InterruptedException
	{
		clickToWoName();
		ClickToUploadBtn();
		attachment10MBPlus();
		verifyMessage("(//span[@class='sc-fzoant eQbRSI'])[2]", "SampleJPGImage_10mbmb.jpg larger than the 10 MB limit");
	}

	public void unsupportedFile(String file) throws InterruptedException
	{
		clickToWoName();
		ClickToUploadBtn();
		attachment.sendKeys(file);
		verifyMessage("(//span[@class='sc-fzoant eQbRSI'])[2]", "country.csv - File format is not supported, Please refer the help section to know the supported file formats");
	}
	
}
