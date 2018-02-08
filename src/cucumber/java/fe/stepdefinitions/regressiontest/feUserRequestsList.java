package fe.stepdefinitions.regressiontest;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fe.pageobject.regressiontest.feUserRequestsListPage;
import tooltwist.utils.TestInit;

public class feUserRequestsList {
	
	private WebDriver driver =  null;
	private feUserRequestsListPage feUserRequestsListPage = null;
	
	public feUserRequestsList(TestInit ti) {
		this.driver = ti.getDriver();
		this.feUserRequestsListPage = new feUserRequestsListPage(ti);
	}
	
	@Given("I am in request and forms page")
	public void i_am_in_request_and_forms_page() throws Throwable {

		feUserRequestsListPage.requestPage();
		
	}

	@When("I click on users request history tab")
	public void i_click_on_users_request_history_tab() throws Throwable {

		feUserRequestsListPage.clickHistoryRequestTab();
		
	}

	@Then("I should be able to see user created requests")
	public void i_should_be_able_to_see_user_created_requests() throws Throwable {
		
		feUserRequestsListPage.table();

	}



}
