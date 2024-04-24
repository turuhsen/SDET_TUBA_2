package ODEVLER._07_03_Wait_Scroll_Alert;

import Utilty.Basedriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

public class odev3 extends Basedriver {
//1) https://demoqa.com/dynamic-properties adresine gidin
//            2) “Will enable 5 seconds” butonunun enable olmasini bekleyin
//3) “Will enable 5 seconds” butonunun enable oldugunu test edin
    @Test
    public void Test(){
        driver.get("https://demoqa.com/dynamic-properties");
        WebElement enablebutton= driver.findElement(By.id("enableAfter"));
        wait.until(ExpectedConditions.elementToBeClickable(enablebutton));

        Assert.assertTrue("Enable degil",enablebutton.isEnabled());

        BekleKapat();
    }
}
