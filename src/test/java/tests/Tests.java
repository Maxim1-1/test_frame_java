package tests;

import pages.SmartPhonesPage;
import pages.HomePage;
import base.Driver;

import java.util.concurrent.TimeUnit;

public class Tests {

    public static void main(String[] args) throws InterruptedException {
        String text="3";
        String price ="20000";

        Driver ins = Driver.getInstance();
        ins.getDriver().get("https://market.yandex.ru/");

        HomePage homePage = new HomePage();
        homePage.clickOnCatalog();
        homePage.clickOnSmartphones();
        SmartPhonesPage smartPhonesPage = new SmartPhonesPage();

        TimeUnit.SECONDS.sleep( 3);
        smartPhonesPage.getCountElements();

//        smartPhonesPage.sendPrice(price);
//        smartPhonesPage.sendDiagonal(text);
//
//        smartPhonesPage.clickOnXiaomiField();
//        smartPhonesPage.clickOnSamsungCheckbox();
//        smartPhonesPage.clickOnAppleCheckbox();
//        smartPhonesPage.clickOnRealmeCheckbox();
//        smartPhonesPage.clickOnBqCheckbox();


//        TimeUnit.SECONDS.sleep( 10);



        ins.getDriver().quit();

    }
}
