package fe.stepdefinitions.smoketest;

import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fe.pageobject.smoketest.feForgotPasswordPageObject;
import tooltwist.utils.TestInit;

public class feForgotPassword {
	
	private WebDriver driver =  null;
	private feForgotPasswordPageObject feforgotPasswordPageObject = null;
	
	public feForgotPassword(TestInit ti) {
		this.driver = ti.getDriver();
		this.feforgotPasswordPageObject = new feForgotPasswordPageObject(ti);
	}
	
	@When("I click forgot password link")
	public void i_click_forgot_password_link() throws Throwable {
		feforgotPasswordPageObject.clickPasswordLink();
	}

	@When("I should be navigated to password reset page")
	public void i_should_be_navigated_to_password_reset_page() throws Throwable {
		feforgotPasswordPageObject.passwordResetPage();
	}

	@When("I enter valid email, (.*)")
	public void i_enter_valid_email_nathalie_domingo_tooltwist_com(String email) throws Throwable {
		feforgotPasswordPageObject.enterEmail(email);
	}

	@When("I click send request button")
	public void i_click_send_request_button() throws Throwable {
		feforgotPasswordPageObject.clickSenRequestButton();
	}

	@Then("I should be navigated to request submission page")
	public void i_should_be_navigated_to_request_submission_page() throws Throwable {
		feforgotPasswordPageObject.requestSubmissionPage();
	}

	@Then("Password must be reset successfully")
	public void password_must_be_reset_successfully() throws Throwable {
		feforgotPasswordPageObject.resetSuccessful();
	}

	@Then("I click back to login page button")
	public void i_click_back_to_login_page_button() throws Throwable {
		feforgotPasswordPageObject.loginButton();
	}

	@Then("I should be navigated to login page")
	public void i_should_be_navigated_to_login_page() throws Throwable {
		feforgotPasswordPageObject.LoginPage();
	}
	
	@Then("A confirmation email must be sent")
	public void a_confirmation_email_must_be_sent() throws Throwable {
	
	}
}

