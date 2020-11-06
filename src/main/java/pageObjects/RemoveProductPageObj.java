package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RemoveProductPageObj extends Base {
	
	public RemoveProductPageObj () {
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(xpath = "//*[@id=\"cart\"]/button")
	private WebElement item;
	@FindBy(xpath = "//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]/strong")
	private WebElement viewCartButton;
	@FindBy(xpath = "//*[@id=\"content\"]/form/div/table/tbody/tr[1]/td[4]/div/span/button[2]/i" )
	private WebElement removeButton;
	
	public void clickOnItems() {
		item.click();
	}
	public void clickOnViewCartButton() {
		viewCartButton.click();
	}
	public void clickOnRemovedButton() {
		removeButton.click();
	}
	
	


}


