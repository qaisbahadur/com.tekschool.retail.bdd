package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class AddtoCartPageObj extends Base {
	
	public AddtoCartPageObj() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"menu\"]/div[2]/ul/li[1]/a")
	private WebElement desktpMenue;
	@FindBy(xpath="//*[@id=\"menu\"]/div[2]/ul/li[1]/div/div/ul/li[2]/a")
	private WebElement macProduct;
	@FindBy(xpath="//*[@id=\"content\"]/div[2]/div/div/div[2]/div[2]/button[1]/span")
	private WebElement addToCart;
	@FindBy(xpath="//*[@id=\"cart-total\"]")
	private WebElement itemAdded;
	@FindBy(xpath="//*[@id=\"product-category\"]/div[1]")
	private WebElement successMessage;
	
	public void clickOnDesktopMenu() {
		desktpMenue.click();
	}
	public void clickOnMacProduct() {
		macProduct.click();
	}
	public void clickOnAddToCart() {
		addToCart.click();
	}
	public void clickOnItemsAdded() {
		itemAdded.click();
	}
	public void getSuccessMessage() {
		String succcessText = successMessage.getText();
		System.out.println(succcessText);
		
	}

}
