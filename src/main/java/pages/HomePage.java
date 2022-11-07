package pages;

import base.elements.Button;

public class HomePage {
    String buttonCatalog = "//*[@id='catalogPopupButton']";
    String smartphones = "//*[contains(@href,'smartfony')]";

    public void  clickOnCatalog(){
       new Button(buttonCatalog).clickOnElement();

    };

    public void clickOnSmartphones(){
        new Button(smartphones).clickOnElement();
    }
}
