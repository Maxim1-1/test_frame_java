package org.example;


import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import org.openqa.selenium.WebDriver;

public class test {
    public static WebDriver open()
    {
        Driver ins = Driver.getInstance();
        ins.getDriver().get("https://stackoverflow.com/questions/513832/how-do-i-compare-strings-in-java");

        return null;
    }
}
