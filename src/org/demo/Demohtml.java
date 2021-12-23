package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demohtml {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Abhyramy\\Desktop\\ABHY - Java Selenium\\Java\\SeleniumDay2Task\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
	
	WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	firstName.sendKeys("Abhyramy");
	
	WebElement lastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	lastName.sendKeys("Baskaran");
	
	WebElement address = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
	address.sendKeys("Baby Nagar, Velachery");
	
	WebElement email = driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
	email.sendKeys("abhykaran007@gmail.com");
	
	WebElement phone = driver.findElement(By.xpath("//input[@ng-model='Phone']"));
	phone.sendKeys("7871911339");
	
	WebElement gender = driver.findElement(By.xpath("//input[@value='FeMale']"));
	gender.click();
	
	WebElement hobby = driver.findElement(By.id("checkbox2"));
	hobby.click();
	
	WebElement pass = driver.findElement(By.id("firstpassword"));
	pass.sendKeys("123456");
	
	WebElement pass2 = driver.findElement(By.id("secondpassword"));
	pass2.sendKeys("123456");
	
	}
}
