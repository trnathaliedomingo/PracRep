package fe.stepdefinitions.smoketest;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fe.pageobject.smoketest.feUserSubmitRequestPageObject;
import tooltwist.utils.TestInit;

public class feUserSubmitRequest {
	
	private WebDriver driver =  null;
	private feUserSubmitRequestPageObject feuserSubmitRequestPageObject = null;
	
	public feUserSubmitRequest(TestInit ti) {
	this.driver = ti.getDriver();
	this.feuserSubmitRequestPageObject = new feUserSubmitRequestPageObject(ti);
	
	}

	@When("I click on request and forms menu")
	public void i_click_on_request_and_forms_menu() throws Throwable {

		feuserSubmitRequestPageObject.clickRequestMenu();
	}

	@When("Click on FE QA request")
	public void click_on_FE_QA_request() throws Throwable {
		
		feuserSubmitRequestPageObject.FEQARequest();
		
	}

	@When("I fill up required fields on request, (.*), (.*)")
	public void i_fill_up_required_fields_on_request_Automated_user_request_Smoke_Automation(String subject, String description) throws Throwable {
		
		feuserSubmitRequestPageObject.fillUpFields(subject, description);
		
	}

	@When("I click on submit button")
	public void i_click_on_submit_button() throws Throwable {
		
		feuserSubmitRequestPageObject.clickSubmitButton();
		
	}

	@Then("I am navigated to history page")
	public void i_am_navigated_to_history_page() throws Throwable {
		
		feuserSubmitRequestPageObject.historyPage();
		
	}

	@Then("Request has successfully been added on list")
	public void request_has_successfully_been_added_on_list() throws Throwable {
		
		feuserSubmitRequestPageObject.requestList();
		
	}


}
