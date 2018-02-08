package fe.pageobject.smoketest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tooltwist.utils.ElementUtil;
import tooltwist.utils.TestInit;
import tooltwist.utils.feObjectReference;

public class feUserSubmitRequestPageObject extends feObjectReference{
	
	private WebDriver driver = null;
	private ElementUtil elementUtil = null;
	private TestInit ti = null;
	private static final Logger logger = LoggerFactory.getLogger(feUserSubmitRequestPageObject.class);

	public feUserSubmitRequestPageObject(TestInit ti) {
	this.driver = ti.getDriver();
	this.elementUtil = ti.getElementUtil();
	this.ti = ti; 
	
	}

	public void clickRequestMenu() {
		
		driver.findElement(By.xpath(requestandforms)).click();
		logger.info("Request and Forms has been clicked");
		
	}

	public void FEQARequest() {
	
		driver.findElement(By.xpath(FEQArequest)).click();
		logger.info("FE QA test has been clicked");	
		
	}

	public void fillUpFields(String subject, String description) {
		
		driver.findElement(By.xpath(requestSubjectField)).clear();
		driver.findElement(By.xpath(requestSubjectField)).sendKeys(subject);
		
		
		driver.findElement(By.xpath(requestDescriptionField)).clear();
		driver.findElement(By.xpath(requestDescriptionField)).sendKeys(description);
				
	}

	public void clickSubmitButton() {
		
		driver.findElement(By.xpath(requestSubmitButton)).click();
		logger.info("Submit button has been clicked");
		
	}

	public void historyPage() {

		logger.info("I am navigated to request history page");

		
	}

	public void requestList() {
		
		driver.findElement(By.xpath(requestSubmitted));
		logger.info("Request has been added");
		
	}

}
