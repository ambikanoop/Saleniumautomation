package com.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day4aselenium {

	static  WebDriver driver;
	static void lanchBrowser() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.globalsqa.com/demo-site/select-elements/");
		driver.manage().window().maximize();
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
	driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//li[contains(text(),'Item 1')]")).click();
		Thread.sleep(3000);
		driver.close();
		//https://www.globalsqa.com/demo-site/draganddrop/
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		lanchBrowser();
	}

}
