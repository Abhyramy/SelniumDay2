package org.redbus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class RedBus {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\Abhyramy\\Desktop\\ABHY - Java Selenium\\Java\\SeleniumDay2Task\\driver\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.redbus.in/ ");
		driver.manage().window().maximize();
		
		WebElement from = driver.findElement(By.id("src"));
		from.sendKeys("Chennai");
		from.click();
		
		WebElement to = driver.findElement(By.id("dest"));
		to.sendKeys("Madurai");
		to.click();
	
		WebElement search = driver.findElement(By.id("search_btn"));
		search.click();
		
	
	}

}
