package fe.stepdefinitions.regressiontest;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import fe.pageobject.regressiontest.feClientPermissionsPageObject;
import tooltwist.utils.TestInit;
import cucumber.api.java.en.Then;

public class feClientPermissions {
	
	private WebDriver driver =  null;
	private feClientPermissionsPageObject feClientPermissionsPageObject = null;
	
	public feClientPermissions(TestInit ti) {
		this.driver = ti.getDriver();
		this.feClientPermissionsPageObject = new feClientPermissionsPageObject(ti);
	}
	
	@Given("I am in client details page")
	public void i_am_in_client_details_page() throws Throwable {
		
		feClientPermissionsPageObject.detailsPage();

	}

	@When("I click on permissions menu at sidebar")
	public void i_click_on_permissions_menu_at_sidebar() throws Throwable {
		
		feClientPermissionsPageObject.clickPermissionsMenu();

	}

	@When("I tick on permission")
	public void i_tick_on_permission() throws Throwable {
		
		feClientPermissionsPageObject.tickpermissions();

	}
	
	@When("I click permissions save button")
	public void i_click_permissions_save_button() throws Throwable {

		feClientPermissionsPageObject.updatePermissions();
		
	}

	@Then("I have successfully granted a permission a client")
	public void i_have_successfully_granted_a_permission_a_client() throws Throwable {
		
		

	}



}
