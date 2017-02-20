package com.indeed.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IndeedJobSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//create firefox dirver to driver the browser
		
		//latest version of Selenium WebDriver i.e. Selenium 3.x, this version of webdriver doesn't support direct firefox launch. You have to set the SystemProperty for webdriver.gecko.driver.
		System.setProperty("webdriver.gecko.driver", "E:\\Projects\\automation\\Tools\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
//		System.setProperty("webdriver.chrome.driver", "E:\\Projects\\automation\\Tools\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		
//		System.setProperty("webdriver.ie.driver", "E:\\Projects\\automation\\Tools\\IEDriverServer_x64_2.53.1\\IEDriverServer.exe");
//		WebDriver driver = new InternetExplorerDriver();
//		
		//open indeed home page
		driver.get("http://www.indeed.co.uk");
		//sleep for w while
		Thread.sleep(2000);
		
		//Find what field and enter Selenium
		driver.findElement(By.id("what")).sendKeys("Selenium");
		
		//Find location field and enter London
		driver.findElement(By.id("where")).clear();
		driver.findElement(By.id("where")).sendKeys("London");
				
		//Find FindJobs button and click on it
		driver.findElement(By.id("fj")).click();
		
		//how to deal with alert window, it is still an open question, to fix it later!!!
		//??????????????????
//		if(driver.switchTo().alert() != null)
//		{
//		    Alert alert = driver.switchTo().alert();
//		    String alertText = alert.getText();
//		    alert.dismiss(); // alert.accept();
//
//		}
		
		//pressing Alt + F4 buttons to close the window.????????
//		driver.findElement(By.cssSelector("html body div div img")).sendKeys(Keys.chord(Keys.ALT, Keys.F4));
		
		//clost the window. ??????????
//		driver.findElement(By.id("csclose")).click();
		
		//From job search results page, get page title and jobs count message
//		System.out.println(driver.getTitle());
//		System.out.println(driver.findElement(By.id("searchCount")).getText());
		
		driver.close();

	}

}
