package fe.pageobject.regressiontest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tooltwist.utils.ElementUtil;
import tooltwist.utils.TestInit;
import tooltwist.utils.feObjectReference;

public class feAddNoticeTypePageObject extends feObjectReference {
	
	private WebDriver driver = null;
	private ElementUtil elementUtil = null;
	private TestInit ti = null;
	private static final Logger logger = LoggerFactory.getLogger(feAddNoticeTypePageObject.class);

	public feAddNoticeTypePageObject(TestInit ti) {
	this.driver = ti.getDriver();
	this.elementUtil = ti.getElementUtil();
	this.ti = ti; 
	
	}

	public void clientListPage() {
		
		
	}
	
	public void clickNoticeType() {
		
		driver.findElement(By.xpath(noticeTypeMenu)).click();
		
	}

	public void clickFEWater() throws InterruptedException {
		
		driver.findElement(By.xpath(organisationField)).sendKeys("FE");
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath(feWater)).click();
		
	}

	public void clickAddNoticeTypeButton() {
		
		driver.findElement(By.xpath(addNoticeTypeButton)).click();
		
	}

	public void typeNoticeTypeName(String noticetype) throws InterruptedException {
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath(noticeTypeField)).sendKeys(noticetype);
		
	}
	

	public void clickSaveButton() throws InterruptedException {
	
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath(noticeTypeSaveButton)).click();
		
	}

	public void successfullyAdded() {
		
		
		
	}


}
