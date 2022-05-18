package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/resources/features" }, 
				  glue = { "steps", "hooks" },
		plugin = {"pretty","json:target/cucumber/Cucumber.json","junit:target/cucumber/Cucumber.xml","html:target/cucumber/Cucumber.html"
				,"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		dryRun = false,
		publish = true,
		//tags = "@Dev",
		monochrome = true)

public class TestRunnerCucumber extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider()
	public Object[][] scenarios() {
		return super.scenarios();
	}
}
