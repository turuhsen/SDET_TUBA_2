package Gun_04;

import Utilty.Myfunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _05_FindingByClassName {
    public static void main(String[] args) {

        //Bowserlarda incele yaptiginizda id lerden aramalar icin #, class aramalar icin . kullanilir

        WebDriver driver=new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement element=driver.findElement(By.className("form-sub-label"));
        System.out.println("element.getText() = " + element.getText());
        //findElement :locator birden fazla elemani isaret ediyorsa, ilkini bulur

        //Bütün elemanlari almak icin findelemenS kullanilir

        List<WebElement> etiketler=driver.findElements(By.className("form-sub-label"));
        System.out.println("etiketler.size() = " + etiketler.size());

        for (WebElement e:etiketler)
            System.out.println("e.getText() = " + e.getText());

        Myfunc.Bekle(5);
        driver.quit();
    }
}
