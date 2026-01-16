    package stepDefinitions;

    import io.cucumber.java.en.*;

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
            System.out.println("user login into the application with " + string + " and " + string2 +" combination");
        }
        @Then("Home page should be displayed")
        public void home_page_should_be_displayed() {
            System.out.println("Home page should be displayed");
        }
        @Then("cards should be displayed")
        public void cards_should_be_displayed() {
            System.out.println("cards should be displayed");
        }
    }
