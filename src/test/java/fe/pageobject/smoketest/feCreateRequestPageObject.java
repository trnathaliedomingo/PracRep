package fe.pageobject.smoketest;
import tooltwist.utils.feObjectReference;

import tooltwist.utils.ElementUtil;
import tooltwist.utils.TestInit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class feCreateRequestPageObject extends feObjectReference{
	
	private WebDriver driver = null;
	private ElementUtil elementUtil = null;
	private TestInit ti = null;
	private static final Logger logger = LoggerFactory.getLogger(feCreateRequestPageObject.class);

	public feCreateRequestPageObject(TestInit ti) {
		this.driver = ti.getDriver();
		this.elementUtil = ti.getElementUtil();
		this.ti = ti; 
	}

	public void clickAddRequestButton() {
		driver.findElement(By.xpath(adminAddRequestButton)).click();
	}

	public void setAssignee() {
		
		Select select = new Select(driver.findElement(By.xpath(adminRequestAssigneeDropdown)));
		select.selectByVisibleText("Nathalie Domingo - tr.nathalie.domingo@gmail.com");
		
	}

	public void fillInFields(String subject, String description) {
		
		driver.findElement(By.xpath(adminRequestSubjectField)).clear(); 
		driver.findElement(By.xpath(adminRequestSubjectField)).sendKeys(subject);
		logger.info("Subject has been typed");
		
		driver.findElement(By.xpath(adminRequestDescriptionField)).clear(); 
		driver.findElement(By.xpath(adminRequestDescriptionField)).sendKeys(description);
		logger.info("Description has been typed");
		
	}
	
	public void clickSaveRequestButton() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollBy(250,350)");
        
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("javascript:window.scrollBy(250,350)");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath(adminRequestSaveButton)).click();
	}


	public void successMessage() {
		driver.findElement(By.xpath("//*[@id='rightpanelmain']/div/div[1]/div")).getText();
		logger.info("Success message has been shown");
		
		
	}

	public void successRequest() {
		
		
	}


}
