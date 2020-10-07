package pl.sant.steps.cucumber.userRegistrationAndLoginSteps;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/user_registration_and_login.feature",
        plugin = {"pretty",
                "html:target/Reports/HTML_report",
                "json:target/Reports/JSON/cucumber.json",
                "junit:target/Reports/XMLJunit/cucumber.xml"},
        monochrome = true)
public class UserRegistrationAndLoginTest {
}
