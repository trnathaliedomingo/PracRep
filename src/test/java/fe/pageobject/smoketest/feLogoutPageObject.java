package fe.pageobject.smoketest;

import tooltwist.utils.ElementUtil;
import tooltwist.utils.feObjectReference;
import tooltwist.utils.TestInit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class feLogoutPageObject extends feObjectReference {
	
	private WebDriver driver = null;
	private ElementUtil elementUtil = null;
	private TestInit ti = null;
	private static final Logger logger = LoggerFactory.getLogger(feLogoutPageObject.class);

	public feLogoutPageObject(TestInit ti) {
		this.driver = ti.getDriver();
		this.elementUtil = ti.getElementUtil();
		this.ti = ti; 
	}

	public void clickProfIcon() throws InterruptedException {
		
		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(adminProfileIcon));
		logger.info("Profile icon button has been clicking");
			
	}

	public void clickLogout() throws InterruptedException {
		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(adminLogoutButton));
		logger.info("Log out button has been clicking");
	}

	public void goToLoginPage(String url) {
		
		String redirectTo = url.replace("{loginURL}", ti.getLoginURL());
		driver.navigate().to(redirectTo);
		logger.info("Redirected to " + redirectTo);
		
	}

	public void SuccessLogout() {
		
		logger.info("Successfully logged out!");
		
	}
	
	

}
