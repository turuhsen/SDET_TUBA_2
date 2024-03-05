package Gun_05;

import Utilty.Basedriver;
import Utilty.Myfunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Navigating extends Basedriver {
    public static void main(String[] args) {
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
        //navigate().to-> get ile ayni, history icin kullanilir ileri -geri icin

        WebElement element = driver.findElement(By.id("alerttest"));
        element.click();
        Myfunc.Bekle(3);

        System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        driver.navigate().back();//bir önceki sayfaya dön
        Myfunc.Bekle(3);
        System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        driver.navigate().forward();
        System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());



        BekleKapat();
    }
}
