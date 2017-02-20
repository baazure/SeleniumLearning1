package tutorialspoint.com.learnings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Webdriverdemo_DropdownInteraction {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "E:\\Projects\\automation\\Tools\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//launch website and maximize window.
		driver.navigate().to("http://www.calculator.net/interest-calculator.html");
		driver.manage().window().maximize();
		
		//select an item from the drop list box.
		Select dropdown = new Select(driver.findElement(By.id("ccompound")));
		dropdown.selectByVisibleText("continuously");
		
		System.out.println("The output of the IsSelected " + driver.findElement(By.id("ccompound")).isSelected());
		System.out.println("The output of the IsEnabled " + driver.findElement(By.id("ccompound")).isEnabled());
		System.out.println("The output of the IsDisplayed " + driver.findElement(By.id("ccompound")).isDisplayed());
		
		//close the browser		
		driver.close();
		
		
		
	}
}
