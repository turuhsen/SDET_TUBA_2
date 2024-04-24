package ODEVLER._07_03_Wait_Scroll_Alert;

import Utilty.Basedriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;

public class odev1 extends Basedriver {
//   1-
//   Senaryo
//- google.com ile sayfayı açınız.
//           2- Daha sonra Yeni bir TAB (ctrl+T) açınız.
//           3- Bu açılan yeni sayfada facebook.com u açınız.
//- Bu sayfanın açıldığını URL sinden kontrol ediniz.
//- Daha sonra facebook.com sayfasını kapatınız.
    @Test
    public void Test(){
        driver.get("https://www.google.com/");
        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("https://www.facebook.com/");

        Assert.assertTrue("Sayfa acilamadi",driver.getCurrentUrl().equals("https://www.facebook.com/"));
        driver.close();

        BekleKapat();

    }
}
