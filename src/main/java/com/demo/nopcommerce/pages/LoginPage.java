package com.demo.nopcommerce.pages;


import com.demo.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

/**
 * Created by Ankita
 */
public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());



    @FindBy(id = "Email")
    WebElement emailField;
    @FindBy(id = "Password")
    WebElement passwordField;
    @FindBy(xpath = "//input[@class='button-1 login-button']")
    WebElement loginBtn;
    @FindBy(xpath = "//div[@class='page-title']//h1")
    WebElement welcomeText;

    public void enterEmailId(String email) {
        Reporter.log("Entering emailId :" +email+ " in the emailfield :" +emailField.toString() + "<br>");
        sendTextToElement(emailField, email);
        log.info("Entering emailId : " +email+ " in the emailfield : " +emailField.toString());
    }

    public void enterPassword(String password) {
        Reporter.log("Entering password :" +password+ " in the password field : " +passwordField.toString() + "<br>");
        sendTextToElement(passwordField, password);
        log.info("Entering password :" +password+ " in the password field : " +passwordField.toString());
    }

    public void clickOnLoginBt() {
        Reporter.log("Clicking on login Button : " +loginBtn.toString() + "<br>");
        clickOnElement(loginBtn);
        log.info("Clicking on login Button : " +loginBtn.toString());
    }

    public String getWelcomeText() {
        Reporter.log("Getting welcome text : " +welcomeText.toString() + "<br>");
        log.info("Getting welcome text : " +welcomeText.toString());
        return getTextFromElement(welcomeText);
    }

    public void logInToNopCommerce(String username, String password){
        enterEmailId(username);
        enterPassword(password);
        clickOnLoginBt();

    }


}
