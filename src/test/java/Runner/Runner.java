package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = "html:target/cucumber",
            features ="src/test/resources/features", // "src\\test\\resources\\features", src/test/resources/features
            glue = "StepDef",
           // monochrome = true,
            dryRun = true,
           tags = {"@amazon"}

    )
    public class Runner {

}
