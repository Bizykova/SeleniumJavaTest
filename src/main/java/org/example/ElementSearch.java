package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ElementSearch {

    public void Search(WebDriver driver) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

        try {
            Actions actions = new Actions(driver);
            Thread.sleep(2000);
            WebElement search1 = driver.findElement(By.id("add-to-cart-sauce-labs-onesie"));
            actions.moveToElement(search1).perform();
            Thread.sleep(2000);
            search1.click();
            Thread.sleep(2000);
            WebElement basket = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
            actions.moveToElement(basket).perform();
            Thread.sleep(2000);
            basket.click();
            Thread.sleep(2000);
            WebElement shopping = driver.findElement(By.id("continue-shopping"));
            shopping.click();
            Thread.sleep(2000);
            WebElement search2 =driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
            search2.click();
            Thread.sleep(2000);
            WebElement search3 = driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
            search3.click();
            Thread.sleep(2000);
            WebElement basket2 = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
            basket2.click();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
