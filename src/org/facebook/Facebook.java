package org.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Abhyramy\\Desktop\\ABHY - Java Selenium\\Java\\SeleniumDay2Task\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();   

		driver.get("https://www.facebook.com/");    //launch url

		driver.manage().window().maximize();		//max webpage

		// To find the locator of the username field
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("abhyramyb@gmail.com"); // To pass the value for username

		// To find the locator for Password field
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("Abhy@1810");
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();   //To click
		

	}

}
