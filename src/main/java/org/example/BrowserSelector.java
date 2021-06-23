package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BrowserSelector extends BasePage {
    LoadProperty loadProperty = new LoadProperty();
    String browserName = loadProperty.getProperty("browser");


    public void openBrowser() {
            switch (browserName){

                case "chrome":
                    WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
                case "edge":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new EdgeDriver();
                break;
                case "firefox":
                    WebDriverManager.edgedriver().setup();
                    driver = new FirefoxDriver();
                break;
                default:
                    driver = new ChromeDriver();
                    break;

            }

        }
}
