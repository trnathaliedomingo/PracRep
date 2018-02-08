package fe.pageobject.regressiontest;

import tooltwist.utils.ElementUtil;
import tooltwist.utils.feObjectReference;
import tooltwist.utils.TestInit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class feRequestsListingPagePageObject extends feObjectReference {
	private WebDriver driver = null;
	private ElementUtil elementUtil = null;
	private TestInit ti = null;
	private static final Logger logger = LoggerFactory.getLogger(feRequestsListingPagePageObject.class);

	public feRequestsListingPagePageObject(TestInit ti) {
	this.driver = ti.getDriver();
	this.elementUtil = ti.getElementUtil();
	this.ti = ti; 	
	
	}

	public void clickRequests() throws InterruptedException {
		
		Assert.assertTrue("Unable to click.", elementUtil.isClickedElementAvailable(adminRequestsMenu));
		logger.info("Requests menu has been clicked");
		
	}

	public void navToRequestsListPage() throws InterruptedException {
		
		Assert.assertTrue("Header unavailable", elementUtil.isElementAvailable(adminRequestsHeader));
		logger.info("I am now in Requests listing page");
		
	}

	public void allElements() {
		
		driver.findElement(By.xpath(adminRequestsSearch));
		driver.findElement(By.xpath(adminRequestsAdvancedSearch));
		driver.findElement(By.xpath(adminRequestsAddButton));
		driver.findElement(By.xpath(adminRequestsColumnFilter));
		driver.findElement(By.xpath(adminRequestsTabs));
		driver.findElement(By.xpath(adminRequestsPageSettings));
		driver.findElement(By.xpath(adminRequestsDownloadCSV));
		driver.findElement(By.xpath(adminRequestsListTable));
		logger.info("All requests page elements are available");
		
	}

	public void requestsPagination() throws InterruptedException {
		
		Thread.sleep(1000);
		Assert.assertTrue("Unable to click", elementUtil.isClickedElementAvailable(adminRequestsPageCount));
		
		Thread.sleep(1000);
		Assert.assertTrue("Unable to click", elementUtil.isClickedElementAvailable(adminRequestsPageCount100));
		
	}

	public void requestsSort() throws InterruptedException {
		
		Thread.sleep(1000);
		Assert.assertTrue("Unable to click", elementUtil.isClickedElementAvailable(adminRequestsIDSort));
		logger.info("ID column is sorting");
		Thread.sleep(1000);
		Assert.assertTrue("Unable to click", elementUtil.isClickedElementAvailable(adminRequestsCategorySort));
		logger.info("Category column is sorting");
		Thread.sleep(1000);
		Assert.assertTrue("Unable to click", elementUtil.isClickedElementAvailable(adminRequestsTypeSort));
		logger.info("Type column is sorting");
		Thread.sleep(1000);
		Assert.assertTrue("Unable to click", elementUtil.isClickedElementAvailable(adminRequestsStatusSort));
		logger.info("Status column is sorting");
		Thread.sleep(1000);
		Assert.assertTrue("Unable to click", elementUtil.isClickedElementAvailable(adminRequestsPrioritySort));
		logger.info("Prioritty column is sorting");
		Thread.sleep(1000);
		Assert.assertTrue("Unable to click", elementUtil.isClickedElementAvailable(adminRequestsDueSort));
		logger.info("Due date column is sorting");
		Thread.sleep(1000);
		Assert.assertTrue("Unable to click", elementUtil.isClickedElementAvailable(adminRequestsDetailsSort));
		logger.info("Details column is sorting");
		Thread.sleep(1000);
		Assert.assertTrue("Unable to click", elementUtil.isClickedElementAvailable(adminRequestsAssigneeSort));
		logger.info("Assignee column is sorting");
		Thread.sleep(1000);
		Assert.assertTrue("Unable to click", elementUtil.isClickedElementAvailable(adminRequestsEmailSort));
		logger.info("Email column is sorting");
		Thread.sleep(1000);
		Assert.assertTrue("Unable to click", elementUtil.isClickedElementAvailable(adminRequestsOrgSort));
		logger.info("Organisation column is sorting");
		Thread.sleep(1000);
		Assert.assertTrue("Unable to click", elementUtil.isClickedElementAvailable(adminRequestsCreatedSort));
		logger.info("Created date column is sorting");
		
		logger.info("All columns are sorting");
		
	}
	

}
