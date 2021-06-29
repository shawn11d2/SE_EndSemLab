package candidate;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)                                        //foldername
@CucumberOptions(features="src/test/resources/Feature", glue= {"candidate"},
plugin= {"pretty","html:target/htmlReports/htmlReports.html"}
		)

public class runner {

}
