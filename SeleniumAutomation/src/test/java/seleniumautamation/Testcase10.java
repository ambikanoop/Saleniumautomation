package seleniumautamation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase10 {
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
		Account();
		WebElement Accname=driver.findElement(By.xpath("//h2[@class='topName']"));
		System.out.println(Accname.getText());
		String expected="AmbikaKrishnamurthy";
		if(Accname.getText().equalsIgnoreCase(expected)) {
			System.out.println("testcase pass");}}
	static void Account() throws InterruptedException {
		Thread.sleep(2000);
		WebElement account=driver.findElement(By.id("Account_Tab"));
		Actions action=new Actions(driver);
		action.moveToElement(account).build().perform();
		action.click().build().perform();
		WebElement newbutton=driver.findElement(By.xpath("//input[@title='New']"));
		newbutton.click();
		WebElement Accountname=driver.findElement(By.xpath("//input[@id='acc2']"));
		Accountname.sendKeys("AmbikaKrishnamurthy");
		WebElement typedropdown=driver.findElement(By.xpath("//select[@id='acc6']"));
		Select type=new Select(typedropdown);
		type.selectByVisibleText("Technology Partner");
		WebElement customerprioritydropdwon=driver.findElement(By.xpath("//select[@id='00Naj000001201m']"));
		Select customerpriority=new Select(customerprioritydropdwon);
		customerpriority.selectByVisibleText("High");
		WebElement save=driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@title='Save']"));
		save.click();
	}
}
