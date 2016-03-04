package de.fashionette.relaunch.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by roshchupkina on 3/4/2016.
 */
public class ShoppingBagPage extends BasePage{

    @FindBy(xpath="//*[@itemprop='name']")
    WebElementFacade itemName;

    @FindBy(xpath="//*[contains(text(), 'zuletz')]")
    WebElementFacade restoreLastProductLink;

    private String removeLink = "//*[contains(text(), 'entfernen')]";


    public String removeAllProductsFromCartAndSaveLastProductName(){
        List<WebElement> productsRemove = getDriver().findElements(By.xpath(removeLink));
        String productName="";
        for(WebElement productRemove: productsRemove){
            productName = itemName.getText();
                productRemove.click();
        }
        return productName;
    }

    public void removeAllProductsFromCart(){
        List<WebElement> productsRemove = getDriver().findElements(By.xpath(removeLink));
        for(WebElement productRemove: productsRemove){
            productRemove.click();
        }
    }

    public String restoreProduct(){
        restoreLastProductLink.click();
        String restoredProductName=itemName.getText();
        return restoredProductName;
    }

    public boolean checkCorrectProductRestored(){
        if(removeAllProductsFromCartAndSaveLastProductName().equals(restoreProduct())) {
            return true;
        }
        return false;
    }
}
