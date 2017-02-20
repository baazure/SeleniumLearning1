package tutorialspoint.com.learnings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webdriverdemo_TextboxInteraction {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "E:\\Projects\\automation\\Tools\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//puts a implicit wait, will wait for 10 seconds before throwing exception
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//launch website
		driver.navigate().to("http://www.calculator.net/percent-calculator.html");
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//enter value 10 in the first number of the percent calculator
		driver.findElement(By.id("cpar1")).sendKeys("10");
		//driver.findElement(By.linkText("about-us")).click(); === try the elements are not in the current displayed screen.
		Thread.sleep(5000);
		
		//get the text box from the application
		String result = driver.findElement(By.id("cpar1")).getAttribute("value");
		
		//print a log in message to the screen
		System.out.println("The result is " + result);
		
		//close the browser
		driver.close();
	
		
		
		
	}
}
