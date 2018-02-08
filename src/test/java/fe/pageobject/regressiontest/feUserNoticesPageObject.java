package fe.pageobject.regressiontest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tooltwist.utils.ElementUtil;
import tooltwist.utils.TestInit;
import tooltwist.utils.feObjectReference;

public class feUserNoticesPageObject extends feObjectReference {
	
	private WebDriver driver = null;
	private ElementUtil elementUtil = null;
	private TestInit ti = null;
	private static final Logger logger = LoggerFactory.getLogger(feUserNoticesPageObject.class);

	public feUserNoticesPageObject(TestInit ti) {
	this.driver = ti.getDriver();
	this.elementUtil = ti.getElementUtil();
	this.ti = ti; 
	
	}

	public void clickNoticesMenu() {
		
		driver.findElement(By.xpath(userNotices)).click();
		
	}

	public void allElements() {
	
		driver.findElement(By.xpath(userNoticesAdvancedSearch));
		driver.findElement(By.xpath(userNoticesDownloadPDF)).click();
		driver.findElement(By.xpath(userNoticesTable));
		logger.info("Table has been shown and all its elements");
		
	}

}
