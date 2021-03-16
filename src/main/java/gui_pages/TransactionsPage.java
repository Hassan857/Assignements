package gui_pages;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TransactionsPage  {


    private WebDriver driver;

    private  By CMS = By.xpath("//i[@class='sidenav-icon fas fa-chalkboard-teacher']");
    private  By items = By.xpath("//i[@class='sidenav-icon fas fa-cube']");

    public TransactionsPage (WebDriver driver) {
        this.driver=driver;
    }

    public Items navigate_to_items () {
        ElementActions.click(driver , CMS);
        WebDriverWait wait = new WebDriverWait(driver , 40);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(items));
        ElementActions.click(driver , items);
        return new Items(driver);
    }
}
