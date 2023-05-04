package anhtester;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestSelenium {
    public static void main(String[] args) throws InterruptedException {

        //Khởi tạo browser với Chrome
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Mở trang anhtester.com
        driver.get("https://anhtester.com/");
        Thread.sleep(2000);

        //Click nút Website Testing
        driver.findElement(By.xpath("//h3[normalize-space()='Website Testing']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h2[@class='card__title']//a[normalize-space()='Selenium WebDriver with C# Basic to Advanced']")).click();
             String description = driver.findElement(By.xpath("//h2[contains(text(),'Xin chào các bạn. Khóa học Selenium C# này nhằm hư')]")).getText();
        Thread.sleep(2000);
        System.out.println(description);
        Thread.sleep(2000);

        //Tắt browser
        driver.quit();
    }
}
