package seleniumautamation;

import io.github.bonigarcia.wdm.WebDriverManager;
import  org.openqa.selenium.chrome.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Testcase1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
WebElement email=driver.findElement(By.id("username"));
email.sendKeys("ambika@com.sand");
WebElement login=driver.findElement(By.id("Login"));
login.click();
WebElement error=driver.findElement(By.id("error"));
String s=error.getText();
String expectederror="Please enter your password.";
if(s.equalsIgnoreCase(expectederror)) {
	System.out.println("pass");
}
//System.out.println(s);

}}
