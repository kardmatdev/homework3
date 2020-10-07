package pl.sant.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://automationpractice.com/index.php?controller=order")
public class AutomationPracticeOrderPage extends PageObject {

    @FindBy(css = "#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium > span")
    private WebElementFacade proceedToCheckoutButton;

    @FindBy(xpath = "//*[@class='page-heading'][text()='Authentication']")
    private WebElementFacade authDescription;

    public boolean isAuthDescriptionDisplayed() {
        return authDescription.isDisplayed();
    }

    public void clickProceedToCheckoutButton() {
        proceedToCheckoutButton.click();
    }
}

