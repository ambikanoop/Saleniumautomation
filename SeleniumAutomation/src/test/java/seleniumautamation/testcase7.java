package seleniumautamation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testcase7 {
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
WebElement mysetting=driver.findElement(By.xpath("//a[@title='My Settings']"));
mysetting.click();
personallink();
displyandLayout() ;
emaillink();
calender();
System.out.println("Testcase passed");
	}
	static void displyandLayout() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.id("DisplayAndLayout_font")).click();
		driver.findElement(By.xpath("//span[@id='CustomizeTabs_font']")).click();
		WebElement customapp=driver.findElement(By.xpath("//select[@id='p4']"));
		Select dropdown=new Select(customapp);
		dropdown.selectByVisibleText("Salesforce Chatter");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//option[@value='02uaj00000240IQ']")).click();
	WebElement report=	driver.findElement(By.xpath("//option[@value='report']"));
	report.click();
		driver.findElement(By.xpath("//img[@alt='Add']")).click();
		driver.findElement(By.xpath("//input[@value=' Save ']")).click();
	}
	static void personallink() {
		driver.findElement(By.id("PersonalInfo_font")).click();
		driver.findElement(By.id("LoginHistory_font")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Download login history for last six months, includ')]")).click();
	}
	static void emaillink() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.id("EmailSetup_font")).click(); 
		driver.findElement(By.xpath("//span[@id='EmailSettings_font']")).click(); 
		WebElement name=driver.findElement(By.id("sender_name"));
		name.clear();
		name.sendKeys("Ambika");
	WebElement email=driver.findElement(By.id("sender_email"));
		email.clear();
		email.sendKeys("ck.ambika@gmail.com");
		driver.findElement(By.id("auto_bcc1")).click();
		driver.findElement(By.xpath("//input[@class='btn primary']")).click();
		}
	static void calender() throws InterruptedException {
		WebElement calender=driver.findElement(By.xpath("//span[@id='CalendarAndReminders_font']"));
		calender.click();
		Thread.sleep(3000);
		WebElement activity=driver.findElement(By.xpath("//span[@id='Reminders_font']"));
		activity.click();
		WebElement test_remender=driver.findElement(By.xpath("//input[@id='testbtn']"));
		test_remender.click();
	}


}

