package Bai7_WebElement;

import common.BaseTest;
import org.openqa.selenium.Cookie;

import java.util.Set;

public class InterfaceOption extends BaseTest {
    public static void main(String[] args) {
        // Phóng hết cỡ trình duyệt theo màn hình máy tính
        createDriver();
        driver.manage().window().maximize();
        driver.get("https://anhtester.com");

// Add a new cookie
        Cookie newCookie = new Cookie("customName", "customValue");
        driver.manage().addCookie(newCookie);
        System.out.println(driver.manage().getCookieNamed("customName"));

// Get all cookies
        Set<Cookie> cookies = driver.manage().getCookies();
        System.out.println(cookies.toString());

// Delete a cookie by name
        driver.manage().deleteCookieNamed("CookieName");

// Delete all cookies
        driver.manage().deleteAllCookies();
        closeDriver();

    }
}
