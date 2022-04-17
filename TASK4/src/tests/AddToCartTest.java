package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.AddToCart;

public class AddToCartTest {
	WebDriver driver;
	AddToCart page;
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\88017\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		page=new AddToCart(driver);
	}
	
	@Test
	public void validateAddToCart() {
		Assert.assertTrue(page.validateAddToCart(driver));
	}

}
