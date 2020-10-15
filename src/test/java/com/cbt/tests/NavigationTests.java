package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationTests {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = BrowserFactory.getDriver("chrome");

        driver.get("https://www.google.com");

        String title1 = driver.getTitle(); //google

        System.out.println("title = " + title1); // 3.step

        Thread.sleep(3000);

        driver.navigate().to("https://etsy.com");

        String title2 = driver.getTitle(); //etsy

        System.out.println("title = " + title2); //5.step

        driver.navigate().back();
        String title3 = driver.getTitle();

        StringUtility.verifyEquals(title1,title3);

        Thread.sleep(3000);

        driver.navigate().forward();

        String title4 = driver.getTitle();

        StringUtility.verifyEquals(title2,title4);
        
        driver.quit();

    }
}