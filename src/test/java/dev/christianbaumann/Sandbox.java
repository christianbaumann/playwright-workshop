package dev.christianbaumann;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.Test;

public class Sandbox {
    private Playwright playwright = Playwright.create();
    private BrowserType.LaunchOptions launchOptions = new BrowserType.LaunchOptions().setHeadless(false);
    private Browser browser;
    protected Page page;

    @Test
    void sandbox() {
        browser = playwright.chromium().launch(launchOptions);
        Browser.NewContextOptions contextOptions = new Browser.NewContextOptions();
        contextOptions.setViewportSize(960 , 516);
        BrowserContext context = browser.newContext(contextOptions);
        page = context.newPage();

        page.navigate("https://the-internet.herokuapp.com/");

//        page.pause();

        browser.close();
    }
}
