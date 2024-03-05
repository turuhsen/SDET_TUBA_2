package Gun_09;

import Utilty.Basedriver;
import Utilty.Myfunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _04_ActionRightClick extends Basedriver {
    @Test
    public void Test(){
        driver.get("https://demoqa.com/buttons");
        Myfunc.Bekle(2);
        List<WebElement> consent=driver.findElements(By.xpath("//p[text()='Einwilligen']"));
        if (consent.size()>0)
            consent.get(0).click();

        Myfunc.Bekle(2);
        WebElement btnClick= driver.findElement(By.id("rightClickBtn"));

        Actions aksiyondriver=new Actions(driver);
        Action aksiyon=aksiyondriver.moveToElement(btnClick).contextClick().build();
        aksiyon.perform();

        //new Actions(driver).contextClick(btnClick).build().perform();

        BekleKapat();
    }
}
