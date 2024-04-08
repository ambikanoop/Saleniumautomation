package com.training.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class statusofwebelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.google.com/");
    //isDisplyed() isEnabled()
 WebElement searchbox  = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]"));
 System.out.println(searchbox.isDisplayed());
 System.out.println(searchbox.isEnabled());
	}

}
