package Gun_09;

import Utilty.Basedriver;
import Utilty.Myfunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _06_ActionDragAndDrop extends Basedriver {
    @Test
    public void Test(){
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        Actions aksiyondriver=new Actions(driver);

        Myfunc.Bekle(2);
        WebElement oslo= driver.findElement(By.id("box1"));
        WebElement norway=driver.findElement(By.id("box101"));

        //1.yöntem
        aksiyondriver.dragAndDrop(oslo,norway).build().perform();
        //osloyu al,norvece götür birak

        //2.Yöntem
        aksiyondriver.clickAndHold(oslo).build().perform();//osloyu eline al
        aksiyondriver.moveToElement(norway).release().build().perform();

        BekleKapat();
    }
}
