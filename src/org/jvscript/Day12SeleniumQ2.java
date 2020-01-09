/*
 * QUESTION 2
-----------
URL : http://toolsqa.com/

NOTE: Go to down of the webpage using scrolldown and again go to top of webpage using scrollup.
 */
package org.jvscript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day12SeleniumQ2 {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:\\Tamizhbharathi\\My_Workspace\\Day12Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/");
	
		
		//Thread.sleep(2000);
		WebElement down = driver.findElement(By.xpath("//a[@rel ='noopener noreferrer'][@target = '_blank'][@href = 'https://www.toolsqa.com/selenium-training/?q=Footer']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)", down);
		
		//Thread.sleep(2000);
		
		WebElement up = driver.findElement(By.xpath("//h4[text() = 'Q&A Forum']"));
		
		js.executeScript("arguments[0].scrollIntoView(false)", up);
		
	}

}
