package pages;

import base.elements.Button;


public class HomePage {

    private final Button buttonCatalog = new Button("//*[@id='catalogPopupButton']");
    private final Button smartphones = new Button("//*[contains(@href,'smartfony')]");


    public void clickOnCatalog() {
        buttonCatalog.clickOnElement();
    }



    public void clickOnSmartphones() {
        smartphones.clickOnElement();
    }
}
