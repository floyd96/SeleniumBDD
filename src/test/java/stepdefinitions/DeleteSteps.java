package stepdefinitions;

import com.factorry.DriverFactory;
import com.pages.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DeleteSteps {
    private ProductPage productPage=new ProductPage(DriverFactory.getDriver());
    private int listSize;


    @Given("a list of products")
    public void a_list_of_products() {
        listSize=productPage.getProductListSize();

    }

    @When("User clicks on delete button for the first product")
    public void user_clicks_on_delete_button_for_the_first_product() {
        productPage.clickDeleteBtn();
    }

    @And("accepts the delete warning")
    public void accepts_the_delete_warning() {
        productPage.acceptAlert();

    }

    @Then("the product list should decrease by One")
    public void the_product_list_should_decrease_by_one() {
        Assert.assertTrue(productPage.getProductListSize()==listSize-1);
    }
}
