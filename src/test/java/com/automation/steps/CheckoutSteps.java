package com.automation.steps;

import com.automation.pages.CheckoutPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutSteps {

    CheckoutPage checkoutPage = new CheckoutPage();

    @Then("verify total price displayed")
    public void verifyTotalPriceDisplayed() {
        checkoutPage.checkTotal();
    }

    @When("click on finish button")
    public void clickOnFinishButton() {
        checkoutPage.clickFinish();
    }
}
