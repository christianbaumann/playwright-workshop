package dev.christianbaumann;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class Base {

    protected final Playwright playwright = Playwright.create();
    protected Browser browser;
    protected final BrowserType.LaunchOptions launchOptions = new BrowserType.LaunchOptions().setHeadless(false);
    protected final Browser.NewContextOptions contextOptions = new Browser.NewContextOptions().setViewportSize(960, 1032);
    protected BrowserContext context;
    protected Page page;

    @BeforeEach
    void setup() {
        browser = playwright.chromium().launch(launchOptions);
        context = browser.newContext(contextOptions);
        context.setDefaultTimeout(5000);
    }

    @AfterEach
    void teardown(){
        browser.close();
    }
    
}
