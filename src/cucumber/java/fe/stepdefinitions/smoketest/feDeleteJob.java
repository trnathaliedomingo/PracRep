package fe.stepdefinitions.smoketest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.WebDriver;
import fe.pageobject.smoketest.feDeleteJobPageObject;
import tooltwist.utils.TestInit;

public class feDeleteJob {
	
	private WebDriver driver =  null;
	private feDeleteJobPageObject fedeleteJobPageObject = null;
	
	public feDeleteJob(TestInit ti) {
		this.driver = ti.getDriver();
		this.fedeleteJobPageObject = new feDeleteJobPageObject(ti);
	}
	
	@Given("I click an existing job")
	public void i_click_an_existing_job() throws Throwable {

		fedeleteJobPageObject.clickExistingJob();
		
	}
	
	@When("I click delete job button")
	public void i_click_delete_job_button() throws Throwable {
		
		fedeleteJobPageObject.clickDeleteButton();
		
	}
	
	@Then("Success message must appear for job deletion")
	public void success_message_must_appear_for_job_deletion() throws Throwable {

		fedeleteJobPageObject.successMessageDeletion();
		
	}

}
