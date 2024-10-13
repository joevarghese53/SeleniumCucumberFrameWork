package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderConfirmationPage extends BasePage {

    @FindBy(xpath = "//button[@name=\"back-to-products\"]")
    WebElement backHomeBtn;

    public void clickBackHome(){
        backHomeBtn.click();
    }
}
