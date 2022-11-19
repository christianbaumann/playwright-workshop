package dev.christianbaumann.demo;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ClickLink {

    private Playwright playwright = Playwright.create();
    private Browser browser;
    private BrowserType.LaunchOptions launchOptions = new BrowserType.LaunchOptions().setHeadless(false);
    private Browser.NewContextOptions contextOptions = new Browser.NewContextOptions().setViewportSize(960, 1032);
    private BrowserContext context;
    private Page page;

    @BeforeEach
    void setup() {
        browser = playwright.chromium().launch(launchOptions);
        context = browser.newContext(contextOptions);
    }

    @AfterEach
    void teardown(){
        browser.close();
    }

    @Test
    void clickLinkViaText() {
        page = context.newPage();

        page.navigate("https://the-internet.herokuapp.com/");

        Locator locatorBrokenImages = page.locator("text=Broken Images");

        locatorBrokenImages.click();

        /*
        // Can be shortened to:
        // page.locator("text=Broken Images").click();
        */

        /*
        // Scroll down and show clickLinkViaTextAndVerify()
        */
    }







































    @Test
    void clickLinkViaTextAndVerify() {
        page = context.newPage();

        page.navigate("https://the-internet.herokuapp.com/");

        page.locator("text=Broken Images").click();

        assertTrue(page.locator("text=Agile Testing Days").isVisible());
    }

}
