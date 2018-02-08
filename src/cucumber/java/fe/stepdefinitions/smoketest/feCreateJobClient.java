package fe.stepdefinitions.smoketest;

import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import fe.pageobject.smoketest.feCreateJobClientPageObject;
import tooltwist.utils.TestInit;

public class feCreateJobClient {
	
	private WebDriver driver =  null;
	private feCreateJobClientPageObject fecreateJobClientPageObject = null;
	
	public feCreateJobClient(TestInit ti) {
		this.driver = ti.getDriver();
		this.fecreateJobClientPageObject = new feCreateJobClientPageObject(ti);
	}
	
	@Given("I input valid log in credentials as client, (.*), (.*)")
	public void i_input_valid_log_in_credentials_as_client_clientUsername_clientPassword(String clientusername, String clientpassword) throws Throwable {
		
		fecreateJobClientPageObject.clientLogin(clientusername, clientpassword);

	}
	
	@Given("I am in jobs listing page")
	public void i_am_in_jobs_listing_page() throws Throwable {

	}

	@When("I click client add job button")
	public void i_click_client_add_job_button() throws Throwable {

		fecreateJobClientPageObject.clickAddJobButton();

	}

	@When("I set notice type to Rates")
	public void i_set_notice_type_to_Rates() throws Throwable {
		
		fecreateJobClientPageObject.setNoticetypeToRates();

	}

	@When("I click on first next button")
	public void i_click_on_first_next_button() throws Throwable {
		
		fecreateJobClientPageObject.firstNextButton();

	}

	@When("I click on additional instructons in the jobs wizard")
	public void i_click_on_additional_instructons_in_the_jobs_wizard() throws Throwable {
		
		fecreateJobClientPageObject.addIns();

	}

	@When("I type in a comment on the additional instructions field, (.*)")
	public void i_type_in_a_comment_on_the_additional_instructions_field_This_is_an_automated_client_job(String clientjobcomment) throws Throwable {
		
		fecreateJobClientPageObject.commentAdd(clientjobcomment);

	}

	@When("I click on second next button")
	public void i_click_on_second_next_button() throws Throwable {
		
		fecreateJobClientPageObject.secondNextButton();

	}

	@When("I click on submit job button")
	public void i_click_on_submit_job_button() throws Throwable {
		
		fecreateJobClientPageObject.submitjob();

	}

	@Then("I have successfully created a client job")
	public void i_have_successfully_created_a_client_job() throws Throwable {
		
		fecreateJobClientPageObject.successfull();

	}


}
