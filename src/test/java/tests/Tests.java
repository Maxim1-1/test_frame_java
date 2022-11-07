package tests;

import pages.SmartPhonesPage;
import pages.HomePage;
import base.Driver;

import java.util.concurrent.TimeUnit;

public class Tests {

    public static void main(String[] args) throws InterruptedException {
        Driver ins = Driver.getInstance();
        ins.getDriver().get("https://market.yandex.ru/");

        HomePage homePage = new HomePage();
        homePage.clickOnCatalog();
        homePage.clickOnSmartphones();
        SmartPhonesPage smartPhonesPage = new SmartPhonesPage();
        smartPhonesPage.clickOnXiaomiField();

        TimeUnit.SECONDS.sleep( 10);



        ins.getDriver().quit();

    }
}
