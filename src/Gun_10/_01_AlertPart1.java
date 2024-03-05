package Gun_10;

import Utilty.Basedriver;
import Utilty.Myfunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_AlertPart1 extends Basedriver {
    @Test
    public void Test(){
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");
        Myfunc.Bekle(3);

        WebElement click1= driver.findElement(By.cssSelector("button[onclick='myAlertFunction()']"));
        click1.click();
        Myfunc.Bekle(2);
        //alert acildi

        driver.switchTo().alert().accept();
        //alert kutusuna git,ok ye bas ,kapaniyor

        BekleKapat();
    }
}
