package tutorialspoint.com.learnings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Webdriverdemo_FindAllLinks {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\Projects\\automation\\Tools\\geckodriver-v0.14.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
//		System.setProperty("webdriver.chrome.driver", "E:\\Projects\\automation\\Tools\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
						
		//launch website.
		driver.navigate().to("http://www.calculator.net/");

		java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Number of Links in the Page is " + links.size());
		
		//size is not the same as index, be more careful here, otherwise there will be outofbunds exception here.
		for (int i=0; i<links.size(); i++){
			System.out.println("Name of Link# " + (i+1) + links.get(i).getText());		
		}
						
		//close the browser		
		driver.close();		
	}
}
