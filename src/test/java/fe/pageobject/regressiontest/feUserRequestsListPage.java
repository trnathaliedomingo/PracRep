package fe.pageobject.regressiontest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tooltwist.utils.ElementUtil;
import tooltwist.utils.TestInit;
import tooltwist.utils.feObjectReference;

public class feUserRequestsListPage extends feObjectReference {
	
	private WebDriver driver = null;
	private ElementUtil elementUtil = null;
	private TestInit ti = null;
	private static final Logger logger = LoggerFactory.getLogger(feUserRequestsListPage.class);

	public feUserRequestsListPage(TestInit ti) {
	this.driver = ti.getDriver();
	this.elementUtil = ti.getElementUtil();
	this.ti = ti; 
	
	}

	public void requestPage() {
		
		
	}

	public void clickHistoryRequestTab() {
		
		driver.findElement(By.xpath(historyRequestTab)).click();
		
		
	}

	public void table() {
		
		driver.findElement(By.xpath(requestTable));
		logger.info("All user created requests has been shown");
		
	}

}
