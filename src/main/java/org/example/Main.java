package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Main {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            driver.get("https://www.saucedemo.com/");
            Thread.sleep(2000);
            LoginPage lp = new LoginPage();
            lp.login("performance_glitch_user","secret_sauce",driver);
            ElementSearch  s = new ElementSearch();
            s.Search(driver);


        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
//            driver.quit();
        }
    }
}