package com.training.selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class googleexample {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
    WebElement SearchBox=driver.findElement(By.name("q"));
    SearchBox.sendKeys("selenium");
    WebElement SearchButton= driver.findElement(By.className("gNO89b"));
    SearchButton.click();
	}

}
