package Gun_05;

import Utilty.Basedriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _01_FindingElements_Tag extends Basedriver {
    public static void main(String[] args) {
        //DriverBaslat();
        driver.get("https://www.hepsiburada.com/");

        List<WebElement>  linkler=driver.findElements(By.tagName("a"));// bütün  a olan tagli elementleri bul

        for (WebElement e:linkler)
            if (!e.getText().equals(""))
                System.out.println("e.getText() = " + e.getText());

    }
}
