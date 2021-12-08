package giancarlo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exercise2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		//url var
		String url = "http://demo.guru99.com/test/newtours/";
		
		//set system property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gianc\\Desktop\\Selenium\\chromedriver.exe");
		
		//create obj
		WebDriver driver = new ChromeDriver();
		
		//open chrome
		driver.get(url);
		
		//maximize window
		driver.manage().window().maximize();
		
		//wait 
		Thread.sleep(1000);
		
		//click register
		driver.findElement(By.linkText("REGISTER")).click();;
		
		//verify page title
		String actualTitle = driver.getTitle();
		String expectedTitle = "Register: Mercury Tours";
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Title verified");
		} else {
			System.out.println("Wrong page title");
		}
				
		//fill form
		driver.findElement(By.name("firstName")).sendKeys("Giancarlo");
		driver.findElement(By.name("lastName")).sendKeys("Mena");
		driver.findElement(By.name("phone")).sendKeys("7873680546");
		driver.findElement(By.id("userName")).sendKeys("gmena730@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("RR1 Box 11961");
		driver.findElement(By.name("city")).sendKeys("city");
		driver.findElement(By.name("state")).sendKeys("PR");
		driver.findElement(By.name("postalCode")).sendKeys("00674");
		
		//select dropdown
		Select dropdown = new Select(driver.findElement(By.name("country")));
		dropdown.selectByValue("PUERTO RICO");
		
		//keep filling form
		driver.findElement(By.id("email")).sendKeys("gmena730");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.name("confirmPassword")).sendKeys("123456");
		driver.findElement(By.name("submit")).click();
		
		/*
		//check confirmation message
		String actualMessage = driver.findElement(By.xpath(
				"/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font")).getText();
		String expectedMessage = "Thank you for registering. You may now sign-in using the user name and password you've just entered.";
		
		if(actualMessage.equals(expectedMessage)) {
			System.out.println("The testcase passed");
		} else {
			System.out.println("The testcase failed");
		}
		*/
		
		//wait
		Thread.sleep(1000);
		
		//quit
		driver.quit();
	}
}
