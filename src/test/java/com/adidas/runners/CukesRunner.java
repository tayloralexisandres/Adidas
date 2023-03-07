package com.adidas.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {

                "json:target/cucumber.json",
                "pretty",
                "html:target/reports.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"},
        features = "src/test/resources/features",
        glue = "com/adidas/step_definitions",
        dryRun = false,
        tags = "@tay",
        monochrome = false,
        publish = true


)


public class CukesRunner {
}


