$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/apiTest.feature");
formatter.feature({
  "name": "create board and cards on trello",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "API random test",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Trello üzerinde bir board oluşturunuz",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Olusturdugunuz boarda iki tane kart oluşturunuz",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Olusturdugunuz bu iki karttan random olacak sekilde bir tanesini güncelleyiniz",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Olusturdugunuz kartları siliniz",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Olusturdugunuz boardu siliniz",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});