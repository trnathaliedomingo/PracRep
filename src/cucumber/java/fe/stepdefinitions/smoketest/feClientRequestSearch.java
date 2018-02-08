package fe.stepdefinitions.smoketest;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.WebDriver;
import tooltwist.utils.TestInit;
import fe.pageobject.smoketest.feClientRequestSearchPageObject;

public class feClientRequestSearch {
	
	private WebDriver driver =  null;
	private feClientRequestSearchPageObject feclientRequestSearchPageObject = null;
	
	public feClientRequestSearch(TestInit ti) {
	this.driver = ti.getDriver();
	this.feclientRequestSearchPageObject = new feClientRequestSearchPageObject(ti);
	
	}
	
	@When("I type a request on the search request field, (.*)")
	public void i_type_a_request_on_the_search_request_field_clientRequestid(String requestID) throws Throwable {
		
		feclientRequestSearchPageObject.typeReqID(requestID);
		
	}

	@Then("Searched request should be reflected on list")
	public void searched_request_should_be_reflected_on_list() throws Throwable {
		feclientRequestSearchPageObject.result();
	}

}
