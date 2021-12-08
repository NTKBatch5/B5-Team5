package amanda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise1 {
		
		public static void main(String[] args) throws InterruptedException {
			
			String url = "https://demoqa.com/text-box";
			
			//set system property
			System.setProperty("webdriver.chrome.driver","C:\\Users\\agg72\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");
			
			// create webdriver object 
			WebDriver driver = new ChromeDriver();
			
			//Maximize window
			driver.manage().window().maximize();
			
			// get driver
			driver.get(url);
			
			// enter full name in full name field
			driver.findElement(By.id("userName")).sendKeys("Amanda Florea");
			
			//enter email in email field
			driver.findElement(By.id("userEmail")).sendKeys("agg725@gmail.com");
			
			// enter address in the 1st current address field
			driver.findElement(By.id("currentAddress")).sendKeys("123 kings street");
			
			//enter different address in 2nd address field
			driver.findElement(By.id("permanentAddress")).sendKeys("456 queen street");
			
			// click submit
			driver.findElement(By.id("submit")).click();
			
			// wait 5 seconds
			Thread.sleep(5000);
			
			
			//close browser
			driver.quit();
			
		}

	}


