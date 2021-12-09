package vlad;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise1 {

	public static void main(String[] args) throws InterruptedException {

		String url = "http://demoqa.com/text-box";

		// Set System property
		System.setProperty("webdriver.chrome.driver", "/Users/vlad/Documents/SDET/Selenium/selenium/chromedriver");

		// Create WebDriver object
		WebDriver driver = new ChromeDriver();

		// Maximize the browser
		driver.manage().window().maximize();

		// Navigate to URL
		driver.get(url);

		// Enter name in the full name field
		driver.findElement(By.id("userName")).sendKeys("Tom Jerry");

		// Enter email in the email field
		driver.findElement(By.id("userEmail")).sendKeys("tomjerry@example.com");

		// Enter address in the 1st Current Address field
		driver.findElement(By.id("currentAddress"))
				.sendKeys("1820 Michael Faraday Dr, Suite 20 \n" + "Reston, VA 20190");

		// Enter different address in the 2nd Current Address field
		driver.findElement(By.id("permanentAddress")).sendKeys("245 N Beverly Dr. \n" + "Beverly Hills, CA 90210");

		// Click submit
		driver.findElement(By.id("submit")).sendKeys("submit" + Keys.ENTER);

		Thread.sleep(5000);

		driver.quit();

	}

}
