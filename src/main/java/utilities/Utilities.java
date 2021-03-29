package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Utilities {
    public static void equalStings(String f, String s){
        if (!f.equals(s)){
            throw new AssertionError("String: '" + f + "' != string: '" + s + "'");
        }
    }

    public static void checkElement(WebElement webElement){
        if(!webElement.isDisplayed()){
            throw new AssertionError("Element isn't appear!");
        }
    }
}
