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
public class RegConfPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegConfPage.class.getName());


    @FindBy(xpath = "//div[@class='result']")
    WebElement registerText;




    public String registerTextCnf() {
        Reporter.log("Getting register conform message :" + registerText.toString() + "<br>");
        log.info("Getting register conform message :" + registerText.toString());
        return getTextFromElement(registerText);

    }
}
