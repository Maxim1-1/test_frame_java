package tests;

import org.openqa.selenium.WebElement;
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


        smartPhonesPage.switchToGrid();
        System.out.println(smartPhonesPage.getCountElements().size());

        smartPhonesPage.sendPrice(price);
        smartPhonesPage.sendDiagonal(text);

        smartPhonesPage.clickOnXiaomiField();
        smartPhonesPage.clickOnSamsungCheckbox();
        smartPhonesPage.clickOnAppleCheckbox();
        smartPhonesPage.clickOnRealmeCheckbox();
        smartPhonesPage.clickOnBqCheckbox();

        title = smartPhonesPage.getTitleFirstTelephone();

        smartPhonesPage.searchFirstTelephone(title);
        smartPhonesPage.clickFindButton();

        smartPhonesPage.getRatingNumber();





        ins.getDriver().quit();

    }
}
