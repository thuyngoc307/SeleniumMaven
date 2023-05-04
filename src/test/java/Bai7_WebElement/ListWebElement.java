package Bai7_WebElement;
import common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class ListWebElement extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        createDriver();
        driver.get("https://app.hrsale.com/");
        driver.findElement(By.xpath("//button[normalize-space()='Super Admin']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        Thread.sleep(6000);

        List<WebElement> listMenu = driver.findElements(By.xpath("//ul[@class='pc-navbar']/li"));
        for (int i = 0; i < listMenu.size(); i++) {
            System.out.println(listMenu.get(i).getText());
        }
        closeDriver();
    }
}
