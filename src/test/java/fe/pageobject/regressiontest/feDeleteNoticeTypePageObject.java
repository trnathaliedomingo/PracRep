package fe.pageobject.regressiontest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tooltwist.utils.ElementUtil;
import tooltwist.utils.TestInit;
import tooltwist.utils.feObjectReference;

public class feDeleteNoticeTypePageObject extends feObjectReference {
	
	private WebDriver driver = null;
	private ElementUtil elementUtil = null;
	private TestInit ti = null;
	private static final Logger logger = LoggerFactory.getLogger(feDeleteNoticeTypePageObject.class);

	public feDeleteNoticeTypePageObject(TestInit ti) {
	this.driver = ti.getDriver();
	this.elementUtil = ti.getElementUtil();
	this.ti = ti; 
	
	}

	public void feWaterNoticePage() {
		
		
	}

	public void tickNoticeType() {
		
		driver.findElement(By.xpath(noticeCheckBox)).click();
		
	}

	public void deleteNotice() throws InterruptedException {
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath(deleteNoticeButton)).click();
		
	}

	public void successfulDelete() {
		
		driver.findElement(By.xpath(noticeTypeSaveButton)).click();
		
	}

}
