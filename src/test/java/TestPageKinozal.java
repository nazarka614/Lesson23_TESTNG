import configuretions.BaseClass;
import data.User;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.KinozalPageObject;

public class TestPageKinozal extends BaseClass {
    public KinozalPageObject kinozalPageObject = PageFactory.initElements(driver, KinozalPageObject.class);

    @BeforeClass
    public void startTest() {
        driver.get("https://kinozal.tv/");
    }
    @Test
    public void enterdata(){
        kinozalPageObject.EnterLoginAndPassword(new User());
    }
}
