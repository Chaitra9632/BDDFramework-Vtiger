package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {".\\src\\test\\java\\features\\DataDriven.feature"},
		glue = {"stepDefinitions"},// if Hook class is in separate package then we have use that package name also in glue
		                           // or the Hook class can be maintained in stepDefinitions package only
		dryRun = false,//if true - doesn't execute in the browser
		               // if false execute in the browser
		plugin = {"pretty","html:Report.html"},// print the log status/scenario steps in console helpful in debugging
		                                         // Used in report generation
		monochrome = true //print log in readable format by eliminating special characters
		)

public class RunnerIO extends AbstractTestNGCucumberTests{
	

}
