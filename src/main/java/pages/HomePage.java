package pages;

import locators.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import static utilities.Utilities.*;
import java.time.Duration;

import static locators.Locators.*;
import static utilities.Utilities.equalStings;

public class HomePage {
    Locators locators = new Locators();
    private WebDriver driver;
    public HomePage(WebDriver driver){
        if (!driver.getCurrentUrl().contains(link)) {
            throw new AssertionError("This is not the page you are expected!");
        }
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    void waitTime(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //timeout for wait elements
    }

    void closeDriver(){
        driver.quit();
    }

    void btnAcceptCookie(){
        driver.findElement(By.cssSelector(locators.cookiePopUP_byCSS)).click();
    }

    void btnCloseAdsBanner(){
        driver.findElement(By.cssSelector(locators.btnClosePopUP_byCSS)).click();
    }

    void btnOpenChangeLanguageList() {
        driver.findElement(By.cssSelector(locators.languagePath_byCSS)).click();
    }

    void btnChooseLanguage(String language){
        driver.findElement(By.cssSelector(language)).click();
    }

    String getText_fromEl(String element){
        return driver.findElement(By.cssSelector(element)).getText();
    }

    void btnGoToSupport(){
        driver.findElement(By.cssSelector(locators.supportLink_byCSS)).click();
    }

    void checkHomePage(){
        checkElement(driver.findElement(By.cssSelector(locators.checkSliderHomePages_byCSS)));
    }

    public void changeLanguage(String setLang, String expectedLang){
        waitTime();

        checkHomePage();

        btnAcceptCookie();
        btnCloseAdsBanner();

        btnOpenChangeLanguageList();
        btnChooseLanguage(setLang);
        equalStings(getText_fromEl(locators.btnPlayNow_byCSS), expectedLang);

        closeDriver();
    }

    public void gotoSupportPage(){
        waitTime();

        checkHomePage();
        btnAcceptCookie();
        btnCloseAdsBanner();

        btnGoToSupport();

        closeDriver();
    }
}
