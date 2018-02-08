package tooltwist.factories;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
//		features = {"features/fe.regressiontest/feBuildVersion.feature"},
		features = {"features/fe.smoketest/feCreateClientRequest.feature"},
		glue = {"fe.stepdefinitions.smoketest", "fe.stepdefinitions.regressiontest"},
		tags = {"@SmokeTest"},
//		tags = {"@RegTest"},
		monochrome = true

		)

public class TestRunner {
	 
}