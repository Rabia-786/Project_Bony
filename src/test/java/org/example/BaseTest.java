package org.example;

import org.junit.After;
import org.junit.Before;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.sql.Timestamp;

 public class BaseTest extends BasePage{
     BrowserSelector browserSelector = new BrowserSelector();
     @Before
     public void openBrowser(){

         browserSelector.openBrowser();
     }
     @After
     public void closeBrowser(){
         driver.quit();
     }
}
















//public class BaseTest extends BrowserSelector {
//    BrowserSelector browserSelector = new BrowserSelector();
//    @Before
//    public void openBrowser(){
//        System.out.println("Test started");
//        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
//        //System.setProperty("webdriver.chrome.driver","src/test/resources/Browser/chromedriver.exe");
//        //driver = new ChromeDriver();
//        // this.openBrowser();
//        //driver.manage().window().maximize();
//        //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//        //driver.get("https://demo.nopcommerce.com/");
//        browserSelector.openBrowser();
//        // get Url
//        driver.get("https://demo.nopcommerce.com/");
//
//    }
//    @After
//    public void closeBrowser(){
//        //    if(!result.isSuccess()){
//        //      captureScreenShot(result.);
//    }
//    // driver.quit();
// }
