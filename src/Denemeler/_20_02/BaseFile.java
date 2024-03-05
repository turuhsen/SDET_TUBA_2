package Denemeler._20_02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseFile {
    public static WebDriver driver;

     static{
        driver=new ChromeDriver();
        driver.manage().window().maximize();    // Ekrani max yapiyor
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // 20 sn mühlet: sayfayı yükleme mühlet
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // 20 sn mühlet: elementi bulma mühleti
    }
public static void BekleKapat(){
    MyFunc.Bekle(3);
    driver.quit();
}




}
class MyFunc {
    public static void Bekle(int sn){

        try {
            Thread.sleep(sn*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
