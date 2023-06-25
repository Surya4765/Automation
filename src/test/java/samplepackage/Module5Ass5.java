package samplepackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Module5Ass5 {


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= new ChromeDriver();

        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
        driver.manage().window().maximize();

        driver.switchTo().frame("iframeResult");
        driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
        driver.switchTo().alert().sendKeys("Test");
        driver.switchTo().alert().accept();
        String s= driver.findElement(By.xpath("//p[@id='demo']")).getText();
        System.out.println(s);
        //Thread.sleep(1000);



       // Thread.sleep(1000);
       // driver.quit();


    }
}
