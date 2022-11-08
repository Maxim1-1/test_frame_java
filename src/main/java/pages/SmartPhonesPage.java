package pages;

import base.elements.TextBox;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SmartPhonesPage {
    private TextBox xiaomiField = new TextBox("//*[@data-filter-value-id='7701962']//*[contains(@class,'_1ZDAA')]");
    private TextBox samsungField = new TextBox("//*[@data-filter-value-id='153061']//*[contains(@class,'_1ZDAA')]");
    private TextBox appleField = new TextBox("//*[@data-filter-value-id='153043']//*[contains(@class,'_1ZDAA')]");
    private TextBox realmeField = new TextBox("//*[@data-filter-value-id='16713696']//*[contains(@class,'_1ZDAA')]");
    private TextBox bqField = new TextBox("//*[@data-filter-value-id='10556303']//*[contains(@class,'_1ZDAA')]");

    private TextBox diagonalField =  new TextBox("//*[@data-auto='filter-range-14805766']//input");

    private TextBox priceField = new  TextBox("//*[@data-auto='filter-range-glprice']//*[@data-tid='587be0c5'][last()]//input");

//    private TextBox countElements = new TextBox("//*[@data-index]") ;

    private TextBox FirstTitleTelephone = new TextBox("//h3//span");

    private TextBox searchField = new TextBox("//*[@id='header-search']");

    private TextBox buttonFind = new TextBox("//*[@data-r='search-button']");

    private final TextBox ratingField = new TextBox("//*[@data-auto='rating-badge-value']");

    private final TextBox gridCheked = new TextBox("//*[contains(@data-zone-data,'grid')]");


    public void switchToGrid (){gridCheked.clickOnElement();}
    public void getRatingNumber(){
        System.out.println(ratingField.getTextElement());
    }

    public void clickFindButton() {
        buttonFind.clickOnElement();

    }

    public void searchFirstTelephone(String text) {
        searchField.sendText(text);
    }

    public String getTitleFirstTelephone() {

        return  FirstTitleTelephone.getTextElement();
    }

    ;

    public List<WebElement> getCountElements() {
        List<WebElement> elements = FirstTitleTelephone.findElements();
        return  elements;
    }

    ;

    public void sendDiagonal(String text) {
        diagonalField.sendText(text);
    }

    ;

    public void sendPrice(String price) {
        priceField.sendText(price);
    }

    public void clickOnXiaomiField() {
        xiaomiField.clickOnElement();

    }
    ;

    public void clickOnSamsungCheckbox() {
        samsungField.clickOnElement();

    }

    ;

    public void clickOnAppleCheckbox() {
        appleField.clickOnElement();

    }

    ;

    public void clickOnRealmeCheckbox() {
        realmeField.clickOnElement();

    }

    ;

    public void clickOnBqCheckbox() {
        bqField.clickOnElement();

    }

    ;


}


