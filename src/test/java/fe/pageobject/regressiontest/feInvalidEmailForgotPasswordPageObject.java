package fe.pageobject.regressiontest;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tooltwist.utils.ElementUtil;
import tooltwist.utils.TestInit;
import tooltwist.utils.feObjectReference;

public class feInvalidEmailForgotPasswordPageObject extends feObjectReference {
	
	private WebDriver driver = null;
	private ElementUtil elementUtil = null;
	private TestInit ti = null;
	private static final Logger logger = LoggerFactory.getLogger(feInvalidEmailForgotPasswordPageObject.class);

	public feInvalidEmailForgotPasswordPageObject(TestInit ti) {
	this.driver = ti.getDriver();
	this.elementUtil = ti.getElementUtil();
	this.ti = ti; 
	
	}

	public void inputInvalid(String invalidmail) {
	
		
		
	}

	public void errorMessage() {
		
		
	}

}
