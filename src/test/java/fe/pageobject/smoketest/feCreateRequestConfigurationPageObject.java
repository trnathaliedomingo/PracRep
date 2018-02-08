package fe.pageobject.smoketest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tooltwist.utils.ElementUtil;
import tooltwist.utils.TestInit;
import tooltwist.utils.feObjectReference;
import org.openqa.selenium.support.ui.Select;

public class feCreateRequestConfigurationPageObject extends feObjectReference {
	
	private WebDriver driver = null;
	private ElementUtil elementUtil = null;
	private TestInit ti = null;
	private static final Logger logger = LoggerFactory.getLogger(feCreateRequestConfigurationPageObject.class);

	public feCreateRequestConfigurationPageObject(TestInit ti) {
	this.driver = ti.getDriver();
	this.elementUtil = ti.getElementUtil();
	this.ti = ti; 
	
	}

	public void clickAddConfigbutton() {
		
		driver.findElement(By.xpath(adminReqConfigAddReqButton)).click();
		logger.info("Add button has been clicked");
		
	}

	public void fillUpFields(String category, String type) {
		
		driver.findElement(By.xpath(adminCategoryField)).sendKeys(category);
		driver.findElement(By.xpath(adminTypeField)).sendKeys(type);
		logger.info("Fields has been filled up");
		
		Select select1 = new Select(driver.findElement(By.xpath(adminVisibleDropdown)));
		select1.selectByVisibleText("Staff, Client");
	
	}

	public void selectfromAdd() throws InterruptedException {
			
		Select select1 = new Select(driver.findElement(By.xpath(adminAddDropdown)));
		
		Thread.sleep(5000);	
		select1.selectByVisibleText("Text Input");
				
		Thread.sleep(5000);
		Select select2 = new Select(driver.findElement(By.xpath(adminAddDropdown)));
		
		Thread.sleep(5000);
		select2.selectByVisibleText("Text Area");

	}

	public void fillUpAddedFields() throws InterruptedException {		
		
		Thread.sleep(3000);		
		driver.findElement(By.xpath(adminTextInputField1)).sendKeys("Subject");
		
		Thread.sleep(3000);	
		driver.findElement(By.xpath(adminTextField)).sendKeys("Description");

		
	}

	public void clickSaveButton() throws InterruptedException {
		
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
        js3.executeScript("javascript:window.scrollBy(250,350)");
        
        JavascriptExecutor js4 = (JavascriptExecutor) driver;
        js4.executeScript("javascript:window.scrollBy(250,350)");
        
//		Thread.sleep(5000);
		driver.findElement(By.xpath(adminSaveReqConfigButton)).click();
	}

	public void SuccessMessage() {
	
		driver.findElement(By.xpath(adminSuccessMessage));
		logger.info("Success message has appeared.");
		
	}
	

}
