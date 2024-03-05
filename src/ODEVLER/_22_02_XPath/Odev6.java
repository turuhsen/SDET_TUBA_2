package ODEVLER._22_02_XPath;

import Utilty.Basedriver;
import Utilty.Myfunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev6 extends Basedriver {
    @Test
    /*
        Bu siteye gidiniz. https://testpages.herokuapp.com/styled/index.html
        Fake Alerts'e tıklayınız.
        Show modal dialog buttonuna tıklayınız.
        Ok'a tıklayınız.
        Alert kapanmalıdır.
         */

    public void Test(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement fakelaerts= driver.findElement(By.xpath("(//div[@class='page-body']//a)[13]"));
        fakelaerts.click();
        Myfunc.Bekle(2);

        WebElement showmodel= driver.findElement(By.xpath("(//div[@class='centered'])[2]/input"));
        showmodel.click();
        Myfunc.Bekle(2);

        WebElement okbutton= driver.findElement(By.xpath("//div[@class='dialog-actions']/button"));
        okbutton.click();
        Myfunc.Bekle(2);

        BekleKapat();
    }
}
