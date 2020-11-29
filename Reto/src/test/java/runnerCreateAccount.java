import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/createAccount.feature"
        //, dryRun = false
        //, tags = "@SignInButton"
)
public class runnerCreateAccount {
}
