package fe.stepdefinitions.smoketest;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fe.pageobject.smoketest.feViewJobPageObject;
import tooltwist.utils.TestInit;

public class feViewJob {
	
	private WebDriver driver =  null;
	private feViewJobPageObject feviewJobPageObject = null;
	
	public feViewJob(TestInit ti) {
		this.driver = ti.getDriver();
		this.feviewJobPageObject = new feViewJobPageObject(ti);
	}
	
	@When("I click an existing sent job")
	public void i_click_an_existing_sent_job() throws Throwable {
		
		feviewJobPageObject.clickJob();

	}

	@Then("I should be able to see all elements in job details page")
	public void i_should_be_able_to_see_all_elements_in_job_details_page() throws Throwable {

		feviewJobPageObject.viewElements();
		
	}

}
