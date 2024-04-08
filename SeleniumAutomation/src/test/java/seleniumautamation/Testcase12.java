package seleniumautamation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase12 {

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
		viewdropdown();
		dropdown();
		Tabs();
		System.out.println("test pass");
	}
	static void viewdropdown() throws InterruptedException {
		Thread.sleep(3000);
		WebElement viewdropdown=driver.findElement(By.xpath("//select[@id='fcf']"));
		Select view=new Select(viewdropdown);
		view.selectByVisibleText("Ambi");
		WebElement edit=driver.findElement(By.xpath("//*[@id='filter_element']/div/span/span[2]/a[1]"));
		edit.click();
		WebElement viewname=driver.findElement(By.xpath("//input[@id='fname']"));
		viewname.clear();
		viewname.sendKeys("Ambi2");
	}
	static void dropdown() {
		WebElement fielddropdown=driver.findElement(By.xpath("//select[@id='fcol1']"));
		Select field=new Select(fielddropdown);
		field.selectByVisibleText("Account Name");
		WebElement operatordropdown=driver.findElement(By.xpath("//select[@id='fop1']"));
		Select operator=new Select(operatordropdown);
		operator.selectByVisibleText("contains");
		WebElement value=driver.findElement(By.xpath("//input[@title='Value 1']"));
		Actions action=new Actions(driver);
		action.moveToElement(value).build().perform();
		//action.sendKeys("a").build().perform();
		action.click().build().perform();
		
		//action.sendKeys("a").build().perform();
	}
	static void Tabs() throws InterruptedException {
		Thread.sleep(3000);
		WebElement availabeTabs=driver.findElement(By.xpath("//select[@id='colselector_select_0']"));
		Select s1=new Select(availabeTabs);
		s1.selectByVisibleText("Last Activity");
		WebElement add=driver.findElement(By.xpath("//a[@id='colselector_select_0_right']//img[@title='Add']"));
		add.click();
		WebElement save=driver.findElement(By.xpath("//input[@data-uidsfdc='5']"));
		save.click();
	}
}
