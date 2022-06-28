package CucumberRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"cucumberFeatures\\loginPage.feature"},
		glue = {"cucumberStepDefinations"},
		plugin = {"pretty"},
		dryRun=false,
		monochrome=true
		)
public class TestRunner {

}
