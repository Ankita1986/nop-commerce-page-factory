package com.demo.nopcommerce.testsuite;


import com.demo.nopcommerce.pages.ComConfPage;
import com.demo.nopcommerce.pages.ComputerPage;
import com.demo.nopcommerce.pages.DeskTopPage;
import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.testbase.TestBase;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Ankita
 */
public class ComputerTest extends TestBase {
    HomePage homePage;
    ComputerPage computerPage;
    DeskTopPage deskTopPage;
    ComConfPage comConfPage;
    @BeforeMethod
    public void setUp(){
        homePage = new HomePage();
        computerPage = new ComputerPage();
        deskTopPage = new DeskTopPage();
        comConfPage = new ComConfPage();
    }



    @Test(priority = 0, groups = {"smoke"})
    public void verifyUserShouldNavigateToComputerPage() {
        homePage.clickOnComputersLink();
        String expectedText = "Computers";
        String actualText = comConfPage.compuConfMsg();
        Assert.assertEquals(expectedText, actualText);


    }

    @Test(priority = 1, groups = {"sanity"})
    public void verifyUserShouldNavigateToDesktopPage() {
        homePage.clickOnComputersLink();
        computerPage.clickOnDesktopLink();
        String expectedText1 = "Desktops";
        String actualText1 = deskTopPage.deskTopConfText();
        Assert.assertEquals(expectedText1, actualText1);

    }

    @Test(priority = 2, groups = {"regression"})
    public void verifyComputerPageScreenMessage() {
        homePage.clickOnComputersLink();
        String expectedText = "Computerss";
        String actualText = comConfPage.compuConfMsg();
        Assert.assertEquals(expectedText, actualText);


    }
}


