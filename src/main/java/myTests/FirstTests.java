package myTests;

import locators.Locators;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static locators.Lockit.playNow_italian;
import static settings.DataSettings.*;
import static locators.Locators.*;
import static utilities.Utilities.equalStings;

public class FirstTests {
    Locators locators = new Locators();

    @Test //test change language on Italian
    public void setLanguage(){
        System.setProperty(chromeDriver, driverPath); //first variant
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //timeout for wait elements
        driver.get(link); //open main page

        //set elements for close popUp's
        WebElement btnCookieAccept = driver.findElement(By.cssSelector(locators.cookiePopUP));
        WebElement btnClosePopUP = driver.findElement(By.cssSelector(locators.btnClosePopUP));
        //set elements for change language buttons
        WebElement btnChangeLanguage = driver.findElement(By.cssSelector(locators.languagePath_byCSS));
        WebElement btnLangITA = driver.findElement(By.cssSelector(locators.languageIT_byCSS));

        //clicks
        btnCookieAccept.click();
        btnClosePopUP.click();

        btnChangeLanguage.click();
        btnLangITA.click();

        WebElement text = driver.findElement(By.cssSelector(locators.playNowButton));
        String itaText = text.getText();

        equalStings(playNow_italian, itaText);
        driver.quit();
    }

    @Test //test goto support page
    public void gotoSupportPage(){
        setDriverPath(); //second variant
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //timeout for wait elements
        driver.get(link); //open main page

        //set elements
        WebElement btnCookieAccept = driver.findElement(By.cssSelector(locators.cookiePopUP));
        WebElement btnClosePopUP = driver.findElement(By.cssSelector(locators.btnClosePopUP));
        WebElement start = driver.findElement(By.cssSelector(locators.supportLink));

        //clicks methods
        btnCookieAccept.click();
        btnClosePopUP.click();
        start.click();

        driver.quit();
    }
}
