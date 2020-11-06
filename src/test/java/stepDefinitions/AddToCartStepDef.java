package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.AddtoCartPageObj;
import utilities.WebDriverUtility;

public class AddToCartStepDef {
	
	AddtoCartPageObj addCartPObj = new AddtoCartPageObj();
	
	@When("^User clicks on a Prduct Menu Item$")
	public void user_clicks_on_a_Prduct_Menu_Item() throws Throwable {
	    addCartPObj.clickOnDesktopMenu();
	}

	@When("^User clicks on a Product$")
	public void user_clicks_on_a_Product() throws Throwable {
	    addCartPObj.clickOnMacProduct();
	}

	@When("^User clicks on Add to Cart$")
	public void user_clicks_on_Add_to_Cart() throws Throwable {
	   addCartPObj.clickOnAddToCart();
	}

	@When("^Item is added to Cart$")
	public void item_is_added_to_Cart() throws Throwable {
	   addCartPObj.clickOnItemsAdded();
	   WebDriverUtility.screenShot();
	}

	@Then("^User sees a message ‘Success 'You have added iMac to your shopping cart!'$")
	public void user_sees_a_message_Success_You_have_added_iMac_to_your_shopping_cart() throws Throwable {
	   addCartPObj.getSuccessMessage();
	   WebDriverUtility.wait(5000);
	   WebDriverUtility.screenShot();
	}


}
