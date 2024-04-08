package seleniumautamation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		WebElement email=driver.findElement(By.id("username"));
		email.sendKeys("ambika@com.sand");
		WebElement password=driver.findElement(By.name("pw"));
		password.sendKeys("Anoopkp@15");
		WebElement remeberbutton=driver.findElement(By.id("rememberUn"));
		remeberbutton.click();
		WebElement login=driver.findElement(By.id("Login"));
		login.click();
		Thread.sleep(3000);
		WebElement userlable=driver.findElement(By.xpath("//span[contains(text(),'Ambika')]"));
		Actions action=new Actions(driver);
		action.click(userlable).build().perform();
		Thread.sleep(3000);
		WebElement logout=driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		logout.click();
		System.out.println("test case pass");

	}

}
