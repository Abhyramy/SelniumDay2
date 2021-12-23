package org.icicibank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IciciBank {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Abhyramy\\Desktop\\ABHY - Java Selenium\\Java\\SeleniumDay2Task\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		driver.manage().window().maximize();

	
	WebElement userName = driver.findElement(By.xpath("//input[@type='text'][1]"));
	userName.sendKeys("04628478495917");
	
//WebElement clickArrow = driver.findElement(By.xpath("//img[@border='0'][2]"));
//clickArrow.click();
		
	}

}
