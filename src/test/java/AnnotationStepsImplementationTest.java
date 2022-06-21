import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class AnnotationStepsImplementationTest extends BaseTest {

  @Test
  @DisplayName("Test with annotation @Step usage")
  public void annotatedStepsTest() {
    AnnotationStepsDescription annotationSteps = new AnnotationStepsDescription();

    annotationSteps.openMainPage();
    annotationSteps.searchRepository(REPOSITORY);
    annotationSteps.openRepositoryLink(REPOSITORY);
    annotationSteps.openIssueTab();
    annotationSteps.checkIssueNumber(ISSUE_NUMBER);
    takeScreenshot();
  }
}
