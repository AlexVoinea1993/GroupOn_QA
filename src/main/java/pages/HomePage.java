package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage {
    @FindBy(css = ".icon-x")
    WebElement close;
    @FindBy(css = ".cui-content")
    List<WebElement> deals;
    @FindBy(xpath = "(//img[@class='cui-image lazy-load lazy-loaded'])[1]")
    WebElement image;
    @FindBy(xpath = "(//div[@class='cui-udc-title'])[1]")
    WebElement title;
    @FindBy(xpath = "(//span[@class='cui-location-name'])[1]")
    WebElement address;
    @FindBy(xpath = "(//div[@class='cui-review-rating'])[2]")
    WebElement rating;
    @FindBy(xpath = "(//div[@class='cui-price'])[2]")
    WebElement oldPrice;
    @FindBy(xpath = "(//div[@class='cui-verbose-urgency-price'])[2]")
    WebElement newPrice;
    @FindBy(xpath = "(//div[@class='cui-udc-title'])[1]")
    WebElement deal;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void closeNotificationIcon() {
        waitForElement(close);
        close.click();
    }

    public int getNumberOfDeals() {
        return deals.size();
    }

    public boolean isDealImageDisplayed() {
        return image.isDisplayed();
    }

    public boolean isDealTitleDisplayed() {
        return title.isDisplayed();
    }

    public boolean isDealAddressDisplayed() {
        return address.isDisplayed();
    }

    public boolean isDealRatingDisplayed() {
        return rating.isDisplayed();
    }

    public boolean isDealOldPriceDisplayed() {
        return oldPrice.isDisplayed();
    }

    public boolean isNewPriceDisplayed() {
        return newPrice.isDisplayed();
    }

    public void clickDealLink() {
        deal.click();
    }
}
