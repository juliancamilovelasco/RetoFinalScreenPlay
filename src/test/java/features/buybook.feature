
@1
Feature: Buy a Book
  As a web user
  I want to Buy a Book in practiceAutomationTesting.com
  to me

  @2
  Scenario Outline: step1

    Given that Julian want to buy a book 2 Items

    When he selects two books
      | firstName   | lastName   | emailAddress   | phone   | address   | city   | country   |
      | <firstName> | <lastName> | <emailAddress> | <phone> | <address> | <city> | <country> |

    Then He should see Thank you. Your order has been received.

    Examples:
      | firstName | lastName | emailAddress     | phone | address    | city   | country  |
      | julian    | velasco  | julian@gmail.com | 12345 | abcde12345 | bogota | colombia |

  @3
  Scenario: step2
    Given that Julian enters to my account
    When he wants to login julian julian
    Then verify that he is not registered yet ERROR

