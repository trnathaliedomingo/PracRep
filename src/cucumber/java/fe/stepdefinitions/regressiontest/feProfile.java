package fe.stepdefinitions.regressiontest;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fe.stepdefinitions.smoketest.feProfilePageObject;
import tooltwist.utils.TestInit;

public class feProfile {
	
	private WebDriver driver =  null;
	private feProfilePageObject feprofilePageObject = null;
	
	public feProfile(TestInit ti) {
		this.driver = ti.getDriver();
		this.feprofilePageObject = new feProfilePageObject(ti);
	}
	
	
	
	@When("I click on pofile icon")
	public void i_click_on_pofile_icon() throws Throwable {
		
		feprofilePageObject.clickProfileIcon();

	}

	@Then("I should be navigated to profile page")
	public void i_should_be_navigated_to_profile_page() throws Throwable {
		
		feprofilePageObject.profilePage();
		
	}
	
	@Then("I should be able to see profile page elements")
	public void i_should_be_able_to_see_profile_page_elements() throws Throwable {
		
		feprofilePageObject.profileElements();
		
	}


}
