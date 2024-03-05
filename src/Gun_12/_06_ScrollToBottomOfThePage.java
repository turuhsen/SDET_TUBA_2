package Gun_12;

import Utilty.Basedriver;
import Utilty.Myfunc;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class _06_ScrollToBottomOfThePage extends Basedriver {
    @Test
    public void Test(){
        driver.get("https://www.selenium.dev/selenium/web/scrolling_tests/frame_with_nested_scrolling_frame_out_of_view.html");

        JavascriptExecutor js=(JavascriptExecutor) driver;

        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");//tüm sayfayi scroll

        Myfunc.Bekle(2);

        js.executeScript("window.scrollTo(0,0)");//bas sayfaya git

        BekleKapat();

    }
}
