package samplewebdriverp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleDriverClass {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S470009140%3A1684861992043926&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ifkv=Af_xneGOead7C-paeV_UcSIg2OOQ3sjNbaVHG-lDRFi_QHH01PlA8O5aQDkLJldOV8qiE9Mz3OIO&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        driver.findElement(By.id("identifierId")).sendKeys("suryanadimpalli2211@gmail.com");
       //driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
        driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/div/div[1]/div/form/span/section/div/div/div[3]/button")).click();
        driver.findElement(By.id("recoveryIdentifierId")).sendKeys("suryanadimpalli2211@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"queryPhoneNext\"]/div/button/span")).click();



    }
}
