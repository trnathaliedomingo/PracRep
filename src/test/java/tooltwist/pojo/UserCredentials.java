package tooltwist.pojo;

public class UserCredentials {
	private String email = "";
	private String password = "";
	//fe login
	private String username;
	private String staffpassword;
	private String username2;
	private String clientpassword;
	private String useremail;
	private String userpassword;
	//fe forgot password
	private String staffemail;
	//fe search
	private String staffjobid;
	private String clientrequestid;
	//fe create user
	private String firstName;
	private String lastName;
	private String eMail;
	private String userName;
	private String passWord;
	//fe user sign up
	private String userEmail;
	
	//to get and set the user credentials from testdata.properties
	public String getFreeUser() {
		return email;
	}

	public void setFreeUser(String email) {
		this.email = email;
	}

	public String getFreePass() {
		return password;
	}

	public void setFreePass(String password) {
		this.password = password;
	}

	//Login Credentials
	public String getStaffUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
		
	}
	
	public String getStaffPassword() {
		return staffpassword;
	}

	public void setStaffPassword(String staffpassword) {
		this.staffpassword = staffpassword;
		
	}
	
	//Forgot Password
	public String getStaffemail() {
		return staffemail;
	}

	public void setStaffemail(String staffemail) {
		this.staffemail = staffemail;
	}
	
	//Search
	public String getStaffjobid() {
		return staffjobid;
	}

	public void setStaffjobid(String staffjobid) {
		this.staffjobid = staffjobid;
		
	}
	
	public String getClientrequestid() {
		return clientrequestid;
	}

	public void setClientrequestid(String clientrequestid) {
		this.clientrequestid = clientrequestid;
	}
	
	//Create User

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
//Client login

	public String getUsername2() {
		return username2;
	}

	public void setUsername2(String username2) {
		this.username2 = username2;
	}

	public String getClientpassword() {
		return clientpassword;
	}

	public void setClientpassword(String clientpassword) {
		this.clientpassword = clientpassword;
	}
	
//User Sign Up

	public String getUserEmail() {
		return userEmail;
	}

//User Log in
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	public String getUserpassword() {
		return userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	
}