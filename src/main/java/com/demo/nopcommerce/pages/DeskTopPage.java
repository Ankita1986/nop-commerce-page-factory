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
public class DeskTopPage extends Utility {
    private static final Logger log = LogManager.getLogger(DeskTopPage.class.getName());



    @FindBy(xpath = "//h2[@class='title']//a[contains(text(),'Desktops')]")
    WebElement desktopText;


    public String deskTopConfText(){
        Reporter.log("Checking Conformation text : " +desktopText.toString() + "<br>");
        log.info("Checking Conformation text : " +desktopText.toString());
        return getTextFromElement(desktopText);


    }

}

