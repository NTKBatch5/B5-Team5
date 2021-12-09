package minky;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExTwo {
	
	public static void main(String[] args) throws InterruptedException {
		
		String url="http://demo.guru99.com/test/newtours/";
		
		//set the system property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mink0\\Desktop\\Selenium\\chromedriver.exe");
	
		//create webdriver object
		WebDriver driver=new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//navigate to mercury tours
		driver.get(url);
		
		//Click Register
		driver.findElement(By.linkText("REGISTER")).click();
		
		//Verify the page title is "Register:Mercury Tours"
		
		String actualTitle=driver.getTitle();
		String expectedTitle="Register: Mercury Tours";
		
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("title verified");
		}else {
			System.out.println("title not verified");
		}
	    //enter the first name
		driver.findElement(By.name("firstName")).sendKeys("John");
		Thread.sleep(3000);
		
		//enter the last name
		driver. findElement(By.name("lastName")).sendKeys("Cena");
		Thread.sleep(3000);
		
		//enter the phone
		driver.findElement(By.name("phone")).sendKeys("703-123-4567");
		Thread.sleep(3000);
		
		//enter email
		driver.findElement(By.name("userName")).sendKeys("donotemail@yahoo.com");
		Thread.sleep(3000);
		
		//enter address
		driver.findElement(By.name("address1")).sendKeys("2051 International Drive");
		Thread.sleep(3000);
		
		//enter city
        driver.findElement(By.name("city")).sendKeys("Mclean");
        Thread.sleep(3000);
		
        //enter state
        driver.findElement(By.name("state")).sendKeys("VA");
        Thread.sleep(3000);
        
        //enter postal code
        driver.findElement(By.name("postalCode")).sendKeys("22102");
        Thread.sleep(3000);
        
        //select Country
        WebElement countryDropdown=driver.findElement(By.name("country"));
        Select countrySelect=new Select(countryDropdown);
        countrySelect.selectByValue("KOREA, REPUBLIC OF");
        Thread.sleep(3000);
        
		//enter username
		driver.findElement(By.name("email")).sendKeys("donotemail@yahoo.com");
		Thread.sleep(3000);
		
		//enter password
		driver.findElement(By.name("password")).sendKeys("123Abc");
		Thread.sleep(3000);
		
		//confirm password
		driver.findElement(By.name("confirmPassword")).sendKeys("123Abc");
		Thread.sleep(3000);
		
		//click submit
		driver.findElement(By.name("submit")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		//Get the confirmation text message
		
		String actualConfirText = driver.findElement(
				By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font")).getText();
		
		String expectedConfirText = "Thank you for registering";

		if (actualConfirText.contains(expectedConfirText)) {

			System.out.println("The test case passed");
		} else {
			System.out.println("The test case failed");
		}
		
		driver.quit();
		
	}

}
