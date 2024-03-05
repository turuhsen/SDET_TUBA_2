package Gun_09;

import Utilty.Basedriver;
import Utilty.Myfunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Map;

public class _09_ActionTusKontrolSendKeys extends Basedriver {
    @Test
    public void Test(){

        driver.get("https://demoqa.com/auto-complete");

        Myfunc.Bekle(2);
        List<WebElement> consent=driver.findElements(By.xpath("//p[text()='Einwilligen']"));
        if (consent.size()>0)
            consent.get(0).click();

        WebElement txtbox= driver.findElement(By.id("autoCompleteMultipleInput"));
        Myfunc.Bekle(3);

        new Actions(driver)
                .moveToElement(txtbox) //kutucuga git
                .click()               //yazabilmek icin icine tikla
                .keyDown(Keys.SHIFT)   //sift tusuna bas
                .sendKeys("a")         //a harfini gönder büyük A yazmali shift den dolayi
                .keyUp(Keys.SHIFT)     //shift tusunu geri birak
                .sendKeys("hmet")      //hmet yazisini gönder kücük harflerle yazmali
                .build()               //aksiyonu hazirla
                .perform();             //islemi gerceklestir

        BekleKapat();
    }
}
