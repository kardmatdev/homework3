package pl.sant.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class AutomationPracticeHomePage extends PageObject {

    @FindBy(className = "login")
    private WebElementFacade signInLink;


    public void clickOnSignInButton() {
        signInLink.click();
    }



}
