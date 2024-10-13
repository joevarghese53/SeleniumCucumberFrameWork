package com.automation.steps;

import com.automation.pages.OrderConfirmationPage;
import io.cucumber.java.en.When;

public class OrderConfirmationSteps {

    OrderConfirmationPage orderConfirmationPage = new OrderConfirmationPage();

    @When("click on back home button")
    public void clickOnBackHomeButton() {
        orderConfirmationPage.clickBackHome();
    }
}
