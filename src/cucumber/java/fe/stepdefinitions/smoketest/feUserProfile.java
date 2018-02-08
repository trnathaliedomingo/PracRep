package fe.stepdefinitions.smoketest;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fe.pageobject.smoketest.feUserProfilePageObject;
import tooltwist.utils.TestInit;

public class feUserProfile {
	
	private WebDriver driver =  null;
	private feUserProfilePageObject feuserProfilePageObject = null;
	
	public feUserProfile(TestInit ti) {
	this.driver = ti.getDriver();
	this.feuserProfilePageObject = new feUserProfilePageObject(ti);
	
	}
	
	@When("I click on user profile")
	public void i_click_on_user_profile() throws Throwable {

		feuserProfilePageObject.clickProfile();
		
	}

	@Then("I should be navigated on profile page")
	public void i_should_be_navigated_on_profile_page() throws Throwable {
		feuserProfilePageObject.profilePage();
	}

	@Then("I should be able to see all user profile elements")
	public void i_should_be_able_to_see_all_user_profile_elements() throws Throwable {
		feuserProfilePageObject.profileElements();

	}

}
