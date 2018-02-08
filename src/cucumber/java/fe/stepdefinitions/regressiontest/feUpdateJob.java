package fe.stepdefinitions.regressiontest;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fe.pageobject.regressiontest.feUpdateJobPageObject;
import tooltwist.utils.TestInit;

public class feUpdateJob {
	
	private WebDriver driver =  null;
	private feUpdateJobPageObject feupdateJobPageObject = null;
	
	public feUpdateJob(TestInit ti) {
		this.driver = ti.getDriver();
		this.feupdateJobPageObject = new feUpdateJobPageObject(ti);
	}
	
	@When("I set status to on hold")
	public void i_set_status_to_on_hold() throws Throwable {
		
		feupdateJobPageObject.setStatusToOnHold();

	}
	
	@When("I click existing job save button")
	public void i_click_existing_job_save_button() throws Throwable {
		
		feupdateJobPageObject.clickUpdateSaveButton();

	}

	@Then("Job Success update message should appear")
	public void job_Success_update_message_should_appear() throws Throwable {
		
		feupdateJobPageObject.successMessageUpdate();
		
	}


}
