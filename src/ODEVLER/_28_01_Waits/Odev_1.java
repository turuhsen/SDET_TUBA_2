package ODEVLER._28_01_Waits;

import Utilty.Basedriver;
import Utilty.Myfunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class Odev_1 extends Basedriver {
    /*
    Senaryo
    1- https://testsheepnz.github.io/BasicCalculator.html sitesine gidiniz.
    2- random 100 e kadar 2 sayı üretiniz.
    3- Sayıları hesap makinesinin bütün fonksiyonları için çalıştırınız.
    4- Sonuçları Assert ile kontrol ediniz.
    5- Yukarıdaki işlemi 5 kez tekrar ettiriniz.
 */    @Test
    public void Senaryo1() {

        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
        Myfunc.Bekle(2);
        wait.until(ExpectedConditions.urlToBe("https://testsheepnz.github.io/BasicCalculator.html"));


        for (int i = 0; i < 5; i++) {

            int rndSayi1 = (int) (Math.random() * 100);
            int rndSayi2 = (int) (Math.random() * 99) + 1; // random olarak verilen sayının her zaman +1 ' ini alır

            String strRndSayi1 = String.valueOf(rndSayi1);
            String strRndSayi2 = String.valueOf(rndSayi2);

            System.out.println((i+1)+".döngu icin sayilar:");
            System.out.println("sayi1="+strRndSayi1+" sayi2="+strRndSayi2);

            KutucukSifirlama();
            degeratama(strRndSayi1,strRndSayi2);

            for (int j = 0; j < 5; j++) {

                switch (j) {

                    case 0:
                        Myfunc.Bekle(3);
                        //KutucukSifirlama();
                        Toplama(rndSayi1,rndSayi2);
                        break;
                    case 1:
                        Myfunc.Bekle(3);
                        //KutucukSifirlama();
                        Cikarma(rndSayi1,rndSayi2);
                        break;
                    case 2:
                        Myfunc.Bekle(3);
                        //KutucukSifirlama();
                        Myfunc.Bekle(3);
                        Carpma(rndSayi1,rndSayi2);
                        break;

                    //case 3:
                    //    Myfunc.Bekle(3);
                    //    //KutucukSifirlama();
                    //    Myfunc.Bekle(3);
                    //    Bolme();
                    //    break;
                    case 4:
                        Myfunc.Bekle(3);
                        //KutucukSifirlama();
                        Myfunc.Bekle(3);
                        Birlestirme(strRndSayi1,strRndSayi2);
                        break;
                    //default:
                    //    System.out.println("Geçersiz seçim. Lütfen tekrar deneyin.");
                }

            }

        }
        BekleKapat();


    }

    public void KutucukSifirlama() {
        Actions driverAksiyon = new Actions(driver);
        WebElement firstNo = driver.findElement(By.xpath("//input[@id='number1Field']"));
        wait.until(ExpectedConditions.visibilityOf(firstNo));
        firstNo.sendKeys("");
        driverAksiyon.moveToElement(firstNo).sendKeys(Keys.CLEAR).sendKeys(Keys.DELETE).
                sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).
                build().perform();

        WebElement secondNo = driver.findElement(By.cssSelector("[id='number2Field']"));
        wait.until(ExpectedConditions.visibilityOf(secondNo));
        secondNo.sendKeys("");
        driverAksiyon.moveToElement(secondNo).sendKeys(Keys.CLEAR).
                sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).
                build().perform();

    }
    public void degeratama(String strRndSayi1,String strRndSayi2)
    {
        Myfunc.Bekle(1);
        Actions driverAksiyon = new Actions(driver);

        new Actions(driver).scrollByAmount(0, 900).build().perform();

        WebElement firstNo = driver.findElement(By.cssSelector("[id='number1Field']"));
        //MyFunc.Bekle(2);
        //Action firstNoAksiyon = driverAksiyon.scrollToElement(firstNo).build();
        wait.until(ExpectedConditions.visibilityOf(firstNo));
        //firstNoAksiyon.perform();

        Action elamanGonder1 = driverAksiyon.moveToElement(firstNo).click().sendKeys(strRndSayi1).build();
        elamanGonder1.perform();

        WebElement secondNo = driver.findElement(By.cssSelector("[id='number2Field']"));

//        Action secondNoAksiyon = driverAksiyon.scrollToElement(secondNo).build();
//        wait.until(ExpectedConditions.visibilityOf(secondNo));
//        secondNoAksiyon.perform();

        wait.until(ExpectedConditions.visibilityOf(secondNo));
        Action elamanGonder2 = driverAksiyon.moveToElement(secondNo).click().sendKeys(strRndSayi2).build();
        elamanGonder2.perform();
    }


    public void Toplama(int rndSayi1,int rndSayi2) {

        Myfunc.Bekle(1);
        Actions driverAksiyon = new Actions(driver);

        new Actions(driver).scrollByAmount(0, 900).build().perform();

        WebElement operationLabel = driver.findElement(By.xpath("//select[@id='selectOperationDropdown']"));
        operationLabel.click();

        wait.until(ExpectedConditions.visibilityOf(operationLabel));
        Select operationMenu = new Select(operationLabel);
        operationMenu.selectByIndex(0); // index ile value 0 dan saymaya başlıyor
        //operationMenu.selectByValue("0");
        //operationMenu.selectByVisibleText("Add");

        WebElement calculateButton = driver.findElement(By.cssSelector("[id='calculateButton']"));

        Action forCalculate = driverAksiyon.moveToElement(calculateButton).click().build();
        wait.until(ExpectedConditions.visibilityOf(calculateButton));
        forCalculate.perform();

        //MyFunc.Bekle(2);
        WebElement answer = driver.findElement(By.xpath("(//div[@class='row'])[9]//input"));
//        WebElement answer = driver.findElement(By.xpath("(//div[@class='col-sm-7'])[6]"));
        //System.out.println("answer.getAttribute(type) = " + answer.getAttribute("type"));
        //System.out.println("answer.getCssValue(overflow) = " + answer.getCssValue("overflow"));
        //MyFunc.Bekle(2);
        wait.until(ExpectedConditions.visibilityOf(answer));
        //MyFunc.Bekle(2);
        //System.out.println("answer.getText() = " + answer.getText());
        System.out.println("answer.getAttribute(value) = " + answer.getAttribute("value"));


        //Assert.assertFalse("Sonuç Ekranda Çıkmadı", answer.getText().length() > 0);
        //System.out.println("answer.isDisplayed() = " + answer.isDisplayed());
        //System.out.println("answer.isEnabled() = " + answer.isEnabled());


        //Assert.assertFalse("Sonuç Yok", answer.getAttribute("value").isEmpty());
        Assert.assertFalse("Sonuç Yok", answer.getAttribute("value").isEmpty());
        // ben false bekliyorum , dolu olmasını boş olmamasını istiyorum

        Assert.assertEquals(answer.getAttribute("value"), String.valueOf(rndSayi1 + rndSayi2));


        //BekleKapat();

    }


    public void Cikarma(int rndSayi1,int rndSayi2) {

        Myfunc.Bekle(1);
        Actions driverAksiyon = new Actions(driver);

        new Actions(driver).scrollByAmount(0, 900).build().perform();

        WebElement operationLabel = driver.findElement(By.xpath("//select[@id='selectOperationDropdown']"));
        operationLabel.click();

        wait.until(ExpectedConditions.visibilityOf(operationLabel));
        Select operationMenu = new Select(operationLabel);
        operationMenu.selectByIndex(1); // index ile value 0 dan saymaya başlıyor
        //operationMenu.selectByValue("0");
        //operationMenu.selectByVisibleText("Add");

        WebElement calculateButton = driver.findElement(By.cssSelector("[id='calculateButton']"));

        Action forCalculate = driverAksiyon.moveToElement(calculateButton).click().build();
        wait.until(ExpectedConditions.visibilityOf(calculateButton));
        forCalculate.perform();

        //MyFunc.Bekle(2);
        WebElement answer = driver.findElement(By.xpath("(//div[@class='row'])[9]//input"));
//        WebElement answer = driver.findElement(By.xpath("(//div[@class='col-sm-7'])[6]"));
        //System.out.println("answer.getAttribute(type) = " + answer.getAttribute("type"));
        //System.out.println("answer.getCssValue(overflow) = " + answer.getCssValue("overflow"));
        //MyFunc.Bekle(2);
        wait.until(ExpectedConditions.visibilityOf(answer));
        //MyFunc.Bekle(2);
        //System.out.println("answer.getText() = " + answer.getText());
        System.out.println("answer.getAttribute(value) = " + answer.getAttribute("value"));


        //Assert.assertFalse("Sonuç Ekranda Çıkmadı", answer.getText().length() > 0);
        //System.out.println("answer.isDisplayed() = " + answer.isDisplayed());
        //System.out.println("answer.isEnabled() = " + answer.isEnabled());


        //Assert.assertFalse("Sonuç Yok", answer.getAttribute("value").isEmpty());
        Assert.assertFalse("Sonuç Yok", answer.getAttribute("value").isEmpty());
        // ben false bekliyorum , dolu olmasını boş olmamasını istiyorum


        Assert.assertEquals(answer.getAttribute("value"), String.valueOf(rndSayi1 - rndSayi2));


        //BekleKapat();

    }

    public void Carpma(int rndSayi1,int rndSayi2) {

        Myfunc.Bekle(1);
        Actions driverAksiyon = new Actions(driver);

        new Actions(driver).scrollByAmount(0, 900).build().perform();

        WebElement operationLabel = driver.findElement(By.xpath("//select[@id='selectOperationDropdown']"));
        operationLabel.click();

        wait.until(ExpectedConditions.visibilityOf(operationLabel));
        Select operationMenu = new Select(operationLabel);
        operationMenu.selectByIndex(2); // index ile value 0 dan saymaya başlıyor
        //operationMenu.selectByValue("0");
        //operationMenu.selectByVisibleText("Add");

        WebElement calculateButton = driver.findElement(By.cssSelector("[id='calculateButton']"));

        Action forCalculate = driverAksiyon.moveToElement(calculateButton).click().build();
        wait.until(ExpectedConditions.visibilityOf(calculateButton));
        forCalculate.perform();

        //MyFunc.Bekle(2);
        WebElement answer = driver.findElement(By.xpath("(//div[@class='row'])[9]//input"));
//        WebElement answer = driver.findElement(By.xpath("(//div[@class='col-sm-7'])[6]"));
        //System.out.println("answer.getAttribute(type) = " + answer.getAttribute("type"));
        //System.out.println("answer.getCssValue(overflow) = " + answer.getCssValue("overflow"));
        //MyFunc.Bekle(2);
        wait.until(ExpectedConditions.visibilityOf(answer));
        //MyFunc.Bekle(2);
        //System.out.println("answer.getText() = " + answer.getText());
        System.out.println("answer.getAttribute(value) = " + answer.getAttribute("value"));


        //Assert.assertFalse("Sonuç Ekranda Çıkmadı", answer.getText().length() > 0);
        //System.out.println("answer.isDisplayed() = " + answer.isDisplayed());
        //System.out.println("answer.isEnabled() = " + answer.isEnabled());


        //Assert.assertFalse("Sonuç Yok", answer.getAttribute("value").isEmpty());
        Assert.assertFalse("Sonuç Yok", answer.getAttribute("value").isEmpty());
        // ben false bekliyorum , dolu olmasını boş olmamasını istiyorum


        Assert.assertEquals(answer.getAttribute("value"), String.valueOf(rndSayi1 * rndSayi2));


        //BekleKapat();

    }

    @Test
    public void Bolme() {
        Myfunc.Bekle(1);
        Actions driverAksiyon = new Actions(driver);

        new Actions(driver).scrollByAmount(0, 900).build().perform();

        WebElement operationLabel = driver.findElement(By.xpath("//select[@id='selectOperationDropdown']"));
        operationLabel.click();

        wait.until(ExpectedConditions.visibilityOf(operationLabel));
        Select operationMenu = new Select(operationLabel);
        operationMenu.selectByIndex(3); // index ile value 0 dan saymaya başlıyor
        //operationMenu.selectByValue("0");
        //operationMenu.selectByVisibleText("Add");

        WebElement calculateButton = driver.findElement(By.cssSelector("[id='calculateButton']"));

        Action forCalculate = driverAksiyon.moveToElement(calculateButton).click().build();
        wait.until(ExpectedConditions.visibilityOf(calculateButton));
        forCalculate.perform();

        //MyFunc.Bekle(2);
        WebElement answer = driver.findElement(By.xpath("(//div[@class='row'])[9]//input"));
//        WebElement answer = driver.findElement(By.xpath("(//div[@class='col-sm-7'])[6]"));
        //System.out.println("answer.getAttribute(type) = " + answer.getAttribute("type"));
        //System.out.println("answer.getCssValue(overflow) = " + answer.getCssValue("overflow"));
        //MyFunc.Bekle(2);
        wait.until(ExpectedConditions.visibilityOf(answer));
        //MyFunc.Bekle(2);
        //System.out.println("answer.getText() = " + answer.getText());
        System.out.println("answer.getAttribute(value) = " + answer.getAttribute("value"));


        //Assert.assertFalse("Sonuç Ekranda Çıkmadı", answer.getText().length() > 0);
        //System.out.println("answer.isDisplayed() = " + answer.isDisplayed());
        //System.out.println("answer.isEnabled() = " + answer.isEnabled());


        //Assert.assertFalse("Sonuç Yok", answer.getAttribute("value").isEmpty());
        Assert.assertFalse("Sonuç Yok", answer.getAttribute("value").isEmpty());
        // ben false bekliyorum , dolu olmasını boş olmamasını istiyorum

       // Assert.assertEquals(answer.getAttribute("value"), String.valueOf(rndSayi1 / rndSayi2));


        //BekleKapat();


    }


    public void Birlestirme(String strRndSayi1,String strRndSayi2) {
        Myfunc.Bekle(1);
        Actions driverAksiyon = new Actions(driver);

        new Actions(driver).scrollByAmount(0, 900).build().perform();

        WebElement operationLabel = driver.findElement(By.xpath("//select[@id='selectOperationDropdown']"));
        operationLabel.click();

        wait.until(ExpectedConditions.visibilityOf(operationLabel));
        Select operationMenu = new Select(operationLabel);
        operationMenu.selectByIndex(4); // index ile value 0 dan saymaya başlıyor
        //operationMenu.selectByValue("0");
        //operationMenu.selectByVisibleText("Add");

        WebElement calculateButton = driver.findElement(By.cssSelector("[id='calculateButton']"));

        Action forCalculate = driverAksiyon.moveToElement(calculateButton).click().build();
        wait.until(ExpectedConditions.visibilityOf(calculateButton));
        forCalculate.perform();

        // MyFunc.Bekle(2);
        WebElement answer = driver.findElement(By.xpath("(//div[@class='row'])[9]//input"));
//        WebElement answer = driver.findElement(By.xpath("(//div[@class='col-sm-7'])[6]"));
        //System.out.println("answer.getAttribute(type) = " + answer.getAttribute("type"));
        //System.out.println("answer.getCssValue(overflow) = " + answer.getCssValue("overflow"));
        //MyFunc.Bekle(2);
        wait.until(ExpectedConditions.visibilityOf(answer));
        //MyFunc.Bekle(2);
        //System.out.println("answer.getText() = " + answer.getText());
        System.out.println("answer.getAttribute(value) = " + answer.getAttribute("value"));


        //Assert.assertFalse("Sonuç Ekranda Çıkmadı", answer.getText().length() > 0);
        //System.out.println("answer.isDisplayed() = " + answer.isDisplayed());
        //System.out.println("answer.isEnabled() = " + answer.isEnabled());


        //Assert.assertFalse("Sonuç Yok", answer.getAttribute("value").isEmpty());
        Assert.assertFalse("Sonuç Yok", answer.getAttribute("value").isEmpty());
        // ben false bekliyorum , dolu olmasını boş olmamasını istiyorum

//        Assert.assertEquals(answer.getAttribute("value"), String.valueOf(rndSayi1 + rndSayi2));
//        Assert.assertEquals(answer.getAttribute("value"), String.valueOf(rndSayi1 - rndSayi2));
//        Assert.assertEquals(answer.getAttribute("value"), String.valueOf(rndSayi1 * rndSayi2));
//        Assert.assertEquals(answer.getAttribute("value"), String.valueOf(rndSayi1 / rndSayi2));
        Assert.assertEquals(answer.getAttribute("value"), strRndSayi1.concat(strRndSayi2));


        //BekleKapat();

    }
}
