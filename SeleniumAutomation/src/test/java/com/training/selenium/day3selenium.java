package com.training.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day3selenium {
static Actions action;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium-prd.firebaseapp.com/");
		Thread.sleep(3000);
		WebElement email=driver.findElement(By.id("email_field"));
		email.sendKeys("admin123@gmail.com");
		
		WebElement password=driver.findElement(By.id("password_field"));
		password.sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		Thread.sleep(3000);
	WebElement intractions=driver.findElement(By.xpath("//button[contains(text(),'Intractions')]"));
		 action=new Actions(driver);
		action.moveToElement(intractions).build().perform();
		Thread.sleep(2000);
	WebElement doubleclick=	driver.findElement(By.xpath("//a[contains(text(),'Double')]"));
	 action=new Actions(driver);
	 action.doubleClick(doubleclick).build().perform();
	 
		WebElement btdoubleclick=driver.findElement(By.xpath("//button[contains(text(),'Double Click')]"));
		
		action=new Actions(driver);
		action.moveToElement(btdoubleclick).build().perform();
		//driver.quit();
driver.findElement(By.xpath("//a[contains(text(),'Tool Tip')]")).click();
		
		WebElement Right = driver.findElement(By.className("tooltipr"));
		action = new Actions(driver);
		action.moveToElement(Right).build().perform();
		
		WebElement righttooltip = driver.findElement(By.className("tooltiptextr"));
		
		String actualText = righttooltip.getText();
		String ExpectedToolTip = "Right";
		System.out.println(actualText);
	}
		
}

