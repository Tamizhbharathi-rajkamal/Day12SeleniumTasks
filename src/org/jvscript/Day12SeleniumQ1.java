/*
 
QUESTION 1
-----------
URL : http://www.greenstechnologys.com/

NOTE: Go to down of the webpage using scrolldown and print the line "greens over all reviws".
 */

package org.jvscript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day12SeleniumQ1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Tamizhbharathi\\My_Workspace\\Day12Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		
		Thread.sleep(2000);
		
		WebElement reviews = driver.findElement(By.xpath("//h2[text() = 'Greens Technologys Overall Reviews']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)", reviews);
		
		//Object obj = js.executeScript("return arguments[0].getAttribute('value')", reviews);
		
		System.out.println(reviews.getText());
		System.out.println("cloning check");
		System.out.println("Tamizhbharathi Selenium Day12 Task1");
		
	}

}
