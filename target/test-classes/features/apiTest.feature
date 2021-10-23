
Feature: create board and cards on trello

  Scenario: API random test
    Given Trello üzerinde bir board oluşturunuz
    When  Olusturdugunuz boarda iki tane kart oluşturunuz
    And   Olusturdugunuz bu iki karttan random olacak sekilde bir tanesini güncelleyiniz
    Then  Olusturdugunuz kartları siliniz
    Then  Olusturdugunuz boardu siliniz