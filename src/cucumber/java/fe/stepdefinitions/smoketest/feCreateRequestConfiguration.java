package fe.stepdefinitions.smoketest;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fe.pageobject.smoketest.feCreateRequestConfigurationPageObject;
import tooltwist.utils.TestInit;

public class feCreateRequestConfiguration {
	
	private WebDriver driver =  null;
	private feCreateRequestConfigurationPageObject fecreateRequestConfigurationPageObject = null;
	
	public feCreateRequestConfiguration(TestInit ti) {
	this.driver = ti.getDriver();
	this.fecreateRequestConfigurationPageObject = new feCreateRequestConfigurationPageObject(ti);
	
	}
	
	@When("I click on add configuration button")
	public void i_click_on_add_configuration_button() throws Throwable {
		
		fecreateRequestConfigurationPageObject.clickAddConfigbutton();


	}

	@When("I fill up required configuration fields, (.*), (.*)")
	public void i_fill_up_required_configuration_fields_category_type(String category, String type) throws Throwable {

		fecreateRequestConfigurationPageObject.fillUpFields(category, type);
		
	}

	@When("I select form fields")
	public void i_select_form_fields() throws Throwable {

		fecreateRequestConfigurationPageObject.selectfromAdd();
		
	}

	@When("I fill up form fields")
	public void i_fill_up_form_fields() throws Throwable {
		
		fecreateRequestConfigurationPageObject.fillUpAddedFields();

	}

	@When("I click configuration save button")
	public void i_click_configuration_save_button() throws Throwable {
		
		fecreateRequestConfigurationPageObject.clickSaveButton();

	}

	@Then("I should be able to see 'Success! Request configuration has been added.' message")
	public void i_should_be_able_to_see_Success_Request_configuration_has_been_added_message() throws Throwable {
		
		fecreateRequestConfigurationPageObject.SuccessMessage();

	}

	@Then("I should be able to save configuration successfully")
	public void i_should_be_able_to_save_configuration_successfully() throws Throwable {

	}

}
