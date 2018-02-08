package fe.pageobject.smoketest;
import tooltwist.utils.ElementUtil;
import tooltwist.utils.feObjectReference;
import tooltwist.utils.TestInit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class feUsersListingPagePageObject extends feObjectReference{
	
	private WebDriver driver = null;
	private ElementUtil elementUtil = null;
	private TestInit ti = null;
	private static final Logger logger = LoggerFactory.getLogger(feUsersListingPagePageObject.class);

	public feUsersListingPagePageObject(TestInit ti) {
	this.driver = ti.getDriver();
	this.elementUtil = ti.getElementUtil();
	this.ti = ti; 
	
	}

	public void clickUsersMenu() throws InterruptedException{
		
//		Thread.sleep(10000);
		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(adminUsersListMenu));
		logger.info("Users menu has been clicked");
		
	}

	public void navToUsersListingPage() throws InterruptedException{

		Assert.assertTrue("Users list page header is not available",elementUtil.isElementAvailable(adminUsersListPageHeader));
		logger.info("I am in Users Listing Page");
		
	}

	public void usersListElements() throws InterruptedException{
		
		driver.findElement(By.xpath(adminUsersListSearchField));
		logger.info("Search field is available");
		driver.findElement(By.xpath(adminUsersListAdvancedSearchOption));
		logger.info("Advanced Search Option is available");
		driver.findElement(By.xpath(adminAddUserButton));
		logger.info("Add client button is available");
		driver.findElement(By.xpath(adminUsersListPageSettings));
		logger.info("Pagination is available");
		driver.findElement(By.xpath(adminUsersListTable));
		logger.info("Client list table is available");
		driver.findElement(By.xpath(adminUsersListDownloadCSV));
		logger.info("Downalod CSV icon is available");
		logger.info("All Users Listing Page Elements are available");
		
	}

	public void usersListPagination() throws InterruptedException{
		
//		Thread.sleep(10000);
		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(adminUsersListPageCounter));
		logger.info("Page counter has been clicking");
		
		Thread.sleep(10000);
		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(adminUsersListPageCounter20));
		logger.info("Page counter has been clicked");
		
		driver.findElement(By.xpath("//*[@id='loader']/div/div/div[2]/h4"));
		logger.info("Page has been loaded");
//		
//		Thread.sleep(10000);
//		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(adminUsersListNextPage));
//		logger.info("Next page has been clicking");
//		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(adminUsersListNextPage));
//		logger.info("Next page has been clicking");
//		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(adminUsersListNextPage));
//		logger.info("Next page has been clicking");
		
	}

	public void usersListSort() throws InterruptedException{
		
		Thread.sleep(10000);
		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(adminEmailColumnSort));
		logger.info("Email column has been sorting");
		
		driver.findElement(By.xpath("//*[@id='loader']/div/div/div[2]/h4"));
		logger.info("Page has been loaded");
		
		Thread.sleep(10000);
		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(adminFirstColumnSort));
		logger.info("First name column has been sorting");
		
		driver.findElement(By.xpath("//*[@id='loader']/div/div/div[2]/h4"));
		logger.info("Page has been loaded");
		
		Thread.sleep(10000);
		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(adminLastColumnSort));
		logger.info("Last name column has been sorting");
		
		driver.findElement(By.xpath("//*[@id='loader']/div/div/div[2]/h4"));
		logger.info("Page has been loaded");
		
		Thread.sleep(10000);
		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(adminUserTypeColumnSort));
		logger.info("User Type column has been sorting");
		
		driver.findElement(By.xpath("//*[@id='loader']/div/div/div[2]/h4"));
		logger.info("Page has been loaded");
		
		Thread.sleep(10000);
		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(adminClientUserColumnSort));
		logger.info("Users column has been sorting");
		
		driver.findElement(By.xpath("//*[@id='loader']/div/div/div[2]/h4"));
		logger.info("Page has been loaded");
		
		Thread.sleep(10000);
		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(adminStatusColumnSort));
		logger.info("Status column has been sorting");
		
		driver.findElement(By.xpath("//*[@id='loader']/div/div/div[2]/h4"));
		logger.info("Page has been loaded");
		
		Thread.sleep(10000);
		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(adminCreatedColumnSort));
		logger.info("Created date column has been sorting");
		
		driver.findElement(By.xpath("//*[@id='loader']/div/div/div[2]/h4"));
		logger.info("Page has been loaded");
		
		Thread.sleep(10000);
		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(adminLastAccessColumnSort));
		logger.info("Last Access Date column has been sorting");
		
		driver.findElement(By.xpath("//*[@id='loader']/div/div/div[2]/h4"));
		logger.info("Page has been loaded");
		
		logger.info("Users listing page's elements are shown and columns are sortable");

	}

}
