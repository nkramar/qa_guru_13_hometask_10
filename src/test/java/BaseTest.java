import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Attachment;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class BaseTest {
  final String REPOSITORY = "nkramar/qa_guru_13_hometask_7";
  final Integer ISSUE_NUMBER = 1;

  @BeforeEach
  public void addListener() {
    SelenideLogger.addListener("allure", new AllureSelenide());
  }


  @Attachment(value = "Screenshot", type = "image/png", fileExtension = "png")
  public byte[] takeScreenshot() {
    return ((TakesScreenshot) WebDriverRunner.getWebDriver()).getScreenshotAs(OutputType.BYTES);


  }
}


