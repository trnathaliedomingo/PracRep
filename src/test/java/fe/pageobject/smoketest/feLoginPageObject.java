package fe.pageobject.smoketest;
import tooltwist.utils.ElementUtil;
import tooltwist.utils.feObjectReference;
import tooltwist.utils.TestInit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class feLoginPageObject extends feObjectReference{
	private WebDriver driver = null;
	private ElementUtil elementUtil = null;
	private TestInit ti = null;
	private static final Logger logger = LoggerFactory.getLogger(feLoginPageObject.class);

	public feLoginPageObject(TestInit ti) {
		this.driver = ti.getDriver();
		this.elementUtil = ti.getElementUtil();
		this.ti = ti; 
	}

	public void goToLoginPage(String url) {
		
		String redirectTo = url.replace("{loginURL}", ti.getLoginURL());
		driver.navigate().to(redirectTo);
		logger.info("Redirected to " + redirectTo);
		
	}

	public void inputCredentials(String staffUsername, String staffPassword) throws InterruptedException {
		
		Assert.assertTrue("Username field is not available", elementUtil.isElementAvailable(adminUsernameField));
		WebElement usernameAdd = driver.findElement(By.xpath(adminUsernameField));
		usernameAdd.sendKeys(ti.getUsername());
			
		Assert.assertTrue("Password field is not available", elementUtil.isElementAvailable(adminPasswordField));
		WebElement passwordAdd = driver.findElement(By.xpath(adminPasswordField));
		passwordAdd.sendKeys(ti.getStaffpassword());
		
	}

	public void clickLogMeInButton() throws InterruptedException {
	
		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(adminLoginButton));
		logger.info("Log me in button has been clicking");

	}
	
	public void dashboardPage() throws InterruptedException {
		 
		Assert.assertTrue("FE logo is not available",elementUtil.isElementAvailable(adminFELogo));
		logger.info("FE logo is available");
		logger.info("I am now in dashboard page");
	
	}
	
	public void successfulLogin() {
		
		logger.info("Successful login!");
		
	}



}
