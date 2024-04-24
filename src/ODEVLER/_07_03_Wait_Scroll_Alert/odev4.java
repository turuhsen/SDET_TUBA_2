package ODEVLER._07_03_Wait_Scroll_Alert;

import Utilty.Basedriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class odev4 extends Basedriver {
    @Test
    public void Test(){
     //   https://demoqa.com/dynamic-properties adresine gidin
     //   1) “Visible After 5 seconds” butonunun gorunur olmasini bekleyin
     //   2) “Visible After 5 seconds” butonunun gorunur oldugunu test edin

        driver.get("https://demoqa.com/dynamic-properties");
        WebElement visibleafter= driver.findElement(By.id("visibleAfter"));

        wait.until(ExpectedConditions.visibilityOf(visibleafter));

        Assert.assertTrue("Buton görünür degil",visibleafter.isDisplayed());

        BekleKapat();
    }
}
