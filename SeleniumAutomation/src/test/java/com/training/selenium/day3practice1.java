package com.training.selenium;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class day3practice1 {
	static WebDriver driver;
public static void main(String[] args) throws InterruptedException  {
		
		applicationLunch();
		homeTab();
		 SwitchtoTab();
		// Alert();
		 windowTab();
	}
	static void applicationLunch() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
		driver.get("https://selenium-prd.firebaseapp.com/");
		Thread.sleep(3000);
		WebElement email	=driver.findElement(By.id("email_field"));
		email.sendKeys("admin123@gmail.com");
		WebElement password=driver.findElement(By.id("password_field"));
		password.sendKeys("admin123");
	Thread.sleep(3000);
	
WebElement login=driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
login.click();
Thread.sleep(3000);

	}
	 static void homeTab() throws InterruptedException {
		
		 Thread.sleep(3000);
		 WebElement home=driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
		 home.click();
		
	 }
 static void SwitchtoTab()   {
		
	 WebElement switchto =driver.findElement(By.xpath("//button[contains(text(),'Switch To')]"));
	 Actions action=new Actions(driver);
	 action.moveToElement(switchto).build().perform();
}
 static void Alert() throws InterruptedException {
		Thread.sleep(3000);
		WebElement alert=driver.findElement(By.xpath("//a[contains(text(),'Alert')]"));
		alert.click();
		//Actions action=new Actions(driver);
		//action.moveToElement(alert).build().perform();
		WebElement windowalert=driver.findElement(By.xpath("//button[contains(text(),'Window Alert')]"));
		windowalert.click();
	String 	alertText=	driver.switchTo().alert().getText();
	System.out.println( alertText);
	driver.switchTo().alert().accept();
	WebElement promtalert=driver.findElement(By.xpath("//button[contains(text(),'Promt Alert')]"));
	promtalert.click();
	//driver.switchTo().alert().dismiss();
	driver.switchTo().alert().sendKeys("aa");
	driver.switchTo().alert().accept();
	WebElement windows=driver.findElement(By.xpath("//a[contains(text(),'Windows')]"));
	windows.click();
}static void windowTab() throws InterruptedException {
	WebElement windows=driver.findElement(By.xpath("//a[contains(text(),'Windows')]"));
	windows.click();
String parentwindow	=driver.getWindowHandle();
System.out.println(parentwindow);
//Set s=driver.getWindowHandles();
driver.findElement(By.xpath("//button[contains(text(),'Tab')]")).click();

for(String handle:driver.getWindowHandles()) {
	System.out.println(handle);
	driver.switchTo().window(handle);
}
Thread.sleep(3000);
System.out.println(driver.getTitle());
driver.findElement(By.name("q")).sendKeys("selenium");
driver.switchTo().window(parentwindow);
System.out.println(driver.getTitle());
}
 }