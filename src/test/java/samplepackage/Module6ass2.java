package samplepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Module6ass2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= new ChromeDriver();
        driver.get("http://only-testing-blog.blogspot.com/2014/09/selectable.html");
       // Thread.sleep(1000);
       // driver.findElement(By.xpath("//button[contains(text(),'See Alert')]"));
        Actions actions= new Actions(driver);
        WebElement click1= driver.findElement(By.xpath("//button[contains(text(),'See Alert')]"));

        actions.doubleClick(click1).perform();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
       //d driver.close();
    }
}
