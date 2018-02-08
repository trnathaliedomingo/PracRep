package fe.stepdefinitions.regressiontest;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fe.pageobject.regressiontest.feClientUserEmailLogPageObject;
import tooltwist.utils.TestInit;

public class feClientUserEmailLog {
	
	private WebDriver driver =  null;
	private feClientUserEmailLogPageObject feClientUserEmailLogPageObject = null;
	
	public feClientUserEmailLog(TestInit ti) {
		this.driver = ti.getDriver();
		this.feClientUserEmailLogPageObject = new feClientUserEmailLogPageObject(ti);
	}
	
	@Given("I am in users list page")
	public void i_am_in_users_list_page() throws Throwable {
		
		feClientUserEmailLogPageObject.usersListPage();

	}

	@Given("I click an existing fe water client user")
	public void i_click_an_existing_fe_water_client_user() throws Throwable {

		feClientUserEmailLogPageObject.feWaterClientUser();
		
	}

	@When("I click on email log menu at sidebar")
	public void i_click_on_email_log_menu_at_sidebar() throws Throwable {
		
		feClientUserEmailLogPageObject.emailLogMenu();

	}

	@Then("I should be able to see all email sent to user")
	public void i_should_be_able_to_see_all_email_sent_to_user() throws Throwable {
		
		feClientUserEmailLogPageObject.emailLogRecord();

	}



}
