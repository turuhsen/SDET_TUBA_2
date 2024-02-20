package Gun_04;

import Utilty.Myfunc;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _06_FindingByLinkText {
    public static void main(String[] args) {
        // id -> By.id
        // name -> By.name
        // class -> By.classname
        // linktext -> By.linktext (SADECE a tagli elemanlar için kullanılır)
        // partiallinktext -> By.partiallinktext (SADECE a tagli elemanlar için kullanılır)

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");
        // linktext:linkin görünen yazisi selector olarak kullanilir
        WebElement siparislerimLinki=driver.findElement(By.linkText("Siparişlerim"));
        System.out.println("siparislerimLinki.getText() = " + siparislerimLinki.getText());

        //Partiallinktext: Linkin görünen yazisinin bir kismini selector olarak kullanabiliriz
        WebElement link2=driver.findElement(By.partialLinkText("Süper Fiyat"));
        System.out.println("link2.getText() = " + link2.getText());

        //elementin özlliklerine getAttribute ile ulasabilirim
        System.out.println("siparislerimLinki = " + siparislerimLinki.getAttribute("href"));
        System.out.println("siparislerimLinki = " + siparislerimLinki.getAttribute("title"));
        System.out.println("siparislerimLinki = " + siparislerimLinki.getAttribute("rel"));


        Myfunc.Bekle(5);
        driver.quit();
    }
}
