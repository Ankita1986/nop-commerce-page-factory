package com.demo.nopcommerce.testsuite;


import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.pages.RegConfPage;
import com.demo.nopcommerce.pages.RegisterPage;
import com.demo.nopcommerce.resources.testdata.TestData;
import com.demo.nopcommerce.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Ankita
 */
public class RegistrationTestWithDataProvider extends TestBase {

    RegisterPage registerPage;
    HomePage homePage;
    RegConfPage regConfPage;

    @BeforeMethod
    public void setUp(){
        registerPage = new RegisterPage();
        homePage = new HomePage();
        regConfPage = new RegConfPage();
    }

    @Test(priority = 0, groups = {"smoke"})
    public void verifyUserShouldNavigateToRegisterPage(){
        homePage.clickOnRegisterLink();
    }

    @Test(priority = 1, groups = {"sanity"}, dataProvider = "Registration Data", dataProviderClass = TestData.class)
    public void verifyUserShouldRegisterSuccessfully(String firstname, String lastname, String date, String month, String year, String email, String companyname, String password, String conformpassword){
        homePage.clickOnRegisterLink();
        registerPage.clickOnRadioBt();
        registerPage.registerInToNopCommerce(firstname, lastname, date, month, year, email, companyname, password, conformpassword);
        registerPage.clickOnRegisterBt();
        String expectedText = "Your registration completed";
        String actualText = regConfPage.registerTextCnf();
        Assert.assertEquals(expectedText, actualText);

    }
    @Test(priority = 2, groups = {"regression"}, dataProvider = "Registration Data", dataProviderClass = TestData.class)
    public void verifySuccessfullRegistrationPageMessage(String firstname, String lastname, String date, String month, String year, String email, String companyname, String password, String conformpassword){
        homePage.clickOnRegisterLink();
        registerPage.clickOnRadioBt();
        registerPage.registerInToNopCommerce(firstname,lastname,date,month,year,email, companyname, password,conformpassword);
        registerPage.clickOnRegisterBt();
        String expectedText = "Your registration ccompleted";
        String actualText = regConfPage.registerTextCnf();
        Assert.assertEquals(expectedText, actualText);


    }
}
