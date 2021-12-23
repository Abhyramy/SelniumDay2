package org.hotel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HotelApp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Abhyramy\\Desktop\\ABHY - Java Selenium\\Java\\SeleniumDay2Task\\driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("http://adactinhotelapp.com/");
	driver.manage().window().maximize();
	
	WebElement user = driver.findElement(By.id("username"));
	user.sendKeys("abhyramyb@gmail.com");
	
	WebElement pass = driver.findElement(By.name("password"));
	pass.sendKeys("12345678");
	
	
	
	
	
	}

}
