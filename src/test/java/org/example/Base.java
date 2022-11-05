package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class Base {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();
        driver.get("https://market.yandex.ru/");
        driver.findElement(By.xpath("//*[@id='catalogPopupButton']")).click();
        TimeUnit.SECONDS.sleep(2);

        driver.findElement(By.xpath("//*[text()='Смартфоны']")).click();
        driver.findElement(By.xpath("//*[@id='textfield74738979']")).sendKeys("3");
        driver.findElement(By.xpath("//*[text()='Apple']")).click();
        driver.findElement(By.xpath("//*[text()='Samsung']")).click();
        driver.findElement(By.xpath("//*[text()='Xiaomi']")).click();
        driver.findElement(By.xpath("//*[text()='realme']")).click();
        driver.findElement(By.xpath("//*[text()='BQ']")).click();

    }


}
