package dev.christianbaumann;

import org.junit.jupiter.api.Test;

public class Trying extends BaseTest{

    @Test
    void test(){
        page.navigate("http://christianbaumann.dev");
        System.out.println(page.title());
    }

    @Test
    void test2(){
        page.navigate("http://playwright.dev");
        System.out.println(page.title());
    }

}
