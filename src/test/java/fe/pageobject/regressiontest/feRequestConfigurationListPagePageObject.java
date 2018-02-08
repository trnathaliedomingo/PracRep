package fe.pageobject.regressiontest;
import tooltwist.utils.ElementUtil;
import tooltwist.utils.feObjectReference;
import tooltwist.utils.TestInit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class feRequestConfigurationListPagePageObject extends feObjectReference {

	private WebDriver driver = null;
	private ElementUtil elementUtil = null;
	private TestInit ti = null;
	private static final Logger logger = LoggerFactory.getLogger(feRequestConfigurationListPagePageObject.class);

	public feRequestConfigurationListPagePageObject(TestInit ti) {
	this.driver = ti.getDriver();
	this.elementUtil = ti.getElementUtil();
	this.ti = ti; 
	
	}

	public void clickConfig() throws InterruptedException{
		
		Assert.assertTrue("Unable to click", elementUtil.isClickedElementAvailable(adminReqConfigMenu));
		logger.info("Configurations menu has been clicked");

		
	}

	public void navToConfig() throws InterruptedException {
		
		Assert.assertTrue("Config header not available", elementUtil.isElementAvailable(adminReqConfigHeader));
		logger.info("I am now in configurations listing page");
	
	}

	public void configElements() throws InterruptedException{
		
		driver.findElement(By.xpath(adminReqConfigSearchField));
		logger.info("Search field is available");
		driver.findElement(By.xpath(adminReqConfigAdvancedSearchOption));
		logger.info("Advanced search option is available is available");
		driver.findElement(By.xpath(adminReqConfigColumnFilter));
		logger.info("Column filter is available");
		driver.findElement(By.xpath(adminReqConfigAddReqButton));
		logger.info("Add button is available");
		driver.findElement(By.xpath(adminReqConfigPageSettings));
		logger.info("Page settings are available");
		driver.findElement(By.xpath(adminReqConfigListTable));
		logger.info("Table list is available");
		driver.findElement(By.xpath(adminReqConfigDownloadCSV));
		logger.info("Download CSV is available");
		logger.info("All elements are available");

		
	}

	public void configPagination() throws InterruptedException {
		

		Thread.sleep(10000);
		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(adminReqConfigPageCount));
		logger.info("Page counter has been clicking");
		
		Thread.sleep(10000);
		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(adminReqConfigPageCount50));
		logger.info("Page counter has been clicked");
		
		Thread.sleep(10000);
		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(adminReqConfigColumnFilter));
		logger.info("Column filter has been clicked");
		
//		Thread.sleep(10000);
//		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(adminReqConfigPageNext));
////		logger.info("Next page has been clicking");

		
	}

	public void sortConfig() throws InterruptedException {

		Thread.sleep(10000);
		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(adminReqConfigIDSort));
		logger.info("ID column has been sorting");
		
		Thread.sleep(10000);
		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(adminReqConfigOrgSort));
		logger.info("Organisation column has been sorting");
		
		Thread.sleep(10000);
		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(adminReqConfigCatSort));
		logger.info("Category column has been sorting");
		
		Thread.sleep(10000);
		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(adminReqConfigTypeSort));
		logger.info("Type column has been sorting");
		
		Thread.sleep(10000);
		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(adminReqConfigRequestSort));
		logger.info("Request column has been sorting");
		
		Thread.sleep(10000);
		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(adminReqConfigStatusSort));
		logger.info("Status column has been sorting");
		
		Thread.sleep(10000);
		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(adminReqConfigVisibleSort));
		logger.info("Visible to column has been sorting");
		
	}

	
}
