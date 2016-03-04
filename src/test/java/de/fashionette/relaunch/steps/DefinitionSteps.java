package de.fashionette.relaunch.steps;

import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import de.fashionette.relaunch.steps.serenity.SmokeTestSteps;

public class DefinitionSteps {

    @Steps
    SmokeTestSteps smokeTestSteps;

    @Given("the user is on the product view page for configurable product")
    public void givenTheUserIsOnTheConfigurableProductPage() {
        smokeTestSteps.openConfigurableProductPage();
    }

    @Given("the user is on the product view page for simple product")
    public void givenTheUserIsOnTheSimpleProductPage() {
        smokeTestSteps.openSimpleProductPage();
    }

    @When("the user selects size for Product (.*)")
    public void whenTheUserSelectSizeOfProduct(String size) {
       smokeTestSteps.selectSize(size);
    }

    @When("the user is adding product to the cart")
    public void whenTheUserAddConfigurableProductToTheCart() {
        smokeTestSteps.addProductToTheCart();
    }

    @When("the user remove product from the cart and get name of last product")
    public void whenTheUserRemoveProductFromTheCart() {
        smokeTestSteps.removeProductsFromCartAndSaveNameOfLastProduct();
    }

    @When("the user restore last removed product in the cart")
    public void whenTheUserRestoreLastRemovedProduct() {
        smokeTestSteps.restoreLastProductInShoppingCart();
    }

    @Then("the last removed product is restored in the shopping cart")
    public void thenLastProductIsRestoredInCart() {
        smokeTestSteps.checkCorrectProductIsRestored();
    }

    }


