Feature: Test login feature for gmail
  Scenario: sign in on gmail login page
    Given I on gmail sign in page
    When I enter "fanta5699@gmail.com" in email field
    And I click Next button
    And I enter "Lhfrjyxbr1" in password field
    And I click Next button
    Then I on my account page


