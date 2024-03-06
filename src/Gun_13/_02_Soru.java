package Gun_13;

import Utilty.Basedriver;
import Utilty.Myfunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _02_Soru extends Basedriver {
    /*
    Senaryo:
    https://www.selenium.dev/ adresindeki ayrı tab da açılan linklere tıklatınız.
    Açılan bütün yeni tablardaki sayfaların title ve url lerini yazdırınız.
    Daha sonra Anasayfa harici diğer tüm sayfaları kapatınız.
 */
    @Test
    public void Test(){
        driver.get("https://www.selenium.dev/");
        Myfunc.Bekle(2);

        JavascriptExecutor js=(JavascriptExecutor) driver;

        List<WebElement> linkler=driver.findElements(By.cssSelector("a[target='_blank']"));

        String anaSayfaWindowID= driver.getWindowHandle(); //bulundugum window un ID sini verir

        for (WebElement e:linkler){
            //e.click();
            js.executeScript("arguments[0].click();",e);
        }

        Set<String> windowsIdler=driver.getWindowHandles(); //bütün sekmmelerinId sini ver

        //bütün acik tablarin title
        for (String id:windowsIdler){
            driver.switchTo().window(id);// siradaki id ye gectim
            System.out.println(id+" "+driver.getTitle()+" "+driver.getCurrentUrl());
        }

        //anasayfa haric digerlerini kapat
        for (String id:windowsIdler){
            if (id.equals(anaSayfaWindowID)) continue;//ana sayfa haric

            driver.switchTo().window(id); //ilgili sekmeye gec
            driver.close();//sadece onu kapar
        }
        BekleKapat();
    }
}
