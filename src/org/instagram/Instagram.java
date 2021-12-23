package org.instagram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Abhyramy\\Desktop\\ABHY - Java Selenium\\Java\\SeleniumDay2Task\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en) login page ");
		driver.manage().window().maximize();

		WebElement user = driver.findElement(By.name("username"));
		user.sendKeys("7871911339");
//	
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("Abhy@1810");

//	

	}

}
