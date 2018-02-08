package fe.pageobject.smoketest;
import tooltwist.utils.ElementUtil;
import tooltwist.utils.feObjectReference;
import tooltwist.utils.TestInit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class feClientsListingPagePageObject extends feObjectReference {
	
	private WebDriver driver = null;
	private ElementUtil elementUtil = null;
	private TestInit ti = null;
	private static final Logger logger = LoggerFactory.getLogger(feClientsListingPagePageObject.class);

	public feClientsListingPagePageObject(TestInit ti) {
	this.driver = ti.getDriver();
	this.elementUtil = ti.getElementUtil();
	this.ti = ti; 
	
	}

	public void clickAdminMenu() throws InterruptedException {
		
		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(adminAdminMenu));
		logger.info("Admin menu has been clicked");
		
	}

	public void navToClientsListPage() throws InterruptedException {
		
		Assert.assertTrue("Clients list page header is not available",elementUtil.isElementAvailable(adminClientsListPageHeader));
		logger.info("I am in Clients Listing Page");
		
		
	}

	public void clientListElements() {
		
		driver.findElement(By.xpath(adminClientsListSearchField));
		logger.info("Search field is available");
		driver.findElement(By.xpath(adminClientsListAdvancedSearchOption));
		logger.info("Advanced Search Option is available");
		driver.findElement(By.xpath(adminAddClientButton));
		logger.info("Add client button is available");
		driver.findElement(By.xpath(adminClientsListPageSettings));
		logger.info("Pagination is available");
		driver.findElement(By.xpath(adminClientsListTable));
		logger.info("Client list table is available");
		driver.findElement(By.xpath(adminClientsListDownloadCSV));
		logger.info("Downalod CSV icon is available");
		logger.info("All Clients Listing Page Elements are available");
		
	}

	public void clickPagination() throws InterruptedException {

		Thread.sleep(10000);
		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(adminClientsListPageCounter));
		logger.info("Page counter has been clicking");
		
		Thread.sleep(10000);
		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(adminClientPageCounter10));
		logger.info("Page counter has been clicked");
		
		Thread.sleep(10000);
		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(adminClientsListPageNext));
		logger.info("Next page has been clicking");
		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(adminClientsListPageNext));
		logger.info("Next page has been clicking");
		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(adminClientsListPageNext));
		logger.info("Next page has been clicking");
		
	}

	public void sortTableColumn() throws InterruptedException {
		
		Thread.sleep(10000);
		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(adminClientColumnSort));
		logger.info("Client column has been sorting");
		
		Thread.sleep(10000);
		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(adminStateColumnSort));
		logger.info("State column has been sorting");
		
		Thread.sleep(10000);
		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(adminUsersColumnSort));
		logger.info("Users column has been sorting");
		
		Thread.sleep(10000);
		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(adminSubmittedJobsColumnSort));
		logger.info("Submitted jobs column has been sorting");
		
	}

}
