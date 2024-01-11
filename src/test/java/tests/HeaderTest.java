package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HeaderPage;

public class HeaderTest extends BaseTest {

    @Test
    public void verifyHeaderTest() {
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.closeIcon();
        Assert.assertTrue(headerPage.isLogoDisplayed());
        Assert.assertTrue(headerPage.isCategoriesButtonDisplayed());
        Assert.assertTrue(headerPage.isSearchBarDisplayed());
        Assert.assertTrue(headerPage.isShoppingCartDisplayed());
        Assert.assertTrue(headerPage.isNotificationBellDisplayed());
        Assert.assertTrue(headerPage.isSignInButtonDisplayed());
    }
}
