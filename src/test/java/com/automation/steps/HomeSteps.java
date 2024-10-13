package com.automation.steps;

import com.automation.pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeSteps {

    HomePage homePage = new HomePage();

    @When("sort items z to a")
    public void sort_items_z_to_a() {
        homePage.sortItemsZtoA();
    }

    @Then("verify items are sorted z to a")
    public void verify_items_are_sorted_z_to_a() {
        homePage.verifySortedItemsZtoA();
    }

    @When("sort items high to low")
    public void sortItemsHighToLow() {
        homePage.sortItemsHtoL();
    }

    @Then("verify items are sorted high to low")
    public void verifyItemsAreSortedHighToLow() {
        homePage.verifySortedItemsHtoL();
    }

    @When("user add all items to cart")
    public void userAddAllItemsToCart() {
        homePage.addAllItemsToCart();
    }

    @Then("verify cart icon qty is correct")
    public void verifyCartIconQtyIsCorrect() {
        homePage.verifyCartQty();
    }

    @When("go to cart page")
    public void goToCartPage() {
        homePage.goToCart();
    }

    @Then("verify remove item button is not displayed")
    public void verifyRemoveItemButtonIsNotDisplayed() {
        homePage.checkRemoveBtnNotDisplayed();
    }

}
