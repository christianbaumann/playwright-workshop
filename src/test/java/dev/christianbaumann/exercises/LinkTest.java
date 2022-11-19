package dev.christianbaumann.exercises;

import dev.christianbaumann.Base;
import org.junit.jupiter.api.Test;

public class LinkTest extends Base {

    @Test
    void clickLink() {
        page = context.newPage();

        page.navigate("https://the-internet.herokuapp.com/");

        // Click "Checkboxes"

    }
}
