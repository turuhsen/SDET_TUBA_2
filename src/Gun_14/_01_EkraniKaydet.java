package Gun_14;

import Utilty.Basedriver;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class _01_EkraniKaydet extends Basedriver {
    @Test
    public void Test() throws IOException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        //kendinize kod yaziyorsaniz
        driver.findElement(By.name("username")).sendKeys("ismet");
        driver.findElement(By.name("password")).sendKeys("1234");

        WebElement submit= driver.findElement(By.cssSelector("button[type='submit']"));
        submit.click();

        List<WebElement>  errormsg=driver.findElements(By.xpath("//*[text()='Invalid credentials']"));
        if (errormsg.size()>0){ //hata olmus demektir, ekran kaydi alalim
            System.out.println("Hata oldu");

            //ekrani kaydet
            TakesScreenshot ts=(TakesScreenshot) driver;//ayni js gibi
            File hafizadakiHali=ts.getScreenshotAs(OutputType.FILE);//ekran kaydi aldi dosya formatinda ama hafizada duruyor

            FileUtils.copyFile(hafizadakiHali,new File("ekrangoruntuleri\\screenshot.jpg"));
            //su anda hafizdaki görüntüyü dosya olarak kaydetti

            BekleKapat();
        }
    }
}
