package fe.stepdefinitions.smoketest;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fe.pageobject.smoketest.feUserLogOutPageObject;
import tooltwist.utils.TestInit;

public class feUserLogOut {
	
	private WebDriver driver =  null;
	private feUserLogOutPageObject feuserLogOutPageObject = null;
	
	public feUserLogOut(TestInit ti) {
	this.driver = ti.getDriver();
	this.feuserLogOutPageObject = new feUserLogOutPageObject(ti);
	
	}
	
	@Given("I am in user dashboard page")
	public void i_am_in_user_dashboard_page() throws Throwable {

	}
	
	@When("I click on user log out button")
	public void i_click_on_user_log_out_button() throws Throwable {

		feuserLogOutPageObject.clickLogOutButton();
		
	}

	@Then("I should be able to be logged out successfully as user")
	public void i_should_be_able_to_be_logged_out_successfully_as_user() throws Throwable {
		
	
	}


}
