package pageObject;

import data.User;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KinozalPageObject {
    @FindBy(xpath = "//*[@name = \"username\"]")
    WebElement inputLogin;

    @FindBy(xpath = "//*[@name = \"password\"]")
    WebElement inputPassword;

    public void EnterLoginAndPassword(User user){
        this.inputLogin.sendKeys(user.getName());
        this.inputPassword.sendKeys(user.getPassword());
    }
}
