package fe.stepdefinitions.smoketest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import fe.pageobject.smoketest.feBuildVersionPageObject;
import tooltwist.utils.TestInit;

public class feBuildVersion {

	private WebDriver driver =  null;
	private feBuildVersionPageObject febuildVersionPageObject = null;
	
	public feBuildVersion(TestInit ti) {
	this.driver = ti.getDriver();
	this.febuildVersionPageObject = new feBuildVersionPageObject(ti);
	
	}
	
	@Given("I am in dashboard page")
	public void i_am_in_dashboard_page() throws Throwable {

		febuildVersionPageObject.atDashboardPage();
		
	}

	@Then("I should be able to see build version at the sidebar footer")
	public void i_should_be_able_to_see_build_version_at_the_sidebar_footer() throws Throwable {
		febuildVersionPageObject.seeBuildVersion();
	}
}
