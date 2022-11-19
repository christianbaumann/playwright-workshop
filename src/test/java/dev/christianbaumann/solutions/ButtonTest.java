package dev.christianbaumann.solutions;

import dev.christianbaumann.Base;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ButtonTest extends Base {

    @Test
    void clickButton() {

        page = context.newPage();

        page.navigate("https://the-internet.herokuapp.com/login");

        page.locator("//*[@id='login']/button").click();

        assertTrue(page.locator("#flash").textContent().contains("Your username is invalid!"));

    }
}