package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DealPage;
import pages.HomePage;
import utils.Constants;
import utils.ErrorMessages;

public class DealPageTest extends BaseTest {

    @Test(testName = "verify deal page elements")
    public void dealPageDisplayTest() {
        HomePage homePage = new HomePage(driver);
        homePage.closeNotificationIcon();
        homePage.clickDealLink();
        DealPage dealPage = new DealPage(driver);
        Assert.assertTrue(dealPage.isDealTitleDisplayed(), ErrorMessages.DEAL_TITLE_NOT_DISPLAYED);
        Assert.assertEquals(dealPage.getDealTitleColor(), Constants.BLACK_COLOR, ErrorMessages.COLOR_NOT_CORRECT);
        Assert.assertTrue(dealPage.isDealAddressDisplayed(), ErrorMessages.DEAL_ADDRESS_NOT_DISPLAYED);
        Assert.assertEquals(dealPage.getDealAddressColor(), Constants.BLUE_COLOR, ErrorMessages.COLOR_NOT_CORRECT);
        dealPage.clickDealAddressLink();
        Assert.assertTrue(dealPage.isSubtitleDisplayed(), ErrorMessages.SUBTITLE_NOT_DISPLAYED);
        dealPage.printSubtitleColor();
        Assert.assertEquals(dealPage.getSubtitleColor(), Constants.GREY_COLOR, ErrorMessages.SUBTITLE_COLOR_NOT_CORRECT);
        Assert.assertTrue(dealPage.isDealPhotoDisplayed(), ErrorMessages.DEAL_PHOTO_IS_NOT_DISPLAYED);
        dealPage.clickForwardButton();
        dealPage.clickBackwardButton();
        Assert.assertEquals(dealPage.getNumberOfDealOptions(), 4, ErrorMessages.NUMBER_OF_DEALS_IS_NOT_CORRECT);
        Assert.assertTrue(dealPage.isNumericalRatingDisplayed(), ErrorMessages.NUMERICAL_RATING_IS_NOT_DISPLAYED);
        Assert.assertTrue(dealPage.isStarRatingDisplayed(), ErrorMessages.STAR_RATING_IS_NOT_DISPLAYED);
        Assert.assertTrue(dealPage.isTotalNumberOfRatingsDisplayed(), ErrorMessages.TOTAL_NUMBER_OF_RATINGS_IS_NOT_DISPLAYED);
    }
}
