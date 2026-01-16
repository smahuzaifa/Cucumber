@tag
  Feature: Application login

  Background: #Get executed before each and every scenario
    #The scope sits in only this feature file
    Given setup the entries in database
    And launch the browser from config variables
    And hit the homepage url of your application

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
    @RegressionTest @SmokeTest
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

    #Data Driven Testing
    @SmokeTest
    Scenario: Filling a form
      Given user is on the registration page
      When user opens the form and is entering data
      #Here the data is passes at the test level and executes once unlike above where
      #2 sets of data are passes resulting in 2 execution
      |first_name|
      |last_name |
      |email@email.com|
      |1234567890|
      Then Home page should be displayed
      And cards should be displayed



