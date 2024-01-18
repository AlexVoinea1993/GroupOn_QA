package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TicketsPage extends BasePage {
    @FindBy(css = "#query-filter-box")
    WebElement tickets;
    @FindBy(xpath = "//button[contains(text(),'Category')]")
    WebElement category;
    @FindBy(xpath = "//a[@data-id='things-to-do']")
    WebElement thingsToDo;

    public TicketsPage(WebDriver driver) {
        super(driver);
    }

    public void printTicketsTabColor() {
        waitForElement(tickets);
        System.out.println(tickets.getCssValue("color"));
    }

    public String getTicketsTabColor() {
        waitForElement(tickets);
        return tickets.getCssValue("color");
    }

    public void clickCategoryTab() {
        category.click();
    }

    public void clickThingsToDo() {
        thingsToDo.click();
    }

    public void printThingsToDoTabColor() {
        System.out.println(thingsToDo.getCssValue("background"));
    }

    public String getThingsToDoTabColor() {
        waitForElement(thingsToDo);
        return thingsToDo.getCssValue("background");
    }
}
