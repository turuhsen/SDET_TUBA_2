package ODEVLER._07_03_Wait_Scroll_Alert;

import Utilty.Basedriver;
import Utilty.Myfunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class Odev6 extends Basedriver {

        /*6-
Senaryo
1- https://www.youtube.com/ adresine gidiniz
2- "Selenium" kelimesi ile video aratınız.
3- Listelenen sonuçlarda 80 videoaya kadar listeyi uzatınız.
4- Son videonun title ını yazdırınız.*/

    @Test
    public void Senaryo6() {

        driver.get("https://www.youtube.com/");


        List<WebElement> consent = driver.findElements(By.xpath("//*[@id='content']/div[2]/div[6]/div[1]/ytd-button-renderer[2]/yt-button-shape/button"));
        if (consent.size() > 0)
            consent.get(0).click();

        Actions actions=new Actions(driver);


        WebElement searchBox = driver.findElement(By.cssSelector("input[name='search_query']"));
        wait.until(ExpectedConditions.visibilityOf(searchBox));
        searchBox.sendKeys("Selenium");
        Action action=actions
                .moveToElement(searchBox)
                .click()
                .keyDown(Keys.ENTER)
                .keyUp(Keys.ENTER)
                .build();
        action.perform();


        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        List<WebElement>  videos=driver.findElements(By.cssSelector(".style-scope ytd-video-renderer"));
        while(videos.size()<80){
            javascriptExecutor.executeScript("window.scrollBy(0,3000)"); //3000 size kaydir
            //javascriptExecutor.executeScript("window.scrollto(0,3000);"); //3000. size e kadar kaydir
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".style-scope ytd-video-renderer")));
            videos=driver.findElements(By.cssSelector(".style-scope ytd-video-renderer"));
        }

        videos.get(79).click();
        WebElement playbutton= driver.findElement(By.xpath("//button[@class='ytp-play-button ytp-button']"));
        wait.until(ExpectedConditions.elementToBeClickable(playbutton));
        System.out.println("80. video Title=" +driver.getTitle());

        //WebElement element80 = driver.findElement(By.xpath("(//div[@id='rendering-content'])[10]"));

        // javascriptExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        // wait.until(ExpectedConditions.elementToBeClickable(element80));
        //
       // WebElement element = null;
       //for (int i = 1; i < 6; i++) {
       //    Myfunc.Bekle(1);
       //     element = driver.findElement(By.xpath("//span[@id='video-title'][" + i + "]"));
       //    wait.until(ExpectedConditions.visibilityOf(element));
       //    javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);",element);
       //    //javascriptExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
       //    //javascriptExecutor.executeScript("arguments[0].click();",element);
       //    }
       //javascriptExecutor.executeScript("arguments[0].click();",element);
       //Myfunc.Bekle(2);
       //String url80 = driver.getTitle();
       //System.out.println("url80 = " + url80);
       //Myfunc.Bekle(8);
       //BekleKapat();
    }
}

