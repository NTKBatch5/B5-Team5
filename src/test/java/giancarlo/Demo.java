package giancarlo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//exercise 1
public class Demo {
	
	//create main method
	public static void main(String[] args) throws InterruptedException {
		
	//create url var
	String url = "https://demoqa.com/text-box";
	
	//set system properties
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\gianc\\Desktop\\Selenium\\chromedriver.exe");
	
	//create driver obj
	WebDriver driver = new ChromeDriver();
	
	//open chrome
	driver.get(url);
	
	//maximize browser
	driver.manage().window().maximize();
	
	//enter keys in full name field
	driver.findElement(By.id("userName")).sendKeys("Giancarlo Mena");
	
	//enter keys in email field
	driver.findElement(By.id("userEmail")).sendKeys("gmena730@gmail.com");
	
	//enter keys in 1st address field
	driver.findElement(By.id("currentAddress")).sendKeys("RR1 Box 11961, Manatí, PR - 00674");
	
	//enter keys in 2nd address field
	driver.findElement(By.id("permanentAddress")).sendKeys("Same as current address");
	
	//wait
	Thread.sleep(3000);
	
	//click submit
	driver.findElement(By.id("submit")).click();
	
	//close
	driver.quit();
	
	}
 
}
