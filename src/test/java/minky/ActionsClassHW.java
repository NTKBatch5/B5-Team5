package minky;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassHW {
	
	WebDriver driver;
	String url = "http://demo.guru99.com/test/simple_context_menu.html";

	public static void main(String[] args) throws InterruptedException {

		ActionsClassHW obj = new ActionsClassHW();

		obj.setUp();
		obj.caseOne();
		obj.caseTwo();
		obj.caseThree();
		obj.caseFour();
		obj.tearDown();

	}

	public void caseOne() throws InterruptedException {

		driver.get(url);

		// create object of actions class

		Actions actions = new Actions(driver);

		// create object of right click me button WebElement

		WebElement rcmeButton = driver.findElement(By.xpath("//span[text()='right click me']"));

		// perform right click me
		actions.contextClick(rcmeButton).build().perform();

		driver.findElement(By.xpath("//span[text()='Copy']")).click();

		Alert alert = driver.switchTo().alert();

		System.out.println(alert.getText());

		// click ok

		alert.accept();

	}

	public void caseTwo() {

		driver.get(url);

		Actions actions = new Actions(driver);

		WebElement dbClickButton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));

		actions.doubleClick(dbClickButton).build().perform();

		Alert alert = driver.switchTo().alert();

		System.out.println(alert.getText());

		alert.accept();

	}

	public void caseThree() throws InterruptedException {

		url = "http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html";

		driver.get(url);

		Actions actions = new Actions(driver);

		// inspect all the elements
		WebElement b1 = driver.findElement(By.cssSelector("#box1"));
		WebElement b2 = driver.findElement(By.cssSelector("#box2"));
		WebElement b3 = driver.findElement(By.cssSelector("#box3"));
		WebElement b4 = driver.findElement(By.cssSelector("#box4"));
		WebElement b5 = driver.findElement(By.cssSelector("#box5"));
		WebElement b6 = driver.findElement(By.cssSelector("#box6"));
		WebElement b7 = driver.findElement(By.cssSelector("#box7"));

		WebElement target = driver.findElement(By.xpath("//div[@id='box101']"));
		WebElement target2 = driver.findElement(By.xpath("//div[@id='box102']"));
		WebElement target3 = driver.findElement(By.xpath("//div[@id='box103']"));
		WebElement target4 = driver.findElement(By.xpath("//div[@id='box104']"));
		WebElement target5 = driver.findElement(By.xpath("//div[@id='box105']"));
		WebElement target6 = driver.findElement(By.xpath("//div[@id='box106']"));
		WebElement target7 = driver.findElement(By.xpath("//div[@id='box107']"));

		actions.clickAndHold(b1).moveToElement(target).release().build().perform();
		Thread.sleep(1000);

		actions.clickAndHold(b2).moveToElement(target2).release().build().perform();
		Thread.sleep(1000);

		actions.clickAndHold(b3).moveToElement(target3).release().build().perform();
		Thread.sleep(1000);

		actions.clickAndHold(b4).moveToElement(target4).release().build().perform();
		Thread.sleep(1000);

		actions.clickAndHold(b5).moveToElement(target5).release().build().perform();
		Thread.sleep(1000);

		actions.clickAndHold(b6).moveToElement(target6).release().build().perform();
		Thread.sleep(1000);

		actions.clickAndHold(b7).moveToElement(target7).release().build().perform();
		Thread.sleep(1000);

		System.out.println("Matched!!!");

	}

	public void caseFour() throws InterruptedException {

		url = "https://opensource-demo.orangehrmlive.com/";

		driver.get(url);

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		Thread.sleep(2000);

		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		Thread.sleep(2000);

		driver.findElement(By.id("btnLogin")).click();

		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']"));
		Thread.sleep(2000);

	}

	public void tearDown() throws InterruptedException {

		Thread.sleep(5000);
		driver.quit();

	}

	public void setUp() {
		// system set property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mink0\\Desktop\\Selenium\\chromedriver.exe");

		// driver object
		driver = new ChromeDriver();
		// maximize
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

}
