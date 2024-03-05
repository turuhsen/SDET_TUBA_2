package Gun_09;

import Utilty.Basedriver;
import Utilty.Myfunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _02_ActionClickTest extends Basedriver {
    @Test
    public void Test(){
        driver.get("https://demoqa.com/buttons");
        Myfunc.Bekle(2);
        List<WebElement> consent=driver.findElements(By.xpath("//p[text()='Einwilligen']"));
        if (consent.size()>0)
            consent.get(0).click();

        Myfunc.Bekle(2);
        WebElement btnClick= driver.findElement(By.xpath("//button[text()='Click Me']"));

        Actions aksiyonlar=new Actions(driver);//web sayfasi aksiyonlara acildi

        Action aksiyon=aksiyonlar.moveToElement(btnClick).click().build();
        //elementin üzerine click iicn git orda bekle aksiyonu hazirla
        System.out.println("aksiyon hazirlandi");

        Myfunc.Bekle(2);
        aksiyon.perform();//aksiyon gerceklesiyor,isleme al,uygula
        System.out.println("Aksiyongerceklesti");

        //kisa hali
        //aksiyonlar.moveToElement(btnclick).click().build().perform();//cok aksiyon icin

        //dahada kisa hali
        //new Actions(driver).moveToElement(btnclick).click().build().perform();//bir tek aksiyon icin

        //kipkisa hali
        //new Actions(driver).click(btnclick).build().perform();//bir tek aksioyn icin

        BekleKapat();



    }
}
