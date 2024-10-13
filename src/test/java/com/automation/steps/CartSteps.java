package com.automation.steps;

import com.automation.pages.CartPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;

public class CartSteps {

    CartPage cartPage = new CartPage();

    @Then("verify no of items in cart is correct")
    public void verifyNoOfItemsInCartIsCorrect() {
        cartPage.verifyCartQty();
    }

    @When("go to Info page")
    public void goToInfoPage() {
        cartPage.goToInfoPage();
    }

}
