package seleniumautamation;

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

public class Testcase16 {
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
		newopportunity();
		closedate();
		satge();
		
		sourcelead();
		//primarysource();
		System.out.println("test case pass");
		}
	static void opportunites() {
		WebElement opp=driver.findElement(By.xpath("//a[contains(text(),'Opportunities')]"));
		Actions action=new Actions(driver);
		action.moveToElement(opp).build().perform();
		action.click().build().perform();
		WebElement newbutton=driver.findElement(By.xpath("//td[@class='pbButton']/input[@name='new']"));
		newbutton.click();
		}
	static void newopportunity() {
		WebElement oppname=driver.findElement(By.xpath("//input[@id='opp3']"));
		oppname.clear();
		oppname.sendKeys("anu");
		WebElement Accountname=driver.findElement(By.xpath("//input[@id='opp4']"));
		Accountname.clear();
		Accountname.sendKeys("ambika");
	}
	static void closedate() {
		WebElement closedate =driver.findElement(By.xpath("//input[@id='opp9']"));
		closedate.click();
		WebElement monthdropdown=driver.findElement(By.id("calMonthPicker"));
		Select month=new Select(monthdropdown);
		month.selectByVisibleText("April");
		WebElement yeardropdown=driver.findElement(By.id("calYearPicker"));
		Select year=new Select(yeardropdown);
		year.selectByValue("2024");
		WebElement date=driver.findElement(By.xpath("//*[@id=\"calRow1\"]/td[6]"));
		date.click();
	}
	static void satge() throws InterruptedException {
		WebElement stagedropdown=driver.findElement(By.id("opp11"));
		Select st=new Select(stagedropdown);
		st.selectByVisibleText("Qualification");
		WebElement probability=driver.findElement(By.id("opp12"));
		probability.sendKeys("0");}
	
static void primarysource() throws InterruptedException {
			
		
		
		WebElement imagebutton=driver.findElement(By.id("opp17_lkwgt"));
		
		imagebutton.click();
		String parentwindow=driver.getWindowHandle();
		Set<String>listofhandles=driver.getWindowHandles();
		for(String h:listofhandles) {
			if(!h.equals(parentwindow)) {
				driver.switchTo().window(h);
				WebElement frame=driver.findElement(By.xpath("//frame[@id='resultsFrame']"));
				driver.switchTo().frame(frame);
driver.findElement(By.xpath("//a[contains(text(),'DM Campaign to Top Customers - Nov 12-23, 2001')]")).click();
				
			}
		}
		driver.switchTo().window(parentwindow);
}
static void sourcelead() {
	WebElement sourcedropdown=driver.findElement(By.xpath("//select[@id='opp6']"));
	Select st1=new Select(sourcedropdown);
	st1.selectByVisibleText("Other");
	
	
	WebElement save=driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@title='Save']"));
	save.click();
}
	
	
}
