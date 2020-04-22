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
public class ComputerPage extends Utility {

    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());



    @FindBy(xpath = "//h2[@class='title']//a[contains(text(),'Desktops')]")
    WebElement deskTopsLink;

    public void clickOnDesktopLink(){
        Reporter.log("Clicking On DesktopLink : " +deskTopsLink.toString() + "<br>");
        clickOnElement(deskTopsLink);
        log.info("Clicking On DesktopLink : " +deskTopsLink.toString());
    }



}
