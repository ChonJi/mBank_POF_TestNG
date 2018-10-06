package pages;

import core.SetUp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DoodlePage extends SetUp {

    public DoodlePage(WebDriver browser, WebDriverWait wait) {
        super(browser, wait);
    }

    public void waitForPageToLoad() {
        wait.until(browser -> browser.getCurrentUrl().equals("https://www.google.com/doodles"));
    }

}
