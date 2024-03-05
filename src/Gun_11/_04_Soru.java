package Gun_11;

import Utilty.Basedriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class _04_Soru extends Basedriver {
    /*https://google.com/ da selenium kelimesini aratınız.
    ilk çıkan sonuca tıklatıp,
    çıkan URL yi ekrana yazdırınız.
    Beklenen url https://www.selenium.dev/  olduğunu doğrulayınız*/
    @Test
    public void Test(){
        driver.get("https://google.com/");
        List<WebElement> elementList=driver.findElements(By.xpath("//div[text()='Alle akzeptieren']"));
        if (elementList.size()>0)
            elementList.get(0).click();
        WebElement serach= driver.findElement(By.className("gLFyf"));
        serach.sendKeys("selenium"+ Keys.ENTER);

        ////a[@href="https://www.selenium.dev/"]     [href='https://www.selenium.dev/'] css
        //WebElement seleniumLink=driver.findElement(By.xpath("//cite[text()='https://www.selenium.dev']"));
        WebElement seleniumLink = driver.findElement(By.xpath("(//h3[text()='Selenium'])[1]"));
        seleniumLink.click();

        wait.until(ExpectedConditions.urlToBe("https://www.selenium.dev/"));//titleContains("Selenium")
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        Assert.assertTrue("Sayfaya ulasilamdi",driver.getCurrentUrl().equals("https://www.selenium.dev/"));

        BekleKapat();
    }
}
