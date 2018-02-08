package fe.pageobject.regressiontest;

import tooltwist.utils.ElementUtil;
import tooltwist.utils.feObjectReference;
import tooltwist.utils.TestInit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class feDashboardPageObject extends feObjectReference {
	
	private WebDriver driver = null;
	private ElementUtil elementUtil = null;
	private TestInit ti = null;
	private static final Logger logger = LoggerFactory.getLogger(feDashboardPageObject.class);

	public feDashboardPageObject(TestInit ti) {
	this.driver = ti.getDriver();
	this.elementUtil = ti.getElementUtil();
	this.ti = ti; 
	
	}

	public void clickQuarterSelectors() throws InterruptedException {
		
		Thread.sleep(10000);
		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(adminQuarterSelectLeft));
		logger.info("Quarter selector left has been clicking");
	
		Thread.sleep(10000);
		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(adminQuarterSelectRight));
		logger.info("Quarter selector right has been clicking");
		
	}

	public void viewPreviousNext() throws InterruptedException {
		
		Assert.assertTrue("I have viewed previous and current quarter",elementUtil.isElementAvailable(adminQuarterName));
		logger.info("Previous and current quarter has been viewed");
		
	}

	public void dashboardElements() throws InterruptedException {
		
		Thread.sleep(10000);
		driver.findElement(By.xpath(adminJobsStatusPanel));
		logger.info("Job status panel available");
		driver.findElement(By.xpath(adminJobsSummaryPanel));
		logger.info("Job summary panel available");
		driver.findElement(By.xpath(adminSLAPanel));
		logger.info("SLA report panel available");
		
		Thread.sleep(10000);
		logger.info("All elements are available");
		
	}
}
