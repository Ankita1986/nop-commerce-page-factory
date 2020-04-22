package com.demo.nopcommerce.pages;


import com.demo.nopcommerce.utility.Utility;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

/**
 * Created by Ankita
 */
public class ComConfPage extends Utility {

    private static final Logger log = LogManager.getLogger(ComConfPage.class.getName());


    @FindBy(xpath = "//h1[contains(text(),'Computers')]")
    WebElement compuConfText;

    public String compuConfMsg() {
        Reporter.log("Checking computer conformmsg :" + compuConfText.toString() + "<br>");
        log.info("Checking computer conformmsg :" + compuConfText.toString());
        return getTextFromElement(compuConfText);
    }
}
