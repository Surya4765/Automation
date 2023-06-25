package reusable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Browsercall {
  static  WebDriver driver;
    public static void browserInvocation() throws IOException {

        FileInputStream inputStream= new FileInputStream("environment.properties");
        Properties prob= new Properties();
        prob.load(inputStream);

        driver = new EdgeDriver();
        driver.get(prob.getProperty("prob"));
        // driver.get("https://login.salesforce.com/");
        driver.manage().window().maximize();

    }
}
