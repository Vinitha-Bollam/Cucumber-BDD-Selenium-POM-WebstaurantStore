package stepdefs;

import BrowserPages.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StepDefinition {
    private static WebDriver driver;
    public String ActualResult;

    @Before
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*", "ignore-certificate-errors");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
    }
    @Given("User navigates to Webstaurantstore")
    public void user_navigates_to_webstaurantstore() {
        BrowserLaunch bl = new BrowserLaunch(driver);
        bl.navigateToPage();
    }
    @When("User search for {string}")
    public void user_search_for(String string) {
        SearchTab st = new SearchTab(driver,  string);
        st.searchBar();
    }
    @Then("User should see every product with the word {string} in its title for {string} search")
    public void user_should_see_every_product_with_the_word_in_its_title(String checkTitlehasWord, String searchFor) {
        ProductTitleCheck ptc = new ProductTitleCheck(driver, searchFor, checkTitlehasWord);
        ActualResult = ptc.searchTable();
        String ExpectedResult = checkTitlehasWord;
        Assert.assertEquals(ExpectedResult, ActualResult);
    }
    @Then("User should select last of found items to Cart")
    public void user_should_select_last_of_found_items_to_cart() {
        AddLastItemToCart ac = new AddLastItemToCart(driver);
        ac.addToCart();
    }
    @Then("User should Empty Cart")
    public void user_should_empty_cart()  {
        EmptyCart ec = new EmptyCart(driver);
        ec.emptyTheCart();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
}
