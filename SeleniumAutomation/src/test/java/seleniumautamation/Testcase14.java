package seleniumautamation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase14 {
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
		Accountlast30();
		
		Fromdate();
}
	static void Accountlast30() {
		WebElement last30=driver.findElement(By.xpath("//a[contains(text(),'Accounts with last activity')]"));
		Actions action=new Actions(driver);
		action.moveToElement(last30).build().perform();  ////table[@class='x-table-layout']//input[@id='ext-comp-1042']
		action.click().build().perform();}
	static void Fromdate() throws InterruptedException {
		WebElement fromdropdown=driver.findElement(By.xpath("//img[@id='ext-gen152']"));
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(fromdropdown));
		fromdropdown.click();
		WebElement date=driver.findElement(By.xpath("//*[@id=\"ext-gen268\"]/tbody/tr[2]/td/table/tbody/tr[1]/td[3]/a"));
		date.click();
		WebElement todropdown=driver.findElement(By.xpath("//*[@id=\"ext-gen154\"]"));
		todropdown.click();
		//WebElement nextmonth=driver.findElement(By.xpath("//*[@id=\"ext-gen268\"]/tbody/tr[1]/td[3]"));
		//WebDriverWait wait1=new WebDriverWait(driver,10);
		//wait1.until(ExpectedConditions.visibilityOf(nextmonth));
		//nextmonth.click();
		//nextmonth.click();
		WebElement date1=driver.findElement(By.xpath("//*[@id='ext-comp-1045']"));
		date1.clear();
		date1.sendKeys("4/2/2024");
		//WebElement today=driver.findElement(By.xpath("//*[@id='ext-gen276']"));
		//WebDriverWait wait1=new WebDriverWait(driver,10);
		//wait1.until(ExpectedConditions.visibilityOf(today));
		//today.click();
		WebElement savebutton=driver.findElement(By.xpath("//*[@id='ext-gen49']"));
		savebutton.click();
		WebElement reportname=driver.findElement(By.xpath("//*[@id=\"saveReportDlg_reportNameField\"]"));
	
		reportname.sendKeys("Ab");
		WebElement ureportname=driver.findElement(By.xpath("//*[@id=\"saveReportDlg_DeveloperName\"]"));
		ureportname.click();
		
		WebElement saveandrun=driver.findElement(By.xpath("//table[@id='dlgSaveAndRun']/tbody/tr[2]/td[2]"));
		WebDriverWait wait5=new WebDriverWait(driver,10);
		wait5.until(ExpectedConditions.visibilityOf(saveandrun));
		saveandrun.click();

		
	}


}