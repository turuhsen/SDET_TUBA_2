package ODEVLER._27_02_Actions;

import Utilty.Basedriver;
import Utilty.Myfunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Odev2 extends Basedriver {
    //Ödev 2 : http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html
    //buradaki bütün öğrencileri bütün kutucukları doldurana kadar atınız.
    @Test
    public void Test(){
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html");

        List<WebElement>   ogrenciler=driver.findElements(By.xpath("//li[starts-with(@id,'node')]"));
        List<WebElement>   boxes=driver.findElements(By.xpath("//ul[starts-with(@id,'box')]"));
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));


       for (WebElement ogrenci:ogrenciler){
           for (WebElement box:boxes){
               Actions driveraksiyon=new Actions(driver);
               Action action=driveraksiyon.clickAndHold(ogrenci).build();
               action.perform();
               wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li[starts-with(@id,'node')]")));
               wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[starts-with(@id,'box')]")));
               action=driveraksiyon.moveToElement(box).release().build();
               action.perform();

           }
       }


        BekleKapat();
    }
}
