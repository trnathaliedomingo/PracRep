package fe.pageobject.regressiontest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tooltwist.utils.ElementUtil;
import tooltwist.utils.TestInit;
import tooltwist.utils.feObjectReference;

public class feClientJobsHistoryPageObject extends feObjectReference {
	
	private WebDriver driver = null;
	private ElementUtil elementUtil = null;
	private TestInit ti = null;
	private static final Logger logger = LoggerFactory.getLogger(feClientJobsHistoryPageObject.class);

	public feClientJobsHistoryPageObject(TestInit ti) {
	this.driver = ti.getDriver();
	this.elementUtil = ti.getElementUtil();
	this.ti = ti; 
	
	}

	public void jobsListPage() {
		
		
		
	}

	public void existingClientJob() {
		
		driver.findElement(By.xpath(existingJob)).click();
		
	}

	public void clickHistoryTab() {
		
		driver.findElement(By.xpath(jobsHistoryTab)).click();
		
		
	}

	public void jobHistory() {
		
		driver.findElement(By.xpath(createdBy));
		logger.info("Created by log is available");
		
		
	}

}
