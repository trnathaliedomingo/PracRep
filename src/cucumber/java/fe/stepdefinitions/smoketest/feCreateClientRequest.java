package fe.stepdefinitions.smoketest;

	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.When;
	import org.openqa.selenium.WebDriver;
	import tooltwist.utils.TestInit;
	import fe.pageobject.smoketest.feCreateClientRequestPageObject;

	public class feCreateClientRequest {
		
		private WebDriver driver =  null;
		private feCreateClientRequestPageObject fecreateClientRequestPageObject = null;
		
		public feCreateClientRequest(TestInit ti) {
			this.driver = ti.getDriver();
			this.fecreateClientRequestPageObject = new feCreateClientRequestPageObject(ti);
		}
	
	@Given("I click on client requests menu at sidebar")
	public void i_click_on_client_requests_menu_at_sidebar() throws Throwable {
		
		fecreateClientRequestPageObject.clickReqMenu();

	}

	@When("I click client add request button")
	public void i_click_client_add_request_button() throws Throwable {

		fecreateClientRequestPageObject.clickAddReq();
		
	}
	
	@When("I click client request save button")
	public void i_click_client_request_save_button() throws Throwable {

		fecreateClientRequestPageObject.clickSaveButton();
		
	}

}
