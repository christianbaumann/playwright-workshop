package dev.christianbaumann.solutions;

import dev.christianbaumann.Base;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TextTest extends Base {

    @Test
    void enterText() {

        page = context.newPage();

        page.navigate("https://the-internet.herokuapp.com/login");

        page.getByLabel("Username").type("tomsmith");

        page.getByLabel("Password").type("SuperSecretPassword!");

        page.locator("//*[@id='login']/button").click();

        assertTrue(page.locator("#flash").textContent().contains("You logged into a secure area!"));

    }
}