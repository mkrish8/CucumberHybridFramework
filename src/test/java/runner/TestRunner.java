package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\krish\\eclipse-workspace\\CGP\\src\\test\\resource\\features\\Search.feature",
                 glue= {"stepdefinitions","hooks"},
                 publish=true,
                 plugin={"pretty","html:target/CucumberReports/CucumberReport.html"})
public class TestRunner {
	

}
