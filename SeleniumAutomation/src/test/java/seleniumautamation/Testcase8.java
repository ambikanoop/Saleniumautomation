package seleniumautamation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase8 {

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
WebElement usermenu= driver.findElement(By.id("userNavLabel"));
usermenu.click();
Thread.sleep(3000);
developerconsole();
windowTab();
System.out.println("testcase passed");
}
	static void developerconsole() {
		WebElement dev=driver.findElement(By.xpath("//a[@class='debugLogLink menuButtonMenuLink']"));
		dev.click();
		
	}
	static void windowTab() {
		String parentwindow=driver.getWindowHandle();
		System.out.println(parentwindow);
		for(String h:driver.getWindowHandles()) {
			System.out.println(h);
			driver.switchTo().window(h);
			driver.switchTo().window(parentwindow);
			System.out.println(driver.getTitle());
		}
		
	}
}