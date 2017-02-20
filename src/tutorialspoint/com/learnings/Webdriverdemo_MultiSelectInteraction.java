package tutorialspoint.com.learnings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class Webdriverdemo_MultiSelectInteraction {

	public static void main(String[] args) throws InterruptedException {
		
//		System.setProperty("webdriver.gecko.driver", "E:\\Projects\\automation\\Tools\\geckodriver-v0.14.0-win64\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		//known firefox issue: Exception in thread "main" org.openqa.selenium.UnsupportedCommandException: POST /session/   /keys did not match a known command
		
		System.setProperty("webdriver.chrome.driver", "E:\\Projects\\automation\\Tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//launch website and maximize window.
		driver.navigate().to("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
		driver.manage().window().maximize();

		driver.findElement(By.id("ContentHolder_lbSelectionMode_I")).click();
		driver.findElement(By.id("ContentHolder_lbSelectionMode_DDD_L_LBI1T0")).click();
		Thread.sleep(5000);
		
		//perform multiple select
		Actions builder = new Actions(driver);
		WebElement select = driver.findElement(By.id("ContentHolder_lbFeatures_LBT"));
		java.util.List<WebElement> options = select.findElements(By.tagName("td"));
		
		System.out.println(options.size());
		Action multipleSelect = builder.keyDown(Keys.CONTROL).click(options.get(2)).click(options.get(4)).click(options.get(6)).build();
		
		multipleSelect.perform();
				
		//close the browser		
		driver.close();		
	}
}
