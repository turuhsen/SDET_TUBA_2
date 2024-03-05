package ODEVLER._21_02_CssSelector;

import Utilty.Basedriver;
import Utilty.Myfunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev5 extends Basedriver {
    @Test

   //Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]

   //Fake Alerts' tıklayınız.

   //Show Alert Box'a tıklayınız.

   //Ok'a tıklayınız.

   //Alert kapanmalıdır.
    public void Test(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement fakelaert= driver.findElement(By.cssSelector("[id='fakealerttest']"));
        fakelaert.click();
        Myfunc.Bekle(2);

        WebElement showbutton= driver.findElement(By.cssSelector("[id='fakealert']"));
        showbutton.click();
        Myfunc.Bekle(2);

        WebElement okbutton= driver.findElement(By.cssSelector("[id='dialog'] button"));
        okbutton.click();
        Myfunc.Bekle(2);

        BekleKapat();



    }
}
