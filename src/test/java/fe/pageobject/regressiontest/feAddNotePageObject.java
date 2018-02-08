package fe.pageobject.regressiontest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fe.pageobject.regressiontest.feAddNotePageObject;
import tooltwist.utils.ElementUtil;
import tooltwist.utils.TestInit;
import tooltwist.utils.feObjectReference;

public class feAddNotePageObject extends feObjectReference {
	
	private WebDriver driver = null;
	private ElementUtil elementUtil = null;
	private TestInit ti = null;
	private static final Logger logger = LoggerFactory.getLogger(feAddNotePageObject.class);

	public feAddNotePageObject(TestInit ti) {
	this.driver = ti.getDriver();
	this.elementUtil = ti.getElementUtil();
	this.ti = ti; 
	
	}

	public void clickRequest() {
		
		driver.findElement(By.xpath(openRequest)).click();
		
	}

	public void clickHistoryTab() {
		
		driver.findElement(By.xpath(historyTab)).click();
		
	}

	public void fillUpNoteTextArea(String note) {
		
		driver.findElement(By.xpath(noteTextField)).sendKeys(note);
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);

		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
	}
	
	public void clicksavebutton() {
		
		driver.findElement(By.xpath(requestSaveButton)).click();
		
	}

	public void SuccessMessageNote() {
		
		
		
	}



}
