package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\88017\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");
		driver.findElement(By.id("email")).sendKeys("userzebel@abc.com");
		driver.findElement(By.id("passwd")).sendKeys("bambambam123");
		driver.findElement(By.id("SubmitLogin")).click();
		
		

	}

}
