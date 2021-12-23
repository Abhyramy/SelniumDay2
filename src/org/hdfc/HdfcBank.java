package org.hdfc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcBank {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Abhyramy\\Desktop\\ABHY - Java Selenium\\Java\\SeleniumDay2Task\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/");
		driver.manage().window().maximize();

		WebElement hdfc = driver.findElement(By.name("fldLoginUserId"));
		hdfc.sendKeys("0123456789");
		
		
	}

}
