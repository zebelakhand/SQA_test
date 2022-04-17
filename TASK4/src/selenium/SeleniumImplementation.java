package selenium;


import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumImplementation {

	org.openqa.selenium.interactions.Actions action;
	
	public void performMouseHower(WebElement element, WebDriver driver) {
		action= new Actions(driver); 
		action.moveToElement(element).build().perform();
	}
	
	public void click(WebElement element) {
		element.click();
	}
	
	public void clear(WebElement element) {
		element.clear();
	}
	
	public void setText(String text, WebElement element) {
		element.sendKeys(text);
	}
	
	
	public void clickUsingJavaScriptExecutor(WebElement element, WebDriver driver) {
		JavascriptExecutor executor= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
	}
	
	public void refresh(WebDriver driver) {
		driver.navigate().refresh();
	}
	
	public boolean validateText(WebDriver driver, WebElement element, String expectedText) {
		String observedText=element.getText();
		if(observedText.equals(expectedText)) {
			return true;
		}
		return false;
	}
}
