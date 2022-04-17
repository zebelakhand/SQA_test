package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class RegistrationPage {
	
	@FindBy(xpath="//*[@id=\"email_create\"]")
	WebElement emailId;
	
	@FindBy(xpath="//*[@id=\"SubmitCreate\"]/span")
	WebElement btnCreateAccount;
	
	public RegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	public boolean validateRegistrationPage(String title, WebDriver driver) {
		emailId.sendKeys("userzebel@abc.com");
		btnCreateAccount.click();
		String currentTitle = driver.getTitle();
		if(currentTitle.equals(title)) {
			return true;
		}
		return false;
		
	}

}
