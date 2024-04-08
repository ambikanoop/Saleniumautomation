package seleniumautamation;

import io.github.bonigarcia.wdm.WebDriverManager;
import  org.openqa.selenium.chrome.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Testcase4a {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		WebElement forgotpassword=driver.findElement(By.xpath("//a[@id='forgot_password_link']"));
		forgotpassword.click();
		// //input[@id='un'],//input[@id='continue']
WebElement username=driver.findElement(By.xpath("//input[@id='un']"));
username.sendKeys("ck.ambika@gmail.com");
WebElement conti=driver.findElement(By.xpath("//input[@id='continue']"));
conti.click();
String actual=driver.getTitle();
System.out.println(actual);
System.out.println("test case pass");

		
	}

}
