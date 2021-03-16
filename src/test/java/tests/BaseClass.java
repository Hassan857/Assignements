package tests;

import com.shaft.gui.browser.BrowserActions;
import com.shaft.gui.browser.BrowserFactory;
import com.shaft.tools.io.ExcelFileManager;
import gui_pages.Login_Options_Page;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

    public WebDriver driver;
    public Login_Options_Page loginwith ;
    public ExcelFileManager excelfile ;


    @BeforeMethod
    public void setup () {

        excelfile = new ExcelFileManager(System.getProperty("user.dir")+"/src/test/resources/TestDataFiles/Data.xlsx");
        WebDriver driver = BrowserFactory.getBrowser();
        BrowserActions.navigateToURL(driver , "http://dashboard.tactful.ai/" , "https://dashboard.tactful.ai/auth/loginfb?redirect=%2Fhome%2Fprofiles" );
        //BrowserActions.fullScreenWindow(driver);
        loginwith = new Login_Options_Page(driver);
    }
    @AfterMethod
    public void after_method () {

        BrowserActions.closeCurrentWindow(driver);
    }
}
