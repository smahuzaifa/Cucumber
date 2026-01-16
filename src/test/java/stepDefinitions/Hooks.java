    package stepDefinitions;

    import io.cucumber.java.After;
    import io.cucumber.java.Before;
    import org.testng.Assert;

    public class Hooks {
        @Before("@NetBanking") //These are called hooks and run before the test case
        //with the mentioned tag
        public void netBankingSetup(){
            System.out.println("This is before code");
            System.out.println("setup the entries in Netbanking database");
        }
        @Before("@MortgageUser")
        public void mortgageUserSetup(){
            System.out.println("This is before code");
            System.out.println("setup the entries in Mortgage User database");
        }
        @After
        public void Teardown(){
            System.out.println("This is after code");
        }
    }
