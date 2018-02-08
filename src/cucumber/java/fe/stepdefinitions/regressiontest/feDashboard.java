package fe.stepdefinitions.regressiontest;


import tooltwist.utils.TestInit;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fe.pageobject.regressiontest.feDashboardPageObject;

public class feDashboard {
	
	private WebDriver driver =  null;
	private feDashboardPageObject fedashboardPageObject = null;
	
	public feDashboard(TestInit ti) {
		this.driver = ti.getDriver();
		this.fedashboardPageObject = new feDashboardPageObject(ti);
	}
	
	@When("I click quarter selector button left/right")
	public void i_click_quarter_selector_button_left_right() throws Throwable {
	
		fedashboardPageObject.clickQuarterSelectors();
		
	}

	@Then("I am able to view previous/next quarter information")
	public void i_am_able_to_view_previous_next_quarter_information() throws Throwable {

		fedashboardPageObject.viewPreviousNext();
		
	}

	@Then("All sections are available in dashboard page")
	public void all_sections_are_available_in_dashboard_page() throws Throwable {
		
		fedashboardPageObject.dashboardElements();
		
	}
}
	
