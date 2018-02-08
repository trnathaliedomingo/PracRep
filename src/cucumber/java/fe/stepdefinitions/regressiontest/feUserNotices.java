package fe.stepdefinitions.regressiontest;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fe.pageobject.regressiontest.feUserNoticesPageObject;
import tooltwist.utils.TestInit;

public class feUserNotices {
	
	private WebDriver driver =  null;
	private feUserNoticesPageObject feUserNoticesPageObject = null;
	
	public feUserNotices(TestInit ti) {
		this.driver = ti.getDriver();
		this.feUserNoticesPageObject = new feUserNoticesPageObject(ti);
	}
	
	@When("I click on notices menu")
	public void i_click_on_notices_menu() throws Throwable {
		
		feUserNoticesPageObject.clickNoticesMenu();

	}

	@Then("All elements should be showing correctly")
	public void all_elements_should_be_showing_correctly() throws Throwable {
	
		feUserNoticesPageObject.allElements();
		
	}



}
