package vlad;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exercise2 {

	public static void main(String[] args) throws InterruptedException {

		String url = "http://demo.guru99.com/test/newtours/";

		String expectedTitle = "Register: Mercury Tours";
		
		String expectedConfirText = "Thank you for registering.";

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
		String actualTitle = driver.getTitle();
		
		System.out.println("EXP: " + expectedTitle);
		System.out.println("ACT: " + actualTitle);

		if (actualTitle.equals(expectedTitle)) {

			System.out.println("TITLE VERIFICATION PASSED");

		} else {

			System.out.println("TITLE VERIFICATION FAILED");

		}

		

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
		WebElement countryDropdown = driver.findElement(By.name("country"));
		
		Select countrySelect = new Select(countryDropdown);
		
		countrySelect.selectByVisibleText("MOLDOVA");
		Thread.sleep(2000);
		
		// Enter User Name
		driver.findElement(By.name("email")).sendKeys("User");

		// Enter Password
		driver.findElement(By.name("password")).sendKeys("Password");

		// Confirm Password
		driver.findElement(By.name("confirmPassword")).sendKeys("Password");

		// Click 'Submit' button
		driver.findElement(By.name("submit")).click();
		
		String actualConfirText = driver.findElement(
				By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font")).getText();

		System.out.println("EXP: " + expectedConfirText);
		System.out.println("ACT: " + actualConfirText);

		if (actualConfirText.contains(expectedConfirText)) {

			System.out.println("Test Case PASSED");

		} else {

			System.out.println("Text Case FAILED");

		}

		Thread.sleep(5000);

		driver.quit();

	}

}
