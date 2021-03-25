package settings;

public class DataSettings {
    //class for links and property
    public static String chromeDriver = "webdriver.chrome.driver";

    public static String driverPath = "D:\\Automation\\ProgramFiles\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe";
    public static void setDriverPath(){
        System.setProperty("webdriver.chrome.driver", driverPath);
    }
}
