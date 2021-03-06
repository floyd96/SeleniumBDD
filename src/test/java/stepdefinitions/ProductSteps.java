package stepdefinitions;

import com.factorry.DriverFactory;
import com.pages.DashboardPage;
import com.pages.LoginPage;
import com.pages.ProductPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class ProductSteps {

    private LoginPage loginPage=new LoginPage(DriverFactory.getDriver());
    private DashboardPage dashboardPage=new DashboardPage(DriverFactory.getDriver());
    private ProductPage productPage=new ProductPage(DriverFactory.getDriver());


    @Given("user has already logged in to application")
    public void user_has_already_logged_in_to_application(DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        List<Map<String,String>> credsList=dataTable.asMaps();
        String username=credsList.get(0).get("username");
        String password=credsList.get(0).get("password");
        DriverFactory.getDriver().get("https://swapnaneel-mukherjee.herokuapp.com/admin/login");
        loginPage.doLogIn(username,password);

    }

    @Given("user has clicked on Products tab")
    public void user_has_clicked_on_products() {
        // Write code here that turns the phrase above into concrete actions
        dashboardPage.clickProductBtn();

    }


    @Given("User clicks on New Product")
    public void user_clicks_on_new_product() {
        // Write code here that turns the phrase above into concrete actions
        productPage.clickNewProduct();

    }

    @When("enters a product name as {string}")
    public void enters_a_product_name(String string) {
        // Write code here that turns the phrase above into concrete actions
        productPage.enterTitle(string);


    }

    @When("enters a product SKU as {string}")
    public void enters_a_product_sku(String string) {
        // Write code here that turns the phrase above into concrete actions
        productPage.enterSKU(string);

    }

    @When("enters a product description as {string}")
    public void enters_a_product_description(String string) {
        // Write code here that turns the phrase above into concrete actions
        productPage.enterDesc(string);

    }

    @When("Clicks on Create Product")
    public void clicks_on_create_product() {
        // Write code here that turns the phrase above into concrete actions
        productPage.clickCreateBtn();

    }

    @Then("new Product should be created")
    public void new_product_should_be_created() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(productPage.isSuccessDisplayed());

    }

    @Then("error message should be displayed")
    public void errorMessageShouldBeDisplayed() {

    }
}
