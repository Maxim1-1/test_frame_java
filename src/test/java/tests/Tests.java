package tests;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import base.driverUtils.Driver;
import pages.HomePage;
import pages.SmartPhonesPage;


import java.io.FileReader;
import java.io.IOException;

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
      void test() throws IOException, ParseException {
        String path = "src/main/resources/testData/testData.json";
        FileReader reader = new FileReader(path);

        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);

        String text= (String) jsonObject.get("diagonal");
        String price =(String) jsonObject.get("price");
        String title;

        HomePage homePage = new HomePage();
        SmartPhonesPage smartPhonesPage = new SmartPhonesPage();

        homePage.clickOnCatalog();
        homePage.clickOnSmartphones();


        smartPhonesPage.switchToGrid();
        Assertions.assertEquals(smartPhonesPage.getCountElements().size(),9);

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
