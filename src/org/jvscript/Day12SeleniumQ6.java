/*
 * QUESTION 6
-----------
URL : https://www.flipkart.com/
NOTE: Enter the email & password and click login button using JavaScript.
 */
package org.jvscript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day12SeleniumQ6 {
	
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:\\Tamizhbharathi\\My_Workspace\\Day12Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		WebElement user = driver.findElement(By.xpath("//input[@class = '_2zrpKA _1dBPDZ']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].setAttribute('value','Tamzihbharathi')", user);
		
		Thread.sleep(2000);
		WebElement pass = driver.findElement(By.xpath("//input[@type = 'password']"));
		
		js.executeScript("arguments[0].setAttribute('value','1234')", pass);

}
}