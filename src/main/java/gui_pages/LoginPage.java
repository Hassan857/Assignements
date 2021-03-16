package gui_pages;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage  {

    private WebDriver driver;

    private By usernamefield = By.id("__BVID__12");
    private By passwordfield = By.id("__BVID__14");
    private By signinbutton = By.xpath("//button");

    public LoginPage (WebDriver driver) {

        this.driver=driver;
    }
    public void enter_username (String username) {
          ElementActions.type(driver , usernamefield , username);
    }
    public void enter_password (String password) {
        ElementActions.type(driver , passwordfield , password);
    }
    public ProfilePage click_signin () {
        ElementActions.click(driver , signinbutton);
        return new ProfilePage (driver);
    }
}
