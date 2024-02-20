package Gun_04;

import Utilty.Myfunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_WebelementGettext {
    public static void main(String[] args) {
        //sublabel_8_first
        WebDriver driver=new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement labelfirstName=driver.findElement(By.id("sublabel_8_first"));
        System.out.println("labelfirstName.getText() = " + labelfirstName.getText());
        //getText()-> weblelementin ekranda gözüken yazisini verir

        WebElement labellastname=driver.findElement(By.id("sublabel_8_last"));
        System.out.println("labellastname.getText() = " + labellastname.getText());

        Myfunc.Bekle(5);
        driver.quit();

    }
}
