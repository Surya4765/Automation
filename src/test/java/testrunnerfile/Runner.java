package testrunnerfile;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(

        features = {"src/test/resources/featurefile"},
        glue = {"stepdefinationfile"},
        tags = "@DynamicdropValidation",
        plugin={"pretty", "html:target/htmlreports.html"}
)

public class Runner {


}
