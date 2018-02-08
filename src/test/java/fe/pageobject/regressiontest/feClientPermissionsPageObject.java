package fe.pageobject.regressiontest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tooltwist.utils.ElementUtil;
import tooltwist.utils.TestInit;
import tooltwist.utils.feObjectReference;

public class feClientPermissionsPageObject extends feObjectReference {
	
	private WebDriver driver = null;
	private ElementUtil elementUtil = null;
	private TestInit ti = null;
	private static final Logger logger = LoggerFactory.getLogger(feClientPermissionsPageObject.class);

	public feClientPermissionsPageObject(TestInit ti) {
	this.driver = ti.getDriver();
	this.elementUtil = ti.getElementUtil();
	this.ti = ti; 
	
	}

	public void detailsPage() {
		

		
	}

	public void clickPermissionsMenu() {
		
		driver.findElement(By.xpath(permissionsMenu)).click();
		
	}

	public void tickpermissions() {

		driver.findElement(By.xpath(permission1)).click();
		
	}

	public void updatePermissions() {
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);

		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		driver.findElement(By.xpath(permissionsSaveButton)).click();
		
	}
	

}
