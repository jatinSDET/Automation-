package TestRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		dryRun = false,
		publish =true,
		monochrome = true,
		features = ".//Features\\NAD.feature",
		glue = "StepDefinition",

//		plugin = {"pretty",  "html:target/cucumber-reports/reports1.html"},
		plugin = {"pretty",  "html:target/cucumber-reports/reports1.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},

		tags = " @PreRequisite or @Regression "
		
		)


public class NAD_Run extends  AbstractTestNGCucumberTests{ 

}
