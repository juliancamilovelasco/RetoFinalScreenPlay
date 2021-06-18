package com.practice.automationtesting.automation.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/java/features/buybook.feature",
        glue = "com.practice.automationtesting.automation.stepdefinitions",
        snippets = SnippetType.CAMELCASE,
        tags = "@1")

public class PracticeRunner {
}
