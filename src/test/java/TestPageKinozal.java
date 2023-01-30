import configuretions.BaseClass;
import data.User;
import liseners.MyLisener;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageObject.KinozalPageObject;
@Listeners(MyLisener.class)
public class TestPageKinozal extends BaseClass {

    static KinozalPageObject kinozalPageObject = PageFactory.initElements(driver, KinozalPageObject.class);

    @BeforeClass
    public void startTest() {
        driver.get("https://kinozal.tv/");
    }

    @Test
    @
    public void enterdata() {

        kinozalPageObject.EnterLoginAndPassword(new User());
    }
}
