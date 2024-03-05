package ODEVLER._22_02_XPath;

import Utilty.Basedriver;
import Utilty.Myfunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev3 extends Basedriver {
    /*
       1) Bu siteye gidin. -> https://www.snapdeal.com/
       2) "teddy bear" aratın ve Search butonuna tıklayın.
       3) Bu yazının göründüğünü doğrulayınız. -> (We've got 297 results for 'teddy bear')
       Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.
       */
    @Test
    public void Test(){
        driver.get("https://www.snapdeal.com");
        WebElement searchinput= driver.findElement(By.xpath("//div[@class='col-xs-14 search-box-wrapper']//input"));
        searchinput.sendKeys("teddy bear");
        Myfunc.Bekle(2);

        WebElement searchbutton= driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']/span"));
        searchbutton.click();
        Myfunc.Bekle(2);

        WebElement text= driver.findElement(By.xpath("//div[@id='searchMessageContainer']//span"));
        Myfunc.Bekle(2);
        Assert.assertTrue("Yazi görünmedi",text.getText().equals("We've got 307 results for teddy bear"));

        BekleKapat();

    }
}
