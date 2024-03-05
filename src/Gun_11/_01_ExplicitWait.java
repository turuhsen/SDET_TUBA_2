package Gun_11;

import Utilty.Basedriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _01_ExplicitWait extends Basedriver {
    @Test
    public void Test(){

        //element var ama tiklanabilir olana kadar beklemem gereken durumlar
        //element var ama icine yazi gönderilebilir durumda degil
        //alertin gözükmesini bekle
        //url bekledigin olana kadar bekle

        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
        WebElement btn= driver.findElement(By.xpath("//button[@onclick='timedText()']"));
        btn.click();

        WebElement msg=driver.findElement(By.id("demo"));
        //bu locator in görünen yazisi bu olana kadar bekle

        WebDriverWait bekle=new WebDriverWait(driver, Duration.ofSeconds(20));
        bekle.until(ExpectedConditions.textToBe(By.id("demo"),"WebDriver"));
        //text bu olana kadar bekle

        System.out.println("msg.getText() = " + msg.getText());//webdriver

        BekleKapat();
    }
}
