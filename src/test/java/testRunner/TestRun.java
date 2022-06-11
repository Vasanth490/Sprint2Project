package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions
		(
				features=".//src/test/resources/features/Properties.feature",
				glue = "StepDefinitions",
				dryRun=true,
				monochrome=true,
				plugin = {"pretty","html:test-output"}
		)
public class TestRun extends AbstractTestNGCucumberTests{

}
