package Denemeler._20_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.Test;
public class FindingCss extends BaseFile {
    public static void main(String[] args) {
        driver.get("https://www.amazon.com.tr/");

        WebElement element = driver.findElement(By.id("nav-link-accountList-nav-line-1"));

        element.click();
        WebElement email =driver.findElement(By.id("ap_email"));
        email.sendKeys("demet123@gmail.com");
        MyFunc.Bekle(2);
        WebElement button=driver.findElement(By.cssSelector("input[ id='continue']"));
        button.click();
        MyFunc.Bekle(2);










        BekleKapat();


    }


}
