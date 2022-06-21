
import com.codeborne.selenide.logevents.SelenideLogger;

import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;


public class BaseTest {
  final String REPOSITORY = "nkramar/qa_guru_13_hometask_7";
  final Integer ISSUE_NUMBER = 1;

  @BeforeEach
  public void addListener() {
    SelenideLogger.addListener("allure", new AllureSelenide());
  }

  @AfterEach
  void addScreenshot() {
    Screenshots.screenshotAs();
  }
}


