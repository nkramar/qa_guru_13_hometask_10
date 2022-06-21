import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

public class SimpleSelenideTest extends BaseTest {
  @DisplayName("Simple Selenide test")
  @Test
  public void testGithubIssueSearch() {

    open("https://github.com");

    $(".header-search-input").click();
    $(".header-search-input").sendKeys(REPOSITORY);
    $(".header-search-input").submit();

    $(linkText(REPOSITORY)).click();
    $(partialLinkText("Issues")).click();
    $(withText("#" + ISSUE_NUMBER)).should(Condition.exist);

  }
}
