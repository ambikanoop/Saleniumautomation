package com.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day4salenium {
	 static WebDriver driver;

public static void main(String[] args) throws InterruptedException {
		LanchApplication();
		SwithToTab() ;
		//HomeTab ();
		Alert();
	}
static void LanchApplication() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	driver.get("https://selenium-prd.firebaseapp.com/");
	WebElement email=driver.findElement(By.id("email_field"));
	Thread.sleep(4000);
	email.sendKeys("admin123@gmail.com");
	WebElement password=driver.findElement(By.id("password_field"));
	password.sendKeys("admin123");
	Thread.sleep(3000);
	
	WebElement login=driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
	login.click();
	Thread.sleep(3000);
	WebElement home=driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
	home.click();}
	
static void SwithToTab() throws InterruptedException {
	Thread.sleep(3000);
	
		WebElement switchto=driver.findElement(By.xpath("//button[contains(text(), 'Switch To')]"));
	Actions action=new Actions(driver);
	//action.click(switchto);
	action.moveToElement(switchto).build().perform();
	}
static void Alert() throws InterruptedException {
	Thread.sleep(3000);
	WebElement alert=driver.findElement(By.xpath("//a[contains(text(),'Alert')]"));
	Actions action=new Actions(driver);
	action.moveToElement(alert).build().perform();
}
}