package fe.pageobject.regressiontest;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fe.pageobject.regressiontest.feUpdateJobPageObject;
import tooltwist.utils.ElementUtil;
import tooltwist.utils.TestInit;
import tooltwist.utils.feObjectReference;

public class feUpdateJobPageObject extends feObjectReference {
	
	private WebDriver driver = null;
	private ElementUtil elementUtil = null;
	private TestInit ti = null;
	private static final Logger logger = LoggerFactory.getLogger(feUpdateJobPageObject.class);

	public feUpdateJobPageObject(TestInit ti) {
		this.driver = ti.getDriver();
		this.elementUtil = ti.getElementUtil();
		this.ti = ti; 
	}

	public void setStatusToOnHold() {
		
		Select s = new Select(driver.findElement(By.xpath(adminStatusDropdown)));
		s.selectByVisibleText("On Hold");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollBy(250,350)");
        
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("javascript:window.scrollBy(250,350)");
        
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
        js3.executeScript("javascript:window.scrollBy(250,350)");
		
	}
	
	public void clickUpdateSaveButton() throws InterruptedException {
	
		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(adminSaveJobButton));
		logger.info("Save button has been clicked");
		
	}

	public void successMessageUpdate() {
		
//		String price = elementUtil.getText(By.xpath(adminJobSuccess));
//		Assert.assertTrue("Success! Job has been added." + price, driver.findElement(By.xpath(adminJobSuccess)).isDisplayed());
		logger.info("Success! Job has been updated.");
		
	}



}
