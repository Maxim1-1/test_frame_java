package pages;

import base.elements.TextBox;
import org.openqa.selenium.WebElement;

public class SmartPhonesPage {
    String xiaomiField = "//*[@data-filter-value-id='7701962']//*[contains(@class,'_1ZDAA')]";
    String samsungField = "//*[@data-filter-value-id='153061']//*[contains(@class,'_1ZDAA')]";
    String appleField = "//*[@data-filter-value-id='153043']//*[contains(@class,'_1ZDAA')]";
    String realmeField = "//*[@data-filter-value-id='16713696']//*[contains(@class,'_1ZDAA')]";
    String bqField = "//*[@data-filter-value-id='10556303']//*[contains(@class,'_1ZDAA')]";

    String diagonalField = "//*[@data-auto='filter-range-14805766']//input";

    String priceField = "//*[@data-auto='filter-range-glprice']//*[@data-tid='587be0c5'][last()]//input";

    String countElements = "//*[@data-index]";

    String FirstTitleTelephone = "//h3//span";

    String searchField="//*[@id='header-search']";

    String buttonFind = "//*[@data-r='search-button']";


    String ratingField = "//*[@data-auto='rating-badge-value']";


    public void getRatingNumber(){
        System.out.println(new TextBox(ratingField).getTextElement());
    }

    public void clickFindButton() {
        new TextBox(buttonFind).clickOnElement();

    }
//    @FindBy
    public void searchFirstTelephone(String text) {
        new TextBox(this.searchField).sendText(text);
    }

    public String getTitleFirstTelephone() {

        return  new TextBox(FirstTitleTelephone).getTextElement();
    }

    ;

    public WebElement getCountElements() {
        WebElement elements = new TextBox(countElements).findElements();
        System.out.println(elements);
        return elements;
    }

    ;

    public void sendDiagonal(String text) {
        new TextBox(diagonalField).sendText(text);
    }

    ;

    public void sendPrice(String price) {
        new TextBox(priceField).sendText(price);
    }

    public void clickOnXiaomiField() {
        new TextBox(xiaomiField).clickOnElement();

    }

    ;

    public void clickOnSamsungCheckbox() {
        new TextBox(samsungField).clickOnElement();

    }

    ;

    public void clickOnAppleCheckbox() {
        new TextBox(appleField).clickOnElement();

    }

    ;

    public void clickOnRealmeCheckbox() {
        new TextBox(realmeField).clickOnElement();

    }

    ;

    public void clickOnBqCheckbox() {
        new TextBox(bqField).clickOnElement();

    }

    ;


}


