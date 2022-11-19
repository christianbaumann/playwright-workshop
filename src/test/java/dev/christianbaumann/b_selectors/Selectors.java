package dev.christianbaumann.b_selectors;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class Selectors {

    private Page page;

    public void main(){

        // text selector
        page.locator("text=Log in").click();

        Locator product = page.getByTestId("product-card").filter(new Locator.FilterOptions().setHasText("Product 2"));
//        product.get_by_text()



        // CSS selector
        page.locator("button").click();

        // XPath selector
        page.locator("xpath=//button").click();

        Locator logInLocator = page.locator("text=Log in");
        logInLocator.click();
    }
}
