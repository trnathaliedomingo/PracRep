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

public class feCreateUserPageObject extends feObjectReference {
	
	private WebDriver driver = null;
	private ElementUtil elementUtil = null;
	private TestInit ti = null;
	private static final Logger logger = LoggerFactory.getLogger(feCreateUserPageObject.class);

	public feCreateUserPageObject(TestInit ti) {
		this.driver = ti.getDriver();
		this.elementUtil = ti.getElementUtil();
		this.ti = ti; 
	}

	public void clickAddButton() {
		
		driver.findElement(By.xpath(adminClientCreateUserButton)).click();
	
		
	}

	public void fillUpFields(String firstName, String lastName, String eMail, String userName, String passWord) throws InterruptedException {
		
		Assert.assertTrue("First name field is not available", elementUtil.isElementAvailable(adminUserFirstnameField));
		WebElement firstNameAdd = driver.findElement(By.xpath(adminUserFirstnameField));
		firstNameAdd.sendKeys(ti.getFirstName());
		
		Assert.assertTrue("Last name field is not available", elementUtil.isElementAvailable(adminUserLastnameField));
		WebElement lastNameAdd = driver.findElement(By.xpath(adminUserLastnameField));
		lastNameAdd.sendKeys(ti.getLastName());
		
		Assert.assertTrue("Email name field is not available", elementUtil.isElementAvailable(adminUserEmailField));
		WebElement eMailAdd = driver.findElement(By.xpath(adminUserEmailField));
		eMailAdd.sendKeys(ti.geteMail());
		
		Assert.assertTrue("User name field is not available", elementUtil.isElementAvailable(adminUserUsernameField));
		WebElement userNameAdd = driver.findElement(By.xpath(adminUserUsernameField));
		userNameAdd.sendKeys(ti.getUserName());
		
		Assert.assertTrue("Password field is not available", elementUtil.isElementAvailable(adminUserPasswordField));
		WebElement passWordAdd = driver.findElement(By.xpath(adminUserPasswordField));
		passWordAdd.sendKeys(ti.getPassWord());
		
		Assert.assertTrue("Confirmation password field is not available", elementUtil.isElementAvailable(adminUserConfPasswordField));
		WebElement ConfpassWordAdd = driver.findElement(By.xpath(adminUserConfPasswordField));
		ConfpassWordAdd.sendKeys(ti.getPassWord());
		
	}

	public void setToClientAdmin() {
		
		Select select1 = new Select(driver.findElement(By.xpath(adminUserUsertypeDropdown)));
		select1.selectByVisibleText("Client Admin");
		logger.info("User type has been set to Client Admin");
		
		Select select2 = new Select(driver.findElement(By.xpath(adminUserClientDropdown)));
		select2.selectByVisibleText("FE Water");
		logger.info("Client has been set to FE Water");
		
		
	}
	
	public void clickSavebutton() {
		
		driver.findElement(By.xpath(adminUserSaveButton)).click();
		
	}

	public void successMessage(String successMessage) {
		
		driver.findElement(By.xpath(adminUserSuccessMessage)).getText();
		logger.info("Success message has been shown");
		
		
	}

	public void userCreated() {
		
		logger.info("User has been created successfully");
		
	}


	
	

}
