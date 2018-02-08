package fe.pageobject.smoketest;
import tooltwist.utils.ElementUtil;
import tooltwist.utils.feObjectReference;
import tooltwist.utils.TestInit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class feDeleteRequestPageObject extends feObjectReference {
	
	private WebDriver driver = null;
	private ElementUtil elementUtil = null;
	private TestInit ti = null;
	private static final Logger logger = LoggerFactory.getLogger(feDeleteRequestPageObject.class);

	public feDeleteRequestPageObject(TestInit ti) {
		this.driver = ti.getDriver();
		this.elementUtil = ti.getElementUtil();
		this.ti = ti; 
	}

	public void clickrequest() {
		
		driver.findElement(By.xpath(adminRequestToDelete)).click();
		
	}

	public void clickDeleteButton() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollBy(250,350)");
        
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("javascript:window.scrollBy(250,350)");
		
		driver.findElement(By.xpath(adminDeleteRequestButton)).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath(deleteRequestOK)).click();
		
	}

	public void successMessage() {
		
		logger.info("Request has successfully been deleted.");
		
	}

}
