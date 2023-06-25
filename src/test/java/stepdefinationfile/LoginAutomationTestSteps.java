package stepdefinationfile;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import reusable.Browsercall;

import java.io.IOException;

public class LoginAutomationTestSteps {

   WebDriver driver; // Global variable
    WebElement currencyElement; // Global Variable

@When("User enter the username {string} and password {string}")
public void enterUsernamePassword(String username, String password)
{
   //driver.findElement(By.id("username")).sendKeys(username);
   // driver.findElement(By.id("password")).sendKeys(password);
    driver.findElement(By.cssSelector("input[id='username']")).sendKeys("Surya");
    driver.findElement(By.cssSelector("#password")).sendKeys("123");

}
    @Given("User launch the browser and navigate to URL")
    public void launchBrowser() throws IOException {

        Browsercall.browserInvocation();
        //driver = new EdgeDriver();
       // driver.get("https://book.spicejet.com/");
       // driver.get("https://login.salesforce.com/");
       // driver.manage().window().maximize();
    }

    @And("User clicks the login button")
    public void loginButton() {
        //driver.findElement(By.id("Login")).click();
        driver.findElement(By.cssSelector(".button.r4.wide.primary")).click();
       // driver.findElement(By.linkText("Forgot Your Password?")).click();
        //driver.findElement(By.partialLinkText("Forgot Your")).click();

    }

    @Then("Validate the error message")
    public void errorMessageValidation() {
        String errorMessage = driver.findElement(By.id("error")).getText();
        System.out.println(errorMessage);
    }

    @Then("Validate whether the user navigate to homepage")
    public void validateUserLogin() {

    }

    @When("User selects the specific dropdown value")
    public void handlingDropdown() {

        currencyElement = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency"));
        Select selectCurrency = new Select(currencyElement);
        //selectCurrency.selectByIndex(0);
        //selectCurrency.selectByVisibleText("OMR");
       selectCurrency.selectByValue("OMR");

        driver.findElement(By.id("divpaxinfo"));
        WebElement adlutElement = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT"));
        Select adultDropdown = new Select(adlutElement);
        adultDropdown.selectByIndex(3);


    }

    @And("User iterates the dropdown value")
    public void iterateDropdownValues() {

        int currencyDropdownSize = currencyElement.findElements(By.tagName("option")).size();

    for(int i = 0; i < currencyDropdownSize ; i++)
    {
       String value = currencyElement.findElements(By.tagName("option")).get(i).getText();
        System.out.println(value);
    }


    }

    @When("User selects the dynamic dropdown value")
    public void dynamicDropdownValue() {

    driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
    driver.findElement(By.xpath("//a[@value='MAA'")).click();

    WebElement toValue = driver.findElement(By.id("glsControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR"));
    toValue.findElement(By.xpath("//a[@value='BLR'")).click();



    }
}
