package com.training.selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day3practiceselenium {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://selenium-prd.firebaseapp.com/");
Thread.sleep(3000);
WebElement email=driver.findElement(By.id("email_field"));
email.sendKeys("admin123@gmail.com");
WebElement password=driver.findElement(By.id("password_field"));
password.sendKeys("admin123");
WebElement login=driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
login.click();
Thread.sleep(3000);
WebElement home=driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
home.click();
WebElement female=driver.findElement(By.xpath("//input[@value='female']"));
female.click();
Thread.sleep(3000);
WebElement citydropdown=driver.findElement(By.id("city"));
Select city=new Select(citydropdown);
city.selectByVisibleText("GOA");
WebElement coursedropdown=driver.findElement(By.id("course"));
Select course=new Select(coursedropdown);
course.selectByVisibleText("B.TECH");
}
}