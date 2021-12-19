package amanda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exercise2 {
	
	public static void main(String[] args) throws InterruptedException {

		String url = "http://demo.guru99.com/test/newtours/";

		// set system property
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\agg72\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");

		// create webdriver object
		WebDriver driver = new ChromeDriver();

		// maximize window
		driver.manage().window().maximize();

		// get url
		driver.get(url);

		// click register
		driver.findElement(By.linkText("REGISTER")).click();

		// verify the page title is "Register: mercury tours"

		String actualTitle = driver.getTitle();
		String expectedTitle = "Register: Mercury Tours";

		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Verified");
		} else {
			System.out.println("not verified");
		}

		// enter first name
		driver.findElement(By.name("firstName")).sendKeys("Amanda");

		// enter last name
		driver.findElement(By.name("lastName")).sendKeys("Flo");

		// enter phone number
		driver.findElement(By.name("phone")).sendKeys("703-354-4206");

		// enter email
		driver.findElement(By.id("userName")).sendKeys("Amanda@outlook.com");

		// enter address
		driver.findElement(By.name("address1")).sendKeys("123 mulberry st");

		// enter city
		driver.findElement(By.name("city")).sendKeys("WB");

		// enter state
		driver.findElement(By.name("state")).sendKeys("VA");

		// enter zipcode
		driver.findElement(By.name("postalCode")).sendKeys("221931");
		
		//Enter country
		WebElement countryDropdown = driver.findElement(By.name("country"));
		Thread.sleep(2000);
		
		//create a select object
		Select countrySelect = new Select(countryDropdown);
		
		countrySelect.selectByValue("EL SALVADOR");
				

		// enter username
		driver.findElement(By.id("email")).sendKeys("Amanda@outlook.com");

		// enter password
		driver.findElement(By.name("password")).sendKeys("123456");

		// enter password in confirm password field
		driver.findElement(By.name("confirmPassword")).sendKeys("123456");

		// click submit button
		driver.findElement(By.name("submit")).click();

		// get the confirmation text message and check if the confirmation text message
		// contains" Thank you for registering" phrase
		// if it does then print "the testcase has passed" otherwise " the testcase
		// failed"

		String actualMessage = driver.findElement(By.xpath(
				"/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font")).getText();
		String expectedMessage = "Thank you for registering.";

		if (actualMessage.contains(expectedMessage)) {
			System.out.println("the testcase has passed");
		} else {
			System.out.println("the testcase failed");
		}

		// wait 5 seconds
		Thread.sleep(5000);

		// close browser
		driver.quit();

	}

}
