package com.demo.nopcommerce.resources.testdata;

import org.testng.annotations.DataProvider;

/**
 * Created by Ankita
 */
public class TestData {

    @DataProvider(name = "Login Data")
    public Object [][] getData(){
        return new Object[][]{
                {"abc@yahoomail.com", "Tajmahal06"}

        };
    }

    @DataProvider(name = "Registration Data")
    public Object[][] getData1(){
        return new Object[][]{
                {"Taj", "Mahal", "1", "July", "1986", "abc@yahoomail.com", "Physio Care", "Tajmahal06", "Tajmahal06"}

        };
    }
}
