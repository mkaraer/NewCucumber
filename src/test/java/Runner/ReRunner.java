package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features ="@target/rerun.txt", // "src\\test\\resources\\features", src/test/resources/features
        plugin ={ "html:target/cucumber","json:target/cucumber.json"},
        glue = "StepDef"
        // monochrome = true,
//test2


)
public class ReRunner {
}
