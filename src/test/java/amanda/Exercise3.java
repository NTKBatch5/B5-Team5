package amanda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise3 {
	public static void main(String[] args) throws InterruptedException {

		String url = "https://www.amazon.com/";

		// set system property
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\agg72\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");

		// create webdriver object
		WebDriver driver = new ChromeDriver();
		
		// maximize window
		driver.manage().window().maximize();

		// get url
		driver.get(url);


		// verify the page title
		String actualTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		String expectedTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";

		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Title Verified");
		} else {
			System.out.println("Title not verified");
		}

		// enter in search bar "head first java, 2nd edition"
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("head first java, 2nd edition");

		// click search button
		driver.findElement(By.id("nav-search-submit-button")).click();

		// click one of the books that has book name "head first java, 2nd edition"
		driver.findElement(By.linkText("Head First Java, 2nd Edition")).click();

		// click add to cart button
		driver.findElement(By.id("add-to-cart-button")).click();

		// verify the page title is "Amazon.com shopping cart"
		String actualPTShoppingCart = driver.getTitle();
		String expectedPTShoppingCart = " Amazon.com Shopping cart";

		if (actualPTShoppingCart.equals(expectedPTShoppingCart)) {
			System.out.println("Verified Page title for Amazon shopping cart");
		} else {
			System.out.println("Not Verified Page title for Amazon shopping cart");
		}
		
		//click on go to cart
		driver.findElement(By.id("nav-cart")).click();

		// click proceed to check out button
		driver.findElement(By.name("proceedToRetailCheckout")).click();

		// verify you are in the amazon sign in page
		String actualSignIn = driver.getTitle();
		String expectedSignIn = "Amazon Sign-In";

		if (actualSignIn.equals(expectedSignIn)) {
			System.out.println("Verified sign in page");
		} else {
			System.out.println("Sign in not verified");
		}

		// enter invalid email in sign in text field
		driver.findElement(By.id("ap_email")).sendKeys("alsknf@gmail.com");
		
		//click continue
		driver.findElement(By.id("continue")).click();
		

		// get the error text message and check if the error message contains "there was
		// a problem" text
		// a. if TRUE, then print the testcase has passed
		// b. otherwise "the testcase failed"

		String actualResult = driver.findElement(By.xpath("//*[@id=\"auth-error-message-box\"]/div/h4")).getText();
		String expectedResult = "There was a problem";

		if (expectedResult.contains(actualResult)) {
			System.out.println("testcase has passed");
		} else {
			System.out.println("the testcase failed");

		}

		// Wait 3 seconds
		Thread.sleep(3000);

		// close browser
		driver.quit();

	}

}
