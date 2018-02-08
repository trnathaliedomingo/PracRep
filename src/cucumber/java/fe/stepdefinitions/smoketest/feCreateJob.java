package fe.stepdefinitions.smoketest;

import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fe.pageobject.smoketest.feCreateJobPageObject;
import tooltwist.utils.TestInit;

public class feCreateJob {
	
	private WebDriver driver =  null;
	private feCreateJobPageObject fecreateJobPageObject = null;
	
	public feCreateJob(TestInit ti) {
		this.driver = ti.getDriver();
		this.fecreateJobPageObject = new feCreateJobPageObject(ti);
	}
	
	@When("I click add jobs button")
	public void i_click_add_jobs_button() throws Throwable {
		fecreateJobPageObject.clickAddJobButton();
	}

	@When("I set client to FE Water")
	public void i_set_client_to_FE_Water() throws Throwable {
		fecreateJobPageObject.setClient();
	}

	@When("I click on Additional instructions")
	public void i_click_on_Addition_instructions() throws Throwable {
		fecreateJobPageObject.clickAdditionalInstructions();
	}
	
	@When("I type in an instruction, (.*)")
	public void i_type_in_an_instruction_This_is_an_automated_staff_job(String instruction) throws Throwable {
		fecreateJobPageObject.typeInstruction(instruction);
	}

	@When("I click save")
	public void i_click_save() throws Throwable {
		fecreateJobPageObject.saveJob();
	}

	@Then("Job Success message should appear, (.*)")
	public void job_success_message_should_appear_Success_Job_has_been_saved(String successmessage) throws Throwable {
		fecreateJobPageObject.successMessage(successmessage);
	}

}
