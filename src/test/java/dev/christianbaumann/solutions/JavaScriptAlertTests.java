package dev.christianbaumann.solutions;

import dev.christianbaumann.Base;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaScriptAlertTests extends Base {

    @Test
    void triggerJavaScriptAlert() {

        page = context.newPage();

        page.navigate("https://the-internet.herokuapp.com/javascript_alerts");

        page.onDialog(dialog -> dialog.accept());
        page.locator("//ul/li[1]/button").click();

        assertEquals("You successfully clicked an alert", page.locator("#result").textContent());
    }

    @Test
    void triggerJavaScriptConfirm() {

        page = context.newPage();

        page.navigate("https://the-internet.herokuapp.com/javascript_alerts");

        page.onDialog(dialog -> dialog.accept());
        page.locator("//ul/li[2]/button").click();

        assertEquals("You clicked: Ok", page.locator("#result").textContent());
        
    }

    @Test
    void triggerJavaScriptPrompt() {

        String textToEnter = "Agile Testing Days";

        page = context.newPage();

        page.navigate("https://the-internet.herokuapp.com/javascript_alerts");

        page.onDialog(dialog -> dialog.accept(textToEnter));
        page.locator("//ul/li[3]/button").click();

        assertEquals("You entered: " + textToEnter, page.locator("#result").textContent());
        
    }
}