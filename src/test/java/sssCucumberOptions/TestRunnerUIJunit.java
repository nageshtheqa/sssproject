package sssCucumberOptions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features/SeleniumTest.feature",glue="stepDefinations",stepNotifications = true,
tags = "@seleniumtest")
public class TestRunnerUIJunit {

}
