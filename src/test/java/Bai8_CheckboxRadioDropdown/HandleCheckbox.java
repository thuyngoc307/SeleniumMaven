package Bai8_CheckboxRadioDropdown;

import common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandleCheckbox extends BaseTest {
    public static void main(String[] args) {
        createDriver();
        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
        WebElement checkboxOne = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
//        driver.findElement(By.id("details-button")).click();
//        driver.findElement(By.id("proceed-linkproceed-link")).click();
        boolean checkboxStatusBefore = checkboxOne.isSelected();
        System.out.println(checkboxStatusBefore);
        if(checkboxStatusBefore==false){
            checkboxOne.click();
        }
        boolean checkboxStatusAfter = checkboxOne.isSelected();
        System.out.println(checkboxStatusAfter);
        closeDriver();

    }

}
