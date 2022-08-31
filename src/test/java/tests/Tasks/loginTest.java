package com.test.mvntest.tests.Tasks;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        LoginUtilities.login(
                "https://login1.nextbasecrm.com/",
                "//*[@id=\"login-popup\"]/form/div[1]/div[1]/input",
                "incorrect",
                "//*[@id=\"login-popup\"]/form/div[1]/div[2]/input",
                "incorrect");


    }
}
