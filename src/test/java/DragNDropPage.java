import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.CollectionCondition.exactTexts;
import static com.codeborne.selenide.Selenide.*;

public class DragNDropPage {


  @Test
  void checkDragNDropPage() {
    Configuration.headless = true;
    //Открываем страницу с проектом
    open("https://the-internet.herokuapp.com/drag_and_drop");

    //Меняем квадраты местами
    $x("//div[@id='column-a']").dragAndDropTo($x("//div[@id='column-b']"));

    //Проверяем, что поменялись
    $$x("//div[@id='columns']").shouldHave(exactTexts("B A"));

  }

}
