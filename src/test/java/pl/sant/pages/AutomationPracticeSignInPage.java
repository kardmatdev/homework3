package pl.sant.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.ui.Select;
import pl.sant.util.Tools;

public class AutomationPracticeSignInPage extends PageObject {

    private final String EMAIL = Tools.generateRandomEmail();

    @FindBy(id = "email_create")
    private WebElementFacade emailEnterField;

    @FindBy(css = "#id_gender1")
    private WebElementFacade gender;

    @FindBy(id = "customer_firstname")
    private WebElementFacade customerFirstname;

    @FindBy(id = "customer_lastname")
    private WebElementFacade customerLastname;

    @FindBy(id = "passwd")
    private WebElementFacade customerNewPassword;

    @FindBy(id = "address1")
    private WebElementFacade address1;

    @FindBy(id = "city")
    private WebElementFacade city;

    @FindBy(css = "#id_state")
    private WebElementFacade stateComboBox;

    @FindBy(id = "uniform-id_state")
    private WebElementFacade stateSelector;

    @FindBy(id = "postcode")
    private WebElementFacade postalcode;

    @FindBy(id = "phone_mobile")
    private WebElementFacade mobilePhone;

    @FindBy(id = "submitAccount")
    private WebElementFacade registerAccountButton;

    @FindBy(className = "logout")
    private WebElementFacade signOutLink;

    @FindBy(id = "email")
    private WebElementFacade alreadyRegEmailField;

    @FindBy(id = "passwd")
    private WebElementFacade alreadyRegPassField;

    public boolean isLogoutButtonVisible() {
        return signOutLink.isPresent();
    }

    public void fillRegistrationForm() {
        gender.click();
        customerFirstname.type("TestUser");
        customerLastname.type("TestUserLastName");
        customerNewPassword.type("1234567890");
        address1.type("Street 123");
        city.type("Warsaw");
        stateSelector.click();
        Select stateList = new Select(stateComboBox);
        stateList.selectByIndex(2);
        postalcode.type("33111");
        mobilePhone.type("123654789");
    }

    public void pressRegistrationButton() {
        registerAccountButton.click();
    }

    public void signOutFromAccount() {
        signOutLink.click();
    }

    public void loginAsExistingUser() {
        alreadyRegEmailField.type(EMAIL);
        alreadyRegPassField.typeAndEnter("1234567890");
    }


    public void typeEmailAndPressEnter() {
        emailEnterField.typeAndEnter(EMAIL);
    }


}
