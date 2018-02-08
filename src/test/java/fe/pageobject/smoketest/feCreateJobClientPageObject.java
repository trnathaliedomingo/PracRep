package fe.pageobject.smoketest;

import tooltwist.utils.ElementUtil;
import tooltwist.utils.feObjectReference;
import tooltwist.utils.TestInit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class feCreateJobClientPageObject extends feObjectReference{
	private WebDriver driver = null;
	private ElementUtil elementUtil = null;
	private TestInit ti = null;
	private static final Logger logger = LoggerFactory.getLogger(feCreateJobClientPageObject.class);

	public feCreateJobClientPageObject(TestInit ti) {
		this.driver = ti.getDriver();
		this.elementUtil = ti.getElementUtil();
		this.ti = ti; 
	}

	public void clientLogin(String clientusername, String clientpassword) throws InterruptedException {
		
		Assert.assertTrue("Username field is not available", elementUtil.isElementAvailable(adminUsernameField));
		WebElement username = driver.findElement(By.xpath(adminUsernameField));
		username.sendKeys(ti.getUsername2());
		
		Assert.assertTrue("Password field is not available", elementUtil.isElementAvailable(adminPasswordField));
		WebElement password = driver.findElement(By.xpath(adminPasswordField));
		password.sendKeys(ti.getClientpassword());
		
		
	}

	public void clickAddJobButton() {
		
		driver.findElement(By.xpath(adminAddJobClientButton)).click();
		
		
	}

	public void setNoticetypeToRates() {
		
		Select select1 = new Select(driver.findElement(By.xpath(adminJobWizNoticeTypeDropdown)));
		select1.selectByVisibleText("Water");
		logger.info("User type has been set to Water");
	
		
	}

	public void firstNextButton() throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(By.xpath(adminJobWizNext2Button)).click();
		
		
		
	}

	public void addIns() throws InterruptedException {
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(adminJobWizAddIns)).click();
		
	}

	public void commentAdd(String clientjobcomment) throws InterruptedException {
		
	
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(adminJobWizAddInsButton)).click();
		logger.info("Add icon has been clicked");
		
		driver.findElement(By.xpath(adminJobWizAddInsTextArea)).clear(); 
		driver.findElement(By.xpath(adminJobWizAddInsTextArea)).sendKeys(clientjobcomment);
		logger.info("Comment has been added");
		
		
	}

	public void secondNextButton() throws InterruptedException {
		
		Thread.sleep(2000);
	
		driver.findElement(By.xpath(adminJobWizNext3Button)).click();
		
	}

	public void submitjob() throws InterruptedException {
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(adminJobWizSubmitJobButton)).click();
		
		
	
	}

	public void successfull() {
	
		logger.info("Job has been successfully submitted");
	}

}
