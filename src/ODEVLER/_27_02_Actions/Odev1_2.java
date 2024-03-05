package ODEVLER._27_02_Actions;

import Utilty.Basedriver;
import Utilty.Myfunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class Odev1_2 extends Basedriver {
    //Ödev 1 : http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html
    //buradaki ülke ve şehirleri findElements ile topluca bularak bir döngü ile bütün şehirleri doğru ülkere dağıtınız.
    @Test
    public void Test(){
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");
        List<WebElement> sehirler=driver.findElements(By.cssSelector("[id='answerDiv'] div"));
        List<WebElement> ulkeler=driver.findElements(By.cssSelector("div[id='questionDiv'] [class='destinationBox']"));



        Actions aksiyondriver=new Actions(driver);

      //for (int i = 0; i < sehirler.size(); i++) {
      //    Action aksiyon = aksiyondriver.clickAndHold(sehirler.get(i)).build();
      //    Myfunc.Bekle(5);
      //    for (WebElement ulke:ulkeler){
      //        Myfunc.Bekle(3);

      //        aksiyondriver.moveToElement(ulke).release().build().perform();
      //        String color = ulke.getCssValue("background-color");
      //        System.out.println("color = " + color);
      //        if (color.contains("green")){
      //            Myfunc.Bekle(3);
      //            aksiyondriver.moveToElement(ulke).release().build().perform();
      //        }

      //    }
      //}
        for (int i = 1; i < 16; i++) {
        //int i=1;
            String sehirId="a";
            sehirId=sehirId+i;
            System.out.println("sehirId = " + sehirId);
            WebElement sehir= driver.findElement(By.id(""+sehirId+""));
            Myfunc.Bekle(4);
            String ulkeId="//div[@id='q";
            ulkeId=ulkeId+i;
            String sonkod="']/following-sibling::div";
            ulkeId=ulkeId+sonkod;
            System.out.println("sonkod = " +ulkeId);
            WebElement ulke= driver.findElement(By.xpath(""+ulkeId+""));
            Myfunc.Bekle(4);

        aksiyondriver.clickAndHold(sehir).build().perform(); // osloyu eline al
        Myfunc.Bekle(3);
        aksiyondriver.moveToElement(ulke).release().build().perform();
        BekleKapat();


        }

    ////div[@id='questionDiv']/div[@class='destinationBox']
    }
}
