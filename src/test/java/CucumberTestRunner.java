import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/features/TestPackage.feature"
)

public class CucumberTestRunner extends AbstractTestNGCucumberTests {}
