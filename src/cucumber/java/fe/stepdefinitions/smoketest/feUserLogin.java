package fe.stepdefinitions.smoketest;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fe.pageobject.smoketest.feUserLoginPageObject;
import tooltwist.utils.TestInit;

public class feUserLogin {
	
	private WebDriver driver =  null;
	private feUserLoginPageObject feuserLoginPageObject = null;
	
	public feUserLogin(TestInit ti) {
	this.driver = ti.getDriver();
	this.feuserLoginPageObject = new feUserLoginPageObject(ti);
	
	}
	
	
	@When("I type in valid log in credentials, (.*), (.*)")
	public void i_type_in_valid_log_in_credentials_userEmail_userPassword(String email, String password) throws Throwable {
		feuserLoginPageObject.userLogin(email, password);
	}

	@When("I click log in button")
	public void i_click_log_in_button() throws Throwable {
		feuserLoginPageObject.clickLogInButton();

	}

	@Then("I should be navigated to user dashboard page")
	public void i_should_be_navigated_to_user_dashboard_page() throws Throwable {
		feuserLoginPageObject.dashboardPage();
	}

}
