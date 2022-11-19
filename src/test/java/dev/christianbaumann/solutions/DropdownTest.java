package dev.christianbaumann.solutions;

import dev.christianbaumann.Base;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DropdownTest extends Base {

    @Test
    void selectFromDropdown() {

        page = context.newPage();

        page.navigate("https://the-internet.herokuapp.com/dropdown");

        page.locator("#dropdown").selectOption("2");

        assertEquals("selected", page.locator("//*[@id='dropdown']/option[3]").getAttribute("selected"));

    }
}