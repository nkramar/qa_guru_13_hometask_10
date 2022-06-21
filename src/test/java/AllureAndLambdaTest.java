import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

public class AllureAndLambdaTest extends BaseTest {

  @Test
  @DisplayName("Test with lambda expressions")
  void lambdaExpressionTest() {
    step("Открываем главную страницу Github", () -> open("https://github.com/"));
    step("Ищем репозиторий " + REPOSITORY, () -> {
      $(".header-search-input").click();
      $(".header-search-input").setValue(REPOSITORY);
      $(".header-search-input").submit();
    });
    step("В результатах поиска переходим по ссылке репозитория " + REPOSITORY, () -> $(linkText(REPOSITORY)).click());
    step("Кликаем и открываем Issues", () -> $(partialLinkText("Issues")).click());
    step("Проверяем что существует Issue с номером " + ISSUE_NUMBER, () -> {
      $(withText("#" + ISSUE_NUMBER)).should(Condition.exist);

    });

  }


}

