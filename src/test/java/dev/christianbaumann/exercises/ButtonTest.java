package dev.christianbaumann.exercises;

import dev.christianbaumann.Base;
import org.junit.jupiter.api.Test;

public class ButtonTest extends Base {

    @Test
    void clickButton() {
        page = context.newPage();

        page.navigate("https://the-internet.herokuapp.com/login");

        // Click the Login-button

        // Verify that the login failed

    }
}