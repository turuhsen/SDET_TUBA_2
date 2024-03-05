package Gun_12;

import Utilty.Basedriver;
import Utilty.Myfunc;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class _05_Scrollintro extends Basedriver {
    @Test
    public void Test(){
        driver.get("https://www.selenium.dev/selenium/web/scrolling_tests/frame_with_nested_scrolling_frame_out_of_view.html");

        JavascriptExecutor js=(JavascriptExecutor) driver;

        js.executeScript("window.scrollTo(0,500)");//dikey yönde 500 pixel bastan kaydir

        Myfunc.Bekle(2);
        js.executeScript("window.scrollBy(0,500)");//bulundugu yerde 500 scroll

        Myfunc.Bekle(2);
        js.executeScript("window.scrollBy(0,-200)");//bulundugu yerde 200 geri scroll

        BekleKapat();

    }
}
