package stepdefinitions;

import com.factorry.DriverFactory;
import com.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSteps {

    private LoginPage loginPage=new LoginPage(DriverFactory.getDriver());
    private static String title;

    @Given("user is on Login Page")
    public void user_is_on_login_page() {
        // Write code here that turns the phrase above into concrete actions
        DriverFactory.getDriver().get("https://swapnaneel-mukherjee.herokuapp.com/admin/login");

        //throw new io.cucumber.java.PendingException();
    }

    @When("user enters username {string}")
    public void user_enters_username(String string) {
        // Write code here that turns the phrase above into concrete actions
        loginPage.enterEmailID(string);
        //throw new io.cucumber.java.PendingException();
    }

    @When("user enters password {string}")
    public void user_enters_password(String string) {
        // Write code here that turns the phrase above into concrete actions
        loginPage.enterPassword(string);
        //throw new io.cucumber.java.PendingException();
    }

    @When("user clicks on logIn button")
    public void user_clicks_on_log_in_button() {
        // Write code here that turns the phrase above into concrete actions
        loginPage.hitLogInBtn();
        //throw new io.cucumber.java.PendingException();
    }

    @Then("user gets title of the page")
    public void user_gets_title_of_the_page() {
        // Write code here that turns the phrase above into concrete actions
        title=loginPage.getTitle();

        //throw new io.cucumber.java.PendingException();
    }

    @Then("page title should be {string}")
    public void page_title_should_be(String expectedTitle) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(title.equalsIgnoreCase(expectedTitle));

        //throw new io.cucumber.java.PendingException();
    }
}
