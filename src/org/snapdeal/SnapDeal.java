package org.snapdeal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhyramy\\Desktop\\ABHY - Java Selenium\\Java\\SeleniumDay2Task\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/login");
		driver.manage().window().maximize();
		
		WebElement user = driver.findElement(By.id("userName"));
		user.sendKeys("7871911339");
		
//		WebElement conti = driver.findElement(By.xpath("//button[text()='continue']"));
//		conti.click();
		
		
		
	}

}
