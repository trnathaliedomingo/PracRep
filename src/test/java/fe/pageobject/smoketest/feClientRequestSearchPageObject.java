package fe.pageobject.smoketest;

import tooltwist.utils.ElementUtil;
import tooltwist.utils.feObjectReference;
import tooltwist.utils.TestInit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class feClientRequestSearchPageObject extends feObjectReference {
	
	private WebDriver driver = null;
	private ElementUtil elementUtil = null;
	private TestInit ti = null;
	private static final Logger logger = LoggerFactory.getLogger(feClientsListingPagePageObject.class);

	public feClientRequestSearchPageObject(TestInit ti) {
	this.driver = ti.getDriver();
	this.elementUtil = ti.getElementUtil();
	this.ti = ti; 
	
	}

	public void typeReqID(String requestID) throws InterruptedException {
		
		Assert.assertTrue("Search field is not available", elementUtil.isElementAvailable(adminClientRequestSearchField));
		WebElement searchreqid = driver.findElement(By.xpath(adminClientRequestSearchField));
		searchreqid.sendKeys(ti.getClientrequestid());
		
	}

	public void result() throws InterruptedException {
		
		Assert.assertTrue("Request does not exist",elementUtil.isElementAvailable(adminClientRequestSearchResult));
		logger.info("Request search matches the result");
		
	}

}
