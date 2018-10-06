package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.MainPage;

import static org.assertj.core.api.Assertions.assertThat;

public class SetUp {

    private static final int SECONDS = 30;
    protected WebDriver browser;
    protected WebDriverWait wait;

    public SetUp(WebDriver browser, WebDriverWait wait){
        this.browser = browser;
        this.wait = wait;
        PageFactory.initElements(browser, this);
    }

    public MainPage openMainPage() {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        browser = new ChromeDriver();
        wait = new WebDriverWait(browser ,SECONDS);
        browser.get("https://www.google.com");
        browser.manage().window().maximize();
        assertThat(browser.getCurrentUrl()).isEqualTo("https://www.google.com/");
        return new MainPage(browser, wait);
    }


    public void quit() {
        browser.quit();
    }


}
