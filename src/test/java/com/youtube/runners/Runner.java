package com.youtube.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "C:\\Users\\Andres\\IdeaProjects\\Youtube\\src\\test\\resources\\features",
        glue = "com.youtube.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class Runner {
}
