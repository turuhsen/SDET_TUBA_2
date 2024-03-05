package Gun_09;

import Utilty.Basedriver;
import Utilty.Myfunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _11_Soru extends Basedriver {
    @Test
    public void Test(){
        driver.get("https://www.mediamarkt.com.tr/");
        Actions driveraksiyon=new Actions(driver);

        WebElement tumkategoriler= driver.findElement(By.xpath("//*[text()='Tüm Kategoriler']"));
        WebElement beyazesya= driver.findElement(By.xpath("//*[contains(text(),'Beyaz Eşya')]"));
        WebElement kombiler= driver.findElement(By.xpath("//*[contains(text(),'Kombiler')]"));

        driveraksiyon.moveToElement(tumkategoriler).build().perform();
        Myfunc.Bekle(2);
        driveraksiyon.moveToElement(beyazesya).build().perform();
        Myfunc.Bekle(2);

        driveraksiyon.click(kombiler).build().perform();
        //kombiler.click();

        String url=driver.getCurrentUrl();

        Assert.assertTrue("URL de kombi kleimesi bulunmadi",url.contains("kombi"));

        BekleKapat();


    }
}
