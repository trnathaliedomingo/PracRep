package fe.stepdefinitions.regressiontest;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fe.pageobject.regressiontest.feInvalidEmailForgotPasswordPageObject;
import tooltwist.utils.TestInit;

public class feInvalidEmailForgotPassword {
	
	private WebDriver driver =  null;
	private feInvalidEmailForgotPasswordPageObject feinvalidEmailForgotPasswordPageObject = null;
	
	public feInvalidEmailForgotPassword(TestInit ti) {
		this.driver = ti.getDriver();
		this.feinvalidEmailForgotPasswordPageObject = new feInvalidEmailForgotPasswordPageObject(ti);
	}
	
	@When("I enter invalid email, (.*)")
	public void i_enter_invalid_email_admin(String invalidmail) throws Throwable {

		feinvalidEmailForgotPasswordPageObject.inputInvalid(invalidmail);
		
	}

	@Then("I should not be navigated to request submission page")
	public void i_should_not_be_navigated_to_request_submission_page() throws Throwable {

		feinvalidEmailForgotPasswordPageObject.errorMessage();
		
	}

}
