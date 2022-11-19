package dev.christianbaumann.exercises;

import dev.christianbaumann.Base;
import org.junit.jupiter.api.Test;

public class JavaScriptAlerts extends Base {

    @Test
    void triggerJavaScriptAlert() {
        page = context.newPage();

        page.navigate("https://the-internet.herokuapp.com/javascript_alerts");

        // Click “JS Alert”-button

        // Confirm popup

        // Verify
        
    }

    @Test
    void triggerJavaScriptConfirm() {
        page = context.newPage();

        page.navigate("https://the-internet.herokuapp.com/javascript_alerts");

        // Click “JS Confirm”-button
        
        // Confirm popup
        
        // Verify
        
    }

    @Test
    void triggerJavaScriptPrompt() {
        page = context.newPage();

        page.navigate("https://the-internet.herokuapp.com/javascript_alerts");

        // Click “JS Prompt”-button
        
        // Enter some value & confirm

        // Verify
        
    }
}