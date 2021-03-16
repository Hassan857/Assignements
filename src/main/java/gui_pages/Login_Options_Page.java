package gui_pages;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Options_Page  {

    private WebDriver driver;
    private By login_link = By.xpath("//a[text() = 'Login with username and password?']");

    public Login_Options_Page (WebDriver driver) {
        this.driver=driver;
    }

    public LoginPage click_login_username () {
        ElementActions.click(driver , login_link);
        return new LoginPage(driver);
    }
}
