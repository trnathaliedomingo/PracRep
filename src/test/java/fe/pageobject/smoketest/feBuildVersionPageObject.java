package fe.pageobject.smoketest;
import tooltwist.utils.ElementUtil;
import tooltwist.utils.feObjectReference;
import tooltwist.utils.TestInit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class feBuildVersionPageObject extends feObjectReference {
	
	private WebDriver driver = null;
	private ElementUtil elementUtil = null;
	private TestInit ti = null;
	private static final Logger logger = LoggerFactory.getLogger(feBuildVersionPageObject.class);

	public feBuildVersionPageObject(TestInit ti) {
	this.driver = ti.getDriver();
	this.elementUtil = ti.getElementUtil();
	this.ti = ti; 
	
	}

	public void atDashboardPage() throws InterruptedException {
		
		Assert.assertTrue("FE logo is not available",elementUtil.isElementAvailable(adminFELogo));
		logger.info("I am in dashboard page");
		
	}

	public void seeBuildVersion() throws InterruptedException {
		
		Assert.assertTrue("Build Version is not available",elementUtil.isElementAvailable(adminBuildVersion));
		logger.info("Build Version is available");

		
	}
} 