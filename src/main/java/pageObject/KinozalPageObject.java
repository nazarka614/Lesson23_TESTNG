package pageObject;

import configuretions.BaseClass;
import data.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KinozalPageObject extends BaseClass {
    @FindBy(xpath = "//input[@name = \"username\"]")
    WebElement inputLogin;

    @FindBy(xpath = "//input[@name = \"password\"]")
    WebElement inputPassword;

    public void EnterLoginAndPassword(User user){
//        driver.findElement(By.xpath("//input[@name = \"username\"]")).sendKeys(user.getName());
//        driver.findElement(By.xpath("//input[@name = \"password\"]")).sendKeys(user.getPassword());
        this.inputLogin.sendKeys(user.getName());
        this.inputPassword.sendKeys(user.getPassword());
    }
}
