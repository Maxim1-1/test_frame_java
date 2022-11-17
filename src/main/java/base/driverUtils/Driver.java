package base.driverUtils;

import base.browser.BrowserFactory;
import org.openqa.selenium.WebDriver;


public class Driver {

    private static WebDriver driver = null;
    private static Driver driverInstance= null;
    private static String browser =  null;

    private static final String url = null;

    Driver(){};

    public static Driver getInstance (){

        if (driverInstance ==  null) {
            driverInstance = new Driver();

        }
        return driverInstance;

    }

    public WebDriver getDriver(){

        if (driver !=  null) {
            driver.manage().window().maximize();
        }
        else {
            driver = BrowserFactory.getBrowser(browser="chrome");
            return driver;
        }
        return driver;
    }

    public void closeDriver(){
        driver.quit();
    }


}
