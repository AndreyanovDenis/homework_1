package config;

import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Configuration.headless;
import static com.codeborne.selenide.Selenide.*;

public class BaseTest {

    @BeforeAll
    static void setup() {
        headless = true;
        open("https://demoqa.com/automation-practice-form");
    }


}

