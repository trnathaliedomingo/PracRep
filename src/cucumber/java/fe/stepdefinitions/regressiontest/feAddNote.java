package fe.stepdefinitions.regressiontest;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fe.pageobject.regressiontest.feAddNotePageObject;
import tooltwist.utils.TestInit;

public class feAddNote {
	
	private WebDriver driver =  null;
	private feAddNotePageObject feaddNotePageObject = null;
	
	public feAddNote(TestInit ti) {
	this.driver = ti.getDriver();
	this.feaddNotePageObject = new feAddNotePageObject(ti);
	
	}
	
	@When("I click on an existing request")
	public void i_click_on_an_existing_request() throws Throwable {
		
		feaddNotePageObject.clickRequest();

	}

	@When("I click request history tab")
	public void i_click_request_history_tab() throws Throwable {
		
		feaddNotePageObject.clickHistoryTab();

	}

	@When("I fill in note field, (.*)")
	public void i_fill_in_note_field_This_is_an_automated_note_regression(String note) throws Throwable {

		feaddNotePageObject.fillUpNoteTextArea(note);
		
	}
	
	@When("I click the save request button")
	public void i_click_the_save_request_button() throws Throwable {
		
		feaddNotePageObject.clicksavebutton();

	}

	@Then("Adding note success message should appear")
	public void adding_note_success_message_should_appear() throws Throwable {
		
		feaddNotePageObject.SuccessMessageNote();

	}

}
