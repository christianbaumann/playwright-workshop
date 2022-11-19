package dev.christianbaumann.solutions;

import dev.christianbaumann.Base;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LinkTest extends Base {

    @Test
    void clickLink() {

        page = context.newPage();

        page.navigate("https://the-internet.herokuapp.com/");

        page.locator("text=Checkboxes").click();

        assertTrue(page.locator("text=Checkboxes").isVisible());

    }
}
