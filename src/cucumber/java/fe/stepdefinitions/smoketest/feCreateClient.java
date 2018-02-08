package fe.stepdefinitions.smoketest;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fe.pageobject.smoketest.feCreateClientPageObject;
import tooltwist.utils.TestInit;


public class feCreateClient {
	
	private WebDriver driver =  null;
	private feCreateClientPageObject fecreateClientPageObject = null;
	
	public feCreateClient(TestInit ti) {
		this.driver = ti.getDriver();
		this.fecreateClientPageObject = new feCreateClientPageObject(ti);
	}
	
	@When("I click on add client button")
	public void i_click_on_add_client_button() throws Throwable {
		fecreateClientPageObject.clickAddButton();

	}

	@When("I filled up required fields, (.*), (.*), (.*)")
	public void i_filled_up_required_fields_clientname_code_account(String clientname, String code, String account) throws Throwable {
		fecreateClientPageObject.fillUpFields(clientname, code, account);
	}

	@When("I click client save button")
	public void i_click_client_save_button() throws Throwable {
		fecreateClientPageObject.clickSaveButton();
	}

	@Then("A client has successfully been created")
	public void a_client_has_successfully_been_created() throws Throwable {
		fecreateClientPageObject.successMessage();
	}

}
