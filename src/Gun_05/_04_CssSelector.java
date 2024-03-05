package Gun_05;

import Utilty.Basedriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _04_CssSelector extends Basedriver {
    public static void main(String[] args) {

        //senaryo
        //https://demo.seleniumeasy.com/basic-first-form-demo.htm safasina gidin
        //"kutucuga "merhaba selenium" yazip butona tiklatiniz
        //Butona tikladiginda merhaba selenium yaziyorsa test passed degilse failed yazicak
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        WebElement element=driver.findElement(By.cssSelector("input[id='user-message']"));
        element.sendKeys("Merhaba Selenium");

        WebElement element1=driver.findElement(By.cssSelector("[onclick='showInput();']"));
        element1.click();

        WebElement txt=driver.findElement(By.cssSelector("[id='display']"));
        if (txt.getText().contains("Merhaba Selenium"))
            System.out.println("test passed");
        else
            System.out.println("test failed");

        BekleKapat();


    }
}
