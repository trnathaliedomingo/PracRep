package fe.stepdefinitions.regressiontest;

import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fe.pageobject.regressiontest.feRequestsListingPagePageObject;
import tooltwist.utils.TestInit;

public class feRequestsListingPage {
	
	
	private WebDriver driver =  null;
	private feRequestsListingPagePageObject ferequestsListingPagePageObject = null;
	
	public feRequestsListingPage(TestInit ti) {
		this.driver = ti.getDriver();
		this.ferequestsListingPagePageObject = new feRequestsListingPagePageObject(ti);
	}
	
	@When("I click on requests menu at sidebar")
	public void i_click_on_requests_menu_at_sidebar() throws Throwable {
		ferequestsListingPagePageObject.clickRequests();

	}

	@Then("I should be navigated to requests listing page")
	public void i_should_be_navigated_to_requests_listing_page() throws Throwable {
		
		ferequestsListingPagePageObject.navToRequestsListPage();

	}

	@Then("All requests elements should be available")
	public void all_requests_elements_should_be_available() throws Throwable {
		
		ferequestsListingPagePageObject.allElements();

	}

	@Then("Requests pagination should be working")
	public void requests_pagination_should_be_working() throws Throwable {
		
		ferequestsListingPagePageObject.requestsPagination();

	}

	@Then("Requests sorting should be working")
	public void requests_sorting_should_be_working() throws Throwable {
		
		ferequestsListingPagePageObject.requestsSort();

	}

}
