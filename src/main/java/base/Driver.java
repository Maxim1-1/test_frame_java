package base;

import org.openqa.selenium.WebDriver;


public class Driver {

    private static WebDriver driver = null;
    private static Driver driverInstance= null;
    private static String browser =  null;

    private static final String url = null;
    Driver(){

        driver = BrowserFactory.getBrowser(browser="chrome");

        if (driver !=  null) {
            driver.manage().window().maximize();


        }
    }
    public static Driver getInstance (){

        if (driverInstance ==  null) {
            driverInstance = new Driver();

        }
        return driverInstance;

    }

    public WebDriver getDriver(){
        return driver;
    }

    public void closeDriver(){
        driver.quit();
    }


}
