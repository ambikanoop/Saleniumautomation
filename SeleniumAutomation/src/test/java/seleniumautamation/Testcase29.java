package seleniumautamation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase29 {
static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		WebElement email=driver.findElement(By.id("username"));
		email.sendKeys("ambika@com.sand");
		WebElement password=driver.findElement(By.name("pw"));
		password.sendKeys("Anoopkp@15");
		WebElement login=driver.findElement(By.id("Login"));
		login.click();
		contactTab() ;
		
	}static void contactTab() {
		WebElement contact=driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
		Actions action=new Actions(driver);
		action.moveToElement(contact).build().perform();
		action.click().build().perform();
		WebElement contactname=driver.findElement(By.xpath(" //a[contains(text(),'Aksha')]"));
		contactname.click();
}
}