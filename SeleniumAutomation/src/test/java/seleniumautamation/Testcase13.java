package seleniumautamation;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase13 {


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
		MergeAccount();
		merge1();
}
	static void MergeAccount() {
		WebElement merge=driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]"));
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(merge));
		Actions action=new Actions(driver);
		action.moveToElement(merge).build().perform();
		action.click().build().perform();
		WebElement search=driver.findElement(By.xpath("//input[@id='srch']"));
		WebDriverWait wait1=new WebDriverWait(driver,10);
		wait1.until(ExpectedConditions.visibilityOf(search));
		search.sendKeys("Am");
	List<WebElement> alloptions=driver.findElements(By.xpath("//input[@value='Find Accounts']"));
	for(WebElement w:alloptions) {
		w.getAttribute("Am");
		w.click();
	}
	//WebElement Accounts=driver.findElement(By.xpath("//table[@class='list']/tbody/tr[2]/td[1]"));
	//WebElement f=driver.findElement(By.xpath("//input[@id='cid0']"));
		List<WebElement> table=driver.findElements(By.xpath("//table[@class='list']/tbody/tr/td"));
		driver.findElement(By.xpath("//td[text()='ambika']//preceding-sibling::th//input")).click();
		driver.findElement(By.xpath("//td[text()='ambika12']//preceding-sibling::th//input")).click();
		for(WebElement W:table) {
			System.out.println(W.getText());
			
		}
	
	WebElement next=driver.findElement(By.xpath("//div[@class='pbTopButtons']//input[@title='Next']"));
	next.click();
	
	}
	static void merge1() {
		WebElement merge1=driver.findElement(By.xpath("//div[@class='pbTopButtons']//input[@title='Merge']"));
		WebDriverWait wait21=new WebDriverWait(driver,10);
		wait21.until(ExpectedConditions.visibilityOf(merge1));
		Actions action3=new Actions(driver);
		action3.moveToElement(merge1).build().perform();
		action3.click().build().perform();
		driver.switchTo().alert().accept();
		driver.quit();
		System.out.println("test case pass");
	}
	
	}
