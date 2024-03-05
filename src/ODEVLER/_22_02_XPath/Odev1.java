package ODEVLER._22_02_XPath;

import Utilty.Basedriver;
import Utilty.Myfunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev1 extends Basedriver {
    /*

  1) Bu siteye gidin. -> http://demoqa.com/text-box

  2) Full Name kısmına "Automation" girin.

  3) Email kısmına "Testing@gmail.com" girin.

  4) Current Address kısmına "Testing Current Address" girin.

  5) Permanent Address kısmına "Testing Permanent Address" girin.

  6) Submit butonuna tıklayınız.

  7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.

  8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.*/

    @Test
    public void Test(){
        driver.get("http://demoqa.com/text-box");

        Myfunc.Bekle(3);
        WebElement fullName=driver.findElement(By.xpath("//div[@id='userName-wrapper']//input"));
        fullName.sendKeys("Automation");
        Myfunc.Bekle(2);

        WebElement email=driver.findElement(By.xpath("//div[@id='userEmail-wrapper']//input"));
        email.sendKeys("Testing@gmail.com");
        Myfunc.Bekle(2);

        WebElement currentAdress=driver.findElement(By.xpath("(//div[@class='mt-2 row'])[3]//textarea"));
        currentAdress.sendKeys("Testing Current Address");
        Myfunc.Bekle(2);

        WebElement permanent=driver.findElement(By.xpath("//div[@id='permanentAddress-wrapper']//textarea"));
        permanent.sendKeys("Testing Permanent Address");
        Myfunc.Bekle(2);
        //[id='submit']

        WebElement submit=driver.findElement(By.xpath("//div[@class='mt-2 justify-content-end row']//button"));
        submit.click();
        Myfunc.Bekle(2);

        WebElement name = driver.findElement(By.xpath("//div[@class='mt-4 row']//p[1]"));
        WebElement emailBox = driver.findElement(By.xpath("//div[@class='mt-4 row']//p[2]"));

        Assert.assertTrue("Aranılan Mesaj Bulunamadı", name.getText().contains("Automation"));
        Assert.assertTrue("Aranılan Mesaj Bulunamadı", emailBox.getText().contains("Testing"));

        BekleKapat();
    }
}




