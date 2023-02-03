package stepdefinitions;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.Driver;

public class UITestStepDefs {

    WebDriver driver;

    @Given("user goes to {string}")
    public void user_goes_to(String url) {
        Driver.getDriver().get(url);


    }
    @Then("user closes the application")
    public void user_closes_the_application() throws InterruptedException {
        Driver.closeDriver();

    }
}
