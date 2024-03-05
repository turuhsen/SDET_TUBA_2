package Gun_11;

import Utilty.Basedriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _03_Soru extends Basedriver {
    /*
Senaryo
1-  https://www.demoblaze.com/index.html  siteyi açınız.
2- Samsung galaxy s6  linkine tıklayınız.
3- Sepete ekleyiniz.
4- Daha Sonra PRODUCT STORE yazısına tıklatarak ana ekrana geri dönününz
*/
    @Test
    public void Test(){
    driver.get("https://www.demoblaze.com/index.html");

        WebElement samsung= driver.findElement(By.linkText("Samsung galaxy s6"));
        samsung.click();

        WebElement addcart=driver.findElement(By.linkText("Add to cart"));
        addcart.click();

        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        WebElement anasayfa=driver.findElement(By.className("navbar-brand"));
        anasayfa.click();

        Assert.assertTrue("Aranilan web sayfasi bulunamadi",driver.getCurrentUrl().equals("https://www.demoblaze.com/index.html"));

        BekleKapat();

    }
}
