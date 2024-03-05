package ODEVLER._22_02_XPath;

import Utilty.Basedriver;
import Utilty.Myfunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev2 extends Basedriver {
//    1) Bu siteye gidin. -> https://demo.applitools.com/
//
//            2) Username kısmına "ttechno@gmail.com" girin.
//
//3) Password kısmına "techno123." girin.
//
//4) "Sign in" buttonunan tıklayınız.
//
//            5) "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız.

    @Test
    public void Test(){
        driver.get(" https://demo.applitools.com");

        WebElement username= driver.findElement(By.xpath("(//h4[@class='auth-header']/following-sibling::form//input)[1]"));
        username.sendKeys("ttechno@gmail.com");
        Myfunc.Bekle(2);

        WebElement password= driver.findElement(By.xpath("(//h4[@class='auth-header']/following-sibling::form//input)[2]"));
        password.sendKeys("techno123.");
        Myfunc.Bekle(2);

        WebElement signbutton= driver.findElement(By.xpath("(//h4[@class='auth-header']/following-sibling::form//a)[1]"));
       signbutton.click();
        Myfunc.Bekle(2);

        WebElement text=driver.findElement(By.xpath("(//div[@class='element-wrapper compact pt-4']//h6)[1]"));
        Myfunc.Bekle(2);
        Assert.assertTrue("Yazi gözükmedi",text.getText().contains("Your nearest branch closes in: 30m 5s"));
        BekleKapat();
    }
}
