package pages.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static controllers.WebDriverFactory.getWebDriver;

public class LandingPageObjects {

    @FindBy(id="react-burger-menu-btn")
    private WebElement openMenu;
    //All pages titles are same. So ignore this
    public LandingPageObjects verifyPageTitle() throws Exception
    {
        Assert.assertEquals(getWebDriver().getTitle(), "Swag Labs");
        return this;
    }

    public LandingPageObjects verifyContainerName() throws Exception{
        Assert.assertTrue(openMenu.isDisplayed());
        return this;
    }
}
