package Gun_03;

import Utilty.Myfunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningWebseite {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();// driver tarayici
        //new FirefoxDriver();
        //new EdgeDriver();
        driver.get("https://techno.study/tr"); // web sayfasini ac

        Myfunc.Bekle(3);
        //bekleme
        driver.quit();
    }
}
