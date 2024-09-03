package StepDefinition;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utility.UserBase;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class Hooks extends UserBase{
	
	UserBase essentials = new UserBase();
	UserBase setup = new UserBase();
	
	
	
	@Before
	public void initialization() throws AWTException, InterruptedException, IOException 
	{
		
		loadProperty();
		config();	
//		excelConfig();
//		ExcelReader();
		
		
	}
	
	@AfterStep
	public void addScreenshot(Scenario scenario) {
		
		if(scenario.isFailed())
		{
		final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	         //attach image files reports(data,media type, name of the attachments)
		 scenario.attach(screenshot,"image/png", scenario.getName());
	}
				
	}
	@After
	public void closehook()
	{
//		driver.quit();
		System.out.println("Quit...");
	}
	

}
