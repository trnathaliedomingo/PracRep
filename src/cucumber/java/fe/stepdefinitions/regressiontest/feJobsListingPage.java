package fe.stepdefinitions.regressiontest;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fe.pageobject.regressiontest.feJobsListingPagePageObject;
import tooltwist.utils.TestInit;
import org.openqa.selenium.WebDriver;

public class feJobsListingPage {
	
	private WebDriver driver =  null;
	private feJobsListingPagePageObject fejobsListingPagePageObject = null;
	
	public feJobsListingPage(TestInit ti) {
	this.driver = ti.getDriver();
	this.fejobsListingPagePageObject = new feJobsListingPagePageObject(ti);
	
	}
	
	@When("I click on jobs menu at sidebar")
	public void i_click_on_jobs_menu_at_sidebar() throws Throwable {
		
		fejobsListingPagePageObject.clickJobsMenu();
		
	}

	@Then("I should be navigated to jobs listing page")
	public void i_should_be_navigated_to_jobs_listing_page() throws Throwable {

		fejobsListingPagePageObject.navToJobsPage();
		
	}

	@Then("All job elements should be available")
	public void all_job_elements_should_be_available() throws Throwable {
		
		fejobsListingPagePageObject.allElements();

	}
	
	@Then("Jobs pagination should be working")
	public void jobs_pagination_should_be_working() throws Throwable {
		
		fejobsListingPagePageObject.JobsPagination();

	}

	@Then("Jobs sorting should be working")
	public void jobs_sorting_should_be_working() throws Throwable {
		
		fejobsListingPagePageObject.JobsSort();

	}

}
