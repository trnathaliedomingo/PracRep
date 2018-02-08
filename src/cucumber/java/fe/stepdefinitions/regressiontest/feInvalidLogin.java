package fe.stepdefinitions.regressiontest;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fe.pageobject.regressiontest.feInvalidLoginPageObject;
import tooltwist.utils.TestInit;

public class feInvalidLogin {
	
	private WebDriver driver =  null;
	private feInvalidLoginPageObject feinvalidLoginPageObject = null;
	
	public feInvalidLogin(TestInit ti) {
		this.driver = ti.getDriver();
		this.feinvalidLoginPageObject = new feInvalidLoginPageObject(ti);
	}
	
	
	@When("I input invalid log in credentials, (.*), (.*)")
	public void i_input_invalid_log_in_credentials_invstaffusername_staffpassword(String invstaffusername, String staffpassword) throws Throwable {
		feinvalidLoginPageObject.invalidCreds(invstaffusername, staffpassword);
	}

	@Then("An error message should appear,(.*)")
	public void an_error_message_should_appear_Error_The_username_email_or_password_you_have_entered_is_invalid(String errormessage) throws Throwable {
		feinvalidLoginPageObject.errorMessage(errormessage);
	}

	@Then("I should not be able to log in")
	public void i_should_not_be_able_to_log_in() throws Throwable {
		feinvalidLoginPageObject.notLogin();
	}


}
