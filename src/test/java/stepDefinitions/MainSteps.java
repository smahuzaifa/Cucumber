package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class MainSteps {
    @Given("user is on the landing page")
    public void user_is_on_the_landing_page() {
        System.out.println("user is on the landing page");
    }

    @When("user login into the application with {string} and password {string}")
    public void user_login_into_the_application_with_and_password(String username, String password) {
        System.out.println("user login into the application with " + username + " and " + password);
    }

    @When("user login into the application with {string} and password {string} combination")
    public void user_login_into_the_application_with_and_password_combination(String string, String string2) {
        System.out.println("user login into the application with " + string + " and " + string2 + " combination");
    }

    @Then("Home page should be displayed")
    public void home_page_should_be_displayed() {
        System.out.println("Home page should be displayed");
    }

    @Then("cards should be displayed")
    public void cards_should_be_displayed() {
        System.out.println("cards should be displayed");
        System.out.println();
    }

    //Data Driven Testing
    @Given("user is on the registration page")
    public void user_is_on_the_registration_page() {
        System.out.println("user is on the registration page");
    }

    @When("user opens the form and is entering data")
    public void user_opens_the_form_and_is_entering_data(List<String> data) {
        for (String field : data) {
            //Use enhanced for loop for simple read-only iteration without index needs;
            // use regular for loop when requiring index access, element modification,
            // reverse iteration, or step-by-step processing.
            System.out.println(field);
        }
    }

    //Background codes
    @Given("setup the entries in database")
    public void setup_the_entries_in_database() {
        System.out.println("Background code is executed");
        System.out.println("setup the entries in database");
    }

    @Given("launch the browser from config variables")
    public void launch_the_browser_from_config_variables() {
        System.out.println("launch the browser from config variables");
    }

    @Given("hit the homepage url of your application")
    public void hit_the_homepage_url_of_your_application() {
        System.out.println("hit the homepage url of your application");
    }

    @Given("User is on the netbanking page")
    public void user_is_on_the_netbanking_page() {
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("user is on the netbanking page");
    }

    @Given("User is on the mortgage registration page")
    public void user_is_on_the_mortgage_registration_page() {
        System.out.println("************************");
        System.out.println("user is on the mortgage registration page");
    }

}
