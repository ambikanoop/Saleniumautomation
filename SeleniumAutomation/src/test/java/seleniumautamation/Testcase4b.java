package seleniumautamation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase4b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
WebElement email=driver.findElement(By.id("username"));
email.sendKeys("ambi@com.sand");
WebElement password=driver.findElement(By.name("pw"));
password.sendKeys("Anoopkp");
WebElement login=driver.findElement(By.id("Login"));
login.click();
String actual=driver.getTitle();
System.out.println(actual);
System.out.println("test case pass");
	}

}
