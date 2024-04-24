package ODEVLER._07_03_Wait_Scroll_Alert;

import Utilty.Basedriver;
import Utilty.Myfunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class odev2 extends Basedriver {
  //  Senaryo
//1) https://demoqa.com/browser-windows adresine gidin
//            2) Alerts’e tiklayin
//3) On button click, alert will appear after 5 seconds karsisindaki click me butonuna basin
//4) Allert’in gorunur olmasini bekleyin
//5) Allert uzerindeki yazinin “This alert appeared after 5 seconds” oldugunu test edin
//6) Ok diyerek alerti kapatin
   @Test
    public void Test(){
        driver.get("https://demoqa.com/browser-windows");

        WebElement alerts= driver.findElement(By.xpath("//span[text()='Alerts']"));
        wait.until(ExpectedConditions.elementToBeClickable(alerts));
        alerts.click();

        WebElement button1= driver.findElement(By.id("timerAlertButton"));
       wait.until(ExpectedConditions.elementToBeClickable(button1));
        button1.click();

       wait.until(ExpectedConditions.alertIsPresent());
       Myfunc.Bekle(3);
       String yazi=driver.switchTo().alert().getText();

       Assert.assertTrue("Yazilar ayni degil",yazi.equals("This alert appeared after 5 seconds"));
      driver.switchTo().alert().accept();

    BekleKapat();
    }
}
