package fe.pageobject.smoketest;

import tooltwist.utils.feObjectReference;

import tooltwist.utils.ElementUtil;
import tooltwist.utils.TestInit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

		public class feCreateClientRequestPageObject extends feObjectReference{
		
		private WebDriver driver = null;
		private ElementUtil elementUtil = null;
		private TestInit ti = null;
		private static final Logger logger = LoggerFactory.getLogger(feCreateClientRequestPageObject.class);

		public feCreateClientRequestPageObject(TestInit ti) {
			this.driver = ti.getDriver();
			this.elementUtil = ti.getElementUtil();
			this.ti = ti; 
		}

		public void clickReqMenu() throws InterruptedException {
			
			Assert.assertTrue("Unable to click.", elementUtil.isClickedElementAvailable(adminClientRequestMenu));
			logger.info("Requests menu has been clicked");
			
		}

		public void clickAddReq() {
			
			driver.findElement(By.xpath(adminAddClientRequestButton)).click();
			logger.info("Add Request button has been clicked");
			
		}

		public void clickSaveButton() throws InterruptedException {
			
			JavascriptExecutor js = ((JavascriptExecutor) driver);

			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			
			Thread.sleep(5000);
			driver.findElement(By.xpath(adminClientRequestSaveButton)).click();
			logger.info("Save button has been clicked");
			
		}

}
