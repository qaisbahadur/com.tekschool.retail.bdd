$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/RetailTestScenarios.feature");
formatter.feature({
  "line": 1,
  "name": "Retail Test Scenarios",
  "description": "",
  "id": "retail-test-scenarios",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6881934000,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User is on Retail website",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginTestStepDefinition.user_is_on_Retail_website()"
});
formatter.result({
  "duration": 7917490300,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "Product from Shopping Cart",
  "description": "",
  "id": "retail-test-scenarios;product-from-shopping-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 30,
      "name": "@RemoveProduct"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "User click on Shopping cart menu",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "User see list of item is displayed",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "User click on Red X button",
  "keyword": "Then "
});
formatter.match({
  "location": "RemoveItemStepDefinition.user_click_on_Shopping_cart_menu()"
});
formatter.result({
  "duration": 5542478000,
  "status": "passed"
});
formatter.match({
  "location": "RemoveItemStepDefinition.user_see_list_of_item_is_displayed()"
});
