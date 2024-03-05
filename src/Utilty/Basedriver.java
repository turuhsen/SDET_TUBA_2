package Utilty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Basedriver {
   public static WebDriver driver;
    public  static WebDriverWait wait;
     static {

       driver =new ChromeDriver();

       driver.manage().window().maximize();//Ekrani max yapiyor
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
         wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public  static void BekleKapat(){
        Myfunc.Bekle(3);
        driver.quit();
    }
}
