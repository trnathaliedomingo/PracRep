package fe.pageobject.smoketest;
import tooltwist.utils.ElementUtil;
import tooltwist.utils.feObjectReference;
import tooltwist.utils.TestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class feDeleteJobPageObject extends feObjectReference{
	private WebDriver driver = null;
	private ElementUtil elementUtil = null;
	private TestInit ti = null;
	private static final Logger logger = LoggerFactory.getLogger(feDeleteJobPageObject.class);

	public feDeleteJobPageObject(TestInit ti) {
		this.driver = ti.getDriver();
		this.elementUtil = ti.getElementUtil();
		this.ti = ti; 
	}

	public void clickExistingJob() {
		
		driver.findElement(By.xpath(adminJobToDelete)).click();
		
	}

	public void clickDeleteButton() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollBy(250,350)");
        
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("javascript:window.scrollBy(250,350)");
		
		driver.findElement(By.xpath(adminDeleteJobButton)).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath(adminDelConfButton)).click();
		
		
		
	}

	public void successMessageDeletion() {
		
		logger.info("Success! Job has successfully been deleted");
		
	}

}
