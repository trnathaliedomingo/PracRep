package fe.stepdefinitions.smoketest;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fe.pageobject.smoketest.feLoginPageObject;
import tooltwist.utils.TestInit;

public class feLogin {
	
	private WebDriver driver =  null;
	private feLoginPageObject feloginPageObject = null;
	
	public feLogin(TestInit ti) {
		this.driver = ti.getDriver();
		this.feloginPageObject = new feLoginPageObject(ti);
	}
	
	@Given("I am in log in page, (.*)")
	public void i_am_in_log_in_page_loginURL(String url) throws Throwable {
	
		feloginPageObject.goToLoginPage(url);
	}

	@When("I input valid log in credentials, (.*), (.*)")
	public void i_input_valid_log_in_credentials(String staffusername, String staffpassword) throws Throwable {
	  
		feloginPageObject.inputCredentials(staffusername, staffpassword);
	}

	@When("I click log me in button")
	public void i_click_log_me_in_button() throws Throwable {
	  
		feloginPageObject.clickLogMeInButton();
		
	}

	@Then("I should be navigated to dashboard page")
	public void i_should_be_navigated_to_dashboard_page() throws Throwable {
		
		feloginPageObject.dashboardPage();
		
	}
	
	@Then("I am logged in successfully")
	public void i_am_successfully_logged_in() throws Throwable {
	
		feloginPageObject.successfulLogin();
		
	}
	
}
