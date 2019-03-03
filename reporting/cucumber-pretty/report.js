$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/Paru/Desktop/API/JenkinTest/features/login.feature");
formatter.feature({
  "line": 2,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Fun"
    }
  ]
});
formatter.before({
  "duration": 13991057096,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Login with invalid credentials",
  "description": "",
  "id": "login;login-with-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is in login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Enter invalid email and password",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Error message appear",
  "keyword": "Then "
});
formatter.match({
  "location": "loginpage.user_is_in_login_page()"
});
formatter.result({
  "duration": 435467850,
  "status": "passed"
});
formatter.match({
  "location": "loginpage.enter_invalid_email_and_password()"
});
formatter.result({
  "duration": 5175553,
  "status": "passed"
});
formatter.match({
  "location": "loginpage.error_message_appear()"
});
formatter.result({
  "duration": 1649510,
  "status": "passed"
});
formatter.after({
  "duration": 282785952,
  "status": "passed"
});
});