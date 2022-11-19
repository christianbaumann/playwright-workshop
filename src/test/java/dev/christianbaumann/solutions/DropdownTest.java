package dev.christianbaumann.solutions;

import dev.christianbaumann.Base;
import org.junit.jupiter.api.Test;

public class DropdownTest extends Base {

    @Test
    void selectFromDropdown() {
        page = context.newPage();

        page.navigate("https://the-internet.herokuapp.com/dropdown");

        // Select a value from the dropdown

        // Verify the value selection

    }
}