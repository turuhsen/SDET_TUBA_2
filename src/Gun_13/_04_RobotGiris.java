package Gun_13;

import Utilty.Basedriver;
import Utilty.Myfunc;
import org.junit.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

public class _04_RobotGiris extends Basedriver {
    @Test
    public void Test() throws AWTException {
        driver.get("https://www.selenium.dev/");
        Myfunc.Bekle(2);

        //Klavyeden ctrl+tab a basarak yeni bir sekme acip,baska sayfa cagiralim
        //Bunu bu sefer ROBOT class la yapalim
        Robot robot=new Robot();

        //yeni pencere acalim
        robot.keyPress(KeyEvent.VK_CONTROL); // ctrl bas,su an artik basili durumda
        robot.keyPress(KeyEvent.VK_T); //ctrl basili idi,T harfine bastim
        robot.keyRelease(KeyEvent.VK_T); // t tusunu geri birak
        robot.keyRelease(KeyEvent.VK_CONTROL);//CTRL tusunu birak

        //simdi 2. sayfanin id sini bulup ona gecip yeni sayfayi cagiralim
        Set<String > idler=driver.getWindowHandles();
        Iterator gosterge=idler.iterator();// id lerin bas tarafina konumlan
        String birincisekme=gosterge.next().toString();//ilk pencerenin id sini aldim
        String ikincisekmeID=gosterge.next().toString();//ikinci pencerenin id sini aldim

        Myfunc.Bekle(2); //burada yeni sayfanin acilmis ve hazir olmasi gerekiyor
        driver.switchTo().window(ikincisekmeID);
        driver.get("https://www.facebook.com/");
    }
}
