package tutorialspoint.com.learnings;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class Webdriverdemo_DragDropInteraction {

	public static void main(String[] args) throws InterruptedException {
		
//		System.setProperty("webdriver.gecko.driver", "E:\\Projects\\automation\\Tools\\geckodriver-v0.11.1-win64\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();

		System.setProperty("webdriver.chrome.driver", "E:\\Projects\\automation\\Tools\\chromedriver_win32\\chromedriver.exe");
//		PropertyConfigurator.configure(System.getProperty("user.dir") + "\\src\\resources\\log4j.properties");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//launch website and maximize window.
		driver.navigate().to("http://keenthemes.com/preview/metronic/theme/admin_1/ui_tree.html");
		driver.manage().window().maximize();
				
		
		//Scroll to a right screen with both elements.
		WebElement Head = driver.findElement(By.className("caption"));
			// now execute query which actually will scroll until that element is not appeared on page.
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Head);
		
		//From To drag & drop.
		WebElement From = driver.findElement(By.xpath(".//*[@id='j3_7']/a"));
		WebElement To = driver.findElement(By.xpath(".//*[@id='j3_1']/a"));
		
		Actions builder = new Actions(driver);
		Action dragAndDrop = builder.clickAndHold(From).moveToElement(To).release(To).build();
		
//		//Scroll to a right screen with both elements.
//		WebElement Head = driver.findElement(By.className("caption"));
//			// now execute query which actually will scroll until that element is not appeared on page.
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Head);
		//builder.moveToElement(Head);  === difference with above executeScript???
		//builder.click();
		dragAndDrop.perform();
		System.out.println("The drag and drop interaction is closing.");
		//close the browser		
		driver.close();
		
	}
}
