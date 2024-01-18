package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HeaderPage;
import pages.HomePage;
import pages.TicketsPage;
import utils.Constants;
import utils.ErrorMessages;

public class SearchFiltersTest extends BaseTest {

    @Test(testName = "verify search filters")
    public void searchFiltersDisplayTest() {
        HomePage homePage = new HomePage(driver);
        homePage.closeNotificationIcon();
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.clickSearchBar();
        headerPage.inputSearchBarText();
        headerPage.pressEnterSearchBar();
        TicketsPage ticketsPage = new TicketsPage(driver);
        Assert.assertEquals(ticketsPage.getTicketsTabColor(), Constants.GREEN_COLOR, ErrorMessages.COLOR_NOT_CORRECT);
        ticketsPage.clickCategoryTab();
        ticketsPage.clickThingsToDo();
        Assert.assertEquals(ticketsPage.getThingsToDoTabColor(), Constants.GREEN_COLOR, ErrorMessages.COLOR_NOT_CORRECT);
    }
}

