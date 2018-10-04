$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/features/aclogin.feature");
formatter.feature({
  "name": "Launch and Login to a2c",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Click on Search client Name",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Search"
    }
  ]
});
formatter.step({
  "name": "Enter Client Name as \u003cClient Name\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "Click on client",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Client Name"
      ]
    },
    {
      "cells": [
        "American Bank"
      ]
    }
  ]
});
formatter.background({
  "name": "Launch the browser and login to a2c",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Launch the Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.LaunchtheBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to the URL",
  "keyword": "And "
});
formatter.match({
  "location": "Login.NavigatetotheURL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Maximise the Browser",
  "keyword": "And "
});
formatter.match({
  "location": "Login.MaximisetheBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Set the timeout",
  "keyword": "And "
});
formatter.match({
  "location": "Login.Setthetimeout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on the qauth link",
  "keyword": "And "
});
formatter.match({
  "location": "Login.Clickontheqauthlink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter username as pkona@usqaex",
  "keyword": "And "
});
formatter.match({
  "location": "Login.Enterusername(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter password as Portal123!",
  "keyword": "And "
});
formatter.match({
  "location": "Login.Enterpassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click submit button",
  "keyword": "When "
});
formatter.match({
  "location": "Login.Clicksubmitbutton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User landed to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.Userlandedtohomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Click on Search client Name",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Search"
    }
  ]
});
formatter.step({
  "name": "Enter Client Name as American Bank",
  "keyword": "When "
});
formatter.match({
  "location": "Login.EnterClientName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on client",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.Clickonclient()"
});
formatter.result({
  "status": "passed"
});
});