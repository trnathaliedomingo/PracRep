package fe.pageobject.regressiontest;
import tooltwist.utils.ElementUtil;
import tooltwist.utils.feObjectReference;
import tooltwist.utils.TestInit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class feJobsListingPagePageObject extends feObjectReference {
	
	private WebDriver driver = null;
	private ElementUtil elementUtil = null;
	private TestInit ti = null;
	private static final Logger logger = LoggerFactory.getLogger(feJobsListingPagePageObject.class);

	public feJobsListingPagePageObject(TestInit ti) {
	this.driver = ti.getDriver();
	this.elementUtil = ti.getElementUtil();
	this.ti = ti; 

	}

	public void clickJobsMenu() throws InterruptedException {
		
		Assert.assertTrue("Unable to click", elementUtil.isClickedElementAvailable(adminJobsMenu));
		logger.info("Jobs menu has been clicked");
	
	}

	public void navToJobsPage() throws InterruptedException {
		
		Assert.assertTrue("Jobs header is not available", elementUtil.isElementAvailable(adminJobsHeader));
		logger.info("I am in Jobs Listing Page");
	}

	public void allElements() throws InterruptedException {
		
		driver.findElement(By.xpath(adminJobsSearchField));
		logger.info("Search field available");
		driver.findElement(By.xpath(adminJobsAdvancedSearch));
		logger.info("Advanced Search available");
		driver.findElement(By.xpath(adminAddJobButton));
		logger.info("Add job button available");
		driver.findElement(By.xpath(adminJobsPageSettings));
		logger.info("Pagination available");
		driver.findElement(By.xpath(adminJobsListTable));
		logger.info("Table available");
		driver.findElement(By.xpath(adminJobsDownloadCSV));
		logger.info("Download CSV button available");
		driver.findElement(By.xpath(adminJobsColumnFilter));
		logger.info("Column filter available");
		logger.info("All jobs listing page elements are available");
	
	}

	public void JobsPagination() throws InterruptedException {
		
//		Thread.sleep(10000);
		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(adminJobsPageCount));
		logger.info("Page counter has been clicking");
		
//		Thread.sleep(10000);
		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(adminJobsPageCount100));
		logger.info("Page counter has been clicked");
		
//		Thread.sleep(10000);
		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(adminJobsColumnFilter));
		logger.info("Column filter has been clicked");
		
		
	}

	public void JobsSort() throws InterruptedException {
		
//		Thread.sleep(10000);
		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(adminJobIDSort));
		logger.info("ID column has been sorting");
		
		Thread.sleep(10000);
		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(adminJobsRefNumSort));
		logger.info("Reference Number column has been sorting");
		
		Thread.sleep(10000);
		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(adminJobsClientSort));
		logger.info("Client column has been sorting");
		
		Thread.sleep(10000);
		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(adminJobsStateSort));
		logger.info("State column has been sorting");
		
		Thread.sleep(10000);
		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(adminSLAHoursSort));
		logger.info("SLA hours column has been sorting");
		
		Thread.sleep(10000);
		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(adminStockCountSort));
		logger.info("Stock count column has been sorting");
		

		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(adminExpectedDateSort));
		logger.info("Expected date column has been sorting");
		
		
		
	}

	
}
