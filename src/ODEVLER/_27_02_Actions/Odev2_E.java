package ODEVLER._27_02_Actions;

import Utilty.Basedriver;
import Utilty.Myfunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

public class Odev2_E extends Basedriver {
    @Test
    public void Test2(){
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html");

        List<WebElement> students = driver.findElements(By.xpath("//ul[@id='allItems']/li"));
        List<Integer> capacities = new ArrayList<>(5);
        capacities.add(4);
        capacities.add(4);
        capacities.add(4);
        capacities.add(3);
        capacities.add(7);

        Actions driverAction = new Actions(driver);

        wait.until(ExpectedConditions.visibilityOfAllElements(students));

        int i = 0;
        for (WebElement student : students){
            if(capacities.get(i) != 0)
            {
                WebElement team = driver.findElement(By.id("box" + (i + 1)));
                Action dragAction = driverAction.clickAndHold(student).build();
                Myfunc.Bekle(2);
                dragAction.perform();

                Action dropAction = driverAction.moveToElement(team).release().build();
                Myfunc.Bekle(2);
                dropAction.perform();
                capacities.set(i, capacities.get(i) - 1);
            } else{
                i++;
                WebElement team = driver.findElement(By.id("box" + (i + 1)));
                Action dragAction = driverAction.clickAndHold(student).build();
                Myfunc.Bekle(2);
                dragAction.perform();

                Action dropAction = driverAction.moveToElement(team).release().build();
                Myfunc.Bekle(2);
                dropAction.perform();
                capacities.set(i, capacities.get(i) - 1);
            }
        }
        BekleKapat();
}}
