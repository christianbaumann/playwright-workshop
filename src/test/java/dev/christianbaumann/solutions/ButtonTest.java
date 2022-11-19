package dev.christianbaumann.solutions;

import dev.christianbaumann.Base;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ButtonTest extends Base {

    @Test
    void clickButton() {
        page = context.newPage();

        page.navigate("https://the-internet.herokuapp.com/login");

        // Click the Login-button

        // Verify that the login failed

    }
}