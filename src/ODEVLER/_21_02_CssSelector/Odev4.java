package ODEVLER._21_02_CssSelector;

import Utilty.Basedriver;
import Utilty.Myfunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev4 extends Basedriver {
  // Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]

  // Calculate'e tıklayınız.

  // İlk input'a herhangi bir sayı giriniz.

  // İkinci input'a herhangi bir sayı giriniz.

  // Calculate button'una tıklayınız.

  // Sonucu alınız.

    //Sonucu yazdırınız.
    @Test
    public void Test4(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement calculate= driver.findElement(By.cssSelector("[id='calculatetest']"));
        calculate.click();
        Myfunc.Bekle(2);

        WebElement input1= driver.findElement(By.cssSelector("[id='number1']"));
        input1.sendKeys("22");
        Myfunc.Bekle(2);

        WebElement input2= driver.findElement(By.cssSelector("[id='number2']"));
        input2.sendKeys("15");
        Myfunc.Bekle(2);

        WebElement calculatbutton= driver.findElement(By.cssSelector("[id='calculate']"));
        calculatbutton.click();
        Myfunc.Bekle(2);
        
        WebElement answer= driver.findElement(By.cssSelector("[id='answer']"));
        System.out.println("answer.getText() = " + answer.getText());
        Myfunc.Bekle(2);

        BekleKapat();

    }
}
