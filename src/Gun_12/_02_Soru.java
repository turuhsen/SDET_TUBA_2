package Gun_12;

import Utilty.Basedriver;
import Utilty.Myfunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_Soru extends Basedriver {
    /*
 Senaryo :
 https://chercher.tech/practice/frames sitesine gidiniz
 Ekranda gözüken ilk kutucuğa Türkiye yazınız.
 Daha sonra animals dan seçeneklerinden avatar ı seçiniz.
*/
    @Test
    public void Test(){
        driver.get("https://chercher.tech/practice/frames");
        Myfunc.Bekle(2);

        driver.switchTo().frame(0); // index ile gecmek sirasina göre geceilebilir
        WebElement txtbox= driver.findElement(By.cssSelector("#topic+input"));//[id='topic']+input ikiside ayni locatar
        txtbox.sendKeys("Türkiye");

        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame2");//2. frame e gectim

        WebElement selectmenu=driver.findElement(By.id("animals"));
        Select slectanilmas=new Select(selectmenu);
        slectanilmas.selectByValue("avatar");

        BekleKapat();

    }
}
