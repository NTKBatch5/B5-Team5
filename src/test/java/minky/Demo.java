package minky;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) throws InterruptedException {

		//
		String url = "https://demoqa.com/text-box";

		// set the system property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mink0\\Desktop\\Selenium\\chromedriver.exe");

		// create WebDriver object

		WebDriver driver = new ChromeDriver();

		// maximize the browser

		driver.manage().window().maximize();

		// navigate to demoqa

		driver.get(url);

		// enter name in the full name field

		driver.findElement(By.id("userName")).sendKeys("John Cena");
		Thread.sleep(3000);
		// enter email in the email field
		driver.findElement(By.id("userEmail")).sendKeys("Donotemail@gmail.com");
		Thread.sleep(3000);
		// enter address in the 1st current address field

		driver.findElement(By.id("currentAddress")).sendKeys("1234 ABC St, Mclean VA 22102");
		Thread.sleep(3000);
		// enter different address in the 2nd current address field

		driver.findElement(By.id("permanentAddress")).sendKeys("456 Sesame Street, Mclean VA 22101");
		Thread.sleep(3000);
		// Click submit

		driver.findElement(By.id("submit")).click();

		Thread.sleep(3000);

		driver.quit();

	}

}

