package fe.stepdefinitions.smoketest;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fe.pageobject.smoketest.feLogoutPageObject;
import tooltwist.utils.TestInit;

public class feLogout {
	
	private WebDriver driver =  null;
	private feLogoutPageObject felogoutPageObject = null;
	
	public feLogout(TestInit ti) {
		this.driver = ti.getDriver();
		this.felogoutPageObject = new feLogoutPageObject(ti);
	}
	
	@When("I click profile icon")
	public void i_click_profile_icon() throws Throwable {
		felogoutPageObject.clickProfIcon();
	}

	@When("I click on log out")
	public void i_click_on_log_out() throws Throwable {
		felogoutPageObject.clickLogout();
	}

	@Then("I should be navigated to log in page, (.*)")
	public void i_should_be_navigated_to_log_in_page(String url) throws Throwable {
		felogoutPageObject.goToLoginPage(url);
	}

	@Then("I should be able to log out successfully")
	public void i_should_be_able_to_log_out_successfully() throws Throwable {
		felogoutPageObject.SuccessLogout();
	}

}
