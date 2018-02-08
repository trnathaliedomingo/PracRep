package fe.stepdefinitions.smoketest;

import org.openqa.selenium.WebDriver;

import tooltwist.utils.TestInit;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fe.pageobject.smoketest.feCreateUserPageObject;

public class feCreateUser {
	
	private WebDriver driver =  null;
	private feCreateUserPageObject fecreateUserPageObject = null;
	
	public feCreateUser(TestInit ti) {
		this.driver = ti.getDriver();
		this.fecreateUserPageObject = new feCreateUserPageObject(ti);
	}
	
	@Given("I am in users listing page")
	public void i_am_in_users_listing_page() throws Throwable {
	   
	}
	
	@When("I click add user button")
	public void i_click_add_user_button() throws Throwable {
		
		fecreateUserPageObject.clickAddButton();
	    
	}

	@When("I fill up required user fields, (.*), (.*), (.*), (.*), (.*)")
	public void i_fill_up_required_user_fields_firstName_lastName_eMail_userName_passWord(String firstName, String lastName, String eMail, String userName, String passWord) throws Throwable {

		fecreateUserPageObject.fillUpFields(firstName, lastName, eMail, userName, passWord);
		
	}

	@When("I set user type to client admin")
	public void i_set_user_type_to_client_admin() throws Throwable {
		
		fecreateUserPageObject.setToClientAdmin();

	}
	
	@When("I click user save button")
	public void i_click_user_save_button() throws Throwable {
		
		fecreateUserPageObject.clickSavebutton();

	}

	@Then("Success message upon user creation should appear, (.*)")
	public void success_message_upon_user_creation_should_appear_successmessage(String successMessage) throws Throwable {

		fecreateUserPageObject.successMessage(successMessage);
		
	}

	@Then("I have successfully created a user")
	public void i_have_successfully_created_a_user() throws Throwable {
		
		fecreateUserPageObject.userCreated();

	}

}
