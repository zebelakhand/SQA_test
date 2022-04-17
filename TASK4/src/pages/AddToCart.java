package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import selenium.SeleniumImplementation;

public class AddToCart {
	@FindBy(xpath="//*[@id=\"homefeatured\"]/li[2]/div/div[1]/div/a[1]/img")
    WebElement itemImage;
	@FindBy(xpath="//*[@id=\"homefeatured\"]/li[2]/div/div[2]/div[2]/a[1]/span")
	WebElement btnAddToCart;
	@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span")
	WebElement btnContinueShopping;
	@FindBy(xpath="//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")
	WebElement cartText;
	
	SeleniumImplementation selenium;
	public AddToCart(WebDriver driver) {
		PageFactory.initElements(driver,  this);
		selenium=new SeleniumImplementation();
		
	}
	
	public boolean validateAddToCart(WebDriver driver) {
		selenium.performMouseHower(itemImage, driver);
		selenium.click(btnAddToCart);
		selenium.click(btnContinueShopping);
		selenium.refresh(driver);
		return selenium.validateText(driver, cartText,"1");
		
		
	
	}
}
