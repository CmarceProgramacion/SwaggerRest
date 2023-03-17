package com.swagger.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/create_users.feature",
        tags = "@All",
        glue = "com.swagger.definitions",
        plugin = {"pretty"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class ConsultUsersRunner {
}
