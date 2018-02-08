package fe.stepdefinitions.regressiontest;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import fe.pageobject.regressiontest.feClientJobsHistoryPageObject;
import tooltwist.utils.TestInit;
import cucumber.api.java.en.Then;

public class feClientJobsHistory {
	
	private WebDriver driver =  null;
	private feClientJobsHistoryPageObject feClientJobsHistoryPageObject = null;
	
	public feClientJobsHistory(TestInit ti) {
		this.driver = ti.getDriver();
		this.feClientJobsHistoryPageObject = new feClientJobsHistoryPageObject(ti);
	}
	
	@Given("I am in client jobs listing page")
	public void i_am_in_client_jobs_listing_page() throws Throwable {

		feClientJobsHistoryPageObject.jobsListPage();
		
	}

	@When("I click an existing client job")
	public void i_click_an_existing_client_job() throws Throwable {
		
		feClientJobsHistoryPageObject.existingClientJob();

	}

	@When("I click on client job history tab")
	public void i_click_on_client_job_history_tab() throws Throwable {
		
		feClientJobsHistoryPageObject.clickHistoryTab();

	}

	@Then("I should be able to see client job history")
	public void i_should_be_able_to_see_client_job_history() throws Throwable {
		
		feClientJobsHistoryPageObject.jobHistory();

	}

}
