package Gun_12;

import Utilty.Basedriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_IFrameGiris extends Basedriver {
    @Test
    public void Test(){
        driver.get("https://chercher.tech/practice/frames");

        //driver.switchTo().frame(0);//index ile gecmek sirasina göre gecilebilir
        //driver.switchTo().frame("frame1");//id sine göre gecilebilir
        //driver.switchTo().frame("iamframe");//name ine göre gecilebilir

        WebElement weFrame1= driver.findElement(By.id("frame1"));//web elemnt olarak da gecilebilir
        driver.switchTo().frame(weFrame1);

        WebElement txtbox= driver.findElement(By.cssSelector("[id='topic']+input"));
        txtbox.sendKeys("Türkiye");

        driver.switchTo().defaultContent();//otomatik olarak ana sayfaya düsersin en disa
        //driver.switchTo().parentFrame();//bir önceki yere dön

        BekleKapat();

    }
}
