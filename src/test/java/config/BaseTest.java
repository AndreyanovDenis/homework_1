package config;

import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class BaseTest {

  @BeforeAll
  static void setup() {
    open("https://demoqa.com/automation-practice-form");
  }

  public void CheckTable(String checkname, String filename) {
    $$(".table-responsive tr").filterBy(text(checkname)).shouldHave(texts(filename));
  }

  public void setText(String s, String fieldName) {
    $(s).setValue(fieldName);
  }


}

