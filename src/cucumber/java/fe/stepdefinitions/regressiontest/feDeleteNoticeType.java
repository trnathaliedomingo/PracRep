package fe.stepdefinitions.regressiontest;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fe.pageobject.regressiontest.feDeleteNoticeTypePageObject;
import tooltwist.utils.TestInit;

public class feDeleteNoticeType {
	
	private WebDriver driver =  null;
	private feDeleteNoticeTypePageObject feDeleteNoticeTypePageObject = null;
	
	public feDeleteNoticeType(TestInit ti) {
		this.driver = ti.getDriver();
		this.feDeleteNoticeTypePageObject = new feDeleteNoticeTypePageObject(ti);
	}
	
	@Given("I am in fe water notice type page")
	public void i_am_in_fe_water_notice_type_page() throws Throwable {
		
		feDeleteNoticeTypePageObject.feWaterNoticePage();

	}

	@When("I tick on notice type")
	public void i_tick_on_notice_type() throws Throwable {
		
		feDeleteNoticeTypePageObject.tickNoticeType();

	}

	@When("I click delete notice type button")
	public void i_click_delete_notice_type_button() throws Throwable {
		
		feDeleteNoticeTypePageObject.deleteNotice();

	}

	@Then("Notice type should be removed on the list")
	public void notice_type_should_be_removed_on_the_list() throws Throwable {
		
		feDeleteNoticeTypePageObject.successfulDelete();

	}



}
