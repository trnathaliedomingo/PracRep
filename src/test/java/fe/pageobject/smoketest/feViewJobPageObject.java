package fe.pageobject.smoketest;

import tooltwist.utils.ElementUtil;
import tooltwist.utils.feObjectReference;
import tooltwist.utils.TestInit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class feViewJobPageObject extends feObjectReference {
	
	private WebDriver driver = null;
	private ElementUtil elementUtil = null;
	private TestInit ti = null;
	private static final Logger logger = LoggerFactory.getLogger(feViewJobPageObject.class);

	public feViewJobPageObject(TestInit ti) {
	this.driver = ti.getDriver();
	this.elementUtil = ti.getElementUtil();
	this.ti = ti; 
	
	}

	public void clickJob() throws InterruptedException {
		
		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(jobperpage));
		logger.info("Page counter has been clicked");
		
		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(jobperpage100));
		logger.info("List has been set to view 100 jobs in one page");

		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(adminSentJob));
		logger.info("Job has been clicked");

		
	}

	public void viewElements() throws InterruptedException {
		
		Assert.assertTrue("Notice panel not available",elementUtil.isElementAvailable(adminPanelNotice));
		logger.info("Notice panel is available");
		
		Assert.assertTrue("Status panel not available",elementUtil.isElementAvailable(adminPanelStatus));
		logger.info("Status panel is available");
		
		Assert.assertTrue("Instruction panel not available",elementUtil.isElementAvailable(adminPanelInstructions));
		logger.info("Instruction panel is available");	
		
	}
	
	

}
