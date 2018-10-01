package tests;

import core.SetUp;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.MainPage;

public class SearchTest {

    private WebDriver browser;
    private MainPage mainPage;
    private SetUp setUp;


    @BeforeClass
    private void run() {
        setUp = new SetUp(browser);
        mainPage = setUp.openMainPage();
    }

    @Test()
    private void shouldSendTextToSearchBox() {
        mainPage.searchByKeys("Dupa");
    }

    @AfterClass(alwaysRun = true)
    private void tearDown() {
        setUp.quit();
    }

}
