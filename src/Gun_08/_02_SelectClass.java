package Gun_08;

import Utilty.Basedriver;
import Utilty.Myfunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_SelectClass extends Basedriver {
    @Test
    public void Test()
    {
        driver.get("https://www.amazon.com/");
        Myfunc.Bekle(2);

        WebElement webmenu= driver.findElement(By.id("searchDropdownBox"));

        //egerki bir html elementi select ile basliyorsa daha kolay kullanim icin,onu
        //selenium select classina cevirip kullanabilirim

        Select ddmenu=new Select(webmenu);
        //ddmenu.selectByIndex(4); // istersen index ile secebiliyorsin
        //ddmenu.selectByValue("search-alias=stripbooks-intl-ship");//istersen value ile secebiliyorsun
        ddmenu.selectByVisibleText("Computer");
        System.out.println("ddmenu.getOptions().size() = " + ddmenu.getOptions().size());

        for (WebElement e:ddmenu.getOptions()){
            System.out.println("e.getText() = " + e.getText());
            System.out.println(" -e.getAttribute(\"value\") = " + e.getAttribute("value"));
        }

    BekleKapat();
    }}
