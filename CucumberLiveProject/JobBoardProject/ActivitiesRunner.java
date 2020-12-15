package cucumberTests;


import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)	
@CucumberOptions(	
		 features = "src/test/java/Feature",
    glue = {"stepDefinitions"},	
    //tags = "@activity1"	
    plugin = {"html:test-reports"},
    monochrome = true
	
)

public class ActivitiesRunner {

}
