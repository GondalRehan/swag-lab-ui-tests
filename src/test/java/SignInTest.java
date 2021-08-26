import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.PageFactoryInitializer;

public class SignInTest extends PageFactoryInitializer {
    @Test(dataProvider = "credentialData")
    public void verifyLogin(String username, String password) throws Exception {
        signInPage().signIn(username, password)
                .verifyContainerName();

    }

    @DataProvider public Object[ ][ ] credentialData()
    {
        return new Object[ ][ ] {
                {"standard_user","secret_sauce"},
                {"locked_out_user","secret_sauce"},
                {"problem_user", "secret_sauce"},
                {"performance_glitch_user", "secret_sauce"}
        };
    }
}

