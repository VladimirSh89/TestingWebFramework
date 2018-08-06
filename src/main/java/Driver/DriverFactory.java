package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {

    static String propertyDriver = System.getProperty("driver");
    static WebDriver driver;
    static String propertyBrowser = System.getProperty("browser");

    public static void setUpDriver() {
        Drivers drivers;
        if(propertyDriver == null) {
            drivers = Drivers.CH;
        } else {
            drivers = Drivers.driverForName(propertyDriver);
        }
        switch (drivers) {
            case CH:
                driver = setUpChromeDriver();
                break;
            case FF:
                driver = setUpFireFoxDriver();
                break;
            case IE:
                driver = setUpInternetExplorerDriver();
                break;
            case SF:
                driver = setUpSafariDriver();
                break;
        }
    }

    private static WebDriver setUpChromeDriver() {
        System.setProperty("webdriver.chrome.driver","C:\\BrowserDriver\\Chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        return driver;
    }

    private static WebDriver setUpFireFoxDriver() {
        System.setProperty("","");
        driver = new FirefoxDriver();
        return driver;
    }

    private static WebDriver setUpInternetExplorerDriver() {
        System.setProperty("","");
        driver = new InternetExplorerDriver();
        return driver;
    }

    private static WebDriver setUpSafariDriver() {
        System.setProperty("","");
        driver = new SafariDriver();
        return driver;
    }

    public static WebDriver getCurrentDriver() {
        return driver;
    }
}
