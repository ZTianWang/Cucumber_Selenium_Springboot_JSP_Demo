package nz.ac.auckland.se754.web.stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import nz.ac.auckland.se754.web.pages.Addpage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class AddStepDefs {

    private WebDriver driver;
    private Addpage addpage;

    @Before("@Test")
    public void setup() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        if (System.getenv("headless") != null && System.getenv("headless").equals("true")) {
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--headless");
            options.addArguments("--disable-gpu");
            options.addArguments("--window-size=1920,1200");
            options.addArguments("--ignore-certificate-errors");
            options.addArguments("--disable-extensions");
        }
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        addpage = new Addpage(driver);
    }

    @After("@Test")
    public void tearDown() {
        driver.quit();
    }

    @Given("I was in the add page")
    public void i_was_in_the_add_page() {
        driver.get("http://localhost:8080/test/add");
    }
    @When("I enter num1 {int}")
    public void i_enter_num1(Integer int1) {
        addpage.entryNum1(int1);
    }
    @When("I enter num2 {int}")
    public void i_enter_num2(Integer int1) {
        addpage.entryNum2(int1);
    }

    @When("I click add button")
    public void i_click_addBtn() {
        addpage.clickBtn();
    }

    @Then("The result is {int}")
    public void the_result_is(Integer int1) {
        int result = Integer.parseInt(addpage.getResult());
        Assertions.assertEquals(int1,result);
    }
}
