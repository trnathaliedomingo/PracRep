package fe.stepdefinitions.regressiontest;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fe.pageobject.regressiontest.feUserAdditionaleMailsPageObject;
import tooltwist.utils.TestInit;

public class feUserAdditionaleMails {
	
	private WebDriver driver =  null;
	private feUserAdditionaleMailsPageObject feUserAdditionaleMailsPageObject = null;
	
	public feUserAdditionaleMails(TestInit ti) {
		this.driver = ti.getDriver();
		this.feUserAdditionaleMailsPageObject = new feUserAdditionaleMailsPageObject(ti);
	}
	
	@When("I click on user emails tab")
	public void i_click_on_user_emails_tab() throws Throwable {
		
		feUserAdditionaleMailsPageObject.clickTab();

	}

	@Then("^I should be navigated to user additional emails page$")
	public void i_should_be_navigated_to_user_additional_emails_page() throws Throwable {
		
		feUserAdditionaleMailsPageObject.navPage();

	}

	@Then("^I should be able to see email pertaining to logged in user$")
	public void i_should_be_able_to_see_email_pertaining_to_logged_in_user() throws Throwable {
		
		feUserAdditionaleMailsPageObject.email();

	}


}
