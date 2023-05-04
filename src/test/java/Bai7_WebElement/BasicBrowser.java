package Bai7_WebElement;

import common.BaseTest;
import org.openqa.selenium.By;

public class BasicBrowser extends BaseTest {
    public static void main(String[] args) {
        createDriver();

// Navigate to a page
        driver.navigate().to("https://anhtester.com");
        sleep(1);
        driver.findElement(By.id("btn-login")).click();

//// Điều hướng về lịch sử trang trước đó
//        driver.navigate().back();
//        sleep(1);
//
//// Làm mới trang hiện tại
//        driver.navigate().refresh();
//        sleep(1);
//
//// Điều hướng đến trang tiếp sau
//        driver.navigate().forward();
//        sleep(1);

// Get the title of the page
        System.out.println(driver.getTitle());
        sleep(1);
// Get the current URL
        System.out.println(driver.getCurrentUrl());
        sleep(1);
// Get the current page HTML source
        System.out.println(driver.getPageSource());
        sleep(1);
        closeDriver();
    }


}
