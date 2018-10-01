package webelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class WebPage {

    private static final Logger logger = LoggerFactory.getLogger(WebPage.class);
    private static final int TIMEOUT_SECONDS = 120;

    protected final WebDriver driver;
    protected final WebDriverWait wait;

    public WebPage(final WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, TIMEOUT_SECONDS);
    }

}
