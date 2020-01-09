/*
 * QUESTION 4
-----------
URL : https://www.facebook.com/

NOTE: Enter the email & password and click login button using JavaScript.
 */

package org.jvscript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day12SeleniumQ4 {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:\\Tamizhbharathi\\My_Workspace\\Day12Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.xpath("//input[@type = 'email']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].setAttribute('value','Tamzihbharathi')", email);
		
		WebElement pass = driver.findElement(By.name("pass"));
		
		js.executeScript("arguments[0].setAttribute('value','1234')", pass);
		
	}

}
