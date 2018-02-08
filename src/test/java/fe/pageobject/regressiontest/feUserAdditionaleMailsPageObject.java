package fe.pageobject.regressiontest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tooltwist.utils.ElementUtil;
import tooltwist.utils.TestInit;
import tooltwist.utils.feObjectReference;

public class feUserAdditionaleMailsPageObject extends feObjectReference {
	
	private WebDriver driver = null;
	private ElementUtil elementUtil = null;
	private TestInit ti = null;
	private static final Logger logger = LoggerFactory.getLogger(feUserAdditionaleMailsPageObject.class);

	public feUserAdditionaleMailsPageObject(TestInit ti) {
	this.driver = ti.getDriver();
	this.elementUtil = ti.getElementUtil();
	this.ti = ti; 
	
	}

	public void clickTab() {
		
		driver.findElement(By.xpath(userEmailsTab)).click();
		
	}

	public void navPage() {
	
		
	}

	public void email() {
		
		driver.findElement(By.xpath(userEmailField)).sendKeys("automated.email@test.com");
		driver.findElement(By.xpath(userEmailAddButton)).click();
		logger.info("All emails has been shown");
		
	}


}
