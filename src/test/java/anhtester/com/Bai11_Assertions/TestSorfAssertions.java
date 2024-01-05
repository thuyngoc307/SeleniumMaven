package anhtester.com.Bai11_Assertions;

import anhtester.com.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestSorfAssertions extends BaseTest     {
    @Test(priority = 1)
    public void RunTest() {

        driver.get("https://rise.fairsketch.com/signin");

        SoftAssert softassert = new SoftAssert();

        String headerSignInPage = driver.findElement(By.xpath("//h2[normalize-space()='Sign in']")).getText();
        softassert.assertEquals(headerSignInPage, "Sign in");
        driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
        WebElement menuClient = driver.findElement(By.xpath("//span[normalize-space()='Clients']"));

        softassert.assertTrue(menuClient.isDisplayed(),"Menu client không hiển thị");
        //Cuối cùng của softassert là phải dùng softassert.assertAll() dể chốt các xác nhận bên trên
        softassert.assertAll();
    }
}
