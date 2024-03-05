package Gun_05;

import Utilty.Basedriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_GetCssValue extends Basedriver {
    public static void main(String[] args) {
        driver.get("https://www.snapdeal.com/");

        WebElement aramakutusu= driver.findElement(By.id("inputValEnter"));

        //parametrenin degerini veriyor
        System.out.println("aramakutusu.getAttribute(\"class\") = " + aramakutusu.getAttribute("class"));

        //elementin sekillendiren degerleri veriyor
        System.out.println("aramakutusu.getCssValue(\"color\") = " + aramakutusu.getCssValue("color"));
        System.out.println("aramakutusu.getCssValue(\"background\") = " + aramakutusu.getCssValue("background"));
        System.out.println("aramakutusu.getCssValue(\"font-size\") = " + aramakutusu.getCssValue("font-size"));
        System.out.println("aramakutusu.getCssValue(\"border\") = " + aramakutusu.getCssValue("border"));
        

    BekleKapat();

    }
}
