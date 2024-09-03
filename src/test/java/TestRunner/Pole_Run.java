package TestRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		dryRun = false,
		publish =true,
		monochrome = true,
		//		features = ".//Features\\OrionBasic.feature",
		features = ".//Features\\Pole.feature",
		glue = "StepDefinition",
//
//		plugin = {"pretty",  "html:target/cucumber-reports/reports1.html"},
		plugin = {"pretty",  "html:target/cucumber-reports/reports1.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},

		tags = "@Setup or @ManualWorkOnly or @SurfaceType or @DPNumber or @PoleNumber or @AdditionalStays or  @Reset or @FibreOnlyPole or @ExistingAerialCables or @ExistingDropWires or @ExistingStays or @ExistingTerminalBlocks or @ExistingJoints or @ExistingOtherFittings"

		)


public class Pole_Run extends AbstractTestNGCucumberTests{

}
