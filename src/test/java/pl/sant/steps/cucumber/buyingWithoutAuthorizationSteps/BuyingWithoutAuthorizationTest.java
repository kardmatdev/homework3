package pl.sant.steps.cucumber.buyingWithoutAuthorizationSteps;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/buy_products_while_not_authorized.feature",
        plugin = {"pretty",
                "html:target/Reports/HTML_report",
                "json:target/Reports/JSON/cucumber.json",
                "junit:target/Reports/XMLJunit/cucumber.xml"},
        monochrome = true)
public class BuyingWithoutAuthorizationTest {
}
