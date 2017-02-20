package tutorialspoint.com.learnings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webdriverdemo_CheckBoxInteraction {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "E:\\Projects\\automation\\Tools\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//put an  implicit wait for 10 seconds before throwing exception
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//launch website
		driver.navigate().to("http://www.calculator.net/mortgage-calculator.html");
		driver.manage().window().maximize();
		
		//click on the checkbox
		driver.findElement(By.id("caddoptional")).click();
		
		System.out.println("The output of the IsSelected " + driver.findElement(By.id("caddoptional")).isSelected());
		System.out.println("The output of the IsEnabled " + driver.findElement(By.id("caddoptional")).isEnabled());
		System.out.println("The output of the IsDisplayed " + driver.findElement(By.id("caddoptional")).isDisplayed());
		
		//close the browser		
		driver.close();
		//driver.quit();  //[Child 6436] ###!!! ABORT: Aborting on channel error.: file c:/builds/moz2_slave/m-rel-w32-00000000000000000000/build/src/ipc/glue/MessageChannel.cpp, line 2056

		
	}
	
}
