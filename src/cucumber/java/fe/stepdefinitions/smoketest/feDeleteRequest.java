package fe.stepdefinitions.smoketest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.WebDriver;
import fe.pageobject.smoketest.feDeleteRequestPageObject;
import tooltwist.utils.TestInit;

public class feDeleteRequest {
	
	private WebDriver driver =  null;
	private feDeleteRequestPageObject fedeleteRequestPageObject = null;
	
	public feDeleteRequest(TestInit ti) {
		this.driver = ti.getDriver();
		this.fedeleteRequestPageObject = new feDeleteRequestPageObject(ti);
	}
	
	@Given("I click an existing request")
	public void i_click_an_existing_request() throws Throwable {
		
		fedeleteRequestPageObject.clickrequest();

	}

	@When("I click delete button")
	public void i_click_delete_button() throws Throwable {
		
		fedeleteRequestPageObject.clickDeleteButton();
		
	}
	
	@Then("Success message should appear")
	public void success_message_should_appear() throws Throwable {

		fedeleteRequestPageObject.successMessage();
		
	}

}
