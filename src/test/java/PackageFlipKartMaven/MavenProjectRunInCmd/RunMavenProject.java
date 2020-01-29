package PackageFlipKartMaven.MavenProjectRunInCmd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RunMavenProject {
	WebDriver driver;
	String path = "https://www.flipkart.com/";
	String login = "9878749578";
	String password = "1234567890";

	@BeforeTest
	public void launchBowser() {
		driver = new ChromeDriver();
		driver.get(path);
		driver.manage().window().maximize();
	}

	@Test
	public void loginDetails() {
		driver.findElement(By.xpath("//*[@class='_2zrpKA _1dBPDZ']")).sendKeys(login);
		driver.findElement(By.xpath("//*[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys(password);
		driver.findElement(By.xpath("//*[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
	}

	@Test(enabled = false)
	public void choosePhone() throws InterruptedException {
		Actions act = new Actions(driver);
		WebElement elm = driver.findElement(By.xpath("//*[@class='_1QZ6fC _3Lgyp8']"));
		act.moveToElement(elm).perform();
		WebElement elm1 = driver.findElement(By.xpath("//*[@class='_1KCOnI _3ZgIXy']"));
		act.moveToElement(elm1).perform();
		
	}

	@AfterTest
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}
}
