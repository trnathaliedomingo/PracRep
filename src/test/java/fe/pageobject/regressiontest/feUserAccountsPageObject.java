package fe.pageobject.regressiontest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tooltwist.utils.ElementUtil;
import tooltwist.utils.TestInit;
import tooltwist.utils.feObjectReference;

public class feUserAccountsPageObject extends feObjectReference {
	
	private WebDriver driver = null;
	private ElementUtil elementUtil = null;
	private TestInit ti = null;
	private static final Logger logger = LoggerFactory.getLogger(feUserAccountsPageObject.class);

	public feUserAccountsPageObject(TestInit ti) {
	this.driver = ti.getDriver();
	this.elementUtil = ti.getElementUtil();
	this.ti = ti; 
	
	}

	public void userProfile() {
	
		logger.info("I am in profile page");
		
	}

	public void clickAccountsTab() {
		
		driver.findElement(By.xpath(userAccounts)).click();
		logger.info("accounts tab has been clicked");
		
	}

	public void accountsPage() {
		
		driver.findElement(By.xpath("//*[@id='accountDetails']/div[1]/input")).sendKeys("czLrTzEc");
		driver.findElement(By.xpath("//*[@id='accountDetails']/div[2]/input")).click();
		logger.info("account has been added");
		
	}

	public void AccountsElements() {
		
		driver.findElement(By.xpath(userTable));
		logger.info("All accounts has been showing");
	}

}
