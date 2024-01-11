package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest extends BaseTest {

    @Test
    public void dealsTest() {
        HomePage homePage = new HomePage(driver);
        homePage.closeNotificationIcon();
        Assert.assertEquals(homePage.getNumberOfDeals(), 34);
        Assert.assertTrue(homePage.isDealImageDisplayed());
        Assert.assertTrue(homePage.isDealTitleDisplayed());
        Assert.assertTrue(homePage.isDealAddressDisplayed());
        Assert.assertTrue(homePage.isDealRatingDisplayed());
        Assert.assertTrue(homePage.isDealOldPriceDisplayed());
        Assert.assertTrue(homePage.isNewPriceDisplayed());
    }
}
