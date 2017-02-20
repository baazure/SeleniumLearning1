package tutorialspoint.com.learnings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PercentCaculator {

	private static WebDriver driver = null;
	
	public static void main(String[] args){
		
		System.setProperty("webdriver.gecko.driver", "E:\\Projects\\automation\\Tools\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://www.calculator.net/");
		
		//use page object library now
		PageObjectsPercCalc.lnk_math_calc(driver).click();
		PageObjectsPercCalc.lnk_percent_calc(driver).click();
		
		PageObjectsPercCalc.lnk_txt_num_1(driver).clear();
		PageObjectsPercCalc.lnk_txt_num_1(driver).sendKeys("10");
		
		PageObjectsPercCalc.lnk_txt_num_2(driver).clear();
		PageObjectsPercCalc.lnk_txt_num_2(driver).sendKeys("50");
		
		PageObjectsPercCalc.bnt_calc(driver).click();
		String result = PageObjectsPercCalc.web_result(driver).getText();
		
		if (result.equals("5")) {
			System.out.println("The result is Pass");
		}
		else {
			System.out.println("The result is Fail");
		}
		driver.close();
	}
}
