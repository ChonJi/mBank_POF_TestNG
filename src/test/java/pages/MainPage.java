package pages;

import core.SetUp;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class MainPage extends SetUp {

    @FindBy(id = "lst-ib")
    private WebElement element;

    @FindBy(xpath = "//input[@value='Szczęśliwy traf']")
    private WebElement luckyShot;

    public MainPage(WebDriver browser, WebDriverWait wait) {
        super(browser, wait);
    }

    public void searchByKeys(final String text) {
        element.sendKeys(text);
    }

    public void clearSearchInput(String text) {
        for (int i = 1; i <= text.length(); i++) {
            element.sendKeys(Keys.BACK_SPACE);
        }
        element.sendKeys(Keys.ESCAPE);
    }

    public DoodlePage goToDoodlePage() {
        wait.until(elementToBeClickable(luckyShot)).click();
        wait.until(browser -> browser.getCurrentUrl().equals("https://www.google.com/doodles/"));
        return new DoodlePage(browser, wait);
    }

}
