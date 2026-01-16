@tag
  Feature: Application login

  Background: #Get executed before each and every scenario
    #The scope sits in only this feature file
    Given setup the entries in database
    And launch the browser from config variables
    And hit the homepage url of your application

    @NetBanking
    Scenario: Netbanking Login
      Given User is on the netbanking page
      When user login into the application with "admin" and password "1234"
      Then Home page should be displayed
      And cards should be displayed

    #Data Driven Testing
    @SmokeTest @MortgageUser
    Scenario: Mortgage User
      Given User is on the mortgage registration page
      When user opens the form and is entering data
      #Here the data is passes at the test level and executes once unlike above where
      #2 sets of data are passes resulting in 2 execution
      |first_name|
      |last_name |
      |email@email.com|
      |1234567890|
      Then Home page should be displayed
      And cards should be displayed



