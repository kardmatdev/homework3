package pl.sant.steps.cucumber.buyingWithoutAuthorizationSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pl.sant.pages.AutomationPracticeCategoryPage;
import pl.sant.pages.AutomationPracticeHomePage;
import pl.sant.pages.AutomationPracticeOrderPage;

public class BuyingWithoutAuthorizationSteps {

    AutomationPracticeHomePage automationPracticeHomePage;
    AutomationPracticeCategoryPage automationPracticeCategoryPage;
    AutomationPracticeOrderPage automationPracticeOrderPage;

    @Given("^Użytkownik otwiera strone domowa serwisu$")
    public void uzytkownikOtwieraStroneDomowaSerwisu() {
        automationPracticeHomePage.open();
    }


    @When("Użytkownik przechodzi do kategorii WOMEN")
    public void uzytkownikPrzechodziDoKategoriiWOMEN() {
        automationPracticeCategoryPage.open();
    }

    @And("Użytkownik dodaje wszystkie produkty widoczne na stronie")
    public void uzytkownikDodajeWszystkieProduktyWidoczneNaStronie() {
        automationPracticeCategoryPage.chooseAllProductsAndAddToCart();
    }

    @And("Użytkownik przejdzie do koszyka")
    public void uzytkownikPrzejdzieDoKoszyka() {
        automationPracticeOrderPage.open();
    }

    @And("Użytkownik kliknie przejdź do kasy")
    public void uzytkownikKlikniePrzejdzDoKasy() {
        automationPracticeOrderPage.clickProceedToCheckoutButton();
    }

    @Then("Pojawi się okno wymagające zalogowania")
    public void pojawiSieOknoWymagajaceZalogowania() {
        Assert.assertTrue(automationPracticeOrderPage.isAuthDescriptionDisplayed());
    }
}
