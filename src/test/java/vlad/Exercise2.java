package vlad;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exercise2 {

	public static void main(String[] args) throws InterruptedException {
		
		String url = "http://demo.guru99.com/test/newtours/";
		
		// Set System Property
		System.setProperty("webdriver.chrome.driver", "/Users/vlad/Documents/SDET/Selenium/selenium/chromedriver");
		
		// Create WebDriver
		WebDriver driver = new ChromeDriver();
		
		// Maximize browser
		driver.manage().window().maximize();
		
		// Navigate to URL
		driver.get(url);
		
		// Click "Register"
		driver.findElement(By.linkText("REGISTER")).click();
		
		// Verify page title
		String title = driver.getTitle();
		System.out.println("Page title is: " + driver.getTitle());
		
		// Enter First Name
		driver.findElement(By.name("firstName")).sendKeys("Vlad");
		
		// Enter Last Name
		driver.findElement(By.name("lastName")).sendKeys("E.");
		
		// Enter Phone Number
		driver.findElement(By.name("phone")).sendKeys("1234567891");
		
		// Enter email
		driver.findElement(By.name("userName")).sendKeys("traininginfo@noorteck.com");
		
		// Enter Address
		driver.findElement(By.name("address1")).sendKeys("1820 Michael Faraday Dr, Suite 20");
		
		// Enter City
		driver.findElement(By.name("city")).sendKeys("Reston");
		
		// Enter State
		driver.findElement(By.name("state")).sendKeys("VA");
		
		// Enter Postal Code
		driver.findElement(By.name("postalCode")).sendKeys("20190");
		
		// Enter Country
	//	Select select = new Select(driver.findElement(By.id("country")));
	//	select.selectByVisibleText("UNITED STATES");
		
		// Enter User Name
		driver.findElement(By.name("email")).sendKeys("User");
		
		// Enter Password
		driver.findElement(By.name("password")).sendKeys("Password");
		
		// Confirm Password
		driver.findElement(By.name("confirmPassword")).sendKeys("Password");
		
		// Click 'Submit' button
		driver.findElement(By.name("submit")).click();
		
        Thread.sleep(5000);
		
		driver.quit();
		
		
		
		
		
		
		

	}

}
