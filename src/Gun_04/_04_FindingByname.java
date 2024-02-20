package Gun_04;

import Utilty.Myfunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _04_FindingByname {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement element=driver.findElement(By.name("q8_name[first]"));
        element.sendKeys("tuba");

        WebElement element1=driver.findElement(By.name("q8_name[last]"));
        element1.sendKeys("aldemir");

        WebElement btnsubmit= driver.findElement(By.id("input_2"));
        btnsubmit.click();

        Myfunc.Bekle(5);
        driver.quit();
    }
}
