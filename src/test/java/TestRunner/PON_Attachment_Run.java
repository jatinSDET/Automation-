package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

		dryRun = false,
		publish =true,
		monochrome = true,
		//		features = ".//Features\\OrionBasic.feature",
		features = ".//Features\\PON_Attachment.feature",
		glue = "StepDefinition",
		//		glue = "Step_Definition",
		//				plugin = {"pretty",  "html:target/cucumber-reports/reports1.html"},
		plugin = {"pretty",  "html:target/cucumber-reports/reports1.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},

		tags = "@PreRequisite or @Upload or @Edit or @Delete or @10+MB or @NagativeAttachments"
		)
public class PON_Attachment_Run extends AbstractTestNGCucumberTests{

}
