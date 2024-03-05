package ODEVLER._21_02_CssSelector;

import Utilty.Basedriver;
import Utilty.Myfunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev1 extends Basedriver {
    @Test
    public void Test1(){
        /*

  1) Bu siteye gidin. -> http://demoqa.com/text-box

  2) Full Name kısmına "Automation" girin.

  3) Email kısmına "Testing@gmail.com" girin.

  4) Current Address kısmına "Testing Current Address" girin.

  5) Permanent Address kısmına "Testing Permanent Address" girin.

  6) Submit butonuna tıklayınız.

  7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.

  8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.

*/
        driver.get("https://demoqa.com/text-box");
        WebElement element= driver.findElement(By.cssSelector("input[id='userName']"));
        element.sendKeys("Automation");
        Myfunc.Bekle(3);

        WebElement email=driver.findElement(By.cssSelector("input[id='userEmail']"));
        email.sendKeys("Testing@gmail.com");
        Myfunc.Bekle(3);

        WebElement currentAdress=driver.findElement(By.cssSelector("[id='currentAddress']"));
        currentAdress.sendKeys("Testing Current Address");
        Myfunc.Bekle(3);

        WebElement permanentAdress=driver.findElement(By.cssSelector("[id='permanentAddress']"));
        permanentAdress.sendKeys("Testing Permanent Address");
        Myfunc.Bekle(3);

        WebElement button=driver.findElement(By.cssSelector("[id='submit']"));
        button.click();
        Myfunc.Bekle(3);

        WebElement name = driver.findElement(By.cssSelector("[id='name'][class='mb-1']"));
        WebElement emailBox = driver.findElement(By.cssSelector("[id='email'][class='mb-1']"));


        Assert.assertTrue("Aranılan Mesaj Bulunamadı", name.getText().contains("Automation"));
        Assert.assertTrue("Aranılan Mesaj Bulunamadı", emailBox.getText().contains("Testing"));



     BekleKapat();
    }
}
