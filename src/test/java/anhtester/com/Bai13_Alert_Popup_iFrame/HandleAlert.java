package anhtester.com.Bai13_Alert_Popup_iFrame;

import anhtester.com.common.BaseTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HandleAlert extends BaseTest {
    @Test
    public void TestAlert01() throws InterruptedException {
        driver.get("http://demo.guru99.com/test/delete_customer.php");

        driver.findElement(By.name("cusid")).sendKeys("53920");
        driver.findElement(By.name("submit")).submit();

        // Khai báo chuyển hướng đến Alert với đối tượng
        Alert alert = driver.switchTo().alert();

        // Get message trên alert
        String alertMessage = driver.switchTo().alert().getText();

        // Displaying alert message
        System.out.println(alertMessage);
        Thread.sleep(2000);

        // accept() = nhấn Ok button
        // driver.switchTo().alert().accept(); //Cách 1
        ((Alert) alert).accept(); //Cách 2

        //Nhấn Cancel button
        //alert.dismiss();

        Thread.sleep(2000);
//        Alert alert2 = driver.switchTo().alert();
//        System.out.println(alert2.getText());
//        Thread.sleep(2000);
    }


}
