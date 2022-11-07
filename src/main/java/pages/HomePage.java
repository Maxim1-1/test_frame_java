package pages;

import base.Button;

public class HomePage {
    String buttonCatalog = "//*[@id='catalogPopupButton']";
    String smartphones = "//*[contains(@href,'smartfony')]";

    public void  clickOnCatalog(){
       new Button(this.buttonCatalog).clickOnElement();

    };

    public void clickOnSmartphones(){
        new Button(this.smartphones).clickOnElement();
    }
}
