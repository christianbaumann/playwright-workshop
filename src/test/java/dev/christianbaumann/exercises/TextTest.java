package dev.christianbaumann.exercises;

import dev.christianbaumann.Base;
import org.junit.jupiter.api.Test;

public class TextTest extends Base {

    @Test
    void enterText() {
        page = context.newPage();

        page.navigate("https://the-internet.herokuapp.com/login");

        // Enter username & password via label

        // Click the Login-button

        // Verify the successful login

    }
}