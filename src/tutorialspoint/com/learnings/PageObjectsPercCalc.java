package tutorialspoint.com.learnings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjectsPercCalc {

	private static WebElement element = null;
	
	//math calc link
	public static WebElement lnk_math_calc(WebDriver driver)
	{
		//element = driver.findElement(By.xpath(".//*[@id='menu']/div[3]/a"));
		element = driver.findElement(By.id("sciout"));
		return element;
	}
	
	//percentage calc link
	public static WebElement lnk_percent_calc(WebDriver driver)
	{
		//element = driver.findElement(By.xpath(".//*[@id='menu']/div[4]/div[3]/a"));
		element = driver.findElement(By.linkText("percent"));
		return element;
	}
	
	//number 1 text box
	public static WebElement lnk_txt_num_1(WebDriver driver)
	{
		element = driver.findElement(By.xpath("cpar1"));
		return element;
	}
	
	//number 2 text box
	public static WebElement lnk_txt_num_2(WebDriver driver)
	{
		element = driver.findElement(By.xpath("cpar2"));
		return element;
	}
	
	//calculate button
	public static WebElement bnt_calc(WebDriver driver)
	{
		element = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr/td[2]/input"));
		return element;
	}
			
	//result
	public static WebElement web_result(WebDriver driver)
	{
		element = driver.findElement(By.xpath(".//*[@id='content']/p[2]/span/font/b"));
		return element;
	}
}
