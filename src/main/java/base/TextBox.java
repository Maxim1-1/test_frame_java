package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TextBox extends BaseElement {
    public TextBox(String locator) {
        super(locator);
    }

    public WebElement getTextElement(){
        WebElement element = this.findElement();
        element.getText();
        return element;
    }

    public  void sendText(String text){
        WebElement element = this.findElement();
        element.sendKeys(text);

    }


}

