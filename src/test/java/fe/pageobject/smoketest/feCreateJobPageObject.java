package fe.pageobject.smoketest;
import tooltwist.utils.ElementUtil;
import tooltwist.utils.feObjectReference;
import tooltwist.utils.TestInit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class feCreateJobPageObject extends feObjectReference{
	private WebDriver driver = null;
	private ElementUtil elementUtil = null;
	private TestInit ti = null;
	private static final Logger logger = LoggerFactory.getLogger(feCreateJobPageObject.class);

	public feCreateJobPageObject(TestInit ti) {
		this.driver = ti.getDriver();
		this.elementUtil = ti.getElementUtil();
		this.ti = ti; 
	}
	
	public void clickAddJobButton() throws InterruptedException {
		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(adminAddJobButton));
		logger.info("Add Job button has been clicked");	
	}

	public void setClient() {
		
		Select select = new Select(driver.findElement(By.xpath(adminClientDropdown)));
		select.selectByVisibleText("FE Water");
		
		Select sel = new Select(driver.findElement(By.xpath(adminNoticeTypeDropdown)));
		sel.selectByVisibleText("Water - Water");
		
		Select se = new Select(driver.findElement(By.xpath(adminAssigneeDropdown)));
		se.selectByVisibleText("Nathalie Domingo - tr.nathalie.domingo@gmail.com");
		
		Select s = new Select(driver.findElement(By.xpath(adminStatusDropdown)));
		s.selectByVisibleText("Submitted");
		logger.info("FE Water, Water, Nathalie Domingo, Submitted");
	}

	public void clickAdditionalInstructions() throws InterruptedException {
		

		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollBy(250,350)");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id='InstructionsTab']/div/div/div[3]/div/div/ul/li[2]/a")).click();
		logger.info("Contacts has been clicked");
		
		Select s = new Select(driver.findElement(By.xpath("//*[@id='siContactsWiz']/div/div[1]/div[4]/div/div[1]/select")));
		s.selectByVisibleText("Test Client - enotices.test@gmail.com");
		logger.info("Contact has been updated");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(adminAdditionalInstructions)).click();
		logger.info("Additional Instructions has been clicked");	
		
//		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(adminAdditionalInstructions));
//		logger.info("Additional Instructions has been clicked");	
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(adminAddComment)).click();
		logger.info("Additional Instructions button has been clicked");
//		
//		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(adminAddCommentsButton));
//		logger.info("Additional Instructions button has been clicked");
		

	}
	
	public void typeInstruction(String instruction) throws InterruptedException {
		
		Assert.assertTrue("Additional Instructions not available", elementUtil.isElementAvailable(adminAdditionalComments));
		WebElement instructions = driver.findElement(By.xpath(adminAdditionalComments));
		instructions.sendKeys("This is an automated job.");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollBy(250,350)");
        
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("javascript:window.scrollBy(250,350)");
        
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
        js3.executeScript("javascript:window.scrollBy(250,350)");
	}
	


	public void saveJob() throws InterruptedException {
		
		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(adminSaveJobButton));
		logger.info("Save button has been clicked");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath(adminPopUpSave));
		logger.info("Pop up is available");
		
		driver.findElement(By.xpath(adminEmailCustomer)).click();
		logger.info("checked");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath(adminJobPopUpButtons));
		logger.info("Buttons are available");
		
		Assert.assertTrue("Unable to click",elementUtil.isClickedElementAvailable(adminContinueButton));
		logger.info("Continue button has been clicked");
		
	}

	public void successMessage(String successmessage) throws InterruptedException {

		String price = elementUtil.getText(By.xpath(adminJobSuccess));
		Assert.assertTrue("Success! Job has been added." + price, driver.findElement(By.xpath(adminJobSuccess)).isDisplayed());
		logger.info("Success! Job has been updated.");

		
	}



}
