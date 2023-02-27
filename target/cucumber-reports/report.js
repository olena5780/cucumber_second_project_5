$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/smartbear.feature");
formatter.feature({
  "name": "SmartBear Functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Validate invalid login attempt",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user enters username as \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user enters password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on Login button",
  "keyword": "And "
});
formatter.step({
  "name": "user should see \"\u003cmessage\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "message"
      ]
    },
    {
      "cells": [
        "abcd",
        "abcd1234",
        "Invalid Login or Password."
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user is on \"http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx\"",
  "keyword": "Given "
});
formatter.match({
  "location": "SmartBearSteps.userNavigatesTo(String)"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\n\tat steps.SmartBearSteps.userNavigatesTo(SmartBearSteps.java:25)\n\tat ✽.user is on \"http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx\"(src/test/resources/features/smartbear.feature:5)\n",
  "status": "failed"
});
formatter.scenario({
  "name": "Validate invalid login attempt",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user enters username as \"abcd\"",
  "keyword": "When "
});
formatter.match({
  "location": "SmartBearSteps.user_enters_username_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters password as \"abcd1234\"",
  "keyword": "And "
});
formatter.match({
  "location": "SmartBearSteps.user_enters_password_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "SmartBearSteps.user_clicks_on_Login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should see \"Invalid Login or Password.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SmartBearSteps.user_should_see_message(String)"
});
formatter.result({
  "status": "skipped"
});
});