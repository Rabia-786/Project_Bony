package org.example;

import org.junit.Assert;
import org.junit.Test;

public class TestSuite extends BaseTest {
    HomePage homePage = new HomePage();
/// visit homepage of NopCommerce demo Website
    @Test

    public void userShouldBeAbleToVisitHomePage(){
        homePage.navigateToHomePage();

        Assert.assertEquals(homePage.currentPage(),"https://demo.nopcommerce.com/");
    }
}