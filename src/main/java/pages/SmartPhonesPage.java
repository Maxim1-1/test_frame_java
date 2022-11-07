package pages;

import base.TextBox;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SmartPhonesPage {
    String xiaomiField = "//*[@data-filter-value-id='7701962']//*[contains(@class,'_1ZDAA')]";
    String samsungField = "//*[@data-filter-value-id='153061']//*[contains(@class,'_1ZDAA')]";
    String appleField = "//*[@data-filter-value-id='153043']//*[contains(@class,'_1ZDAA')]";
    String realmeField = "//*[@data-filter-value-id='16713696']//*[contains(@class,'_1ZDAA')]";
    String bqField = "//*[@data-filter-value-id='10556303']//*[contains(@class,'_1ZDAA')]";

    String diagonalField = "//input[@id='textfield1770537473']";

    String price = "//input[@id='textfield6923702739']";

    String countElements = "//*[@data-index]";


    public void getCountElements(){
        WebElement elements =  new TextBox(this.countElements).findElements();
        System.out.println(elements);
    };
    public void sendDiagonal(String text){
        new TextBox(this.diagonalField).sendText(text);
    };

    public void sendPrice(String price){
        new TextBox(this.price).sendText(price);
    }

    public void  clickOnXiaomiField(){
        new TextBox(this.xiaomiField).clickOnElement();

    };

    public void  clickOnSamsungCheckbox(){
        new TextBox(this.samsungField).clickOnElement();

    };
    public void  clickOnAppleCheckbox(){
        new TextBox(this.appleField).clickOnElement();

    };

    public void  clickOnRealmeCheckbox(){
        new TextBox(this.realmeField).clickOnElement();

    };

    public void  clickOnBqCheckbox(){
        new TextBox(this.bqField).clickOnElement();

    };


}


