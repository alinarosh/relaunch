package de.fashionette.relaunch.pages;

import ch.lambdaj.function.convert.Converter;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.WebElementFacade;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static ch.lambdaj.Lambda.convert;

@DefaultUrl("https://frontend.dev.fashionette.de/")
public class BasePage extends PageObject {

    @FindBy(xpath="//a[contains(@href, 'home')]")
    private WebElementFacade homePage;

    @FindBy(partialLinkText="amarena")
    private WebElementFacade configurableProduct;

    @FindBy(partialLinkText="Mawi")
    private WebElementFacade simpleProduct;


    public void openConfigurableProduct(){
        configurableProduct.click();
    }

    public void openSimpleProduct(){
        simpleProduct.click();
    }

    public void isElementPresent(WebElement element){
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}