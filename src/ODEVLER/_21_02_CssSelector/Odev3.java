package ODEVLER._21_02_CssSelector;

import Utilty.Basedriver;
import Utilty.Myfunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev3 extends Basedriver {
  /*  1) Bu siteye gidin. -> https://www.snapdeal.com/

            2) "teddy bear" aratın ve Search butonuna tıklayın.

3) Bu yazının göründüğünü doğrulayınız. -> (We've got 297 results for 'teddy bear')
    Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.*/
    @Test
    public  void Test1(){
        driver.get("https://www.snapdeal.com");

        WebElement arama= driver.findElement(By.cssSelector("[id='inputValEnter']"));
        arama.sendKeys("teddy bear");
        Myfunc.Bekle(3);

        WebElement button= driver.findElement(By.cssSelector("[class='searchTextSpan']"));
        button.click();
        Myfunc.Bekle(3);

        WebElement text=driver.findElement(By.cssSelector("[id='searchMessageContainer'] span[style='color: #212121; font-weight: normal'][ class='nnn']"));

        Assert.assertTrue("Aranan sonuc bulunamadi",text.getText().contains("We've got 308 results for teddy bear"));

        BekleKapat();





    }
}
