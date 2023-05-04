package Bai6_WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class loginCMS {
    public static void main(String[] args) throws InterruptedException {

        //Khởi tạo driver với chrome
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(1000);

        //Login CMS
        driver.get("https://demo.activeitzone.com/ecommerce/login");
        //Bắt element Email
        WebElement inputEmail = driver.findElement(By.id("email"));
        inputEmail.sendKeys("admin@example.com");
        Thread.sleep(500);
        //Bắt element Password
        driver.findElement(By.id("password")).sendKeys("123456");
        Thread.sleep(1000);

        WebElement buttonCopy = driver.findElement(By.xpath(" (//button[normalize-space()='Copy'])"));
        System.out.println("Trạng thái nút Copy: " + buttonCopy.isDisplayed());

        if(buttonCopy.isDisplayed()==true) {

            driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        }
            Thread.sleep(2000);

        //Tắt browser
        driver.quit();
    }
}
