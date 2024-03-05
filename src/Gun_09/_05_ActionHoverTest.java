package Gun_09;

import Utilty.Basedriver;
import Utilty.Myfunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _05_ActionHoverTest extends Basedriver {
    @Test
    public void Test()
    {
        driver.get("https://www.hepsiburada.com/");
        WebElement element= driver.findElement(By.xpath("//span[text()='Moda']"));
        Myfunc.Bekle(2);

        Actions aksiyondriver=new Actions(driver);
        Action aksiyon=aksiyondriver.moveToElement(element).build();

        aksiyon.perform();

        //new Actions(driver).moveToElement(element).build().perform();

        BekleKapat();

    }}
