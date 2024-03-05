package Gun_12;

import Utilty.Basedriver;
import Utilty.Myfunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _03_Soru extends Basedriver {
    /*
      1-driver.get("https://chercher.tech/practice/frames"); sayfasına gidiniz.
      2-Inputa ülke adı yazınız
      3-CheckBox ı çekleyiniz.
      4-Select in 2.elemanını seçiniz.
    */    @Test
    public void Test(){
        driver.get("https://chercher.tech/practice/frames");
        Myfunc.Bekle(2);

        driver.switchTo().frame(0); // index ile gecmek sirasina göre geceilebilir
        WebElement txtbox= driver.findElement(By.cssSelector("#topic+input"));//[id='topic']+input ikiside ayni locatar
        txtbox.sendKeys("Türkiye");

        driver.switchTo().frame(0);
        WebElement check= driver.findElement(By.cssSelector("input[id='a']"));
        check.click();

        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);//2. frame e gectim

        WebElement selectmenu=driver.findElement(By.id("animals"));
        Select slectanilmas=new Select(selectmenu);
        slectanilmas.selectByIndex(1);

        BekleKapat();


    }
}
