package Gun_12;

import Utilty.Basedriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class _07_ScrollToWebElement extends Basedriver {
    @Test
    public void Test(){

        driver.get("https://www.selenium.dev/selenium/web/scrolling_tests/frame_with_nested_scrolling_frame_out_of_view.html");

        JavascriptExecutor js=(JavascriptExecutor) driver;

        WebElement iframe= driver.findElement(By.name("nested_scrolling_frame"));

        js.executeScript("arguments[0].scrollIntoView(true);",iframe);//elemente kadar kaydir

        BekleKapat();
    }
}
