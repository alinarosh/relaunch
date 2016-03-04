package de.fashionette.relaunch.steps.serenity;

import de.fashionette.relaunch.pages.BasePage;
import de.fashionette.relaunch.pages.ProductViewPage;
import de.fashionette.relaunch.pages.ShoppingBagPage;
import junit.framework.Assert;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

public class SmokeTestSteps extends ScenarioSteps {

    BasePage basePage;
    ProductViewPage productViewPage;
    ShoppingBagPage shoppingBagPage;

    @Step
    public void openConfigurableProductPage(){
        basePage.open();
        productViewPage.openConfigurableProduct();
    }

    public void openSimpleProductPage(){
        basePage.open();
        productViewPage.openSimpleProduct();
    }

    @Step
    public void selectSize(String size){productViewPage.selectSize(size);}

    @Step
    public void addProductToTheCart(){productViewPage.addProductToTheCart();}

    @Step
    public void removeProductsFromCartAndSaveNameOfLastProduct(){shoppingBagPage.removeAllProductsFromCartAndSaveLastProductName();}

    @Step
    public void restoreLastProductInShoppingCart(){shoppingBagPage.restoreProduct();}

    @Step
    public void checkCorrectProductIsRestored(){
        Assert.assertTrue(shoppingBagPage.checkCorrectProductRestored());}

}