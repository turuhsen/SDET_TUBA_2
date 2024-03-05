package Gun_09;

import Utilty.Basedriver;
import Utilty.Myfunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _08_ActionMouseWheel extends Basedriver {
    @Test
    public void Test1(){
        driver.get("https://www.selenium.dev/selenium/web/scrolling_tests/frame_with_nested_scrolling_frame_out_of_view.html");
        WebElement iframe= driver.findElement(By.name("nested_scrolling_frame"));

        Myfunc.Bekle(2);
        //iframe isimli weblemente kadar scroll yap

        new Actions(driver).
                scrollToElement(iframe).
                build().
                perform();

        BekleKapat();

    }
    @Test
    public void Test2(){
        driver.get("https://www.selenium.dev/selenium/web/scrolling_tests/frame_with_nested_scrolling_frame_out_of_view.html");
        WebElement iframe= driver.findElement(By.name("nested_scrolling_frame"));

        Myfunc.Bekle(2);
        //belli bir miktar pixel kadar  scroll

        new Actions(driver).
                scrollByAmount(0,500).
                build().
                perform();
                BekleKapat();
    }
}
