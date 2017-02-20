package tutorialspoint.com.learnings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webdriverdemo_RadioButtonInteraction {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "E:\\Projects\\automation\\Tools\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//puts a implicit wait, will wait for 10 seconds before throwing exception
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//launch website
		driver.navigate().to("http://www.calculator.net/mortgage-payoff-calculator.html");
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//click on the radio button
		driver.findElement(By.id("cpayoff1")).click();
		System.out.println("The output of the IsSelected " + driver.findElement(By.id("cpayoff1")).isSelected());
		System.out.println("The output of the IsEnabled " + driver.findElement(By.id("cpayoff1")).isEnabled());
		System.out.println("The output of the IsDisplayed " + driver.findElement(By.id("cpayoff1")).isDisplayed());
				
		//close the browser
		driver.close();
	
		
		
		
	}
}
