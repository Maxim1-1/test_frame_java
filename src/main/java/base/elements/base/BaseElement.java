package base.elements.base;

import base.driverUtils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class BaseElement {
    protected String locator;

    public BaseElement(String locator) {

        this.locator = locator;

    }

    public WebElement findElement(){
        WebElement wait = (WebElement) new WebDriverWait(Driver.getInstance().getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath(this.locator)));
        WebElement element = Driver.getInstance().getDriver().findElement(By.xpath(this.locator));
        return element;
    }
    public WebElement findElements(){
//        WebElement wait = (WebElement) new WebDriverWait(Driver.getInstance().getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath(this.locator)));
        WebElement elements = (WebElement) Driver.getInstance().getDriver().findElements(By.xpath(this.locator));
        return elements;
    }

    public void  clickOnElement(){
       WebElement element = this.findElement();
        element.click();
    }


}
