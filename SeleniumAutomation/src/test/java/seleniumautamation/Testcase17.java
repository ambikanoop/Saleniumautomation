package seleniumautamation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase17 {

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
		opportunites();
		System.out.println("test case pass");

}
	static void opportunites() {
		WebElement opp=driver.findElement(By.xpath("//a[contains(text(),'Opportunities')]"));
		Actions action=new Actions(driver);
		action.moveToElement(opp).build().perform();
		action.click().build().perform();
		WebElement opppipeline=driver.findElement(By.xpath("//a[contains(text(),'Opportunity Pipeline')]"));
		opppipeline.click();
}}