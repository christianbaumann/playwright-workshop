package dev.christianbaumann.a_clickLink;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.Test;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class clickLink {

    private Playwright playwright = Playwright.create();
    private BrowserType.LaunchOptions launchOptions = new BrowserType.LaunchOptions().setHeadless(false);
    private Browser browser;
    protected Page page;

    @Test
    void clickLink() {
        browser = playwright.chromium().launch(launchOptions);
        page = browser.newPage();

        page.navigate("https://the-internet.herokuapp.com/");

        // implement click here

        browser.close();
    }

    @Test
    void clickLinkViaText() {
        browser = playwright.chromium().launch(launchOptions);
        page = browser.newPage();

        page.navigate("https://the-internet.herokuapp.com/");

        page.locator("text=\"Broken Images\"").click();

        browser.close();
    }

    @Test
    void clickLinkViaTextAndVerify() {
        browser = playwright.chromium().launch(launchOptions);
        page = browser.newPage();

        page.navigate("https://the-internet.herokuapp.com/");

        page.locator("text=\"Broken Images\"").click();

        assertThat(page.getByText("Broken Images")).isVisible();

        browser.close();
    }

}
