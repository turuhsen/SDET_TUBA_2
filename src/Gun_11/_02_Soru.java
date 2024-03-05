package Gun_11;

import Utilty.Basedriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _02_Soru extends Basedriver {
    /*
       Bu siteye gidiniz.  http://demo.seleniumeasy.com/ajax-form-submit-demo.html
       Name giriniz.
       Comment giriniz.
       Submit'e tıklayınız.
       Form submited Successfully! yazısı görüntülenmelidir.
       assert ile kontrol ediniz
       (xpath kullanmayınız)
*/
    @Test
    public void Test(){
        driver.get("http://demo.seleniumeasy.com/ajax-form-submit-demo.html");
        WebElement name=driver.findElement(By.xpath("//input[@class='form-control']"));
        name.sendKeys("tuba");

        WebElement comment= driver.findElement(By.cssSelector("[id='description']"));
        comment.sendKeys("basarilar");

        WebElement submit= driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
        submit.click();



        wait.until(ExpectedConditions.textToBe(By.xpath("//div[text()='Form submited Successfully!']"),"Form submited Successfully!"));
        WebElement msg= driver.findElement(By.xpath("//div[text()='Form submited Successfully!']"));

        Assert.assertTrue("aranilan mesaj bulunamdi",msg.getText().equals("Form submited Successfully!"));

        BekleKapat();
    }}