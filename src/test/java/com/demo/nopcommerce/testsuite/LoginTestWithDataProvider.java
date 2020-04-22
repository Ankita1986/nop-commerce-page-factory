package com.demo.nopcommerce.testsuite;


import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.pages.LoginPage;
import com.demo.nopcommerce.resources.testdata.TestData;
import com.demo.nopcommerce.testbase.TestBase;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Ankita
 */
public class LoginTestWithDataProvider extends TestBase {
    String emailId;
    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod
    public void setUp(){
        homePage = new HomePage();
        loginPage = new LoginPage();
    }

    @Test(priority = 0, groups = {"smoke"},dataProvider = "Login Data", dataProviderClass = TestData.class)
    public void verifyUserShouldNavigateToLoginPage(String username, String password) {
        homePage.clickOnLoginLink();
        loginPage.logInToNopCommerce(username, password);
        String expectedText = "Welcome, Please Sign In!";
        String actualText = loginPage.getWelcomeText();
        Assert.assertEquals(expectedText, actualText);
    }

    @Test(priority = 1, groups = {"sanity"}, dataProvider = "Login Data", dataProviderClass = TestData.class)
    public void verifyUserShouldLoginPageSuccessfully(String username, String password) {
        homePage.clickOnLoginLink();
        loginPage.logInToNopCommerce(username, password);
        loginPage.clickOnLoginBt();

    }

    @Test(priority = 2, groups = {"regression"})
    public void verifySuccessfullLoginPageMessage() {
        homePage.clickOnLoginLink();
        String expectedText = "Welcome, PPlease Sign In!";
        String actualText = loginPage.getWelcomeText();
        Assert.assertEquals(expectedText, actualText);

    }
}


