package fe.pageobject.regressiontest;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tooltwist.utils.ElementUtil;
import tooltwist.utils.TestInit;
import tooltwist.utils.feObjectReference;

public class feInvalidLoginPageObject extends feObjectReference{
	
	private WebDriver driver = null;
	private ElementUtil elementUtil = null;
	private TestInit ti = null;
	private static final Logger logger = LoggerFactory.getLogger(feInvalidLoginPageObject.class);

	public feInvalidLoginPageObject(TestInit ti) {
	this.driver = ti.getDriver();
	this.elementUtil = ti.getElementUtil();
	this.ti = ti; 
	
	}

	public void invalidCreds(String invstaffusername, String staffpassword) {
		
		
	}

	public void errorMessage(String errormessage) {
		
		
	}

	public void notLogin() {
		logger.info("I am not able to sign in");
		
	}

}
