package base.elements;

import base.elements.base.BaseElement;
import org.openqa.selenium.WebElement;

public class TextBox extends BaseElement {
    public TextBox(String locator) {
        super(locator);
    }

    public String getTextElement(){
        WebElement element = findElement();

        return  element.getText();
    }

    public  void sendText(String text){
        WebElement element = findElement();
        element.clear();
        element.sendKeys(text);}




}

