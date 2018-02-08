package fe.pageobject.smoketest;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tooltwist.utils.ElementUtil;
import tooltwist.utils.TestInit;
import tooltwist.utils.feObjectReference;

public class feClientViewRequestPageObject extends feObjectReference {
	
	private WebDriver driver = null;
	private ElementUtil elementUtil = null;
	private TestInit ti = null;
	private static final Logger logger = LoggerFactory.getLogger(feClientViewRequestPageObject.class);

	public feClientViewRequestPageObject(TestInit ti) {
	this.driver = ti.getDriver();
	this.elementUtil = ti.getElementUtil();
	this.ti = ti; 
	
	}

	public void clickRequest() throws InterruptedException {
		
		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(clientOpenRequest));
		logger.info("Request has been clicked");
		
	}

	public void requestElements() {
	
		driver.findElement(By.xpath(clientRequestDetails));
		logger.info("Request details is available");
		driver.findElement(By.xpath(clientContactPanel));
		logger.info("Contact section is available");
		driver.findElement(By.xpath(clientFormDetails));
		logger.info("Form details are available");
		driver.findElement(By.xpath("//*[@id='rightpanelmain']/div[5]/div[1]"));
		logger.info("Cancel and Save button are available");
		
		
	}

}
