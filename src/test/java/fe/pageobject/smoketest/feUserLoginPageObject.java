package fe.pageobject.smoketest;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tooltwist.utils.ElementUtil;
import tooltwist.utils.TestInit;
import tooltwist.utils.feObjectReference;

public class feUserLoginPageObject extends feObjectReference {
	
	private WebDriver driver = null;
	private ElementUtil elementUtil = null;
	private TestInit ti = null;
	private static final Logger logger = LoggerFactory.getLogger(feUserLoginPageObject.class);

	public feUserLoginPageObject(TestInit ti) {
	this.driver = ti.getDriver();
	this.elementUtil = ti.getElementUtil();
	this.ti = ti; 
	
	}

	public void userLogin(String email, String password) throws InterruptedException {
		
		Assert.assertTrue("User email field is not available", elementUtil.isElementAvailable(userEmailField));
		WebElement email1 = driver.findElement(By.xpath(userEmailField));
		email1.sendKeys(ti.getUseremail());
		
		Assert.assertTrue("Password field is not available", elementUtil.isElementAvailable(userPasswordField));
		WebElement password1 = driver.findElement(By.xpath(userPasswordField));
		password1.sendKeys(ti.getUserpassword());
	}

	public void clickLogInButton() {
		
		driver.findElement(By.xpath(userLoginButton)).click();
		logger.info("Log in button has been clicked");
		
	}

	public void dashboardPage() {
		
		driver.findElement(By.xpath(userDashboardElements));
		logger.info("All user dashboard elements are available");
		
	}

}
