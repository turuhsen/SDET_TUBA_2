package Gun_13;

import Utilty.Basedriver;
import Utilty.Myfunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

public class _05_RobotFileUpload extends Basedriver {
    @Test
    public void Test() throws AWTException {
        driver.get("https://demo.guru99.com/test/upload/");
        Myfunc.Bekle(2);
        // acceptAll
        WebElement acceptAllFrame=driver.findElement(By.id("gdpr-consent-notice"));
        driver.switchTo().frame(acceptAllFrame);

        List<WebElement> acceptAll=
                wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[text()='Alle akzeptieren']")));

        if (acceptAll.size() > 0)
            acceptAll.get(0).click();
        /*********************/

        Robot robot=new Robot();
        for (int i = 0; i < 21; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Myfunc.Bekle(1);

        //stringi hafizaya kopyalama yöntemi
        StringSelection dosyayolu=new StringSelection("C:\\Users\\P\\OneDrive\\Masaüstü\\2.PNG");

        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(dosyayolu, null); //ctrl+C panoya gitti,panoya kopyalandi

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V); //ctrl+v yapistirma

        robot.keyRelease(KeyEvent.VK_CONTROL);// tuslar serbest birakildi
        robot.keyRelease(KeyEvent.VK_V);

        Myfunc.Bekle(1);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        Myfunc.Bekle(2);
        for (int i = 0; i <2 ; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        } //check nox a geldim

        Myfunc.Bekle(1);
        robot.keyPress(KeyEvent.VK_SPACE);
        robot.keyRelease(KeyEvent.VK_SPACE);

        Myfunc.Bekle(1);
        for (int i = 0; i < 2; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }//submit butonuna geldim

        Myfunc.Bekle(1);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);//Submit butonuna bastim

        WebElement msg=
                wait.until(ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//*[text()='has been successfully uploaded.']")));

        Assert.assertTrue(msg.isDisplayed());

        Myfunc.Bekle(2);
        //BekleKapat();
    }
}
