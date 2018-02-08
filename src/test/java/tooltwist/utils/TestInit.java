package tooltwist.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import tooltwist.pojo.UserCredentials;

/**
 * When running a feature file, this class (<b>TestInit.class</b>)
 * will run on top of StepDef classes to load some other classes,
 * like web drivers etc.</br>
 * 
 * Additional objects that needs to be initialize before some StepDef classes,
 * should be placed here.
 * 
 * @author julius.balgue
 *
 */
public class TestInit {
	
	private WebDriver driver =  null;
	private ElementUtil elementUtil =  null;
	private TestDataConfigUtil config = null;
	private String environmentUrl = "";
	private UserCredentials userCredentials;
	//LoginURL
	private String urlSet = "";
	private String urlGet = "";
	private String userurlSet = "";
	private String userurlGet = "";
	//Credentials
	private String username = "";
	private String staffpassword = "";
	private String username2 = "";
	private String clientpassword = "";
	private String useremail = "";
	private String userpassword = "";
	//Forgot Password
	private String staffemail = "";
	//Search
	private String staffjobid = "";
	private String clientrequestid = "";
	//Create User
	private String firstName = "";
	private String lastName = "";
	private String eMail = "";
	private String userName = "";
	private String passWord = "";
	//User Sign Up
	private String userEmail = "";
	
	public TestInit() throws Exception { 
		System.out.println(">>>>>>>>>>>>>>>>>>>> Initializing TestInit <<<<<<<<<<<<<<<<<<<<");
		this.config = TestDataConfigUtil.getTestDataConfig();
		this.driver = new DriverManager().getDriver();
		if (this.driver == null) {
			throw new Exception("Driver instance is null");
		}
		
		//Set Login URL
		String  urlSet = "";
		String urlGet = "";
	    String userurlSet = "";
	    String userurlGet = "";

		//Set Environment
		String env = this.config.getConfig("environment");
		this.environmentUrl = getEnvURL(env);
		
		//Set user
		UserCredentials uc = new UserCredentials();
		uc.setFreeUser(this.config.getConfig("email"));
		uc.setFreePass(this.config.getConfig("password"));
		
		//Login
		uc.setUsername(this.config.getConfig("staffUsername"));
		uc.setStaffPassword(this.config.getConfig("staffPassword"));
		uc.setUsername2(this.config.getConfig("clientUsername"));
		uc.setClientpassword(this.config.getConfig("clientPassword"));
		
		//Forgot Password
		uc.setStaffemail(this.config.getConfig("staffEmail"));
		
		//Search
		uc.setStaffjobid(this.config.getConfig("staffJobid"));
		uc.setClientrequestid(this.config.getConfig("clientRequestid"));
		
        //Create User
		uc.setFirstName(this.config.getConfig("firstName"));
		uc.setLastName(this.config.getConfig("lastName"));
		uc.seteMail(this.config.getConfig("eMail"));
		uc.setUserName(this.config.getConfig("userName"));
		uc.setPassWord(this.config.getConfig("passWord"));
		
		//User Sign Up
		uc.setUserEmail(this.config.getConfig("signupEmail"));
		
		//User Log in
		uc.setUseremail(this.config.getConfig("userEmail"));
		uc.setUserpassword(this.config.getConfig("userPassword"));
		
		this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		this.driver.manage().window().maximize();

		this.userCredentials = uc;
		this.elementUtil = new ElementUtil(this);
	}
	
	private String getEnvURL(String env) {
		return this.config.getConfig(env + ".environment.url");
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public ElementUtil getElementUtil() {
		return elementUtil;
	}

	public void setElementUtil(ElementUtil elementUtil) {
		this.elementUtil = elementUtil;
	}

	public TestDataConfigUtil getConfig() {
		return config;
	}

	public void setConfig(TestDataConfigUtil config) {
		this.config = config;
	}

	public String getEnvironmentUrl() {
		return environmentUrl;
	}

	public void setEnvironmentUrl(String environmentUrl) {
		this.environmentUrl = environmentUrl;
	}
	
	public UserCredentials getUserCredentials() {
		return userCredentials;
	}

	public String getLoginURL() {
		
		return urlSet = this.config.getConfig("loginURL");
	}
	
	public String getCurrentUrl() {
		
		return urlGet = this.config.getConfig("adminURL");
	}
	
	public String getUserURL() {
		
		return userurlSet = this.config.getConfig("userURL");
	}
	
	public String getCurrentUserUrl() {
		
		return urlGet = this.config.getConfig("signupURL");
	}

//Login Credentials
	public String getUsername() {
		return username = this.config.getConfig("staffUsername");
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getStaffpassword() {
		return staffpassword = this.config.getConfig("staffPassword");
	}

	public void setStaffpassword(String staffpassword) {
		this.staffpassword = staffpassword;
	}
	
//Forgot Password
	public String getStaffemail() {
		return staffemail = this.config.getConfig("staffEmail");
	}

	public void setStaffemail(String staffemail) {
		this.staffemail = staffemail;
	}
	
//Search
	public String getStaffjobid() {
		return staffjobid = this.config.getConfig("staffJobid");
	}

	public void setStaffjobid(String staffjobid) {
		this.staffjobid = staffjobid;
	}
	
	public String getClientrequestid() {
		return clientrequestid = this.config.getConfig("clientRequestid");
	}

	public void setClientrequestid(String clientrequestid) {
		this.clientrequestid = clientrequestid;
	}

//Create User

	public String getFirstName() {
		return firstName = this.config.getConfig("firstName");
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName = this.config.getConfig("lastName");
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String geteMail() {
		return eMail = this.config.getConfig("eMail");
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getUserName() {
		return userName = this.config.getConfig("userName");
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord = this.config.getConfig("passWord");
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getUsername2() {
		return username2 = this.config.getConfig("clientUsername");
	}

	public void setUsername2(String username2) {
		this.username2 = username2;
	}
	
	//Client Login

	public String getClientpassword() {
		return clientpassword = this.config.getConfig("clientPassword");
	}

	public void setClientpassword(String clientpassword) {
		this.clientpassword = clientpassword;
	}

	//User Sign Up
	public String getUserEmail() {
		return userEmail = this.config.getConfig("signupEmail");
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUseremail() {
		return useremail = this.config.getConfig("userEmail");
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	public String getUserpassword() {
		return userpassword = this.config.getConfig("userPassword");
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}



}
