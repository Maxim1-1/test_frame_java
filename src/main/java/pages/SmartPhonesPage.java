package pages;

import base.Button;
import base.TextBox;

public class SmartPhonesPage {
    String xiaomiField = "//*[@data-filter-value-id='7701962']";
    String samsungField = "//*[contains(@href,'smartfony')]";
    String appleField = "//*[contains(@href,'smartfony')]";
    String realmeField = "//*[contains(@href,'smartfony')]";
    String bqField = "//*[contains(@href,'smartfony')]";

    public void  clickOnXiaomiField(){
        new TextBox(this.xiaomiField).clickOnElement();

    };

}


