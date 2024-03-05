package Denemeler._20_02;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Campus extends BaseFile{

    @Test
    public  void Campus() {
        driver.get("https://test.mersys.io/");
        WebElement id=driver.findElement(By.cssSelector("input[id='mat-input-0']"));
        id.sendKeys("Student_3");

        MyFunc.Bekle(1);
        WebElement password=driver.findElement(By.cssSelector("input[id='mat-input-1']"));
        password.sendKeys("S12345");

        MyFunc.Bekle(1);
        WebElement login=driver.findElement(By.cssSelector("span[class='mdc-button__label']"));
        login.click();

        WebElement page=driver.findElement(By.cssSelector("span[style='font-size: 20px; padding-top: 4px;']"));
        Assert.assertFalse("Aranilan sayfa bulunamadi",page.getText().contains(" Welcome, Student_3 11A !  "));


        BekleKapat();









    }
}
