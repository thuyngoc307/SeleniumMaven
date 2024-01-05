package anhtester.com.Bai11_Assertions;

import anhtester.com.common.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHardAssertions extends BaseTest {
    @Test(priority = 1)
    public void assertEquals() {

        driver.get("https://anhtester.com");

        String expectedTitle = "Anh Tester Automation";
        String actualTitle = driver.getTitle();

        System.out.println("*** Checking For The Title ***");

        Assert.assertEquals(actualTitle, expectedTitle,"Tiêu đề chưa đúng!");
        System.out.println("Hello Automation class");
    }
    @Test(priority = 2)
    public void assertTrue() {

        driver.get("https://anhtester.com");
        String actualTitle = driver.getTitle();
        System.out.println("*** Checking For The Title ***");
        Assert.assertTrue(actualTitle.contains("Anh Tester"));
        System.out.println(actualTitle);
    }
}
