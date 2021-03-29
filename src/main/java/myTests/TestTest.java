package myTests;

import locators.Locators;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.HomePage;

import java.time.Duration;

import static locators.Locators.link;
import static locators.Lockit.playNow_italian;
import static settings.DataSettings.*;
import static utilities.Utilities.*;

public class TestTest {
    Locators locators = new Locators();
    @Test //test change language on Italian
    public void setLanguage(){
        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();
        driver.get("https://support.g5e.com/hc/en-us"); //open main page

        HomePage homePage = new HomePage(driver);
        homePage.changeLanguage(locators.languageIT_byCSS, playNow_italian);

        PageFactory pageFactory = new PageFactory();
    }

    /*@Test
    public void setWrongLanguage(){
        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();
        driver.get(link); //open main page

        HomePage homePage = new HomePage(driver);
        homePage.changeLanguage(locators.languageIT_byCSS, ".eng");
    }*/
}
