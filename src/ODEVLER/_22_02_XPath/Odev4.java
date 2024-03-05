package ODEVLER._22_02_XPath;

import Utilty.Basedriver;
import Utilty.Myfunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev4 extends Basedriver {
    /*
       Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]
       Calculate'e tıklayınız.
       İlk input'a herhangi bir sayı giriniz.
       İkinci input'a herhangi bir sayı giriniz.
       Calculate button'una tıklayınız.
       Sonucu alınız.
       Sonucu yazdırınız.
        */
    @Test
    public void Test(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement calculator= driver.findElement(By.xpath("(//div[@class='thumbdesclist']//a)[4]"));
        calculator.click();
        Myfunc.Bekle(2);


        WebElement input1= driver.findElement(By.xpath("//div[@class='form-label']/input[1]"));
       input1.sendKeys("5");
        Myfunc.Bekle(2);
        WebElement input2= driver.findElement(By.xpath("//div[@class='form-label']/input[2]"));
        input2.sendKeys("6");
        Myfunc.Bekle(2);

        WebElement calculatebutton= driver.findElement(By.xpath("//div[@class='form-label']//following::div/input"));
       calculatebutton.click();
        Myfunc.Bekle(2);

        WebElement anaswer= driver.findElement(By.xpath("//div[@class='centered']//span"));
        Myfunc.Bekle(2);
        System.out.println("answer = " + anaswer.getText());
        BekleKapat();



    }
}
