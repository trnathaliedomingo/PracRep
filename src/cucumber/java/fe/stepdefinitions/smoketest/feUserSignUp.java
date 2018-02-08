package fe.stepdefinitions.smoketest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.WebDriver;
import tooltwist.utils.TestInit;
import fe.pageobject.smoketest.feUserSignUpPageObject;

public class feUserSignUp {
	
	private WebDriver driver =  null;
	private feUserSignUpPageObject feuserSignUpPageObject = null;
	
	public feUserSignUp(TestInit ti) {
	this.driver = ti.getDriver();
	this.feuserSignUpPageObject = new feUserSignUpPageObject(ti);
	
	}
	
	@Given("I am in user log in page, (.*)")
	public void i_am_in_user_log_in_page_userURL(String url) throws Throwable {

		feuserSignUpPageObject.logIn(url);
		
	}

	@When("I click sign up tab")
	public void i_click_sign_up_tab() throws Throwable {

		feuserSignUpPageObject.clickSignupTab();
		
	}

	@When("I type in valid user email, (.*)")
	public void i_type_in_valid_user_email_staffemail(String email) throws Throwable {

		feuserSignUpPageObject.inputEmail(email);
		
	}

	@When("I click sign up button")
	public void i_click_sign_up_button() throws Throwable {

		feuserSignUpPageObject.clickSignUpButton();
		
	}

	@Then("I should be navigated to success configuration sign up page")
	public void i_should_be_navigated_to_success_configuration_sign_up_page() throws Throwable {

		feuserSignUpPageObject.navToSuccess();
		
	}

	@Then("A sign up email must be sent")
	public void a_sign_up_email_must_be_sent() throws Throwable {

		feuserSignUpPageObject.signUpEmail();
		
	}


}
