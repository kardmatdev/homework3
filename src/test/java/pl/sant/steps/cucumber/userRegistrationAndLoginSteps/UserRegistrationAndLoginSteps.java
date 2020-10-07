package pl.sant.steps.cucumber.userRegistrationAndLoginSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import pl.sant.pages.AutomationPracticeHomePage;
import pl.sant.pages.AutomationPracticeMyAccountPage;
import pl.sant.pages.AutomationPracticeSignInPage;

public class UserRegistrationAndLoginSteps {

    AutomationPracticeHomePage automationPracticeHomePage;

    @Steps(shared = true)
    AutomationPracticeSignInPage automationPracticeSignInPage;

    AutomationPracticeMyAccountPage automationPracticeMyAccountPage;


    @Given("^Użytkownik otwiera strone domowa serwisu$")
    public void uzytkownikOtwieraStroneDomowaSerwisu() {
        automationPracticeHomePage.open();
    }

    @When("Uzytkownik nacisnie przycisk Sign In")
    public void uzytkownikNacisniePrzyciskSignIn() {
        automationPracticeHomePage.clickOnSignInButton();
    }

    @And("Uzytkownik wprowadzi adres e-mail i nacisnie przycisk Create an account")
    public void uzytkownikWprowadziAdresEMailINacisniePrzyciskCreateAnAccount() {
        automationPracticeSignInPage.typeEmailAndPressEnter();
    }

    @And("Uzytkownik wypelni wszystkie wymagane pola i nacisnie przycisk Register")
    public void uzytkownikWypelniWszystkieWymaganePolaINacisniePrzyciskRegister() {
        automationPracticeSignInPage.fillRegistrationForm();
        automationPracticeSignInPage.pressRegistrationButton();
    }

    @Then("Uzytkownik zostanie zarejestrowany i przeniesiony do widoku MyAccount")
    public void uzytkownikZostanieZarejestrowanyIPrzeniesionyDoWidokuMyAccount() {
        Assert.assertEquals("My account - My Store", automationPracticeMyAccountPage.getTitle());
        Assert.assertTrue(automationPracticeSignInPage.isLogoutButtonVisible());
    }

    @Given("Użytkownik znajduje się na stronie domowej serwisu")
    public void uzytkownikZnajdujeSieNaStronieDomowejSerwisu() {
        automationPracticeHomePage.open();
    }

    @When("Użytkownik naciska na przycisk Sign In")
    public void uzytkownikNaciskaNaPrzyciskSignIn() {
        automationPracticeHomePage.clickOnSignInButton();
    }

    @And("Użytkownik wprowadzi login i hasło i naciśnie przycisk Sign In")
    public void uzytkownikWprowadziLoginIHasloINacisniePrzyciskSignIn() {
        automationPracticeSignInPage.loginAsExistingUser();
    }

    @Then("Uzytkownik zostanie zalogowany i zostanie przeniesiony do widoku MyAccount")
    public void uzytkownikZostanieZalogowanyIZostaniePrzeniesionyDoWidokuMyAccount() {
        Assert.assertEquals("My account - My Store", automationPracticeMyAccountPage.getTitle());
        Assert.assertTrue(automationPracticeSignInPage.isLogoutButtonVisible());
    }
}
