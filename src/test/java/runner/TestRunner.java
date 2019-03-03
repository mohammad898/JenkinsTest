package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(features = {"/Users/Paru/Desktop/API/JenkinTest/features/login.feature"} ,
        plugin = {"pretty","json:reporting/cucumber.json","html:reporting/cucumber-pretty","junit:reporting/junit_xml/cucumber.xml"},
        glue = "Steps",
        strict = false,
        monochrome = true,
        tags = {"@Fun"},  //@SmokeTest, @FunctionalTest, @DocString
        dryRun =false)
public class TestRunner {





}
