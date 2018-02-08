package fe.stepdefinitions.smoketest;

import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fe.pageobject.smoketest.feJobsSearchPageObject;
import tooltwist.utils.TestInit;

public class feJobsSearch {
	
	private WebDriver driver =  null;
	private feJobsSearchPageObject fejobsSearchPageObject = null;
	
	public feJobsSearch(TestInit ti) {
		this.driver = ti.getDriver();
		this.fejobsSearchPageObject = new feJobsSearchPageObject(ti);
	}
	
	@When("I type in job id on search field, (.*)")
	public void i_type_in_job_id_on_search_field_jobID(String staffjobid) throws Throwable {
		fejobsSearchPageObject.searchJob(staffjobid);
	}

	@Then("Typed in job id should be shown on list")
	public void typed_in_job_id_should_be_shown_on_list() throws Throwable {
		fejobsSearchPageObject.resultList();
	}


}
