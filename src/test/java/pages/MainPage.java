package pages;

import core.SetUp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends SetUp {

    @FindBy(id = "lst-ib")
    private WebElement element;

    public MainPage(WebDriver browser, WebDriverWait wait) {
        super(browser, wait);
    }

    public void searchByKeys(final String text) {
        element.sendKeys(text);
    }

    public String getTextFromSearchBox() {
        return element.getText();
    }

}
