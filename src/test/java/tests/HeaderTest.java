package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HeaderPage;
import utils.ErrorMessages;

public class HeaderTest extends BaseTest {

    @Test(testName = "verify header elements")
    public void verifyHeaderTest() {
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.closeIcon();
        Assert.assertTrue(headerPage.isLogoDisplayed(), ErrorMessages.LOGO_NOT_DISPLAYED);
        Assert.assertTrue(headerPage.isCategoriesButtonDisplayed(), ErrorMessages.CATEGORIES_NOT_DISPLAYED);
        Assert.assertTrue(headerPage.isSearchBarDisplayed(), ErrorMessages.SEARCH_BAR_NOT_DISPLAYED);
        Assert.assertTrue(headerPage.isShoppingCartDisplayed(), ErrorMessages.SHOPPING_CART_NOT_DISPLAYED);
        Assert.assertTrue(headerPage.isNotificationBellDisplayed(), ErrorMessages.NOTIFICATION_BELL_NOT_DISPLAYED);
        Assert.assertTrue(headerPage.isSignInButtonDisplayed(), ErrorMessages.SIGN_IN_BUTTON_NOT_DISPLAYED);
    }
}
