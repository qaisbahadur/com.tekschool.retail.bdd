package stepDefinitions;

import core.Base;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.RemoveProductPageObj;
import utilities.WebDriverUtility;

public class RemoveItemStepDefinition extends Base {
	RemoveProductPageObj rPPObj = new RemoveProductPageObj();

@When("^User click on Shopping cart menu$")
public void user_click_on_Shopping_cart_menu() throws Throwable {
	rPPObj.clickOnItems();
	WebDriverUtility.wait(5000);
	
	WebDriverUtility.screenShot();
}

@When("^User see list of item is displayed$")
public void user_see_list_of_item_is_displayed() throws Throwable {
	rPPObj.clickOnViewCartButton();
}

@Then("^User click on Red X button$")
public void user_click_on_Red_X_button() throws Throwable {
    rPPObj.clickOnRemovedButton();
    WebDriverUtility.wait(3000);
    
    WebDriverUtility.screenShot();
    
}



}
