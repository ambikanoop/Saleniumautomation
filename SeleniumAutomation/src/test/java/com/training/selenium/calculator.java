package com.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class calculator {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		LanchBrowser();

	}

static void LanchBrowser() throws InterruptedException   {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://selenium-prd.firebaseapp.com/");
	Thread.sleep(3000);
	WebElement email=driver.findElement(By.id("email_field"));
	email.sendKeys("admin123@gmail.com");
	WebElement password=driver.findElement(By.id("password_field"));
	password.sendKeys("admin123");
Thread.sleep(3000);

WebElement login=driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
login.click();
Thread.sleep(3000);
WebElement calculator=driver.findElement(By.xpath("//a[contains(text(),'Cal')]"));
Actions action=new Actions(driver);
action.moveToElement(calculator).build().perform();
action.click( ).build().perform();
WebElement number2=driver.findElement(By.xpath("//input[@value='2'] "));
number2.click();
WebElement operator=driver.findElement(By.xpath("//input[@value='x'] "));
operator.click();
WebElement number3=driver.findElement(By.xpath("//input[@value='3'] "));
number3.click();
WebElement operator1=driver.findElement(By.xpath("//input[@value='='] "));
operator1.click();
WebElement display=driver.findElement(By.xpath("//input[@id='display'] "));
System.out.println(display.getAttribute("value"));
}
	
	
	
	
}
