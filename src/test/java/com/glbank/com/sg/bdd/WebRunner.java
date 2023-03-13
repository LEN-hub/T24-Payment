package com.glbank.com.sg.bdd;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features",
        plugin = {"pretty","html:target/cucumber","json:target/json/cucumber.json"},
        tags = "@Health_Check_INB_SIT")
public class WebRunner {

}
