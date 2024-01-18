package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Constants;

public class HeaderPage extends BasePage {
    @FindBy(css = ".icon-x")
    WebElement close;
    @FindBy(css = "#ls-groupon-logo")
    WebElement logo;
    @FindBy(css = "#btn-categories")
    WebElement categoriesButton;
    @FindBy(xpath = "(//input[@type='search'])[3]")
    WebElement searchBar;
    @FindBy(css = "#cart-icon")
    WebElement shoppingCart;
    @FindBy(css = "#bell")
    WebElement notification;
    @FindBy(xpath = "//button[@id='signin-container']")
    WebElement signIn;

    public HeaderPage(WebDriver driver) {
        super(driver);
    }

    public void closeIcon() {
        close.click();
    }

    public boolean isLogoDisplayed() {
        return logo.isDisplayed();
    }

    public boolean isCategoriesButtonDisplayed() {
        return categoriesButton.isDisplayed();
    }

    public boolean isSearchBarDisplayed() {
        return searchBar.isDisplayed();
    }

    public boolean isShoppingCartDisplayed() {
        return shoppingCart.isDisplayed();
    }

    public boolean isNotificationBellDisplayed() {
        return notification.isDisplayed();
    }

    public boolean isSignInButtonDisplayed() {
        return signIn.isDisplayed();
    }

    public void clickSearchBar() {
        waitForElement(searchBar);
        searchBar.click();
    }

    public void inputSearchBarText() {
        searchBar.sendKeys(Constants.PRODUCT);
    }

    public void pressEnterSearchBar() {
        waitForElement(searchBar);
        driver.findElement(By.xpath("(//input[@type='search'])[3]")).sendKeys(Keys.ENTER);
    }
}

