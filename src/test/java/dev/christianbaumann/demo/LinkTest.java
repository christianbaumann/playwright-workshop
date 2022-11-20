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

        Locator locatorBrokenImages = page.getByText("Broken Images");

        locatorBrokenImages.click();

        /*
        // Wait, this was too fast?
        // debug
        // page.pause() -> show recorder
        */

        /*
        // Can be shortened to:
        // page.getByText("Broken Images").click();
        */

        /*
        // Scroll down and show clickLinkViaTextAndVerify()
        */
    }







































    @Test
    void clickLinkViaTextAndVerify() {
        page = context.newPage();

        page.navigate("https://the-internet.herokuapp.com/");

        page.getByText("Broken Images").click();

        assertTrue(page.getByText("Agile Testing Days").isVisible());
    }

}
