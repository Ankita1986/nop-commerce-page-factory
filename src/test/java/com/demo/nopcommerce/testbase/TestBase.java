package com.demo.nopcommerce.testbase;


import com.demo.nopcommerce.basepage.BasePage;

import com.demo.nopcommerce.browserselector.BrowserSelector;
import com.demo.nopcommerce.loadproperty.LoadProperty;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;


/**
 * Created by Ankita
 */
public class TestBase extends BasePage {
    BrowserSelector browserSelector = new BrowserSelector();
   // String baseUrl = "https://demo.nopcommerce.com//";
    LoadProperty loadProperty = new LoadProperty();

    String baseUrl = loadProperty.getProperty("baseUrl");

    String browser = loadProperty.getProperty("browser");


    @BeforeMethod(groups = {"smoke", "sanity", "regression"})
    public void openBrowser() {

        browserSelector.selectorBrowser(browser);
        driver.manage().window().maximize();
        //driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @AfterMethod(groups = {"smoke", "sanity", "regression"})
    public void tearDown() {
        driver.quit();

    }
}


