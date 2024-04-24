package ODEVLER._07_03_Wait_Scroll_Alert;

import Utilty.Basedriver;
import Utilty.Myfunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Odev5 extends Basedriver {
//    https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
//            1) “Add Element” butona basin
//2) “Delete” butonu gorunur oluncaya kadar bekleyin
//3) “Delete” butonunun gorunur oldugunu test edin
//4) Delete butonuna basarak butonu silin
//5) Delete butonunun gorunmedigini test edin
     @Test
    public void Test(){
         driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
         WebElement add= driver.findElement(By.cssSelector("button[onclick='addElement()']"));
         add.click();

         WebElement delete= driver.findElement(By.cssSelector("button[onclick='deleteElement()']"));
         wait.until(ExpectedConditions.visibilityOf(delete));
         Myfunc.Bekle(3);

         Assert.assertTrue("Delete görünür degil",delete.isDisplayed());
         delete.click();

         boolean isDeleteButtonVisible = driver.findElements(By.className("added-manually")).size() > 0;
         if (!isDeleteButtonVisible) {
             System.out.println("Delete button is successfully removed.");
         } else {
             System.out.println("Delete button is still visible.");
         }

        BekleKapat();

    }
}
