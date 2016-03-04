package de.fashionette.relaunch.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by roshchupkina on 3/3/2016.
 */
public class ProductViewPage extends BasePage {

    @FindBy(css=".product-details__description__brand")
    private WebElementFacade productBrand;

    @FindBy(css=".product-details__description__brand")
    private WebElementFacade productTitle;

    @FindBy(css=".dropdown__title")
    private WebElementFacade sizeBox;

    private String sizeBoxValue="//*[@class='dropdown__options']//*[contains(text(), '$1')]";

    @FindBy(css =".logo-logo")
    private WebElementFacade addToCartBtn;

    public void selectSize(String size){
        sizeBox.click();
        $(sizeBoxValue.replace("$1", size)).click();
    }

    public void addProductToTheCart(){
       isElementPresent(addToCartBtn);
        addToCartBtn.click();
    }


}
