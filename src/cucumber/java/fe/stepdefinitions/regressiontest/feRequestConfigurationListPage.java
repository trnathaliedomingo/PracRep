package fe.stepdefinitions.regressiontest;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fe.pageobject.regressiontest.feRequestConfigurationListPagePageObject;
import tooltwist.utils.TestInit;
import org.openqa.selenium.WebDriver;

public class feRequestConfigurationListPage {
	
	private WebDriver driver =  null;
	private feRequestConfigurationListPagePageObject ferequestConfigurationPageObject = null;
	
	public feRequestConfigurationListPage(TestInit ti) {
	this.driver = ti.getDriver();
	this.ferequestConfigurationPageObject = new feRequestConfigurationListPagePageObject(ti);
	
	}
	
	@When("I click configurations menu at sidebar")
	public void i_click_configurations_menu_at_sidebar() throws Throwable {

		ferequestConfigurationPageObject.clickConfig();
		
	}

	@Then("I should be navigated to configuration page")
	public void i_should_be_navigated_to_configuration_page() throws Throwable {

		ferequestConfigurationPageObject.navToConfig();
		
	}

	@Then("All configuration page elements should be available")
	public void all_configuration_page_elements_should_be_available() throws Throwable {

		ferequestConfigurationPageObject.configElements();
		
	}

	@Then("Configuration pagination should be working")
	public void configuration_pagination_should_be_working() throws Throwable {
		
		ferequestConfigurationPageObject.configPagination();

	}

	@Then("Configuration table should be sorting")
	public void configuration_table_should_be_sorting() throws Throwable {
		
		ferequestConfigurationPageObject.sortConfig();

	}

}
