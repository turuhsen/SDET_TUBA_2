package Gun_07_;

import Utilty.Basedriver;
import Utilty.Myfunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Soru extends Basedriver {
    @Test
    public void Test(){
        driver.get("https://www.saucedemo.com");

        Myfunc.Bekle(2);
        WebElement userneme=driver.findElement(By.xpath("//input[@id='user-name']"));
        userneme.sendKeys("standard_user");
        Myfunc.Bekle(2);

        Myfunc.Bekle(2);
        WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");
        Myfunc.Bekle(2);

        WebElement loginbutton= driver.findElement(By.xpath("//input[@id='login-button']"));
        loginbutton.click();
        Myfunc.Bekle(2);

        WebElement backpack= driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack']"));
        backpack.click();
        Myfunc.Bekle(2);

        WebElement buttonaddcart= driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
        buttonaddcart.click();
        Myfunc.Bekle(2);


        WebElement buttonback= driver.findElement(By.xpath("//button[@id='back-to-products']"));
        buttonback.click();
        Myfunc.Bekle(2);

        WebElement tshirt= driver.findElement(By.xpath("//*[text()='Sauce Labs Bolt T-Shirt']"));
        tshirt.click();
        Myfunc.Bekle(2);

        WebElement buttonaddcart2= driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']"));
        buttonaddcart2.click();
        Myfunc.Bekle(2);

        WebElement sepet= driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        sepet.click();
        Myfunc.Bekle(2);

        WebElement buttoncheckout= driver.findElement(By.xpath("//button[@id='checkout']"));
        buttoncheckout.click();
        Myfunc.Bekle(2);

        WebElement firstname= driver.findElement(By.xpath("//input[@id='first-name']"));
        firstname.sendKeys("tuba");
        Myfunc.Bekle(2);
        WebElement lastname= driver.findElement(By.xpath("//input[@id='last-name']"));
        lastname.sendKeys("al");
        Myfunc.Bekle(2);

        WebElement zipcode= driver.findElement(By.xpath("//input[@id='postal-code']"));
        zipcode.sendKeys("86555");
        Myfunc.Bekle(2);
        WebElement continuebutton= driver.findElement(By.xpath("//input[@id='continue']"));
        continuebutton.click();
        Myfunc.Bekle(2);

        //sepet toplam islemleri yapiliyor
        List<WebElement> urunler=driver.findElements(By.xpath("//div[@class='inventory_item_price']"));

        double uruntoplamucret=0;
        for (WebElement e:urunler){
            System.out.println("e.getText() = " + e.getText());//$15,99
            String strurunfiyat=e.getText().replaceAll("[^0-9,.]","");
            double urunfiyat=Double.parseDouble(strurunfiyat);
            uruntoplamucret=uruntoplamucret+urunfiyat;
        }

        System.out.println("uruntoplamucret = " + uruntoplamucret);

        //item total aliniyor
        WebElement itemtotalelement= driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));
        String stritemtotal=itemtotalelement.getText().replaceAll("[^0-9,.]","");
        double iteamtotal=Double.parseDouble(stritemtotal);
        System.out.println("iteamtotal = " + iteamtotal);

        Assert.assertTrue("rakamlar esit degil",uruntoplamucret==iteamtotal);

    }
}
