package fe.stepdefinitions.regressiontest;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fe.pageobject.regressiontest.feUserAccountsPageObject;
import tooltwist.utils.TestInit;

public class feUserAccounts {
	
	private WebDriver driver =  null;
	private feUserAccountsPageObject feUserAccountsPageObject = null;
	
	public feUserAccounts(TestInit ti) {
		this.driver = ti.getDriver();
		this.feUserAccountsPageObject = new feUserAccountsPageObject(ti);
	}
	
	
	@Given("I am in user profile page")
	public void i_am_in_user_profile_page() throws Throwable {
		
		feUserAccountsPageObject.userProfile();

	}

	@When("I click on user accounts tab")
	public void i_click_on_user_accounts_tab() throws Throwable {
		
		feUserAccountsPageObject.clickAccountsTab();

	}

	@Then("I should be navigated to user accounts page")
	public void i_should_be_navigated_to_user_accounts_page() throws Throwable {
		
		feUserAccountsPageObject.accountsPage();

	}

	@Then("I should be able to see all accounts pertaining to logged in user")
	public void i_should_be_able_to_see_all_accounts_pertaining_to_logged_in_user() throws Throwable {
		
		feUserAccountsPageObject.AccountsElements();

	}

}
