package Gun_13;

import Utilty.Basedriver;
import Utilty.Myfunc;
import org.junit.Test;
import org.openqa.selenium.WindowType;

public class _03_WindowYeni extends Basedriver {
    @Test
    public void Test(){
        driver.get("https://www.selenium.dev/");
        Myfunc.Bekle(2);

        driver.switchTo().newWindow(WindowType.TAB); //yeni bos sekme acar
        //yeni acilan tabda  https://www.facebook.com/ nasil cagiririz
        // acilan yeni tabda oldugumdan sadece driver.get ile yeni sayfa acabilirim

        driver.get("https://www.facebook.com/");

        Myfunc.Bekle(2);
        BekleKapat();
    }
}
