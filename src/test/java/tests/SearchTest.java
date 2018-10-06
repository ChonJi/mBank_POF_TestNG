package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.MainPage;

public class SearchTest {

    private WebDriver browser;
    private WebDriverWait wait;
    private MainPage mainPage;

    @BeforeClass
    private void run() {
        mainPage = new MainPage(browser, wait).openMainPage();
    }

    @Test()
    private void shouldSendTextToSearchBox() {
        mainPage.searchByKeys("Dupa");
    }

    @AfterClass(alwaysRun = true)
    private void tearDown() {
        mainPage.quit();
    }

}
