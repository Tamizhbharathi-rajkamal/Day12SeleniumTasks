/*
 * 
QUESTION 3
-----------
URL : http://www.greenstechnologys.com/selenium-course-content.html

NOTE: Go to down of webpage using scrolldown and highlight the line "Best Selenium training center in OMR" with Red color.
 */
package org.jvscript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day12SeleniumQ3 {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:\\Tamizhbharathi\\My_Workspace\\Day12Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		WebElement down = driver.findElement(By.xpath("//h2[text() = 'Best Selenium training center in OMR']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)", down);
		js.executeScript("arguments[0].setAttribute('style', 'background: red;');", down);
	
	}

}
