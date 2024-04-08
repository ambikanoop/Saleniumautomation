package com.training.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class testweb {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
WebElement email	=driver.findElement(By.id("user-name"));
	email.sendKeys("standard_user");
	WebElement password=driver.findElement(By.name("password"));
	password.sendKeys("secret_sauce");
	WebElement loginbotton=driver.findElement(By.name("login-button"));
	loginbotton.click();

}}
