package tests;

import pages.SmartPhonesPage;
import pages.HomePage;
import base.driverUtils.Driver;

import java.util.concurrent.TimeUnit;

public class Tests {

    public static void main(String[] args) throws InterruptedException {
        String text="3";
        String price ="20000";
        String title;

        Driver ins = Driver.getInstance();
        ins.getDriver().get("https://market.yandex.ru/");

        HomePage homePage = new HomePage();
        SmartPhonesPage smartPhonesPage = new SmartPhonesPage();

        homePage.clickOnCatalog();
        homePage.clickOnSmartphones();

        TimeUnit.SECONDS.sleep( 3);
        System.out.println(smartPhonesPage.getCountElements());

//        smartPhonesPage.sendPrice(price);
//        smartPhonesPage.sendDiagonal(text);
//
//        smartPhonesPage.clickOnXiaomiField();
//        smartPhonesPage.clickOnSamsungCheckbox();
//        smartPhonesPage.clickOnAppleCheckbox();
//        smartPhonesPage.clickOnRealmeCheckbox();
//        smartPhonesPage.clickOnBqCheckbox();
//
//        title = smartPhonesPage.getTitleFirstTelephone();
//
//        smartPhonesPage.searchFirstTelephone(title);
//        smartPhonesPage.clickFindButton();
//
//        smartPhonesPage.getRatingNumber();
//
//        TimeUnit.SECONDS.sleep( 10);



        ins.getDriver().quit();

    }
}
