package gui_pages;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePage  {

    private WebDriver driver;


    private By demo_icon = By.xpath("//div[@class='contact-content-about']/descendant::a[text()='Demo']");

    public ProfilePage (WebDriver driver) {
        this.driver=driver;
    }

    public TransactionsPage click_demo_icon () {
        ElementActions.click(driver , demo_icon);
        return new TransactionsPage(driver);
    }
}
