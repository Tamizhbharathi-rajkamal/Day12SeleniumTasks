/*
 * 
QUESTION 5
-----------
URL : http://www.adactin.com/HotelApp/

NOTE: Enter the username & password and click login button using JavaScript.
 */
package org.jvscript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day12SeleniumQ5 {
	
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:\\Tamizhbharathi\\My_Workspace\\Day12Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.adactin.com/HotelApp/");
		WebElement user = driver.findElement(By.id("username"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].setAttribute('value','Tamzihbharathi')", user);
		
		WebElement pass = driver.findElement(By.id("password"));
		
		js.executeScript("arguments[0].setAttribute('value','1234')", pass);
	}

}
