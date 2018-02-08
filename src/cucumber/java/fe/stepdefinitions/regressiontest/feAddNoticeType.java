package fe.stepdefinitions.regressiontest;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fe.pageobject.regressiontest.feAddNoticeTypePageObject;
import tooltwist.utils.TestInit;

public class feAddNoticeType {
	
	private WebDriver driver =  null;
	private feAddNoticeTypePageObject feAddNoticeTypePageObject = null;
	
	public feAddNoticeType(TestInit ti) {
		this.driver = ti.getDriver();
		this.feAddNoticeTypePageObject = new feAddNoticeTypePageObject(ti);
	}
	
	@Given("I am in client listing page")
	public void i_am_in_client_listing_page() throws Throwable {
		
		feAddNoticeTypePageObject.clientListPage();

	}

	@When("I click on FE Water client")
	public void i_click_on_FE_Water_client() throws Throwable {
		
		feAddNoticeTypePageObject.clickFEWater();

	}

	@When("I click on notice types menu at sidebar")
	public void i_click_on_notice_types_menu_at_sidebar() throws Throwable {
		
		feAddNoticeTypePageObject.clickNoticeType();

	}

	@When("I click Add notice type button")
	public void i_click_Add_notice_type_button() throws Throwable {
		
		feAddNoticeTypePageObject.clickAddNoticeTypeButton();

	}

	@When("I input notice type name, (.*)")
	public void i_input_notice_type_name_Automation(String noticetype) throws Throwable {
		
		feAddNoticeTypePageObject.typeNoticeTypeName(noticetype);

	}
	
	@When("I notice type save button")
	public void i_notice_type_save_button() throws Throwable {
		
		feAddNoticeTypePageObject.clickSaveButton();
	}
	

	@Then("I have successfully added a notice type")
	public void i_have_successfully_added_a_notice_type() throws Throwable {
		
		feAddNoticeTypePageObject.successfullyAdded();

	}



}
