package run;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	tags= "@Registrations_Users" ,
	glue= {"stepDefinition" , "hooks" },
	features="src/test/features/TestAutomationExercice" ,
	monochrome = false,
	publish= true ,
	plugin= {"pretty", "html:target/new-cucumber-report.html" , "json:target/new-cucmber-report.json", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
	
		)



public class Runner {

	
}
