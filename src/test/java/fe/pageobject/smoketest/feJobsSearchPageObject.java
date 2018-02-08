package fe.pageobject.smoketest;

import tooltwist.utils.feObjectReference;

import tooltwist.utils.ElementUtil;
import tooltwist.utils.TestInit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class feJobsSearchPageObject extends feObjectReference {
	
	private WebDriver driver = null;
	private ElementUtil elementUtil = null;
	private TestInit ti = null;
	private static final Logger logger = LoggerFactory.getLogger(feJobsSearchPageObject.class);

	public feJobsSearchPageObject(TestInit ti) {
	this.driver = ti.getDriver();
	this.elementUtil = ti.getElementUtil();
	this.ti = ti; 
	
	}

	public void searchJob(String staffJobid) throws InterruptedException {		
		Assert.assertTrue("Search field is not available", elementUtil.isElementAvailable(staffJobsSearchId));
		WebElement addJobid = driver.findElement(By.xpath(staffJobsSearchId));
		addJobid.sendKeys(ti.getStaffjobid());
		
	}

	public void resultList() throws InterruptedException {
		Assert.assertTrue("Job id is available",elementUtil.isElementAvailable(staffJobId));
		logger.info("I have the correct result");
	}
	
	
	

}
