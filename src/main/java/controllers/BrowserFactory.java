package controllers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Listeners;

import java.util.concurrent.TimeUnit;


@Listeners({listeners.ExtentTestNGIReporterListener.class})
public class BrowserFactory extends InitMethod {
    static WebDriver driver;

    static WebDriver createDriver() throws Exception {

        switch (Browser.toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;

            case "chrome_headless":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/Drivers/chromedriver.exe");
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--headless");
                chromeOptions.addArguments("--disable-gpu");
                driver = new ChromeDriver(chromeOptions);
                break;

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;

            case "ie":
            case "internet explorer":
                System.setProperty("webdriver.ie.driver", "src/main/resources/Drivers/IEDriverServer.exe");
                driver = new InternetExplorerDriver();
                break;

            case "edge":
                System.setProperty("webdriver.edge.driver", "src/main/resources/Drivers/MicrosoftWebDriver.exe");
                driver = new EdgeDriver();
                break;

            case "safari":
                driver = new SafariDriver();
                break;

            default:
                throw new NotFoundException("Browser Not Found. Please Provide a Valid Browser");
        }

        if (ImplicitlyWait > 0) {
            implicitlywait(ImplicitlyWait);
        }

        if (MaxPageLoadTime > 0) {
            setMaxPageLoadTime(MaxPageLoadTime);
        }
        driver.get(WebsiteURL);
        if (!Browser.toLowerCase().contains("unit") || !Browser.toLowerCase().contains("ghost") || !Browser.toLowerCase().contains("phantom")) {
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void implicitlywait(int timeInSeconds) throws Exception {
        driver.manage().timeouts().implicitlyWait(timeInSeconds, TimeUnit.SECONDS);
    }

    public static void setMaxPageLoadTime(int timeInSeconds) {
        driver.manage().timeouts().pageLoadTimeout(timeInSeconds, TimeUnit.SECONDS);
    }
}
