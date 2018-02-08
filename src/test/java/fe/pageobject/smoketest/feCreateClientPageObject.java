package fe.pageobject.smoketest;

import tooltwist.utils.ElementUtil;
import tooltwist.utils.feObjectReference;
import tooltwist.utils.TestInit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class feCreateClientPageObject extends feObjectReference {
	
	private WebDriver driver = null;
	private ElementUtil elementUtil = null;
	private TestInit ti = null;
	private static final Logger logger = LoggerFactory.getLogger(feCreateClientPageObject.class);

	public feCreateClientPageObject(TestInit ti) {
		this.driver = ti.getDriver();
		this.elementUtil = ti.getElementUtil();
		this.ti = ti; 
	}

	public void clickAddButton() {
		
		driver.findElement(By.xpath(adminCreateClient)).click();
		logger.info("Create client has been clicked");
		
	}

	public void fillUpFields(String clientname, String code, String account) throws InterruptedException {
		
		driver.findElement(By.xpath(adminClientNameField)).sendKeys(clientname);
		logger.info("Client name has been typed");
		
		driver.findElement(By.xpath(adminClientCodeField)).sendKeys(code);
		logger.info("Client code has been typed");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(adminClientAccountField)).sendKeys(account);
		logger.info("Client account has been typed");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(adminClientAccountField)).sendKeys(account);
		logger.info("Client account has been typed");
	
		
		
	}

	public void clickSaveButton() throws InterruptedException {
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);

		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(adminClientSaveButton)).click();
		logger.info("Save button has been clicked");
		
	}

	public void successMessage() {
		
		driver.findElement(By.xpath("//*[@id='customerDetails']/div[1]")).getText();
		logger.info("Success message has been shown");
		
		
	}

}
