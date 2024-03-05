package Gun_05;

import Utilty.Basedriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.Test;

public class _04_CssSelector_Test extends Basedriver {
    @Test
    public void Test1()
    {
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        WebElement element=driver.findElement(By.cssSelector("input[id='user-message']"));
        element.sendKeys("Merhaba Selenium");

        WebElement element1=driver.findElement(By.cssSelector("[onclick='showInput();']"));
        element1.click();

        WebElement txt=driver.findElement(By.cssSelector("[id='display']"));

        Assert.assertTrue("Aranilan mesaj bulunmadi",txt.getText().contains("Merhaba Selenium"));

        //Ben true bekliyorum , degilse göster, yoksa test passed

        BekleKapat();
    }
}
