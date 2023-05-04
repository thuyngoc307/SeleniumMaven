package Bai8_CheckboxRadioDropdown;

import common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandleRadioButton extends BaseTest {
    public static void main(String[] args) {
        createDriver();
        driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
        WebElement radioButton = driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//label[normalize-space()='Male']/input"));
        System.out.println(radioButton.isSelected());
        if(radioButton.isSelected() == false) {
            radioButton.click();
        }
        System.out.println(radioButton.isSelected());
        WebElement radioButtonGroup = driver.findElement(By.xpath("//h4[normalize-space()='Age Group :']/following-sibling::label[normalize-space()='5 to 15']/input"));
        radioButtonGroup.click();
        System.out.println("Trạng thái radio button group: "+ radioButtonGroup.isSelected());
        WebElement radioButton0to5 = driver.findElement(By.xpath("//h4[normalize-space()='Age Group :']/following-sibling::label[normalize-space()='0 to 5']/input"));
        WebElement radioButton15to50 = driver.findElement(By.xpath("//h4[normalize-space()='Age Group :']/following-sibling::label[normalize-space()='15 to 50']/input"));
        System.out.println("Trạng thái radio button 0 to 5: "+ radioButton0to5.isSelected()); //sau này dùng Asert của testNG để kiểm tra
        System.out.println("Trạng thái radio button 15 to 50: "+ radioButton15to50.isSelected());
        closeDriver();
    }

}
