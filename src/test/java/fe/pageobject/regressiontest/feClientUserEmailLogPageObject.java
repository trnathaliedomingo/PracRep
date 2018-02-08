package fe.pageobject.regressiontest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tooltwist.utils.ElementUtil;
import tooltwist.utils.TestInit;
import tooltwist.utils.feObjectReference;

public class feClientUserEmailLogPageObject extends feObjectReference {
	
	private WebDriver driver = null;
	private ElementUtil elementUtil = null;
	private TestInit ti = null;
	private static final Logger logger = LoggerFactory.getLogger(feClientUserEmailLogPageObject.class);

	public feClientUserEmailLogPageObject(TestInit ti) {
	this.driver = ti.getDriver();
	this.elementUtil = ti.getElementUtil();
	this.ti = ti; 
	
	}

	public void usersListPage() {
	
		
	}

	public void feWaterClientUser() {
		
		driver.findElement(By.xpath(emailLogUser)).click();
	
		
	}

	public void emailLogMenu() {
		
		driver.findElement(By.xpath(emailLogMenu)).click();
	
		
	}

	public void emailLogRecord() {
		
		driver.findElement(By.xpath("//*[@id='rightpanelmain']/div/div[2]/table/tbody/tr[2]/td[2]"));
		logger.info("Log are intact");
		
		
	}

}
