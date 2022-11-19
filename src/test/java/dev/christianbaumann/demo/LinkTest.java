package dev.christianbaumann.demo;

import com.microsoft.playwright.Locator;
import dev.christianbaumann.Base;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LinkTest extends Base {

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
