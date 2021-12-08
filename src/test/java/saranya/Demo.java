package saranya;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

//HW EXERCISE------>1 FILL OUT THE FORM AND SUBMIT
	
public static void main(String[] args) throws InterruptedException {
		
		String url = "https://demoqa.com/text-box";
		
		//Step 1:Set the system property
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chand\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");
		
		//Step 2: Create the web driver object
		WebDriver driver = new ChromeDriver();
		
		//Step 3: Maximize the browser
		driver.manage().window().maximize();
		
		//Step 4: Navigate to URL
		driver.get(url);
		
		//Step 5:Enter Full Name, Email, address
	    driver.findElement(By.id("userName")).sendKeys("Saranya Chandran");
		driver.findElement(By.id("userEmail")).sendKeys("sara1chand@yahoo.com");
		driver.findElement(By.id("currentAddress")).sendKeys("1550 cattail Ct, Manassas, VA, 20120");
		driver.findElement(By.id("permanentAddress")).sendKeys("2230 Bull run, Centreville, VA, 20120");
		
		//Step 6: Click Submit button
		
		//driver.findElement(By.id("submit")).click();
		driver.findElement(By.id("submit")).sendKeys("submit" + Keys.ENTER);
		
		
		
		//Step 7: wait 7 second
		Thread.sleep(7000);
		
		//Step 8: Close the browser
		driver.quit();
		
}
	
}	
	
	
 

