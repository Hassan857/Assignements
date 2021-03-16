package gui_pages;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Items {


    private WebDriver driver;

    private By add_new_item = By.xpath("//button[@data-test='product-add']");
    private By product_type = By.xpath("//span[@class='ion ion-md-cart display-4 text-primary align-icon']");
    private By product_name = By.xpath("//div[text()='automation']");


    public Items (WebDriver driver ) {
        this.driver=driver;
    }

    public void click_add_new_item () {
        ElementActions.click(driver , add_new_item);
    }
    public Item_Details click_product_type () {
        ElementActions.click(driver , product_type);
        return new Item_Details(driver);
    }
    public String getproduct_name_text () {
        return ElementActions.getText(driver , product_name);
    }
}
