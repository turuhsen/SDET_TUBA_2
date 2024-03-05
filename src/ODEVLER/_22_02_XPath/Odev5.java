package ODEVLER._22_02_XPath;

import Utilty.Basedriver;
import Utilty.Myfunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev5 extends Basedriver {
    /*
       Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]
       Fake Alerts' tıklayınız.
       Show Alert Box'a tıklayınız.
       Ok'a tıklayınız.
       Alert kapanmalıdır.
        */
    @Test
    public void Test(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        Myfunc.Bekle(2);

        WebElement fakelaerts= driver.findElement(By.xpath("(//div[@class='page-body']//a)[13]"));
        fakelaerts.click();
        Myfunc.Bekle(2);

        WebElement showlaerts= driver.findElement(By.xpath("(//div[@class='page-body']//input)[1]"));
        showlaerts.click();
        Myfunc.Bekle(2);

        WebElement okbutton= driver.findElement(By.xpath("//div[@class='dialog-actions']/button"));
        okbutton.click();
        Myfunc.Bekle(2);

        BekleKapat();
    }
}
