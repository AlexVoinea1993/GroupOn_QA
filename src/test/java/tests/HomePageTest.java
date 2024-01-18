package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.ErrorMessages;

public class HomePageTest extends BaseTest {

//    Tema:
//    1. Intru pe site, fac login(cu un cont creat manual inainte) - nu merge sa fac login cu automation
//    2. Search in bara (caut tickets + tasta enter) -
//    3. Validez ca tabul de tickets este verde
//    4. Selectez primul filtru si aleg orice varianta
//    5. Validez  ca filtrul selectat s-a facut verde
//    6. Selectez fiecare filtru pana la final si aleg cate o valoare, si validez ca s-a facut verde!

    @Test(testName = "verify deal tests")
    public void dealsTest() {
        HomePage homePage = new HomePage(driver);
        homePage.closeNotificationIcon();
        Assert.assertEquals(homePage.getNumberOfDeals(), 34, ErrorMessages.NUMBER_OF_DEALS_IS_NOT_CORRECT);
        Assert.assertTrue(homePage.isDealImageDisplayed(), ErrorMessages.DEAL_PHOTO_IS_NOT_DISPLAYED);
        Assert.assertTrue(homePage.isDealTitleDisplayed(), ErrorMessages.DEAL_TITLE_NOT_DISPLAYED);
        Assert.assertTrue(homePage.isDealAddressDisplayed(), ErrorMessages.DEAL_ADDRESS_NOT_DISPLAYED);
        Assert.assertTrue(homePage.isDealRatingDisplayed(), ErrorMessages.STAR_RATING_IS_NOT_DISPLAYED);
        Assert.assertTrue(homePage.isDealOldPriceDisplayed(), ErrorMessages.DEAL_OLD_PRICE_NOT_DISPLAYED);
        Assert.assertTrue(homePage.isNewPriceDisplayed(), ErrorMessages.DEAL_NEW_PRICE_NOT_DISPLAYED);
    }
}
