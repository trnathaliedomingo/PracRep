package fe.pageobject.smoketest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tooltwist.utils.ElementUtil;
import tooltwist.utils.TestInit;
import tooltwist.utils.feObjectReference;

public class feUserProfilePageObject extends feObjectReference {
	
	private WebDriver driver = null;
	private ElementUtil elementUtil = null;
	private TestInit ti = null;
	private static final Logger logger = LoggerFactory.getLogger(feUserProfilePageObject.class);

	public feUserProfilePageObject(TestInit ti) {
	this.driver = ti.getDriver();
	this.elementUtil = ti.getElementUtil();
	this.ti = ti; 
	
	}

	public void clickProfile() {
		
		driver.findElement(By.xpath(userProfile)).click();
		logger.info("Profile has been clicked");
		
	}

	public void profilePage() {
		
		driver.findElement(By.xpath(userProfileButtons));
		logger.info("Buttons are available");
		
	}

	public void profileElements() {
		
		driver.findElement(By.xpath(userElements));
		logger.info("Profile tab, accounts, emails are available");

	}

}
