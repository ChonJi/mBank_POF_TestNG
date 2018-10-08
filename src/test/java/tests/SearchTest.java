package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.DoodlePage;
import pages.MainPage;

import static data.SearchTestData.DOODLE_HEADER;
import static data.SearchTestData.SEARCH_PHASE;
import static org.assertj.core.api.Assertions.assertThat;

public class SearchTest {

    private WebDriver browser;
    private WebDriverWait wait;
    private MainPage mainPage;
    private DoodlePage doodlePage;

    @BeforeClass
    private void run() {
        mainPage = new MainPage(browser, wait).openMainPage();
    }

    @Test()
    private void shouldSendTextToSearchBox() {
        mainPage.searchByKeys(SEARCH_PHASE);
        mainPage.clearSearchInput(SEARCH_PHASE);
    }

    @Test(dependsOnMethods = "shouldSendTextToSearchBox")
    private void shouldGoToDoodlePage() {
        doodlePage = mainPage.goToDoodlePage();
        assertThat(doodlePage.getHeaderText()).isEqualTo(DOODLE_HEADER);
    }

    @AfterClass(alwaysRun = true)
    private void tearDown() {
        mainPage.quit();
    }

}
