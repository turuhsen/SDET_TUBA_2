package Gun_12;

import Utilty.Basedriver;
import Utilty.Myfunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class _08_JavaScriptClick extends Basedriver {
    @Test
    public void Test(){
   driver.get("https://www.copado.com/robotic-testing");
        Myfunc.Bekle(2);

        JavascriptExecutor js=(JavascriptExecutor) driver;

        WebElement readstory= driver.findElement(By.xpath("//div[text()='Read Success Story']"));
        //readstory.click();//sayfa önünde mause click
        js.executeScript("arguments[0].click();",readstory); //js click :sayfanin icinden click
    }
}
