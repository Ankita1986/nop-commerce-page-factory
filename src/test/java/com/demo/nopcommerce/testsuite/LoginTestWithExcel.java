package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.excelutility.ExcelUtility;
import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.pages.LoginPage;
import com.demo.nopcommerce.testbase.TestBase;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * Created by Ankita
 */
public class LoginTestWithExcel extends TestBase {

    public static final String File_Path = System.getProperty("user.dir")+"/src/test/java/com/demo/nopcommerce/resources/testdata/NopExcelData.xlsx";
    HomePage homePage;
    LoginPage loginPage;
    SoftAssert softAssert = new SoftAssert();

    @BeforeClass(groups = {"sanity", "smoke", "regression"})
    public void setExcel(){
        //Tell the code about the location of excel file
        try {
            ExcelUtility.setExcelFile(File_Path, "LoginTest");
        }catch (Exception e) {
            e.printStackTrace();
        }

    }

    @BeforeMethod(groups = {"sanity", "smoke", "regression"})
    public void setUp() {
        homePage = new HomePage();
        loginPage = new LoginPage();

    }


    @DataProvider(name = "LoginData")
    public Object[][] getData(){
        Object[][] data = ExcelUtility.getTestData("LoginData");
        return data;
    }

    @Test(dataProvider = "LoginData")
    public void doLogin(String username, String password){
        homePage.clickOnLoginLink();
        loginPage.logInToNopCommerce(username, password);
    }

}
