package Gun_09;

import Utilty.Basedriver;
import Utilty.Myfunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _07_DragAndDropBy extends Basedriver {
    @Test
    public void Test(){
        driver.get("https://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");

        Myfunc.Bekle(2);
        List<WebElement> consent=driver.findElements(By.xpath("//p[text()='Einwilligen']"));
        if (consent.size()>0)
            consent.get(0).click();

        Actions driveraksiyon=new Actions(driver);
        WebElement solsugu= driver.findElement(By.xpath("//div[@id='slider-range']/span[1]"));
        Myfunc.Bekle(2);

        //dragnaddropBy(Weblement,X,Y) x:yatay yönde, y:dikey yönde
        Action aksiyon=driveraksiyon.dragAndDropBy(solsugu,100,0).build();
        aksiyon.perform();
        //+ deger girdigimizde saga dogru, - deger girdigimizde sola dogru kaydiriyor

        BekleKapat();
    }
}
