package ODEVLER._21_02_CssSelector;

import Utilty.Basedriver;
import Utilty.Myfunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev2 extends Basedriver {
    @Test

   /* 1) Bu siteye gidin. -> https://demo.applitools.com/

            2) Username kısmına "ttechno@gmail.com" girin.

3) Password kısmına "techno123." girin.

4) "Sign in" buttonunan tıklayınız.

            5) "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız*/
    public void Test1(){
        driver.get("https://demo.applitools.com");

        WebElement username=driver.findElement(By.cssSelector("[id='username']"));
        username.sendKeys("ttechno@gmail.com");
        Myfunc.Bekle(3);

        WebElement password=driver.findElement(By.cssSelector("[id='password']"));
        password.sendKeys("techno123.");
        Myfunc.Bekle(3);

        WebElement button =driver.findElement(By.cssSelector("[id='log-in']"));
       button.click();
        Myfunc.Bekle(3);

        WebElement text=driver.findElement(By.cssSelector("[id='time']"));
        Assert.assertTrue("Mesaj bulunamadi",text.getText().contains("Your nearest branch closes in: 30m 5s"));

        BekleKapat();
    }
}
