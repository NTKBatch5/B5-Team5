package giancarlo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise3 {
	
	
	public static void main(String[] args) {
	//1. Launch chrome browser
		String url = "https://www.amazon.com/";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gianc\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	//2. Navigate to https://www.amazon.com/
		
		driver.get(url);
		
	//3. Verify the page title is “Amazon.com: Online Shopping for Electronics, Apparel,
	//Computers, Books, DVDs & more”
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Correct page title");
		} else {
			System.out.println("Wrong page title");
		}
		
	//4. Enter is “Head First Java, 2nd Edition”
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Head First Java, 2nd Edition");
		
	//5. Click Search button
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
	//6. Click one of the books that has book name “Head First Java, 2nd Edition”
		
		driver.findElement(By.linkText("Head First Java, 2nd Edition")).click();
		
	//7. Click Add to Cart button
		
		driver.findElement(By.id("add-to-cart-button-ubb")).click();
		
	//8. Verify the page title is “Amazon.com Shopping Cart”
		
		actualTitle = driver.getTitle();
		expectedTitle = "Amazon.com Shopping Cart";
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Correct page title");
		} else {
			System.out.println("Wrong page title");
		}
		
	//9. Click Proceed to checkout button
		
		driver.findElement(By.id("a-autoid-0")).click();
		
	//10. Verify you are in Amazon Sign-In page
				
		actualTitle = driver.getTitle();
		expectedTitle = "Amazon Sign-In";
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Correct page title");
		} else {
			System.out.println("Wrong page title");
		}
		
	//11. Enter invalid email in sign-in text field
		
		driver.findElement(By.id("ap_email")).sendKeys("augsdkjahsd");
		driver.findElement(By.id("continue")).click();
		
	//12. Get the error text message and check if the error message contains “There was a
	//problem” text
		
		String textMessage = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[1]/div/div/div/h4")).getText();
		String expectedMessage = "There was a problem";
		
	//a. If TRUE, then print “The testcase passed.”
		
		if(textMessage.equals(expectedMessage)) {
		System.out.println("The testcase passed.");	
		}
		
	//b. Otherwise “The testcase failed.”
		else {
			System.out.println("The testcase failed.");
		}
		
	//13. Close the browser
		
		driver.quit();
	}
}
