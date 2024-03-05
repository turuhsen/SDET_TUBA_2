package Gun_09;

import Utilty.Basedriver;
import Utilty.Myfunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _10_ActionTusKontrolSendKeys extends Basedriver {
    @Test
    public void Test(){
        driver.get("https://demoqa.com/auto-complete");

        WebElement txtbox= driver.findElement(By.id("autoCompleteSingleInput"));
        Myfunc.Bekle(3);
        List<WebElement> consent=driver.findElements(By.xpath("//p[text()='Einwilligen']"));
        if (consent.size()>0)
            consent.get(0).click();

        //txtbox a git ,icine tikalt ,b harfine bas, asagi yön tusuna bas enter e bas
        Actions driverAksiyon=new Actions(driver);

        driverAksiyon
                .moveToElement(txtbox)
                .click()
                .sendKeys("b")
                .build()
                .perform();
        Myfunc.Bekle(2);

        driverAksiyon.sendKeys(Keys.DOWN)
                .sendKeys(Keys.ENTER)
                .build()
                .perform();

        BekleKapat();
}}
