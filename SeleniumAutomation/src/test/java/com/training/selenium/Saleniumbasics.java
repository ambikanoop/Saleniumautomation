package com.training.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.WebDriverHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Saleniumbasics {
public static void main(String[] args) throws InterruptedException {
	//launch the browser-chrome browser
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium-prd.firebaseapp.com/home.html");
	Thread.sleep(5000);
	//8 Identifier to locate the element
	//find the element
WebElement email=driver.findElement(By.id("email_field"));
	//perform action
email.sendKeys("admin123@gmail.com");

WebElement password =driver.findElement(By.id("password_field"));
password.sendKeys("admin123");
//WebElement login =driver.findElement(By.xpath("//button[contains(text(),'login to account')]"));
//login.click();
WebElement loginbutton =driver.findElement(By.tagName("button"));
loginbutton.click();
Thread.sleep(5000);
driver.close();
}}