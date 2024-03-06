package Gun_13;

import Utilty.Basedriver;
import Utilty.Myfunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _01_WindowsGiris extends Basedriver {
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

        Set<String>  windowsIdler=driver.getWindowHandles(); //bütün sekmmelerinId sini ver

        for (String id:windowsIdler)
            System.out.println("id = " + id);

        Myfunc.Bekle(2);
        driver.switchTo().window(anaSayfaWindowID);//ana sayfa tabina git

        BekleKapat();
    }}
