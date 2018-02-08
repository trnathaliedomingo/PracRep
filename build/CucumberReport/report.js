$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("fe.regressiontest/feAddNote.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Nathalie Domingo"
    }
  ],
  "line": 3,
  "name": "Add Note on Request",
  "description": "",
  "id": "add-note-on-request",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 10,
  "name": "I should be able to add a note on a request",
  "description": "",
  "id": "add-note-on-request;i-should-be-able-to-add-a-note-on-a-request",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 11,
  "name": "I am in dashboard page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I click on requests menu at sidebar",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I click on an existing request",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click request history tab",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I fill in note field, \u003cnote\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I click the save request button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Adding note success message should appear",
  "keyword": "Then "
});
formatter.examples({
  "line": 19,
  "name": "",
  "description": "",
  "id": "add-note-on-request;i-should-be-able-to-add-a-note-on-a-request;",
  "rows": [
    {
      "cells": [
        "note"
      ],
      "line": 20,
      "id": "add-note-on-request;i-should-be-able-to-add-a-note-on-a-request;;1"
    },
    {
      "cells": [
        "This is an automated note. - regression"
      ],
      "line": 21,
      "id": "add-note-on-request;i-should-be-able-to-add-a-note-on-a-request;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I am in log in page, {loginURL}",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I input valid log in credentials, {staffusername}, {staffpassword}",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click log me in button",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "{loginURL}",
      "offset": 21
    }
  ],
  "location": "feLogin.i_am_in_log_in_page_loginURL(String)"
});
formatter.result({
  "duration": 17775558517,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "{staffusername}",
      "offset": 34
    },
    {
      "val": "{staffpassword}",
      "offset": 51
    }
  ],
  "location": "feLogin.i_input_valid_log_in_credentials(String,String)"
});
formatter.result({
  "duration": 533501534,
  "status": "passed"
});
formatter.match({
  "location": "feLogin.i_click_log_me_in_button()"
});
formatter.result({
  "duration": 189574456,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "I should be able to add a note on a request",
  "description": "",
  "id": "add-note-on-request;i-should-be-able-to-add-a-note-on-a-request;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 11,
  "name": "I am in dashboard page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I click on requests menu at sidebar",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I click on an existing request",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click request history tab",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I fill in note field, This is an automated note. - regression",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I click the save request button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Adding note success message should appear",
  "keyword": "Then "
});
formatter.match({
  "location": "feBuildVersion.i_am_in_dashboard_page()"
});
formatter.result({
  "duration": 5474146275,
  "status": "passed"
});
formatter.match({
  "location": "feRequestsListingPage.i_click_on_requests_menu_at_sidebar()"
});
formatter.result({
  "duration": 2045820226,
  "status": "passed"
});
formatter.match({
  "location": "feAddNote.i_click_on_an_existing_request()"
});
formatter.result({
  "duration": 2903591688,
  "status": "passed"
});
formatter.match({
  "location": "feAddNote.i_click_request_history_tab()"
});
formatter.result({
  "duration": 157022989,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "This is an automated note. - regression",
      "offset": 22
    }
  ],
  "location": "feAddNote.i_fill_in_note_field_This_is_an_automated_note_regression(String)"
});
formatter.result({
  "duration": 621464939,
  "status": "passed"
});
formatter.match({
  "location": "feAddNote.i_click_the_save_request_button()"
});
formatter.result({
  "duration": 152765377,
  "status": "passed"
});
formatter.match({
  "location": "feAddNote.adding_note_success_message_should_appear()"
});
formatter.result({
  "duration": 61677,
  "status": "passed"
});
formatter.uri("fe.regressiontest/feAddNoticeType.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Nathalie Domingo"
    }
  ],
  "line": 3,
  "name": "Add Notice Type",
  "description": "",
  "id": "add-notice-type",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 11,
  "name": "I should be able to add notice type",
  "description": "",
  "id": "add-notice-type;i-should-be-able-to-add-notice-type",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 12,
  "name": "I am in client listing page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I click on FE Water client",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I click on notice types menu at sidebar",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I click Add notice type button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I input notice type name, \u003cnoticetype\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I notice type save button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I have successfully added a notice type",
  "keyword": "Then "
});
formatter.examples({
  "line": 20,
  "name": "",
  "description": "",
  "id": "add-notice-type;i-should-be-able-to-add-notice-type;",
  "rows": [
    {
      "cells": [
        "noticetype"
      ],
      "line": 21,
      "id": "add-notice-type;i-should-be-able-to-add-notice-type;;1"
    },
    {
      "cells": [
        "Automation"
      ],
      "line": 22,
      "id": "add-notice-type;i-should-be-able-to-add-notice-type;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I am in log in page, {loginURL}",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I input valid log in credentials, {clientUsername}, {clientPasword}",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click log me in button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click admin menu at sidebar",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "{loginURL}",
      "offset": 21
    }
  ],
  "location": "feLogin.i_am_in_log_in_page_loginURL(String)"
});
formatter.result({
  "duration": 5483135618,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "{clientUsername}",
      "offset": 34
    },
    {
      "val": "{clientPasword}",
      "offset": 52
    }
  ],
  "location": "feLogin.i_input_valid_log_in_credentials(String,String)"
});
formatter.result({
  "duration": 396305350,
  "status": "passed"
});
formatter.match({
  "location": "feLogin.i_click_log_me_in_button()"
});
formatter.result({
  "duration": 193899812,
  "status": "passed"
});
formatter.match({
  "location": "feClientsListingPage.i_click_admin_menu_at_sidebar()"
});
formatter.result({
  "duration": 6703737093,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "I should be able to add notice type",
  "description": "",
  "id": "add-notice-type;i-should-be-able-to-add-notice-type;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 12,
  "name": "I am in client listing page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I click on FE Water client",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I click on notice types menu at sidebar",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I click Add notice type button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I input notice type name, Automation",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I notice type save button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I have successfully added a notice type",
  "keyword": "Then "
});
formatter.match({
  "location": "feAddNoticeType.i_am_in_client_listing_page()"
});
formatter.result({
  "duration": 379719,
  "status": "passed"
});
formatter.match({
  "location": "feAddNoticeType.i_click_on_FE_Water_client()"
});
formatter.result({
  "duration": 12662178913,
  "status": "passed"
});
formatter.match({
  "location": "feAddNoticeType.i_click_on_notice_types_menu_at_sidebar()"
});
formatter.result({
  "duration": 1558330604,
  "status": "passed"
});
formatter.match({
  "location": "feAddNoticeType.i_click_Add_notice_type_button()"
});
formatter.result({
  "duration": 133564569,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Automation",
      "offset": 26
    }
  ],
  "location": "feAddNoticeType.i_input_notice_type_name_Automation(String)"
});
formatter.result({
  "duration": 10455843052,
  "status": "passed"
});
formatter.match({
  "location": "feAddNoticeType.i_notice_type_save_button()"
});
formatter.result({
  "duration": 10185274900,
  "status": "passed"
});
formatter.match({
  "location": "feAddNoticeType.i_have_successfully_added_a_notice_type()"
});
formatter.result({
  "duration": 60294,
  "status": "passed"
});
formatter.uri("fe.regressiontest/feClientJobsHistory.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Nathalie Domingo"
    }
  ],
  "line": 2,
  "name": "Client Jobs History",
  "description": "",
  "id": "client-jobs-history",
  "keyword": "Feature"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am in log in page, {loginURL}",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I input valid log in credentials as client, {clientUsername}, {clientPassword}",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click log me in button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click on jobs menu at sidebar",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "{loginURL}",
      "offset": 21
    }
  ],
  "location": "feLogin.i_am_in_log_in_page_loginURL(String)"
});
formatter.result({
  "duration": 6638439950,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "{clientUsername}",
      "offset": 44
    },
    {
      "val": "{clientPassword}",
      "offset": 62
    }
  ],
  "location": "feCreateJobClient.i_input_valid_log_in_credentials_as_client_clientUsername_clientPassword(String,String)"
});
formatter.result({
  "duration": 418993978,
  "status": "passed"
});
formatter.match({
  "location": "feLogin.i_click_log_me_in_button()"
});
formatter.result({
  "duration": 194745833,
  "status": "passed"
});
formatter.match({
  "location": "feJobsListingPage.i_click_on_jobs_menu_at_sidebar()"
});
