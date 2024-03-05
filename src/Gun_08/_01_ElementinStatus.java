package Gun_08;

import Utilty.Basedriver;
import Utilty.Myfunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_ElementinStatus extends Basedriver {
    @Test
    public void Test(){
        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");

        WebElement monday= driver.findElement(By.id("gwt-debug-cwCheckBox-Monday-input"));
        Myfunc.Bekle(2);

        System.out.println("monday.isDisplayed() = " + monday.isDisplayed());//web de görünüyormu
        System.out.println("monday.isEnabled() = " + monday.isEnabled());//web de etkinmi
        System.out.println("monday.isSelected() = " + monday.isSelected());//ceklimi

        monday.click();
        Myfunc.Bekle(2);

        System.out.println("monday.isSelected() = " + monday.isSelected());// ceklimi

        /** cumartesi***/
        WebElement cumartesi= driver.findElement(By.id("gwt-debug-cwCheckBox-Saturday-input"));
        System.out.println("cumartesi.isDisplayed() = " + cumartesi.isDisplayed());
        System.out.println("cumartesi.isEnabled() = " + cumartesi.isEnabled());
        System.out.println("cumartesi.isSelected() = " + cumartesi.isSelected());

        BekleKapat();
    }
}
