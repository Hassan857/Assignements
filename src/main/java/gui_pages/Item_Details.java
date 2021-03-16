package gui_pages;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Item_Details {

   private WebDriver driver;

   private By name_field = By.xpath("//input[@name='example-input-1']");
   private By sku_field = By.xpath("//input[@data-test='product-sku']");
   private By tax_field = By.xpath("//input[@placeholder='Tax']");
    private By parent_category = By.xpath("//input[@placeholder='Parent Category'][@class='multiselect__input']");
   private By burgers_category = By.xpath("//span[text()='burgers']");
    private By languages_category = By.xpath("//input[@placeholder='Language']");
   private By arabic_lang = By.xpath("//span[text()='arabic']");
   private By inventory_field = By.xpath("//input[@placeholder='Inventory']");
   private By brand_field = By.xpath("//input[@placeholder='Brand']");
   private By author_field = By.xpath("//input[@placeholder='Author']");
   private By save_button = By.xpath("//button[text()='Save changes']");
   private By info_tap = By.xpath("//div [@class='list-group account-settings-links list-group-flush']//child::button[2]");
   private By phone_field = By.xpath("//input[@placeholder='(20)01550773456']");
   private By website_field = By.xpath("//input[@placeholder='Website']");
   private By location_url = By.xpath("//input[@placeholder='Location URL']");
   private By short_address = By.xpath("//input[@placeholder='Short Address']");
   private By video_url = By.xpath("//input[@placeholder='Video URL']");
   private By prices_tap = By.xpath("//button[@data-test='variations']");
   private By discount_field = By.xpath("//input[@placeholder='Discount']");
   private By add_button = By.xpath("//button[@data-test='add-variant']");
   private By name = By.xpath("//input[@placeholder='Name']");
   private By price = By.xpath("//input[@placeholder='Price']");
    private By buttons_tap = By.xpath("//button[@data-test='buttons']");
    private  By use_default_buttons_checkbox = By.xpath("//div[@class='btn-default custom-control custom-checkbox']//child::label");
    private By button_label_1 = By.xpath("//input[@placeholder='Button1 Label']");
    private By button_label_2 = By.xpath("//input[@placeholder='Button2 Label']");
    private By button_label_3 = By.xpath("//input[@placeholder='Button3 Label']");
    private By button_action_1 = By.xpath("//select[@class='btn-action-1 custom-select']");
    private By button_action_2 = By.xpath("//select[@class='btn-action-2 custom-select']");
    private By button_action_3 = By.xpath("//select[@class='btn-action-3 custom-select']");





    public Item_Details (WebDriver driver) {
       this.driver=driver;
   }
   public Items Create_new_item (String Name , String sku , String tax  , String inventory , String brand , String author ,
   String phone , String website , String locationURL , String short_address , String videoURL , String discount , String name , String price ,
                                 String label1 , String label2 , String label3 , String action1 , String action2 , String action3
   ) {
        enter_name(Name);
        enter_sku(sku);
        enter_tax(tax);
        //select_parent_category();
       // select_language();
        enter_inventory(inventory);
        enter_brand(brand);
        enter_author(author);
        click_info_tap();
        enter_phone(phone);
        enter_website(website);
        enter_location_url(locationURL);
        enter_short_address(short_address);
        enter_video_url(videoURL);
        click_pricing_and_discount_tap();
        enter_discount(discount);
        click_add();
        enter_name_and_price(name , price);
       click_buttons_tap();
       uncheck_use_default_buttons_checkbox();
       enter_button_labels(label1 , label2 , label3);
       select_buttons_actions(action1 , action2 , action3);
        click_save_changes();
        return new Items(driver);
   }
   public void enter_name (String name) {
       ElementActions.type(driver , name_field , name);
   }
    public void enter_sku (String sku) {
        ElementActions.type(driver , sku_field , sku);
    }
    public void enter_tax (String tax) {
        ElementActions.type(driver , tax_field , tax);
    }
    public void enter_inventory (String inventory) {
        ElementActions.type(driver , inventory_field , inventory);
    }
    public void enter_brand (String brand) {
        ElementActions.type(driver , brand_field , brand);
    }
    public void enter_author (String authorname) {
        ElementActions.type(driver , author_field , authorname);
    }
    public void click_info_tap () {
        ElementActions.click(driver , info_tap);
    }
    public void enter_phone (String phone) {
        ElementActions.type(driver , phone_field , phone);
    }
    public void enter_website (String websitename) {
        ElementActions.type(driver , website_field , websitename);
    }
    public void enter_location_url (String location) {
        ElementActions.type(driver , location_url , location);
    }
    public void enter_short_address (String address) {
        ElementActions.type(driver , short_address , address);
    }
    public void enter_video_url (String video_link) {
        ElementActions.type(driver , video_url , video_link);
    }
    public void click_pricing_and_discount_tap () {
        ElementActions.click(driver , prices_tap);
    }
    public void enter_discount (String discount_num) {
        ElementActions.type(driver , discount_field , discount_num);
    }
    public void click_add () {
        ElementActions.click(driver , add_button);
    }
    public void click_buttons_tap () {
        ElementActions.click(driver , buttons_tap);
    }
    public void uncheck_use_default_buttons_checkbox () {
        ElementActions.click(driver , use_default_buttons_checkbox);
    }
    public void enter_button_labels (String label1 , String label2 , String label3) {
        ElementActions.type(driver , button_label_1 , label1);
        ElementActions.type(driver , button_label_2 , label2);
        ElementActions.type(driver , button_label_3 , label3);
    }
    public void select_buttons_actions (String action1 , String action2 , String action3) {
        Select select = new Select(driver.findElement(button_action_1));
        select.selectByVisibleText(action1);
        Select select2 = new Select(driver.findElement(button_action_2));
        select2.selectByVisibleText(action2);
        Select select3 = new Select(driver.findElement(button_action_3));
        select3.selectByVisibleText(action3);
    }

    public void enter_name_and_price (String Name , String Price) {
        ElementActions.type(driver , name , Name);
        ElementActions.type(driver , price , Price);
    }
    public void select_parent_category () {
        ElementActions.click(driver , parent_category);
        ElementActions.click(driver , burgers_category);
    }
    public void select_language () {
        ElementActions.click(driver ,languages_category);
        ElementActions.click(driver , arabic_lang);

    }
    public Items click_save_changes () {
        ElementActions.click(driver , save_button);
        return new Items(driver);
    }

}
