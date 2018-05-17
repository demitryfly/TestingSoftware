import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

import java.util.UUID;
import java.util.Vector;

import static junit.framework.TestCase.assertTrue;


public class GoogleTests {

    static Vector<WebDriver> driverVector = new Vector<WebDriver>();

    {
        System.setProperty("webdriver.gecko.driver", "D:\\DRIVERS\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "D:\\DRIVERS\\chromedriver.exe");

        driverVector.add(new FirefoxDriver());
        driverVector.add(new ChromeDriver());
    }

    @Test
    public void trySendEmail() throws InterruptedException {


        for (WebDriver driver : driverVector) {

            String messageName = UUID.randomUUID().toString();


//        driver = new FirefoxDriver();
//        driver = new ChromeDriver();

            driver.get("https://mail.google.com/mail/u/0/#inbox");
            driver.findElement(By.id("identifierId")).sendKeys("TestITMO123@gmail.com");
            driver.findElement(By.id("identifierNext")).click();

            Thread.sleep(10000);

            driver.findElement(By.name("password")).sendKeys("sPiMz(//ai%3CFf4&j8U");
            driver.findElement(By.id("passwordNext")).click();


            Thread.sleep(10000);

            driver.findElement(By.xpath("//div[.='COMPOSE']")).click();
            Thread.sleep(5000);

            driver.findElement(By.name("to")).sendKeys("TestITMO123@gmail.com");
            Thread.sleep(5000);

            driver.findElement(By.xpath("//input[@placeholder='Subject']")).sendKeys(messageName);
            Thread.sleep(5000);


            driver.findElement(By.xpath("//div[.='Send']")).click();
            Thread.sleep(5000);


            driver.get("https://mail.google.com/mail/u/0/#inbox");


            Thread.sleep(10000);

            String s = driver.findElement(By.xpath("//span[@class='bog']/b")).getText();// == messageName;

//        System.out.println(s);
//        System.out.println(messageName);

            assertTrue(0 == s.compareTo(messageName));
        }
    }
}
