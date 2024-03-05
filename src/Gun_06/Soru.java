package Gun_06;

import Utilty.Basedriver;
import Utilty.Myfunc;
import io.netty.handler.codec.spdy.SpdyWindowUpdateFrame;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Base64;

public class Soru extends Basedriver {
    // 1- https://formsmarts.com/form/yu?mode=h5 sitesini açın
// 2- Business i çekleyin.
// 3- discover XYZ ye tıklatın ve online Advertising i seçin
// 4- Every day i seçin
// 5- Good u seçin
// 6- using XYZ yi tıklatın ve 3.seçeneği seçin
// css selector
// her bir tıklatma vs işlemin arasına MyFunc.Bekle(2);
    @Test
    public  void Test1(){
    driver.get("https://formsmarts.com/form/yu?mode=h5");

        WebElement element=driver.findElement(By.cssSelector("[type='radio'][value='Business']"));
        element.click();
        Myfunc.Bekle(3);

        WebElement element1= driver.findElement(By.cssSelector("[id$='_4588']"));
        element1.click();
        Myfunc.Bekle(3);

        WebElement element2= driver.findElement(By.cssSelector("[id$='_4588']>:nth-Child(4)"));
        element2.click();
        Myfunc.Bekle(3);

        WebElement element3=driver.findElement(By.cssSelector("[type='radio'][value='Every Day']"));
        element3.click();
        Myfunc.Bekle(3);

        WebElement element4= driver.findElement(By.cssSelector("[type='radio'][value='Good']"));
        element4.click();
        Myfunc.Bekle(3);

        WebElement element5= driver.findElement(By.cssSelector("[id$='_4597']"));
        element5.click();
        Myfunc.Bekle(3);

        WebElement element6= driver.findElement(By.cssSelector("[id$='_4597']>:nth-Child(4)"));
        element6.click();
        Myfunc.Bekle(3);

        element4.click();
        BekleKapat();

    }
}
