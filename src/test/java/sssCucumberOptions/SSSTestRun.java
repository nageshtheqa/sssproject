package sssCucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features/SSSRegistration.feature",glue="stepDefinations",tags ="@sanity",stepNotifications = true)
public class SSSTestRun {

}
