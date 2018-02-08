package fe.pageobject.regressiontest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tooltwist.utils.ElementUtil;
import tooltwist.utils.TestInit;
import tooltwist.utils.feObjectReference;

public class feClientUserPermissionsPageObject extends feObjectReference {
	
	private WebDriver driver = null;
	private ElementUtil elementUtil = null;
	private TestInit ti = null;
	private static final Logger logger = LoggerFactory.getLogger(feClientUserPermissionsPageObject.class);

	public feClientUserPermissionsPageObject(TestInit ti) {
	this.driver = ti.getDriver();
	this.elementUtil = ti.getElementUtil();
	this.ti = ti; 
	
	}

	public void clientDashboard() {
		
		
	}
	
	public void clickUsersMenu() {
		
		driver.findElement(By.xpath(usersMenu)).click();
		
	}

	public void clickExistingUser() {
		
		driver.findElement(By.xpath(existingClientUser)).click();
		
	}

	public void clickPermissionsMenu() {
		
		driver.findElement(By.xpath(permissionsClientUser)).click();
	
		
	}

	public void tickPermissions() {
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);

		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		driver.findElement(By.xpath(permission2)).click();
	
		
	}

	public void clickSaveUserButton() {
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);

		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		driver.findElement(By.xpath(savePermissionButton)).click();
		
		
	}

	public void successUserPermissionUpdate() {
		
		
	}

}
