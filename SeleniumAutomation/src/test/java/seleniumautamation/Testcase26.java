package seleniumautamation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase26 {

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
		contactTab();
		newview();
		System.out.println("test case pass");
}static void contactTab() {
	WebElement contact=driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
	Actions action=new Actions(driver);
	action.moveToElement(contact).build().perform();
	action.click().build().perform();
}
static void newview() {
	WebElement newview=driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
	newview.click();
	WebElement viewname=driver.findElement(By.xpath("//td[@class='dataCol']//input[@id='fname']"));
	viewname.sendKeys("aa");
	WebElement uviewname=driver.findElement(By.xpath("//td[@class='dataCol']//input[@id='devname']"));
	uviewname.clear();
	uviewname.sendKeys("bb");
	WebElement savebutton=driver.findElement(By.xpath("//td[@class='pbButtonb']//input[@data-uidsfdc='3']"));
	savebutton.click();
}

}
	
	
