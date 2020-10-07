package pl.sant.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import java.util.List;

@DefaultUrl(("http://automationpractice.com/index.php?id_category=3&controller=category"))
public class AutomationPracticeCategoryPage extends PageObject {

    @FindBy(xpath = "//*[@class=\"product_list grid row\"]/li")
    private List<WebElementFacade> listOfAllWomanProducts;

    @FindBy(xpath = "//*[@title='Add to cart'][@data-id-product='1']")
    private WebElementFacade cartButton;

    @FindBy(xpath = "//span[@class='cross'][@title='Close window']")
    private WebElementFacade closeWindowButton;

    public void chooseAllProductsAndAddToCart() {
        int numOfElements = listOfAllWomanProducts.size();
        for (int i=0; i < numOfElements; i++) {
            withAction().moveToElement(listOfAllWomanProducts.get(i)).build().perform();
            String xpathSelector = "//*[@title='Add to cart'][@data-id-product='" + String.valueOf(i+1) + "']";
            getDriver().findElement(By.xpath(xpathSelector)).click();
            withAction().moveToElement(closeWindowButton).clickAndHold().perform();
            closeWindowButton.click();
        }
    }

}
