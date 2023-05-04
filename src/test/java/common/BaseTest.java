package common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;
    public static void createDriver(){
        //Khởi tạo browser với Chrome
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    public static void closeDriver(){
        sleep(2);
        driver.quit();
    }
    public static void sleep(double seconds){
        try {
            Thread.sleep((long) (1000 * seconds));
        }catch(InterruptedException e) {
            throw new RuntimeException(e);
        }
        }

    }


