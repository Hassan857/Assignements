package tests;

import gui_pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Create_New_Item_Test_Case extends BaseClass{


    LoginPage loginpage;
    ProfilePage profilepage;
    TransactionsPage transpage;
    Items items;
    Item_Details itemdetail ;




    @Test
    public void Valid_Create_New_Item () {
       loginpage = loginwith.click_login_username();
       loginpage.enter_username(excelfile.getCellData("username"));
       //loginpage.enter_password(excelfile.getCellData("password"));
        loginpage.enter_password("12344321");
       profilepage = loginpage.click_signin();
       transpage = profilepage.click_demo_icon();
       items = transpage.navigate_to_items();
       items.click_add_new_item();
        itemdetail = items.click_product_type();
        items = itemdetail.Create_new_item(excelfile.getCellData("name") ,
                excelfile.getCellData("sku") , excelfile.getCellData("tax") ,
                excelfile.getCellData("inventory") , excelfile.getCellData("brand") ,
                excelfile.getCellData("author") , excelfile.getCellData("phone"),
                excelfile.getCellData("website") , excelfile.getCellData("locationurl") ,
                excelfile.getCellData("shortaddress") , excelfile.getCellData("videourl"),
                excelfile.getCellData("discount") , excelfile.getCellData("Name") ,
                excelfile.getCellData("price") ,
                excelfile.getCellData("label1") ,
                excelfile.getCellData("label2"),
                excelfile.getCellData("label3") ,
                excelfile.getCellData("action1") ,
                excelfile.getCellData("action2"),
                excelfile.getCellData("action3"));

        Assert.assertEquals(items.getproduct_name_text() , excelfile.getCellData("name"));
    }
}
