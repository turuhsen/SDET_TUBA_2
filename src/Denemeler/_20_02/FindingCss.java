package Denemeler._20_02;

import Utilty.Basedriver;
import Utilty.Myfunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.Test;

import static Utilty.Basedriver.driver;

public class FindingCss extends Basedriver {
    public static void main(String[] args) {
        driver.get("https://www.amazon.com.tr/");

        WebElement element = driver.findElement(By.id("nav-link-accountList-nav-line-1"));

        element.click();
        WebElement email =driver.findElement(By.id("ap_email"));
        email.sendKeys("demet123@gmail.com");
        Myfunc.Bekle(2);
        WebElement button=driver.findElement(By.cssSelector("input[ id='continue']"));
        button.click();
        Myfunc.Bekle(2);










        BekleKapat();


    }


}
