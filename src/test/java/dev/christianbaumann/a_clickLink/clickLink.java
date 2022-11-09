package dev.christianbaumann.a_clickLink;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.Test;

public class clickLink {

    private Playwright playwright = Playwright.create();
    private BrowserType.LaunchOptions launchOptions = new BrowserType.LaunchOptions().setHeadless(false);
    private Browser browser;
    protected Page page;

    @Test
    void clickLink(){
        browser = playwright.chromium().launch(launchOptions);
        page = browser.newPage();

        page.navigate("https://demoqa.com/links");

        // click here

        browser.close();
    }
}
