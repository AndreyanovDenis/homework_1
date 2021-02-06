import org.junit.jupiter.api.*;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class GitHubPage {


  @Test
  void checkGitHubPage() {
    //Открываем страницу с проектом
    open("https://github.com/selenide/selenide");

    //Открываем Wiki
    $("[data-content='Wiki']").click();

    //Переходим на SoftAssertions
    $$("#wiki-pages-box li").findBy(text("SoftAssertions")).click();

    //Ищем пример кода
    $$(By.id("wiki-body")).findBy(text("And use code like this:")).shouldBe(visible);


  }

}
