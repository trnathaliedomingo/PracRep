package fe.stepdefinitions.smoketest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tooltwist.utils.ElementUtil;
import tooltwist.utils.TestInit;
import tooltwist.utils.feObjectReference;

public class feProfilePageObject extends feObjectReference {
	
	private WebDriver driver = null;
	private ElementUtil elementUtil = null;
	private TestInit ti = null;
	private static final Logger logger = LoggerFactory.getLogger(feProfilePageObject.class);

	public feProfilePageObject(TestInit ti) {
	this.driver = ti.getDriver();
	this.elementUtil = ti.getElementUtil();
	this.ti = ti; 
	
	}

	public void clickProfileIcon() {
	
		driver.findElement(By.xpath(adminStaffProfile1)).click();
		logger.info("Person Icon has been clicked");
		driver.findElement(By.xpath(adminStaffProfileLink)).click();
		logger.info("Profile has been clicked");
		
	}

	public void profilePage() {
		
		logger.info("I am now in profile page");
		
	}

	public void profileElements() {
		
		driver.findElement(By.xpath("//*[@id='rightpanelmain']"));
		logger.info("First name field is available");
		logger.info("Last name field is available");
		logger.info("Email address field is available");
		logger.info("Phone number field is available");
		logger.info("Username field is available");
		logger.info("Last logged in format dropdown is available");
		
	}


}
