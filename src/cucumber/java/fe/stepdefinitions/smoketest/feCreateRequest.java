package fe.stepdefinitions.smoketest;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import tooltwist.utils.TestInit;
import fe.pageobject.smoketest.feCreateRequestPageObject;

public class feCreateRequest {
	
	private WebDriver driver =  null;
	private feCreateRequestPageObject fecreateRequestPageObject = null;
	
	public feCreateRequest(TestInit ti) {
		this.driver = ti.getDriver();
		this.fecreateRequestPageObject = new feCreateRequestPageObject(ti);
	}

	
	@When("I click on add request button")
	public void i_click_on_add_request_button() throws Throwable {
		fecreateRequestPageObject.clickAddRequestButton();

	}

	@When("I set an assignee")
	public void i_set_an_assignee() throws Throwable {

		fecreateRequestPageObject.setAssignee();
		
	}

	@When("I fill in subject and description, (.*), (.*)")
	public void i_fill_in_subject_and_description_Automation_This_is_an_automated_request(String subject, String description) throws Throwable {
		fecreateRequestPageObject.fillInFields(subject, description);
	}
	
	@When("I click request save button")
	public void i_click_request_save_button() throws Throwable {
		fecreateRequestPageObject.clickSaveRequestButton();
	}
	
	@Then("A success message should appear")
	public void a_success_message_should_appear() throws Throwable {
		
		fecreateRequestPageObject.successMessage();
		
	}

	@Then("I should be able to submit a request successfully")
	public void i_should_be_able_to_submit_a_request_successfully() throws Throwable {
		
		fecreateRequestPageObject.successRequest();

	}

}


