package pages;

import controllers.BaseMethod;
import org.openqa.selenium.support.PageFactory;
import pages.objectRepository.LandingPageObjects;
import pages.objectRepository.SignInPageObjects;


public class PageFactoryInitializer extends BaseMethod {
    public SignInPageObjects signInPage() {
        return PageFactory.initElements(getWebDriver(), SignInPageObjects.class);
    }

    public LandingPageObjects landingPage() {
        return PageFactory.initElements(getWebDriver(), LandingPageObjects.class);
    }
}