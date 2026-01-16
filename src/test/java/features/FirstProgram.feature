@tag
  Feature: Application login

    Scenario: Admin Page Default Login
      Given user is on the landing page
      When user login into the application with "admin" and password "1234"
      Then Home page should be displayed
      And cards should be displayed

    #Reusable
    Scenario: User Page Default Login
      Given user is on the landing page
      When user login into the application with "user" and password "1234"
      Then Home page should be displayed
      And cards should be displayed


    #Parametarisation : When we want to run the same test case but with different credentials
    Scenario Outline: User Page Default Login
      Given user is on the landing page
      When user login into the application with "<user>" and password "<pass>" combination
      #user and password act as variables whose values are passed under examples
      Then Home page should be displayed
      And cards should be displayed
      Examples:
      |user|pass|
      |debit|1234|
      |credit|3456|



