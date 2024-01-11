package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DealPage extends BasePage {
    @FindBy(css = "#deal-title")
    WebElement dealTile;
    @FindBy(css = ".merchant-info-anchor")
    WebElement dealAddress;
    @FindBy(css = "#deal-with-tag")
    WebElement subtitle;
    @FindBy(css = ".media-container.loaded")
    WebElement dealPhoto;
    @FindBy(css = ".controls-button.carousel-button.forward")
    WebElement forwardButton;
    @FindBy(xpath = "//div[@class='controls-button carousel-button back']")
    WebElement backwardButton;
    @FindBy(css = ".option")
    List<WebElement> dealOptions;
    @FindBy(xpath = "(//span[@id='numerical-rating'])[1]")
    WebElement numericalRating;
    @FindBy(xpath = "(//ul[@class='svg-rating ugc-star-rating'])[1]")
    WebElement starRating;
    @FindBy(xpath = "(//span[@class='star-rating-text'])[1]")
    WebElement totalNumberOfRatings;

    public DealPage(WebDriver driver) {
        super(driver);
    }

    public boolean isDealTitleDisplayed() {
        return dealTile.isDisplayed();
    }

    public void printDealTitleColor() {
        System.out.println(dealTile.getCssValue("color"));
    }

    public String getDealTitleColor() {
        return dealTile.getCssValue("color");
    }

    public boolean isDealAddressDisplayed() {
        return dealAddress.isDisplayed();
    }

    public void printDealAddressColor() {
        System.out.println(dealAddress.getCssValue("color"));
    }

    public String getDealAddressColor() {
        return dealAddress.getCssValue("color");
    }

    public void clickDealAddressLink() {
        dealAddress.click();
    }

    public boolean isSubtitleDisplayed() {
        return subtitle.isDisplayed();
    }

    public void printSubtitleColor() {
        scrollToElement(subtitle);
        System.out.println(subtitle.getCssValue("color"));
    }

    public String getSubtitleColor() {
        return subtitle.getCssValue("color");
    }

    public boolean isDealPhotoDisplayed() {
        return dealPhoto.isDisplayed();
    }

    public void clickForwardButton() {
        forwardButton.click();
    }

    public void clickBackwardButton() {
        backwardButton.click();
    }

    public int getNumberOfDealOptions() {
        return dealOptions.size();
    }

    public boolean isNumericalRatingDisplayed() {
        return numericalRating.isDisplayed();
    }

    public boolean isStarRatingDisplayed() {
        return starRating.isDisplayed();
    }

    public boolean isTotalNumberOfRatingsDisplayed() {
        return totalNumberOfRatings.isDisplayed();
    }
}
