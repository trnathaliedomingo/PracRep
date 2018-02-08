package fe.stepdefinitions.regressiontest;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fe.pageobject.regressiontest.feClientUserPermissionsPageObject;
import tooltwist.utils.TestInit;

public class feClientUserPermissions {
	
	private WebDriver driver =  null;
	private feClientUserPermissionsPageObject feClientUserPermissionsPageObject = null;
	
	public feClientUserPermissions(TestInit ti) {
		this.driver = ti.getDriver();
		this.feClientUserPermissionsPageObject = new feClientUserPermissionsPageObject(ti);
	}
	
	@Given("I am in client dashboard page")
	public void i_am_in_client_dashboard_page() throws Throwable {
		
		feClientUserPermissionsPageObject.clientDashboard();

	}

	@When("I click on client users menu at sidebar")
	public void i_click_on_client_users_menu_at_sidebar() throws Throwable {

		feClientUserPermissionsPageObject.clickUsersMenu();
		
	}

	@When("I click an existing client user")
	public void i_click_an_existing_client_user() throws Throwable {

		feClientUserPermissionsPageObject.clickExistingUser();
		
	}

	@When("I click on client users permissions menu at sidebar")
	public void i_click_on_client_users_permissions_menu_at_sidebar() throws Throwable {

		feClientUserPermissionsPageObject.clickPermissionsMenu();
		
	}

	@When("I tick on client user permission")
	public void i_tick_on_client_user_permission() throws Throwable {

		feClientUserPermissionsPageObject.tickPermissions();
		
	}

	@When("I click client user save button")
	public void i_click_client_user_save_button() throws Throwable {
		
		feClientUserPermissionsPageObject.clickSaveUserButton();

	}

	@Then("I should be able to grant user permission")
	public void i_should_be_able_to_grant_user_permission() throws Throwable {
		
		feClientUserPermissionsPageObject.successUserPermissionUpdate();

	}

}
