package fe.stepdefinitions.smoketest;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import tooltwist.utils.TestInit;
import fe.pageobject.smoketest.feClientsListingPagePageObject;

public class feClientsListingPage {
	
	private WebDriver driver =  null;
	private feClientsListingPagePageObject feclientsListingPagePageObject = null;
	
	public feClientsListingPage(TestInit ti) {
	this.driver = ti.getDriver();
	this.feclientsListingPagePageObject = new feClientsListingPagePageObject(ti);
	
	}
	
	@When("I click admin menu at sidebar")
	public void i_click_admin_menu_at_sidebar() throws Throwable {

		feclientsListingPagePageObject.clickAdminMenu();
		
	}

	@Then("I should be navigated to clients listing page")
	public void i_should_be_navigated_to_clients_listing_page() throws Throwable {
		
		feclientsListingPagePageObject.navToClientsListPage();

	}

	@Then("All elements should be available")
	public void all_elements_should_be_available() throws Throwable {
		
		feclientsListingPagePageObject.clientListElements();

	}
	
	@Then("Pagination should be working")
	public void pagination_should_be_working() throws Throwable {
		
		feclientsListingPagePageObject.clickPagination();
	    
	}

	@Then("Table should be sorting")
	public void table_should_be_sorting() throws Throwable {
		
		feclientsListingPagePageObject.sortTableColumn();
	   
	}

}
