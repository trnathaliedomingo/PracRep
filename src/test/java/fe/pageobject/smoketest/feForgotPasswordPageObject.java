package fe.pageobject.smoketest;

import tooltwist.utils.ElementUtil;
import tooltwist.utils.feObjectReference;
import tooltwist.utils.TestInit;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class feForgotPasswordPageObject extends feObjectReference{
	private WebDriver driver = null;
	private ElementUtil elementUtil = null;
	private TestInit ti = null;
	private static final Logger logger = LoggerFactory.getLogger(feLoginPageObject.class);

	public feForgotPasswordPageObject(TestInit ti) {
		this.driver = ti.getDriver();
		this.elementUtil = ti.getElementUtil();
		this.ti = ti; 
	}

	public void clickPasswordLink() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(adminForgotPasswordLink));
		logger.info("Forgot password link has been clicked");
		
	}

	public void passwordResetPage() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue("Forgot password text is not available",elementUtil.isElementAvailable(adminResetPage));
		logger.info("I am in forgot password page");
	}

	public void enterEmail(String email) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Assert.assertTrue("Email field is not available", elementUtil.isElementAvailable(adminForgotEmailField));
		WebElement emailAd = driver.findElement(By.xpath(adminForgotEmailField));
		emailAd.sendKeys(ti.getStaffemail());
		
	}

	public void clickSenRequestButton() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(adminSendRequestButton));
		logger.info("Send Request button has been clicked");
		
	}

	public void requestSubmissionPage() throws InterruptedException {
		Thread.sleep(1000);
		logger.info("I am in request submission page");

		
	}

	public void resetSuccessful() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue("Success message is not available",elementUtil.isElementAvailable(adminFPSuccess));
		logger.info("Success message is available");
		
	}

	public void loginButton() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(adminBackToLoginButton));
		logger.info("Send Request button has been clicked");
		
	}

	public void LoginPage() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue("Admin Logo is not available",elementUtil.isElementAvailable(adminLoginLogo));
		logger.info("I am now back to login page");
		
	}
}
