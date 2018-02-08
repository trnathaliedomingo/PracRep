package tooltwist.utils;

public class feObjectReference {
	
	//Admin Site Login
	public static String adminUsernameField = "//*[@id='emailAddress']";
	public static String adminPasswordField = "//*[@id='loginForm']/div/div[3]/div/input";
	public static String adminLoginButton = "//*[@id='loginForm']/div/div[4]/a";
	public static String adminFELogo = "/html/body/div[1]/div/div/div[1]/div[1]/a/img";
	public static String adminForgotPasswordLink = "//*[@id='loginForm']/div/div[5]/a";
	public static String adminForgotEmailField = "//*[@id='forgotPwdForm']/div[2]/div/input";
	public static String adminSendRequestButton = "//*[@id='forgotPwdForm']/div[3]/a";
	public static String adminBackToLoginButton = "/html/body/div[1]/div/div/div[2]/div/div/div/div[2]/a";
	
	//Admin Site Forgot Password
	public static String adminFPSuccess = "/html/body/div[1]/div/div/div[2]/div/div/div/p";
	public static String adminResetPage = "/html/body/div[1]/div/div/div[2]/div/div/p";
	public static String adminLoginLogo = "/html/body/div[1]/div/div/div[1]/div/div/img";
    
	//Admin Build Version
	public static String adminBuildVersion = "//*[@id='sideBarTemplate']/footer/small";
	
	//Admin Dashboard
	public static String adminQuarterName = "//*[@id='rightpanelmain']/div[1]/h3/span[2]/small";
	public static String adminQuarterSelectRight = "//*[@id='rightpanelmain']/div[1]/a[2]";
	public static String adminQuarterSelectLeft = "//*[@id='rightpanelmain']/div[1]/a[1]";
	public static String adminJobsStatusPanel = "//*[@id='rightpanelmain']/div[2]";
	public static String adminJobsSummaryPanel = "//*[@id='dashboardStaffJobsTally']";
	public static String adminSLAPanel = "//*[@id='rightpanelmain']/div[4]";
	
	//Admin Clients Listing Page
	public static String adminClientsListPageHeader = "//*[@id='rightpanelmain']/div[1]/h1";
	public static String adminAdminMenu = "//*[@id='sideBarTemplate']/ul/li[4]/a";
	public static String adminClientsListSearchField = "//*[@id='searchkey']";
	public static String adminClientsListAdvancedSearchOption = "//*[@id='rightpanelmain']/div[3]/div/div/h5[2]/a";
	public static String adminAddClientButton = "//*[@id='rightpanelmain']/div[5]/div[1]/a/i";
	public static String adminClientsListPageSettings = "//*[@id='rightpanelmain']/div[5]/div[3]";
	public static String adminClientsListTable = "//*[@id='rightpanelmain']/div[5]/div[6]";
	public static String adminClientsListDownloadCSV = "//*[@id='rightpanelmain']/div[5]/div[10]/a/i";
	public static String adminClientsListPageCounter = "//*[@id='paginateClientsListTop']";
	public static String adminClientPageCounter = "//*[@id='limitOptionTop']";
	public static String adminClientPageCounter10 = "//*[@id='10']";
	public static String adminClientsListPageNext = "//*[@id='rightpanelmain']/div[5]/div[3]/ul/li[10]";
	public static String adminClientColumnSort = "//*[@id='rightpanelmain']/div[5]/div[6]/div/table/thead/tr/th[1]";
	public static String adminStateColumnSort = "//*[@id='rightpanelmain']/div[5]/div[6]/div/table/thead/tr/th[2]";
	public static String adminUsersColumnSort = "//*[@id='rightpanelmain']/div[5]/div[6]/div/table/thead/tr/th[3]";
	public static String adminSubmittedJobsColumnSort = "//*[@id='rightpanelmain']/div[5]/div[6]/div/table/thead/tr/th[4]";
	
	//Admin Users Listing Page
	public static String adminUsersListMenu = "//*[@id='sideBarTemplate']/ul/li[3]/a";
	public static String adminUsersListPageHeader = "//*[@id='rightpanelmain']/span/h1";
	public static String adminUsersListSearchField = "//*[@id='searchkey']";
	public static String adminUsersListAdvancedSearchOption = "//*[@id='rightpanelmain']/div/div[1]/h5/a";
	public static String adminAddUserButton = "//*[@id='rightpanelmain']/div/div[2]/div[2]/a/i";
	public static String adminUsersListPageSettings = "//*[@id='paginateUsersListTop']";
	public static String adminUsersListTable = "//*[@id='rightpanelmain']/div/div[2]";
	public static String adminUsersListDownloadCSV = "//*[@id='rightpanelmain']/div/div[2]/div[11]/a/i";
	public static String adminUsersListPageCounter = "//*[@id='paginateUsersListTop']/span";
	public static String adminUsersListPageCounter20 = "//*[@id='20']";
	public static String adminUsersListNextPage = "//*[@id='rightpanelmain']/div/div[2]/div[3]/ul/li[3]/a";
	public static String adminEmailColumnSort = "//*[@id='rightpanelmain']/div/div[2]/div[7]/div/table/thead/tr/th[5]";
	public static String adminFirstColumnSort = "//*[@id='rightpanelmain']/div/div[2]/div[7]/div/table/thead/tr/th[3]";
	public static String adminLastColumnSort = "//*[@id='rightpanelmain']/div/div[2]/div[7]/div/table/thead/tr/th[4]";
	public static String adminUserTypeColumnSort = "//*[@id='rightpanelmain']/div/div[2]/div[7]/div/table/thead/tr/th[6]";
	public static String adminClientUserColumnSort = "//*[@id='rightpanelmain']/div/div[2]/div[7]/div/table/thead/tr/th[7]";
	public static String adminStatusColumnSort = "//*[@id='rightpanelmain']/div/div[2]/div[7]/div/table/thead/tr/th[8]";
	public static String adminCreatedColumnSort = "//*[@id='rightpanelmain']/div/div[2]/div[7]/div/table/thead/tr/th[13]";
	public static String adminLastAccessColumnSort = "//*[@id='rightpanelmain']/div/div[2]/div[7]/div/table/thead/tr/th[14]";
	
	//Admin Request Configurations Listing Page
	public static String adminReqConfigMenu = "//*[@id='sideBarTemplate']/ul/li[4]/a";
	public static String adminReqConfigHeader = "//*[@id='rightpanelmain']/div[1]/h1";
	public static String adminReqConfigSearchField = "//*[@id='searchkey']";
	public static String adminReqConfigAdvancedSearchOption = "//*[@id='rightpanelmain']/div[3]/div/h5[2]/a";
	public static String adminReqConfigColumnFilter = "//*[@id='columnFilterId']/div/div/button";
	public static String adminReqConfigAddReqButton = "//*[@id='rightpanelmain']/div[5]/a/i";
	public static String adminReqConfigPageSettings = "//*[@id='rightpanelmain']/div[5]/div[3]/div[2]";
	public static String adminReqConfigListTable = "//*[@id='rightpanelmain']/div[5]/div[7]";
	public static String adminReqConfigDownloadCSV = "//*[@id='rightpanelmain']/div[5]/div[11]/a/i";
	public static String adminReqConfigPageCount = "//*[@id='paginateConfigurationListTop']";
	public static String adminReqConfigPageCount50 = "//*[@id='50']";
	public static String adminReqConfigPageNext = "//*[@id='rightpanelmain']/div[5]/div[3]/ul/li[3]/span";
	public static String adminReqConfigIDSort = "//*[@id='rightpanelmain']/div[5]/div[7]/div/table/thead/tr/th[1]";
	public static String adminReqConfigOrgSort = "//*[@id='rightpanelmain']/div[5]/div[7]/div/table/thead/tr/th[2]";
	public static String adminReqConfigCatSort = "//*[@id='rightpanelmain']/div[5]/div[7]/div/table/thead/tr/th[3]";
	public static String adminReqConfigTypeSort = "//*[@id='rightpanelmain']/div[5]/div[7]/div/table/thead/tr/th[4]";
	public static String adminReqConfigRequestSort = "//*[@id='rightpanelmain']/div[5]/div[7]/div/table/thead/tr/th[5]";
	public static String adminReqConfigStatusSort = "//*[@id='rightpanelmain']/div[5]/div[7]/div/table/thead/tr/th[6]";
	public static String adminReqConfigVisibleSort = "//*[@id='rightpanelmain']/div[5]/div[7]/div/table/thead/tr/th[7]";
	
	//Admin Jobs Listing Page
	public static String adminJobsMenu = "//*[@id='sideBarTemplate']/ul/li[2]/a";
	public static String adminJobsHeader = "//*[@id='rightpanelmain']/span/h1";
	public static String adminJobsSearchField = "//*[@id='searchkey']";
	public static String adminJobsAdvancedSearch = "//*[@id='rightpanelmain']/div[2]/div[1]/h5/a";
	public static String adminAddJobButton = "//*[@id='generateId']";
	public static String adminJobsPageSettings = "//*[@id='tabpanel']/div[3]/ul";
	public static String adminJobsListTable = "//*[@id='tabpanel']";
	public static String adminJobsDownloadCSV = "//*[@id='rightpanelmain']/div/div[2]/div[2]/a/i";
	public static String adminJobsColumnFilter = "//*[@id='columnFilterId']/div/div/button";
	public static String adminJobsPageCount = "//*[@id='paginateJobListTop']";
	public static String adminJobsPageCount100 = "//*[@id='paginateJobListTop']";
	public static String adminJobsPageNext = "//*[@id='rightpanelmain']/div[2]/div[2]/div[4]/ul/li[3]/span";
	public static String adminJobIDSort = "//*[@id='tabpanel']/div[6]/table/thead/tr/th[1]";
	public static String adminJobsRefNumSort = "//*[@id='tabpanel']/div[6]/table/thead/tr/th[2]";
	public static String adminJobsClientSort = "//*[@id='tabpanel']/div[6]/table/thead/tr/th[3]";
	public static String adminJobsStateSort = "//*[@id='tabpanel']/div[6]/table/thead/tr/th[4]";
	public static String adminSLAHoursSort = "//*[@id='tabpanel']/div[6]/table/thead/tr/th[5]";
	public static String adminStockCountSort = "//*[@id='tabpanel']/div[6]/table/thead/tr/th[6]";
	public static String adminExpectedDateSort = "//*[@id='tabpanel']/div[6]/table/thead/tr/th[7]";
	
	//Admin Requests Listing Page
	public static String adminRequestsMenu = "//*[@id='sideBarTemplate']/ul/li[3]/a";
	public static String adminRequestsHeader = "//*[@id='rightpanelmain']/span/h1";
	public static String adminRequestsSearch = "//*[@id='searchkey']";
	public static String adminRequestsAdvancedSearch = "//*[@id='advanceSearchForm']/h5/a";
	public static String adminRequestsAddButton = "//*[@id='request_tabpanel']/div[1]/div[1]/a/i";
	public static String adminRequestsColumnFilter = "//*[@id='columnFilterId']/div/div/button/span[1]";
	public static String adminRequestsTabs = "//*[@id='rightpanelmain']/div/div[2]/ul";
	public static String adminRequestsPageSettings = "//*[@id='request_tabpanel']/div[1]/div[2]/div[1]";
	public static String adminRequestsDownloadCSV = "//*[@id='rightpanelmain']/div/div[2]/div[2]/a/i";
	public static String adminRequestsListTable = "//*[@id='request_tabpanel']/div[2]/div";
	public static String adminRequestsPageCount = "//*[@id='request_tabpanel']/div[1]/div[2]/div[1]/div[1]/a/span";
	public static String adminRequestsPageCount100 = "//*[@id='100']";
	public static String adminRequestsIDSort = "//*[@id='request_list']/thead/tr/th[1]";
	public static String adminRequestsCategorySort = "//*[@id='request_list']/thead/tr/th[2]";
	public static String adminRequestsTypeSort = "//*[@id='request_list']/thead/tr/th[3]";
	public static String adminRequestsStatusSort = "//*[@id='request_list']/thead/tr/th[4]";
	public static String adminRequestsPrioritySort = "//*[@id='request_list']/thead/tr/th[5]";
	public static String adminRequestsDueSort = "//*[@id='request_list']/thead/tr/th[6]";
	public static String adminRequestsDetailsSort = "//*[@id='request_list']/thead/tr/th[7]";
	public static String adminRequestsAssigneeSort = "//*[@id='request_list']/thead/tr/th[8]";
	public static String adminRequestsEmailSort = "//*[@id='request_list']/thead/tr/th[9]";
	public static String adminRequestsOrgSort = "//*[@id='request_list']/thead/tr/th[10]";
	public static String adminRequestsCreatedSort = "//*[@id='request_list']/thead/tr/th[11]";
	
	//Staff Job Search
	public static String staffJobsSearchId = "//*[@id='searchkey']";
	public static String staffJobId = "//*[@id='tabpanel']/div[6]/table/tbody/tr";
			//"//*[@id='rightpanelmain']/div[2]/div[2]/div[6]/table/tbody/tr/td[1]";
	
	//Log out
	public static String adminProfileIcon = "//*[@id='navbar']/ul/li[2]/a";
	public static String adminLogoutButton = "//*[@id='navbar']/ul/li[2]/ul/li[3]/a";
	
	//FE Create Job
    public static String adminClientDropdown = "//*[@id='user-customer']";
    public static String adminClientFEWater = "//*[@id='user-customer']/option[66]";
    public static String adminNoticeTypeDropdown = "//*[@id='2']";
    public static String adminNoticeOption = "//*[@id='2']/option[3]";
    public static String adminReferenceNumberField = "//*[@id='rightpanelmain']/div[2]/div[2]/div[4]/div/div/input";
    public static String adminAssigneeDropdown = "//*[@id='rightpanelmain']/div[2]/div[2]/div[5]/div/div/select";
    public static String adminStatusDropdown = "//*[@id='rightpanelmain']/div[3]/div[2]/div[1]/div/div/select";
    public static String adminExpectedDatePicker = "//*[@id='dp1499841852301']";
    public static String adminSubmittedDatePicker = "//*[@id='dp1499841852302']";
    public static String adminProofDatePicker = "//*[@id='dp1499841852303']";
    public static String adminProofApprovalDatePicker = "//*[@id='dp1499841852304']";
    public static String adminSentDatePicker = "//*[@id='dp1499841852305']";
    public static String adminSaveJobButton = "//*[@id='saveBtn']";
    public static String adminAdditionalInstructions = "//*[@id='InstructionsTab']/div/div/div[3]/div/div/ul/li[13]/a";
    public static String adminAdditionalComments = "//*[@id='siCommentsWiz']/div/div/div[2]/div/div[1]/div/div[1]/textarea";
//    public static String adminAddCommentsButton = "//*[@id='siCommentsWiz']/div/div/div[1]/div[2]/div/a/i";
    public static String adminAddComment = "//*[text()='Additional Instructions']/ancestor::*[@class='row']/descendant::*[@class='add-comment']";
    public static String adminEmailCustomer = "//*[@id='cbReissueCustomer']";
    public static String adminContinueButton = "(//*[@id='continue'])[3]";
    public static String adminJobSuccess = "//*[contains(@class,'alert-success')]//*[contains(text(),'Job has been updated')]";//"//*[@id='rightpanelmain']/div[2]/div[1]";
    public static String adminPopUpSave = "//*[@id='staff-save-confirmation']/div/div[1]/div/h4";
    public static String adminJobPopUpButtons = "//*[@id='staff-save-confirmation']/div/div[2]";
    
    //FE Create Request
    public static String adminAddRequestButton = "//*[@id='request_tabpanel']/div[1]/div[1]/a/i";
    public static String adminRequestAssigneeDropdown = "//*[@id='staff_request_form']/div[1]/div[3]/div[5]/div/select";
	public static String adminRequestSubjectField = "//*[@id='form_details']/div/div[2]/div/input";
	public static String adminRequestDescriptionField = "//*[@id='form_details']/div/div[3]/div/textarea";
	public static String adminRequestSaveButton = "//*[@id='rightpanelmain']/div[5]/div[1]/button[2]";
	
	//FE Delete
	public static String adminRequestToDelete = "//*[@id='request_list']/tbody/tr[5]";
	public static String adminDeleteRequestButton = "//*[@id='rightpanelmain']/div[5]/a";
	
	//job
	public static String adminJobToDelete = "//*[@id='tabpanel']/div[6]/table/tbody/tr[1]/td[3]";
	public static String adminDeleteJobButton = "//*[@id='rightpanelmain']/div[9]/a[1]";
	public static String adminDelConfButton = "(//*[@id='continue'])[2]";
	public static String adminDelJobConfButton = "//*[@id='continue']";
	public static String adminDelConfPopup = "//*[@id='deleteConfirmation']/div/div[1]/div/p";
	
	
	public static String adminDeleteClientButton = "";
	public static String adminDeleteUserButton = "";
	public static String adminDeleteRequestConfigButton = "";
	
	//FE Create Client
	public static String adminCreateClient = "//*[@id='rightpanelmain']/div[5]/div[1]/a/i";
	public static String adminClientNameField = "//*[@id='customer']";
	public static String adminClientCodeField = "//*[@id='customerDetails']/div[2]/div[12]/div[4]/div/div[1]/div[1]/div/input";
	public static String adminClientAccountField = "//*[@id='customerDetails']/div[2]/div[12]/div[4]/div/div[1]/div[2]/div/input";
	public static String adminClientSaveButton = "//*[@id='rightpanelmain']/div[4]/button[2]";
	
	//FE Create User
	public static String adminClientCreateUserButton = "//*[@id='rightpanelmain']/div/div[2]/div[2]/a/i";
	public static String adminUserFirstnameField = "//*[@id='user-first-name']";
	public static String adminUserLastnameField = "//*[@id='user-last-name']";
	public static String adminUserEmailField = "//*[@id='user-email']";
	public static String adminUserUsernameField = "//*[@id='user-username']";
	public static String adminUserPasswordField = "//*[@id='user-password']";
	public static String adminUserConfPasswordField ="//*[@id='user-confirm-password']";
	public static String adminUserUsertypeDropdown = "//*[@id='user-user-type']";
	public static String adminUserClientDropdown = "//*[@id='user-customer']";
	public static String adminUserSaveButton = "//*[@id='saveBtn']";	
	public static String adminUserSuccessMessage = "//*[contains(@class,'alert-success')]//*[contains(text(),'Success')]";
	
	//FE Create Job as Client
	public static String adminAddJobClientButton = "//*[@id='generateId']";
	public static String adminJobWizNoticeTypeDropdown = "//*[@id='createJobTab']/div/div[1]/div/div/select";
	public static String adminJobWizNext2Button = "(//*[@id='2'])[7]"; 
	public static String adminJobWizNext3Button = "(//*[@id='3'])[3]";
	public static String adminJobWizAddIns = "//*[@id='InstructionsTab']/div/div/div[3]/div/div/ul/li[13]/a";
	public static String adminJobWizAddInsButton = "//*[@id='siCommentsWiz']/div/div/div[1]/div[2]/div/a/i";
	public static String adminJobWizAddInsTextArea = "//*[@id='siCommentsWiz']/div/div/div[2]/div[1]/div[1]/div/div[1]/textarea";
	public static String adminJobWizSubmitJobButton = "//*[@id='create-job']";
	
	//FE Create Request as Client
	public static String adminClientRequestMenu = "//*[@id='sideBarTemplate']/ul/li[4]/a";
	public static String adminAddClientRequestButton = "//*[@id='temp']/div[1]/div[1]/a/i";
	public static String adminClientRequestSaveButton = "//*[@id='rightpanelmain']/div[5]/div[1]/button[2]";
	
	//FE Client Request Search
	public static String adminClientRequestSearchField = "//*[@id='searchkey']";
	public static String adminClientRequestSearchResult = "//*[@id='request_list']/tbody/tr/td[1]";
	
	//FE User Sign Up
	public static String userSignUpTab = "//*[@id='cobrandLogin']/div/div/div/div[2]/ul/li[1]/a";
	public static String userSignUpEmailField = "(//*[@id='userEmail'])[2]";
	public static String userSignUpButton = "//*[@id='registrationForm']/button";
	public static String userSuccessSignUp = "//*[@id='cobrandThankyou']/div/p";
	
	//Admin View Job
	public static String adminSentJob = "//*[@id='tabpanel']/div[6]/table/tbody/tr[1]";
	public static String adminPanelNotice = "//*[@id='rightpanelmain']/div[2]";
	public static String adminPanelStatus = "//*[@id='rightpanelmain']/div[3]";
	public static String adminPanelInstructions = "//*[@id='job-details-ins']";
	public static String jobperpage = "//*[@id='paginateJobListTop']/span";
	public static String jobperpage100 = "//*[@id='100']";
	
	//Client View Request
	public static String clientRequestMenu = "//*[@id='sideBarTemplate']/ul/li[4]/a";
	public static String clientOpenRequest = "//*[@id='request_list']/tbody/tr[1]";
	public static String clientRequestDetails = "//*[@id='staff_request_form']/div[1]";
	public static String clientContactPanel = "//*[@id='contact_details_section']";
	public static String clientFormDetails = "//*[@id='form_details_section']";
	
	//FE User Login
	public static String userEmailField = "//*[@id='emailDetails']/div/div/div[1]";
	public static String userPasswordField = "//*[@id='loginForm']/div[3]/input";
	public static String userLoginButton = "//*[@id='loginForm']/button";
	public static String userDashboardElements = "/html/body/div[1]/section/div[2]";
	
	//FE User Profile
	public static String userProfile = "//*[@id='navbar']/form/a";
	public static String userElements = "/html/body/div[1]/section/div[1]/div";
	public static String userProfileButtons = "//*[@id='saveprofileform']/div[3]";
	
	//FE User Submit Request
	public static String requestandforms = "//*[@id='sideBarTemplate']/ul/li[2]/a";
	public static String FEQArequest = "//*[@id='thumbnailwrapper']/a[5]";
	public static String requestSubjectField = "//*[@id='formdetails']/div[2]/div[1]/div/input";
	public static String requestDescriptionField = "//*[@id='formdetails']/div[2]/div[2]/div/textarea";
	public static String requestSubmitButton = "/html/body/div[1]/section/div[4]/div/div/input";
	public static String requestSubmitted = "//*[@id='request_list']/tr[1]/td[1]";
	
	//FE User Log Out
	public static String userLogOutButton = "//*[@id='navbar']/ul/li/a/i";
	
	//Admin Create Request Configuration
	public static String adminCategoryField = "//*[@id='category_id']";
	public static String adminTypeField = "//*[@id='type_id']";
	public static String adminVisibleDropdown = "//*[@id='visible_to']";
	public static String adminAddDropdown = "//*[@id='add_control']";
	public static String adminTextInputField1 = "//*[@id='formdetailstable']/tbody/tr[1]/td[4]/input";
	public static String adminTextAreaField1 = "//*[@id='formdetailstable']/tbody/tr[2]/td[4]/input";
	public static String adminTextField = "//*[@id='formdetailstable']/tbody/tr[2]/td[4]/input";
	public static String adminTextField2 = "//*[@id='formdetailstable']/tbody/tr[4]/td[4]/input";
	public static String adminDeleteForm = "//*[@id='formdetailstable']/tbody/tr[3]/td[10]/div/i";
	public static String adminSaveReqConfigButton = "//*[@id='saveBtn']";
	public static String adminSuccessMessage = "//*[@id='request_form']/div[1]/div[1]";
	
	//Regression
	
	//Invalid Credentials
	public static String adminLoginErrorMessage = "//*[@id='loginForm']/div/div[1]";
	
	//Profile
	public static String adminStaffProfile1 = "//*[@id='navbar']/ul/li[2]/a";
	public static String adminStaffProfileLink = "//*[@id='navbar']/ul/li[2]/ul/li[1]/a";
	
	//Delete
	public static String deleteUser = "//*[@id='deleteUserBtn']";
	public static String deleteRequestOK = "//*[@id='continue']";
	
	//Add Notice Type
	public static String noticeTypeMenu = "//*[@id='sideBarTemplate']/ul/li[3]/a";
	public static String feWater = "//*[@id='rightpanelmain']/div[5]/div[6]/div/table/tbody/tr[4]";
	public static String addNoticeTypeButton = "(//*[@id='2']/i)[1]";
	public static String noticeTypeField = "//*[@id='defaultsTable']/tbody/tr[1]/td[3]/div/input";
	public static String noticeTypeSaveButton = "//*[@id='save']";
	public static String organisationField = "//*[@id='searchkey']";
	
	//Delete Notice Type
	public static String noticeCheckBox = "//*[@id='defaultsTable']//input[@type='checkbox'][1]";
	public static String deleteNoticeButton = "(//*[@id='2']/i)[2]";
	
	//Add Note
	public static String openRequest = "//*[@id='request_list']/tbody/tr[1]";
	public static String historyTab = "//*[@id='form_details_section']/ul/li[2]/a";
	public static String noteTextField = "//*[@id='addNoteHistory']";
	public static String requestSaveButton = "//*[@id='rightpanelmain']/div[5]/div[1]/button";
	
	//FE Client Permissions
	public static String permissionsMenu = "//*[@id='sideBarTemplate']/ul/li[4]/a";
	public static String permission1 = "//*[@id='permissions_form']/div[2]/div[2]/div/div[2]/div[1]/input";
	public static String permissionsSaveButton = "//*[@id='rightpanelmain']/div/a[1]";
	
	//FE Job Tabs
	public static String jobsHistoryTab = "//*[@id='job-details-ins']/ul/li[2]/a";
	public static String existingJob = "//*[@id='rightpanelmain']/div[2]/div[2]/div[7]/table/tbody/tr[1]";
	public static String createdBy = "//*[@id='tab_job_history']/div/div/div";
	
	//FE Users Permissions
	public static String usersMenu = "//*[@id='sideBarTemplate']/ul/li[3]";
	public static String existingClientUser = "//*[@id='rightpanelmain']/div/div[2]/div[7]/div/table/tbody/tr[9]/td[3]";
	public static String permissionsClientUser = "//*[@id='sideBarTemplate']/ul/li[3]/a";
	public static String permission2 = "//*[@id='userPermisions']/div[1]/div[6]/div[2]/div/div/div[2]/div/input";
	public static String savePermissionButton = "//*[@id='savePermission']";

	//FE Email Log
	public static String emailLogMenu = "//*[@id='sideBarTemplate']/ul/li[4]/a";
	public static String emailLogUser = "//*[@id='rightpanelmain']/div/div[2]/div[7]/div/table/tbody/tr[3]";
	
	//FE User Requests List
	public static String historyRequestTab = "/html/body/div[1]/section/div/ul/li[2]/a";
	public static String requestTable = "/html/body/div[1]/section/div/div/div/div/div[2]/div/div/div/table";
	
	//FE Notices
	public static String userNotices = "//*[@id='sideBarTemplate']/ul/li[3]/a";
	public static String userNoticesAdvancedSearch = "/html/body/div[1]/section/div[1]/div[1]/h5[2]/a";
	public static String userNoticesDownloadPDF = "/html/body/div[1]/section/div[1]/div[5]/div/a/i";
	public static String userNoticesTable = "/html/body/div[1]/section/div[1]/div[3]";
	
	//FE Accounts
	public static String userAccounts = "/html/body/div[1]/section/div[1]/div/ul/li[2]/a";
	public static String userTable = "//*[@id='account_list_desktop']";

	//FE Emails
	public static String userEmailsTab = "/html/body/div[1]/section/div[1]/div/ul/li[3]/a";
	public static String userAddField = "//*[@id='inputEmail']";
	public static String userEmailAddButton = "//*[@id='emailDetails']/div/div/div[2]/input";
	
}


