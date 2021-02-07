package config;

import org.junit.jupiter.api.BeforeAll;

import java.util.Random;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.headless;
import static com.codeborne.selenide.Selenide.*;

public class BaseTest {
    String city;
    Integer intCity;

    @BeforeAll
    static void setup() {
        headless = true;
        open("https://demoqa.com/automation-practice-form");
    }

    public void checkTable(String checkname, String filename) {
        $$(".table-responsive tr").filterBy(text(checkname)).shouldHave(texts(filename));
    }

    public void setText(String s, String fieldName) {
        $(s).setValue(fieldName);
    }

    public static int generateRandomInt(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public String getCityByState(String state) {
        Random random = new Random();
        switch (state) {
            case "NCR":
                final String[] cityArrayNCR = {"Delhi", "Gurgaon", "Noida"};
                intCity = random.nextInt(cityArrayNCR.length);
                city = cityArrayNCR[intCity];
                break;

            case "Uttar Pradesh":
                final String[] cityArrayUttar = {"Agra", "Lucknow", "Merrut"};
                intCity = random.nextInt(cityArrayUttar.length);
                city = cityArrayUttar[intCity];
                break;

            case "Haryana":
                final String[] cityArrayHaryana = {"Karnal", "Panipat"};
                intCity = random.nextInt(cityArrayHaryana.length);
                city = cityArrayHaryana[intCity];
                break;

            case "Rajasthan":
                final String[] cityArrayRajasthan = {"Jaipur", "Jaiselmer"};
                intCity = random.nextInt(cityArrayRajasthan.length);
                city = cityArrayRajasthan[intCity];
                break;

        }
        return city;
    }

}

