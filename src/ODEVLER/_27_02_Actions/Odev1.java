package ODEVLER._27_02_Actions;

import Utilty.Basedriver;
import Utilty.Myfunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Odev1 extends Basedriver {
    //Ödev 1 : http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html
    //buradaki ülke ve şehirleri findElements ile topluca bularak bir döngü ile bütün şehirleri doğru ülkere dağıtınız.
    @Test
    public void Teset(){
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");

        Myfunc.Bekle(2);

       List<WebElement>  sehirler=driver.findElements(By.xpath("//div[@class='dragDropSmallBox' and starts-with(@id,'a')]"));
        List<WebElement>  ulkeler=driver.findElements(By.xpath("//div[@class='dragDropSmallBox' and starts-with(@id,'q')]"));

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='dragDropSmallBox' and starts-with(@id,'a')]")));
        for (WebElement sehir:sehirler){
            Actions actions=new Actions(driver);
            Action action=actions.clickAndHold(sehir).build();
            action.perform();
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='dragDropSmallBox' and starts-with(@id,'q')]")));
            for (WebElement ulke:ulkeler){
                if (sehir.getAttribute("id").substring(1).equals(ulke.getAttribute("id").substring(1))){
                    action=actions.moveToElement(ulke).release().build();
                    action.perform();
                }
            }
        }

               BekleKapat();

        }}





