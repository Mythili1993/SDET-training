package cucumberTest;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/feature",
    glue = {"stepDefinitions"},
  //  tags = "@activity1_1",
   monochrome = true,
   plugin = {"pretty: test-reports"}
)



public class ActivitiesRunner2 {

}
