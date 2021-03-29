package myTests;

import locators.Locators;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

import static locators.Lockit.playNow_italian;
import static settings.DataSettings.*;
import static locators.Locators.*;

public class FirstTests {
    Locators locators = new Locators();

    @Test //test change language on Italian
    public void setLanguage(){
        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();
        driver.get(link); //open main page

        HomePage homePage = new HomePage(driver);
        homePage.changeLanguage(locators.languageIT_byCSS, playNow_italian);
    }

    @Test //test goto support page
    public void gotoSupportPage(){
        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();
        driver.get(link); //open main page

        HomePage homePage = new HomePage(driver);
        homePage.gotoSupportPage();
    }
}
