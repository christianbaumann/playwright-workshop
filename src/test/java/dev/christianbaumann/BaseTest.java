package dev.christianbaumann;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    private Playwright playwright = Playwright.create();
    private BrowserType.LaunchOptions launchOptions = new BrowserType.LaunchOptions();
    private Browser browser;
    protected Page page;

    @BeforeEach
    void beforeEach() {
        System.out.println("----This is the before Each method");

        launchOptions.setHeadless(false);
        browser = playwright.chromium().launch(launchOptions);
        page = browser.newPage();
    }

    @AfterEach
    void afterEach() {
        System.out.println("----This is the after Each method");

        browser.close();

    }
}
