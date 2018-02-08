package fe.stepdefinitions.smoketest;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fe.pageobject.smoketest.feUsersListingPagePageObject;
import tooltwist.utils.TestInit;
import org.openqa.selenium.WebDriver;

public class feUsersListingPage {
	
	private WebDriver driver =  null;
	private feUsersListingPagePageObject feusersListingPagePageObject = null;
	
	public feUsersListingPage(TestInit ti) {
	this.driver = ti.getDriver();
	this.feusersListingPagePageObject = new feUsersListingPagePageObject(ti);
	
	}
	
	@When("I click users menu at sidebar")
	public void i_click_users_menu_at_sidebar() throws Throwable {
		
		feusersListingPagePageObject.clickUsersMenu();

	}

	@Then("I should be navigated to users listing page")
	public void i_should_be_navigated_to_users_listing_page() throws Throwable {

		feusersListingPagePageObject.navToUsersListingPage();
		
	}

	@Then("All users listing page elements should be available")
	public void all_users_listing_page_elements_should_be_available() throws Throwable {

		feusersListingPagePageObject.usersListElements();
		
	}

	@Then("Users listing page pagination should be working")
	public void users_listing_page_pagination_should_be_working() throws Throwable {

		feusersListingPagePageObject.usersListPagination();
		
	}

	@Then("Users listing page table should be sorting")
	public void users_listing_page_table_should_be_sorting() throws Throwable {

		feusersListingPagePageObject.usersListSort();
		
	}


}
