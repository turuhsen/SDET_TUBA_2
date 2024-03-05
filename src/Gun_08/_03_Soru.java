package Gun_08;

import Utilty.Basedriver;
import Utilty.Myfunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class _03_Soru extends Basedriver {
    //        Test Senaryosu
//        1- https://www.facebook.com/  sayfasına gidiniz
//        2- CreateNewAccount a tıklatınız.
//        3- Açılan yeni pencerede isim, soyisim ve emaili giriniz.
//        4- Email i tekrar girmenizi isteyen bir input daha açıldığını
//           öncesinde de görünmediğini, sonrasında da göründüğünü
//           assert ile doğrulayınız.
//        5- Doğum tarihinizi Select sınıfı ile seçiniz (düzenlendi)

    @Test
    public void Test(){
        driver.get("https://www.facebook.com/");
        Myfunc.Bekle(2);

        List<WebElement>  cookiesAccept=driver.findElements(By.cssSelector("[data-testid='cookie-policy-manage-dialog-accept-button']"));
        //elemani bulursa 1 elemanli list döndürür
        //bulmazsa size 0 olan bir list döndürür
        if (cookiesAccept.size()>0)// eger elemani bulabilmis ise
            cookiesAccept.get(0).click();

        Myfunc.Bekle(2);
        WebElement newaccount= driver.findElement(By.cssSelector("[data-testid='open-registration-form-button']"));
        //By.linkText("Yeni hesap oluştur")
        newaccount.click();
        Myfunc.Bekle(2);

        WebElement name= driver.findElement(By.name("firstname"));
        name.sendKeys("tuba");
        Myfunc.Bekle(2);

        WebElement lastname= driver.findElement(By.name("lastname"));
        lastname.sendKeys("al");
        Myfunc.Bekle(2);

        WebElement reEmail=driver.findElement(By.name("reg_email_confirmation__"));
        Assert.assertFalse("REemail gözüktü",reEmail.isDisplayed());//gözükmemesini bekliyorum
        System.out.println("reEmail.isDisplayed() = " + reEmail.isDisplayed());
        Myfunc.Bekle(2);

        WebElement email= driver.findElement(By.name("reg_email__"));
        email.sendKeys("tt@gmail.com");
        Myfunc.Bekle(2);

        Assert.assertTrue("Reemail gözükmedi",reEmail.isDisplayed()); //gözükmesini bekliyorum
        System.out.println("reEmail = " + reEmail.isDisplayed());
        Myfunc.Bekle(2);

        WebElement webday= driver.findElement(By.id("day"));
        WebElement webmonth= driver.findElement(By.id("month"));
        WebElement webyear= driver.findElement(By.id("year"));

        Select day=new Select(webday);
        Select month=new Select(webmonth);
        Select year=new Select(webyear);

        day.selectByValue("23");
        month.selectByValue("3");
        year.selectByValue("1980");

        BekleKapat();
    }
}
