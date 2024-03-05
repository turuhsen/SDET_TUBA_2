package ODEVLER._27_02_Actions;

import Utilty.Basedriver;
import Utilty.Myfunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Odev3 extends Basedriver {
    //Ödev 3: http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html
    //buradaki bütün şehirleri bütün ülkere doğru şekilde topluca dağıtınız.
    @Test
    public void Test(){
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html");
        Myfunc.Bekle(2);

        for (int i = 1; i < 21; i++) {
            String sehirId = "node";
            sehirId = sehirId + i;

            WebElement sehir = driver.findElement(By.id(sehirId));
            wait.until(ExpectedConditions.visibilityOf(sehir));
            Actions driverAksiyon = new Actions(driver);
            Action aksiyon = driverAksiyon.clickAndHold(sehir).build();

            aksiyon.perform();
            for (int j = 1; j <8 ; j++) {
                String boxId="box";
                boxId=boxId+i;
                WebElement box = driver.findElement(By.id(boxId));
                wait.until(ExpectedConditions.visibilityOf(box));
                if (sehir.getAttribute("groupid").equals(boxId)) {

                    aksiyon = driverAksiyon.moveToElement(box).release().build();
                    wait.until(ExpectedConditions.visibilityOf(box));
                    aksiyon.perform();
                    System.out.println("sehir = "+sehir.getText()+" kutu=  " + sehir.getAttribute("groupid"));

            }

            }

        }




        BekleKapat();


    }
}
