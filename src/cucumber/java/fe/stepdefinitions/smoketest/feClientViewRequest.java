package fe.stepdefinitions.smoketest;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fe.pageobject.smoketest.feClientViewRequestPageObject;
import tooltwist.utils.TestInit;

public class feClientViewRequest {
	
	private WebDriver driver =  null;
	private feClientViewRequestPageObject feclientViewRequestPageObject = null;
	
	public feClientViewRequest(TestInit ti) {
		this.driver = ti.getDriver();
		this.feclientViewRequestPageObject = new feClientViewRequestPageObject(ti);
	}
	
	@When("I click an existing open request")
	public void i_click_an_existing_open_request() throws Throwable {
		feclientViewRequestPageObject.clickRequest();
	}

	@Then("I should be able to see all elements in request details page")
	public void i_should_be_able_to_see_all_elements_in_request_details_page() throws Throwable {
		feclientViewRequestPageObject.requestElements();
	}

}
