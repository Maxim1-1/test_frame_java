package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import pages.SmartPhonesPage;
import pages.HomePage;
import org.junit.jupiter.api.Test;
import base.driverUtils.Driver;

public class Tests {
    @BeforeAll
    static void setup(){
        Driver ins = Driver.getInstance();
        ins.getDriver().get("https://market.yandex.ru/");
    }

    @AfterAll
    static void teardown(){
        Driver ins = Driver.getInstance();
        ins.getDriver().quit();
    }
    @Test
      void test() {
        String text="3";
        String price ="20000";
        String title;

        HomePage homePage = new HomePage();
        SmartPhonesPage smartPhonesPage = new SmartPhonesPage();

        homePage.clickOnCatalog();
        homePage.clickOnSmartphones();


        smartPhonesPage.switchToGrid();
        Assertions.assertEquals(smartPhonesPage.getCountElements().size(),10);

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

    }

}
