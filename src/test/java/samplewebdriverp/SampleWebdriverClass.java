package samplewebdriverp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SampleWebdriverClass {


    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();

        driver.get("https://login.salesforce.com/");
        driver.findElement(By.id("username")).sendKeys("Aravinth");
        //driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Aravinth");
       // driver.findElement(By.className("input r4 wide mb16 mt8 username")).sendKeys("test");
        driver.findElement(By.name("pw")).sendKeys("123");
        driver.findElement(By.id("Login")).click();
      String errorMessage = driver.findElement(By.id("error")).getText();
        System.out.println(errorMessage);

    }
}
