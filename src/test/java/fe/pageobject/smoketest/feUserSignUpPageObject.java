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

public class feUserSignUpPageObject extends feObjectReference {
	
	private WebDriver driver = null;
	private ElementUtil elementUtil = null;
	private TestInit ti = null;
	private static final Logger logger = LoggerFactory.getLogger(feUserSignUpPageObject.class);

	public feUserSignUpPageObject(TestInit ti) {
	this.driver = ti.getDriver();
	this.elementUtil = ti.getElementUtil();
	this.ti = ti; 
	
	}

	public void logIn(String url) {
		
		String redirectTo = url.replace("{userURL}", ti.getUserURL());
		driver.navigate().to(redirectTo);
		logger.info("Redirected to " + redirectTo);
		
	}

	public void clickSignupTab() {
		
		driver.findElement(By.xpath(userSignUpTab)).click();
		logger.info("Sign Up Tab has been clicked");
		
	}

	public void inputEmail(String email) throws InterruptedException {
		
		Assert.assertTrue("Email field is not available", elementUtil.isElementAvailable(userSignUpEmailField));
		WebElement aemail = driver.findElement(By.xpath(userSignUpEmailField));
		aemail.sendKeys(ti.getUserEmail());
		
		
	}

	public void clickSignUpButton() {
		
		driver.findElement(By.xpath(userSignUpButton)).click();
		logger.info("Sign up button has been clicked");
		
	}

	public void navToSuccess() {
	
		driver.findElement(By.xpath(userSuccessSignUp));
		logger.info("I am directed in success page");
		
	}

	public void signUpEmail() {
		
		logger.info("Email is to be checked");
	}


}
