package seleniumautamation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase23 {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();  
		 driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		WebElement email=driver.findElement(By.id("username"));
		email.sendKeys("ambika@com.sand");
		WebElement password=driver.findElement(By.name("pw"));
		password.sendKeys("Anoopkp@15");
		WebElement login=driver.findElement(By.id("Login"));
		login.click();
		leadTab();
		view();
		System.out.println("test case pass");
}
static void leadTab() {
		WebElement lead=driver.findElement(By.xpath("//a[@title='Leads Tab']"));
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(lead));
		Actions action=new Actions(driver);
		action.moveToElement(lead).build().perform();
		action.click().build().perform();}
	static void view() {
		WebElement viewdropdown=driver.findElement(By.xpath("//select[@id='fcf']"));
		Actions action1=new Actions(driver);
		action1.moveToElement(viewdropdown).build().perform();
		action1.click().build().perform();
	
		Select select=new Select(viewdropdown);
		select.selectByVisibleText("Today's Leads");
		action1.click().build().perform();
	}
}
