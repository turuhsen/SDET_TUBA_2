package Gun_14;

import Utilty.Basedriver;
import Utilty.Myfunc;
import org.junit.Test;
import org.openqa.selenium.Dimension;

import java.awt.*;

public class _02_WindowSize extends Basedriver {
    @Test
    public void Test(){
        driver.get("https://www.youtube.com/");
        Myfunc.Bekle(5);

        driver.manage().window().maximize();//ekrani max yapar

        Dimension ekranboyutu=driver.manage().window().getSize();
        System.out.println("ekranboyutu.width = " + ekranboyutu.width);
        System.out.println("ekranboyutu.height = " + ekranboyutu.height);

        Myfunc.Bekle(5);
        Dimension yeniboyut=new Dimension(516,600);
        driver.manage().window().setSize(yeniboyut);// tarayicinin boyutunu istenilen boyutlara getirdim, teste böyle basliyorum

        //testler
        BekleKapat();
    }
}
