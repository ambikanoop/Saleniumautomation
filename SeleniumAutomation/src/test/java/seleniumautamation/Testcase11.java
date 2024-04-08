package seleniumautamation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase11 {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();   //  //a[@title='My Settings']
		 driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		WebElement email=driver.findElement(By.id("username"));
		email.sendKeys("ambika@com.sand");
		WebElement password=driver.findElement(By.name("pw"));
		password.sendKeys("Anoopkp@15");
		WebElement login=driver.findElement(By.id("Login"));
		login.click();
		Thread.sleep(2000);
		WebElement account=driver.findElement(By.id("Account_Tab"));
		Actions action=new Actions(driver);
		action.moveToElement(account).build().perform();
		action.click().build().perform();
		createnewview();
		System.out.println("test passed");
		
		}
	static void createnewview() throws InterruptedException {
		WebElement newview=driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
		newview.click();
		WebElement viewname=driver.findElement(By.xpath("//input[@id='fname']"));
		viewname.sendKeys("Ambi");
		WebElement viewuniqname=driver.findElement(By.xpath("//input[@id='devname']"));
	
		viewuniqname.click();
	
		WebElement save=driver.findElement(By.xpath("//input[@data-uidsfdc='4']"));
		save.click();
		Thread.sleep(3000);
		
	}
}