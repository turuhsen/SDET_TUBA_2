package Gun_04;

import Utilty.Myfunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_FindingIdnotfound {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");
        try{
            WebElement element= driver.findElement(By.id("hatali"));
        }
        catch (Exception e){
            System.out.println("Web elemet bulunmadi " + e.getMessage());
        }


        Myfunc.Bekle(5);
        driver.quit();

    }
}
