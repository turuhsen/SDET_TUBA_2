package Gun_04;

import Utilty.Myfunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_FindingById {
    public static void main(String[] args) {
        //first_8
        //last_8
        WebDriver driver=new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement element=driver.findElement(By.id("first_8"));
        element.sendKeys("tuba");

        WebElement element1=driver.findElement(By.id("last_8"));
        element1.sendKeys("aldemir");

        Myfunc.Bekle(3);
        //bekleme
        driver.quit();
    }
}
