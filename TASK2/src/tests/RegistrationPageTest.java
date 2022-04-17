package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.RegistrationPage;

public class RegistrationPageTest {
	
	WebDriver driver;
	RegistrationPage page;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\88017\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().window().maximize();
	    page = new RegistrationPage(driver);
		
	}
	
	@Test
	public void validateRegistrationPage() {
		
		String title="Login - My Store";
		
		boolean res = page.validateRegistrationPage(title,driver);
		
		Assert.assertTrue(res);
	}
	
	

}
