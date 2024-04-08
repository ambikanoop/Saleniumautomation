package com.training.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.Capabilities;
import io.github.bonigarcia.wdm.WebDriverManager;

public class seleniumtest2 {
public static WebDriver driver;
	public static  void main(String[] args)  {
		//ChromeOptions ob=new ChromeOptions();
		//ob.setHeadless(true);
	//WebDriver driver=WebDriverManager.chromedriver().create();

     //driver.get("https://www.google.com/");
 	//Thread.sleep(5000);
 	//System.out.println(driver.getTitle());
 	//System.out.println(driver.getCurrentUrl());
		
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}

}
