package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginPage {

    public void login(String user, String pass, WebDriver driver) throws InterruptedException {
    WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
    WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
    WebElement login = driver.findElement(By.xpath("//input[@class = 'submit-button btn_action']"));
    WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds (10));
    username.sendKeys(user);
    Thread.sleep(2000);
    password.sendKeys(pass);
    Thread.sleep(1000);
    login.click();


    }



}
