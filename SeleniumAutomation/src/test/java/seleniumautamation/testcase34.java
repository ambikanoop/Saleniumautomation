package seleniumautamation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testcase34 {

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
		HomeTab();
		System.out.println("test case pass");
		}static void HomeTab() {
		WebElement homebutton=driver.findElement(By.xpath("//*[@id=\"home_Tab\"]/a"));
		Actions action=new Actions(driver);
		action.moveToElement(homebutton).build().perform();
		action.click().build().perform();
		WebElement Aname=driver.findElement(By.xpath("//span[@class='pageType']//a[contains(text(),'Ambika Abcd')]"));
		Aname.click();
		WebElement editlink=driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img[@title='Edit Profile']"));
		editlink.click();
		WebElement iframe=driver.findElement(By.xpath("//iframe[@id='contactInfoContentId']"));
		driver.switchTo().frame(iframe);
		WebElement about=driver.findElement(By.xpath("//a[contains(text(),'About')]"));
		about.click();
		WebElement lastname=driver.findElement(By.xpath("//input[@id='lastName']"));
		lastname.clear();
		lastname.sendKeys("Abcd");
		WebElement saveall=driver.findElement(By.xpath("//input[@value='Save All']"));
		saveall.click();
	}

}
