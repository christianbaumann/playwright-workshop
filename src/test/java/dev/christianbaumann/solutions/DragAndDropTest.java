package dev.christianbaumann.solutions;

import dev.christianbaumann.Base;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DragAndDropTest extends Base {

    @Test
    void dragAndDrop() {

        page = context.newPage();

        page.navigate("https://the-internet.herokuapp.com/drag_and_drop");

        page.locator("#column-a").dragTo(page.locator("#column-b"));

        assertEquals("B", page.locator("//*[@id=\"column-a\"]/header").textContent());

    }
}