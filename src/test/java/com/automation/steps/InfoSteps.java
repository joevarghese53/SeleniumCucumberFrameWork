package com.automation.steps;

import com.automation.pages.InfoPage;
import io.cucumber.java.en.When;

public class InfoSteps {

    InfoPage infoPage = new InfoPage();

    @When("user fills info")
    public void userFillsInfo() {
        infoPage.fillInfo();
    }

    @When("go to Checkout")
    public void goToCheckout() {
        infoPage.goToCheckout();
    }
}
