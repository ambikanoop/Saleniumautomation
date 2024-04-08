package seleniumautamation;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase36 {
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
	 HomeTab() ;
	 datelink();
	}
	static void HomeTab() {
		WebElement homebutton=driver.findElement(By.xpath("//*[@id=\"home_Tab\"]/a"));
		Actions action=new Actions(driver);
		action.moveToElement(homebutton).build().perform();
		action.click().build().perform();         //[@class='fixedTable']
}
	static void datelink() {
		WebElement date=driver.findElement(By.xpath("//span[@class='pageDescription']/a"));
		date.click();
		WebElement timelink=driver.findElement(By.xpath("//td[@class='calendarBlock']//div[@id='p:f:j_id25:j_id61:28:j_id64']/a"));
		timelink.click();
		
		WebElement subcombo=driver.findElement(By.xpath("//a[@title='Combo (New Window)']"));
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(subcombo));
		subcombo.click();
		String p=driver.getWindowHandle();
		Set<String>handles=driver.getWindowHandles();
		for(String Whandle:handles) {
			if(!p.equals(Whandle)) {
			driver.switchTo().window(Whandle);
			WebElement other=driver.findElement(By.xpath("/html/body/div[2]/ul/li[5]/a"));
			other.click();
			}
		}
		driver.switchTo().window(p);
		WebElement endtime=driver.findElement(By.xpath("//*[@id=\"EndDateTime_time\"]"));
	endtime.click();
		
		endtime.sendKeys("9:00PM");
      
       WebElement save=driver.findElement(By.xpath("//*[@id=\"bottomButtonRow\"]/input[1]"));
       save.click();
     
     
      
	}
	
	
	
}
