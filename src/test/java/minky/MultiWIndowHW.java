package minky;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWIndowHW {
	
	public static void main(String[] args) throws InterruptedException {
		String url = "http://demo.automationtesting.in/Windows.html";

		// set the system property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mink0\\Desktop\\Selenium\\chromedriver.exe");

		// create webdriver object
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// maximize the browser
		driver.manage().window().maximize();

		driver.get(url);

		// verify the page title is"Frames & windows"

		String actualTitle = driver.getTitle();
		String expectedTitle = "Frames & windows";

		if (actualTitle.equals(expectedTitle)) {
			System.out.println("we are in correct page.");
		} else {
			System.out.println("we are in wrong page, but I will continue with my automation");
		}

		// get the id of current window
		String parentWindow = driver.getWindowHandle();

		System.out.println("Parent Window: " + parentWindow);

		// click open seperate multiple windows
		driver.findElement(By.linkText("Open Seperate Multiple Windows")).click();

		// click button
		driver.findElement(By.xpath("//button[@onclick='multiwindow()']")).click();

		// click open new tabbed windows button
		driver.findElement(By.xpath("//a[@class='analystic']")).click();

		// click button
		driver.findElement(By.xpath("//button[@onclick='multiwindow()']")).click();

		// getWindowHandles() will return all the ids of opened windows
		Set<String> allWindows = driver.getWindowHandles();

		for (String window : allWindows) {

			System.out.println(window);

			driver.switchTo().window(window);

			// get the title and store in the string object

			String pgTitle = driver.getTitle();

			Thread.sleep(2000);

			if (pgTitle.equals("Index")) {

				System.out.println("We are in index pge");
			} else {
				System.out.println(" We are not in index page");
			}

		}

		Thread.sleep(5000);
		driver.quit();
	}

}
