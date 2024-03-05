package ODEVLER._27_02_Actions;

import Utilty.Basedriver;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class Soru_3_2 extends Basedriver {
    @Test
    public void Test(){

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html");

        List<WebElement> cities = driver.findElements(By.xpath("//div[@id='dhtmlgoodies_dragDropContainer']//li"));
        List<WebElement> countries = driver.findElements(By.xpath("//div[@id='dhtmlgoodies_mainContainer']//ul"));

        wait.until(ExpectedConditions.visibilityOfAllElements(cities));

        for (WebElement country : countries) {

            for (WebElement city : cities) {
                try {
                    Alert alert = driver.switchTo().alert();
                    alert.accept();
                }catch (NoAlertPresentException e){

                }
                String boxId = country.getAttribute("id");
                if (city.getAttribute("groupid").equals(boxId)) {
                    Actions driverAksiyon = new Actions(driver);
                    Action aksiyon = driverAksiyon.clickAndHold(city).build();

                    aksiyon.perform();
                    wait.until(ExpectedConditions.visibilityOfAllElements(countries));

                    aksiyon = driverAksiyon.moveToElement(country).release().build();
                    wait.until(ExpectedConditions.visibilityOfAllElements(countries));
                    aksiyon.perform();

                }
            }

        }

        BekleKapat();
    }
}
